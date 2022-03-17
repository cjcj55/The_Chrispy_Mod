package io.github.cjcj55.chrispymod.common.block.entity;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.client.screen.AlloyFurnaceMenu;
import io.github.cjcj55.chrispymod.common.recipe.AlloyFurnaceRecipe;
import io.github.cjcj55.chrispymod.core.init.BlockEntityInit;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class AlloyFurnaceBlockEntity extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 100;
    private int fuelTime;
    private int maxFuelTime;

    public AlloyFurnaceBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityInit.ALLOY_FURNACE.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            public int get(int index) {
                switch (index) {
                    case 0: return AlloyFurnaceBlockEntity.this.progress;
                    case 1: return AlloyFurnaceBlockEntity.this.maxProgress;
                    case 2: return AlloyFurnaceBlockEntity.this.fuelTime;
                    case 3: return AlloyFurnaceBlockEntity.this.maxFuelTime;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: AlloyFurnaceBlockEntity.this.progress = value; break;
                    case 1: AlloyFurnaceBlockEntity.this.maxProgress = value; break;
                    case 2: AlloyFurnaceBlockEntity.this.fuelTime = value; break;
                    case 3: AlloyFurnaceBlockEntity.this.maxFuelTime = value; break;
                }
            }
            public int getCount() {
                return 4;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container." + ChrispyMod.MODID + ".alloy_furnace");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new AlloyFurnaceMenu(pContainerId, pInventory, this, this.data);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    public void forceUpdateAllStates() {
        BlockState state = level.getBlockState(worldPosition);
        if (state.getValue(BlockStateProperties.LIT) != this.isBurning()) {
            level.setBlock(worldPosition, state.setValue(BlockStateProperties.LIT, this.isBurning()), 3);
        }
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("alloy_smelting.progress", progress);
        tag.putInt("alloy_smelting.fuelTime", fuelTime);
        tag.putInt("alloy_smelting.maxFuelTime", maxFuelTime);
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("alloy_smelting.progress");
        fuelTime = nbt.getInt("alloy_smelting.fuelTime");
        maxFuelTime = nbt.getInt("alloy_smelting.maxFuelTime");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    private void consumeFuel() {
        if(!itemHandler.getStackInSlot(0).isEmpty()) {
            this.fuelTime = ForgeHooks.getBurnTime(this.itemHandler.extractItem(0, 1, false), RecipeType.SMELTING);
            this.maxFuelTime = this.fuelTime;
        }
    }

    public static void tick(Level level, BlockPos blockPos, BlockState state, AlloyFurnaceBlockEntity blockEntity) {
        if(isConsumingFuel(blockEntity)) {
            blockEntity.fuelTime--;
        }

        if (!isConsumingFuel(blockEntity)) {
            blockEntity.forceUpdateAllStates();
        }

        if(hasRecipe(blockEntity)) {
            if(hasFuelInFuelSlot(blockEntity) && !isConsumingFuel(blockEntity)) {
                blockEntity.consumeFuel();
                setChanged(level, blockPos, state);
            }
            if(isConsumingFuel(blockEntity)) {
                blockEntity.forceUpdateAllStates();
                blockEntity.level.setBlock(blockEntity.worldPosition, blockEntity.level.getBlockState(blockEntity.worldPosition).setValue(BlockStateProperties.LIT, blockEntity.isBurning()), 3);
                blockEntity.progress++;
                setChanged(level, blockPos, state);
                if(blockEntity.progress > blockEntity.maxProgress) {
                    craftItem(blockEntity);
                }
            }
        } else {
            blockEntity.resetProgress();
            blockEntity.forceUpdateAllStates();
            setChanged(level, blockPos, state);
        }
    }

    private static boolean hasFuelInFuelSlot(AlloyFurnaceBlockEntity entity) {
        return !entity.itemHandler.getStackInSlot(0).isEmpty();
    }

    private static boolean isConsumingFuel(AlloyFurnaceBlockEntity entity) {
        return entity.fuelTime > 0;
    }

    public boolean isBurning() {
        return this.fuelTime > 0;
    }

    private static boolean hasRecipe(AlloyFurnaceBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<AlloyFurnaceRecipe> match = level.getRecipeManager()
                .getRecipeFor(AlloyFurnaceRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem());
    }

    private static void craftItem(AlloyFurnaceBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<AlloyFurnaceRecipe> match = level.getRecipeManager().getRecipeFor(AlloyFurnaceRecipe.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            entity.itemHandler.extractItem(1,1, false);
            entity.itemHandler.extractItem(2,1, false);

            entity.itemHandler.setStackInSlot(3, new ItemStack(match.get().getResultItem().getItem(),
                    entity.itemHandler.getStackInSlot(3).getCount() + 1));

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(3).getItem() == output.getItem() || inventory.getItem(3).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(3).getMaxStackSize() > inventory.getItem(3).getCount();
    }
}

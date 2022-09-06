package io.github.cjcj55.chrispymod.common.block.entity;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.client.screen.JamAndJellyMakerMenu;
import io.github.cjcj55.chrispymod.common.block.AlloyFurnaceBlock;
import io.github.cjcj55.chrispymod.common.recipe.JamAndJellyMakerRecipe;
import io.github.cjcj55.chrispymod.core.init.BlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class JamAndJellyMakerBlockEntity extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(10) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 200;
    private int fuelTime = 0;
    private int maxFuelTime = 0;

    public JamAndJellyMakerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityInit.JAM_AND_JELLY_MAKER.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                switch (index) {
                    case 0: return JamAndJellyMakerBlockEntity.this.progress;
                    case 1: return JamAndJellyMakerBlockEntity.this.maxProgress;
                    case 2: return JamAndJellyMakerBlockEntity.this.fuelTime;
                    case 3: return JamAndJellyMakerBlockEntity.this.maxFuelTime;
                    default: return 0;
                }
            }
            @Override
            public void set(int index, int value) {
                switch(index) {
                    case 0: JamAndJellyMakerBlockEntity.this.progress = value; break;
                    case 1: JamAndJellyMakerBlockEntity.this.maxProgress = value; break;
                    case 2: JamAndJellyMakerBlockEntity.this.fuelTime = value; break;
                    case 3: JamAndJellyMakerBlockEntity.this.maxFuelTime = value; break;
                }
            }
            @Override
            public int getCount() {
                return 4;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container." + ChrispyMod.MODID + ".jam_and_jelly_maker");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new JamAndJellyMakerMenu(pContainerId, pInventory, this, this.data);
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
        tag.putInt("jam_and_jelly_maker.progress", progress);
        tag.putInt("jam_and_jelly_maker.fuelTime", fuelTime);
        tag.putInt("jam_and_jelly_maker.maxFuelTime", maxFuelTime);
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("jam_and_jelly_maker.progress");
        fuelTime = nbt.getInt("jam_and_jelly_maker.fuelTime");
        maxFuelTime = nbt.getInt("jam_and_jelly_maker.maxFuelTime");
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

    public static void tick(Level level, BlockPos blockPos, BlockState state, JamAndJellyMakerBlockEntity blockEntity) {
        if (level.isClientSide()) {
            return;
        }

        // TODO:  this if/else clause is new.  unsure if necessary or not
        if (hasRecipe(blockEntity)) {
            blockEntity.progress++;
            setChanged(level, blockPos, state);

            if (blockEntity.progress >= blockEntity.maxProgress) {
                craftItem(blockEntity);
            }
        } else {
            blockEntity.resetProgress();
            setChanged(level, blockPos, state);
        }

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
                state = state.setValue(AlloyFurnaceBlock.LIT, Boolean.valueOf(blockEntity.isBurning()));
                level.setBlock(blockPos, state, 3);
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

    private static boolean hasFuelInFuelSlot(JamAndJellyMakerBlockEntity entity) {
        return !entity.itemHandler.getStackInSlot(0).isEmpty();
    }

    private static boolean isConsumingFuel(JamAndJellyMakerBlockEntity entity) {
        return entity.fuelTime > 0;
    }

    public boolean isBurning() {
        return this.fuelTime > 0;
    }

    private static boolean hasRecipe(JamAndJellyMakerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<JamAndJellyMakerRecipe> match = level.getRecipeManager()
                .getRecipeFor(JamAndJellyMakerRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem());
    }

    private static void craftItem(JamAndJellyMakerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<JamAndJellyMakerRecipe> match = level.getRecipeManager().getRecipeFor(JamAndJellyMakerRecipe.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            entity.itemHandler.extractItem(1,1, false);
            entity.itemHandler.extractItem(2,1, false);
            entity.itemHandler.extractItem(3,1, false);
            entity.itemHandler.extractItem(4,1, false);
            entity.itemHandler.extractItem(5,1, false);
            entity.itemHandler.extractItem(6,1, false);
            entity.itemHandler.extractItem(7,1, false);
            entity.itemHandler.extractItem(8,1, false);

            entity.itemHandler.setStackInSlot(9, new ItemStack(match.get().getResultItem().getItem(),
                    entity.itemHandler.getStackInSlot(9).getCount() + 1));

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(9).getItem() == output.getItem() || inventory.getItem(9).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(9).getMaxStackSize() > inventory.getItem(9).getCount();
    }

}
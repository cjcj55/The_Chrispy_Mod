package github.cjcj55.chrispymod.blocks.entity;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.blocks.AlloyFurnaceBlock;
import github.cjcj55.chrispymod.client.screen.AlloyFurnaceMenu;
import github.cjcj55.chrispymod.client.screen.JamAndJellyMakerMenu;
import github.cjcj55.chrispymod.recipe.AlloyFurnaceRecipe;
import github.cjcj55.chrispymod.recipe.JamAndJellyMakerRecipe;
import github.cjcj55.chrispymod.registry.CMBlockEntities;
import github.cjcj55.chrispymod.util.InventoryDirectionEntry;
import github.cjcj55.chrispymod.util.InventoryDirectionWrapper;
import github.cjcj55.chrispymod.util.WrappedHandler;
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
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
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
        super(CMBlockEntities.JAM_AND_JELLY_MAKER_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> JamAndJellyMakerBlockEntity.this.progress;
                    case 1 -> JamAndJellyMakerBlockEntity.this.maxProgress;
                    case 2 -> JamAndJellyMakerBlockEntity.this.fuelTime;
                    case 3 -> JamAndJellyMakerBlockEntity.this.maxFuelTime;
                    default -> 0;
                };
            }
            @Override
            public void set(int index, int value) {
                switch(index) {
                    case 0 -> JamAndJellyMakerBlockEntity.this.progress = value;
                    case 1 -> JamAndJellyMakerBlockEntity.this.maxProgress = value;
                    case 2 -> JamAndJellyMakerBlockEntity.this.fuelTime = value;
                    case 3 -> JamAndJellyMakerBlockEntity.this.maxFuelTime = value;
                };
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
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
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
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("jam_and_jelly_maker_inventory", itemHandler.serializeNBT());
        pTag.putInt("jam_and_jelly_maker.progress", progress);
        pTag.putInt("jam_and_jelly_maker.fuelTime", fuelTime);
        pTag.putInt("jam_and_jelly_maker.maxFuelTime", maxFuelTime);
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        itemHandler.deserializeNBT(pTag.getCompound("jam_and_jelly_maker_inventory"));
        this.progress = pTag.getInt("jam_and_jelly_maker.progress");
        this.fuelTime = pTag.getInt("jam_and_jelly_maker.fuelTime");
        this.maxFuelTime = pTag.getInt("jam_and_jelly_maker.maxFuelTime");
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
                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem(null));
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

            entity.itemHandler.setStackInSlot(9, new ItemStack(match.get().getResultItem(null).getItem(),
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
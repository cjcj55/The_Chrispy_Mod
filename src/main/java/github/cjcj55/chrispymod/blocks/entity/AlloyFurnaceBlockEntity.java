package github.cjcj55.chrispymod.blocks.entity;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.blocks.AlloyFurnaceBlock;
import github.cjcj55.chrispymod.recipe.AlloyFurnaceRecipe;
import github.cjcj55.chrispymod.registry.CMBlockEntities;
import github.cjcj55.chrispymod.blocks.entity.screen.AlloyFurnaceMenu;
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

public class AlloyFurnaceBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
//            if (!level.isClientSide()) {
//                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
//            }
        }
    };

    private static final int INPUT_SLOT_1 = 0;
    private static final int INPUT_SLOT_2 = 1;
    private static final int FUEL_SLOT = 2;
    private static final int OUTPUT_SLOT = 3;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    //       N
    //       *
    //  W * [ ] * E
    //       *
    //       S
    //     FRONT
    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            new InventoryDirectionWrapper(itemHandler,
                    new InventoryDirectionEntry(Direction.DOWN, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.UP, FUEL_SLOT, true),
                    new InventoryDirectionEntry(Direction.NORTH, FUEL_SLOT, true),
                    new InventoryDirectionEntry(Direction.SOUTH, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.EAST, INPUT_SLOT_1, true),
                    new InventoryDirectionEntry(Direction.WEST, INPUT_SLOT_2, true)).directionsMap;

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 300;
    private int fuelTime;
    private int maxFuelTime;

//    public ItemStack getRenderStack() {
//        ItemStack stack = itemHandler.getStackInSlot(OUTPUT_SLOT);
//
//        if (stack.isEmpty()) {
//            stack = itemHandler.getStackInSlot(INPUT_SLOT_1);
//        }
//
//        return stack;
//    }

    public AlloyFurnaceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(CMBlockEntities.ALLOY_FURNACE_BLOCK_ENTITY.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> AlloyFurnaceBlockEntity.this.progress;
                    case 1 -> AlloyFurnaceBlockEntity.this.maxProgress;
                    case 2 -> AlloyFurnaceBlockEntity.this.fuelTime;
                    case 3 -> AlloyFurnaceBlockEntity.this.maxFuelTime;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> AlloyFurnaceBlockEntity.this.progress = pValue;
                    case 1 -> AlloyFurnaceBlockEntity.this.maxProgress = pValue;
                    case 2 -> AlloyFurnaceBlockEntity.this.fuelTime = pValue;
                    case 3 -> AlloyFurnaceBlockEntity.this.maxFuelTime = pValue;
                }
            }

            @Override
            public int getCount() {
                return 4;
            }
        };
    }

    public void drops() {
        SimpleContainer alloyFurnaceInventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            alloyFurnaceInventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, alloyFurnaceInventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container." + ChrispyMod.MODID + ".alloy_furnace");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new AlloyFurnaceMenu(pContainerId, pPlayerInventory, this, this.data);
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
        pTag.put("alloy_furnace_inventory", itemHandler.serializeNBT());
        pTag.putInt("alloy_smelting.progress", progress);
        pTag.putInt("alloy_smelting.fuelTime", fuelTime);
        pTag.putInt("alloy_smelting.maxFuelTime", maxFuelTime);

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        itemHandler.deserializeNBT(pTag.getCompound("alloy_furnace_inventory"));
        this.progress = pTag.getInt("alloy_smelting.progress");
        this.fuelTime = pTag.getInt("alloy_smelting.fuelTime");
        this.maxFuelTime = pTag.getInt("alloy_smelting.maxFuelTime");
    }

    private void consumeFuel() {
        if(!itemHandler.getStackInSlot(0).isEmpty()) {
            this.fuelTime = ForgeHooks.getBurnTime(this.itemHandler.extractItem(0, 1, false), RecipeType.SMELTING);
            this.maxFuelTime = this.fuelTime;
        }
    }

    public void tick(Level level, BlockPos blockPos, BlockState state) {
        if (level.isClientSide()) {
            return;
        }

        if(isConsumingFuel(this)) {
            this.fuelTime--;
        }

        if (!isConsumingFuel(this)) {
            this.forceUpdateAllStates();
        }

        if(hasRecipe(this)) {
            if(hasFuelInFuelSlot(this) && !isConsumingFuel(this)) {
                this.consumeFuel();
                setChanged(level, blockPos, state);
            }
            if(isConsumingFuel(this)) {
                this.forceUpdateAllStates();
                this.level.setBlock(this.worldPosition, this.level.getBlockState(this.worldPosition).setValue(BlockStateProperties.LIT, this.isBurning()), 3);
                state = state.setValue(AlloyFurnaceBlock.LIT, Boolean.valueOf(this.isBurning()));
                level.setBlock(blockPos, state, 3);
                this.progress++;
                setChanged(level, blockPos, state);
                if(this.progress > this.maxProgress) {
                    craftItem(this);
                }
            }
        } else {
            this.resetProgress();
            this.forceUpdateAllStates();
            setChanged(level, blockPos, state);
        }
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            if (side == null) {
                return lazyItemHandler.cast();
            }

            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(AlloyFurnaceBlock.FACING);

                if (side == Direction.DOWN || side == Direction.UP) {
                    return directionWrappedHandlerMap.get(side).cast();
                }

                return switch (localDir) {
                    default -> directionWrappedHandlerMap.get(side.getOpposite()).cast();
                    case EAST -> directionWrappedHandlerMap.get(side.getClockWise()).cast();
                    case SOUTH -> directionWrappedHandlerMap.get(side).cast();
                    case WEST -> directionWrappedHandlerMap.get(side.getCounterClockWise()).cast();
                };
            }
        }
        return super.getCapability(cap, side);
    }

    public void forceUpdateAllStates() {
        BlockState state = level.getBlockState(worldPosition);
        if (state.getValue(BlockStateProperties.LIT) != this.isBurning()) {
            level.setBlock(worldPosition, state.setValue(BlockStateProperties.LIT, this.isBurning()), 3);
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
                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem(entity.getLevel().registryAccess()));
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

            entity.itemHandler.setStackInSlot(3, new ItemStack(match.get().getResultItem(entity.getLevel().registryAccess()).getItem(),
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

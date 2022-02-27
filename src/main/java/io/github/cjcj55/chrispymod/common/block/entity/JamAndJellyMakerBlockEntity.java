package io.github.cjcj55.chrispymod.common.block.entity;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.client.screen.JamAndJellyMakerMenu;
import io.github.cjcj55.chrispymod.core.init.BlockEntityInit;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JamAndJellyMakerBlockEntity extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public JamAndJellyMakerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityInit.JAM_AND_JELLY_MAKER.get(), pWorldPosition, pBlockState);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container." + ChrispyMod.MODID + ".jam_and_jelly_maker");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new JamAndJellyMakerMenu(pContainerId, pInventory, this);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
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
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos blockPos, BlockState state, JamAndJellyMakerBlockEntity blockEntity) {
        if (hasRecipe(blockEntity) && hasNotReachedStackLimit(blockEntity)) {
            craftItem(blockEntity);
        }
    }

    private static void craftItem(JamAndJellyMakerBlockEntity entity) {
        entity.itemHandler.extractItem(0, 1, false);
        entity.itemHandler.extractItem(1, 1, false);

        entity.itemHandler.setStackInSlot(3, new ItemStack(ItemInit.COBALT.get(), entity.itemHandler.getStackInSlot(3).getCount() + 1));
    }

    private static boolean hasRecipe(JamAndJellyMakerBlockEntity entity) {
        boolean hasItemInSecondSlot = entity.itemHandler.getStackInSlot(0).getItem() == ItemInit.HELLFIRE.get();
        boolean hasItemInFirstSlot = entity.itemHandler.getStackInSlot(1).getItem() == BlockInit.COBALT_ORE.get().asItem();

        return hasItemInFirstSlot && hasItemInSecondSlot;
    }

    private static boolean hasNotReachedStackLimit(JamAndJellyMakerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(3).getCount() < entity.itemHandler.getStackInSlot(3).getMaxStackSize();
    }
}

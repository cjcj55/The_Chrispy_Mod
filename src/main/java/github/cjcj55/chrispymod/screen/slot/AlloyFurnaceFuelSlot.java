package github.cjcj55.chrispymod.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class AlloyFurnaceFuelSlot extends SlotItemHandler {
    public AlloyFurnaceFuelSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        return AbstractFurnaceBlockEntity.isFuel(stack) || AlloyFurnaceFuelSlot.isBucket(stack);
    }

    @Override
    public int getMaxStackSize(ItemStack pStack) {
        return AlloyFurnaceFuelSlot.isBucket(pStack) ? 1 : super.getMaxStackSize(pStack);
    }

    public static boolean isBucket(ItemStack stack) {
        return stack.is(Items.BUCKET);
    }
}

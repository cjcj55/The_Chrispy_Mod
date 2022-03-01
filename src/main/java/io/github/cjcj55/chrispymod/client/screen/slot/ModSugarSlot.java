package io.github.cjcj55.chrispymod.client.screen.slot;

import io.github.cjcj55.chrispymod.common.block.entity.JamAndJellyMakerBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ModSugarSlot extends SlotItemHandler {
    public ModSugarSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return isSugar(stack);
    }

    public static boolean isSugar(ItemStack stack) {
        return stack.is(Items.SUGAR);
    }
}

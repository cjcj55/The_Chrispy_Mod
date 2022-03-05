package io.github.cjcj55.chrispymod.client.screen.slot;

import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ModMasonJarSlot extends SlotItemHandler {
    public ModMasonJarSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return isMasonJar(stack);
    }

    public static boolean isMasonJar(ItemStack stack) {
        return stack.is(ItemInit.MASON_JAR.get());
    }
}

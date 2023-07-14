package github.cjcj55.chrispymod.client.screen.slot;

import github.cjcj55.chrispymod.registry.CMItems;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class MasonJarSlot extends SlotItemHandler {
    public MasonJarSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return isMasonJar(stack);
    }

    public static boolean isMasonJar(ItemStack stack) {
        return stack.is(CMItems.MASON_JAR.get());
    }
}

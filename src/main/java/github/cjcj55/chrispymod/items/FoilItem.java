package github.cjcj55.chrispymod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class FoilItem extends Item {
    public FoilItem() {
        super(new Item.Properties());
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}

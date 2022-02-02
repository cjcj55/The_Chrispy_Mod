package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class WhiteDwarfStarItem extends Item {
    public WhiteDwarfStarItem() {
        super(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB));
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}

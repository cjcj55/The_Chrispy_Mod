package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.item.Item;

public class ChrispyModItem extends Item {
    public ChrispyModItem() {
        super(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB));
    }

    public ChrispyModItem(Properties properties) {
        super(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB));
    }
}

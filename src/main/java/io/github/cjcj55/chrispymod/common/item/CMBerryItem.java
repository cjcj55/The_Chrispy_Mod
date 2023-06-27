package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;

public class CMBerryItem extends ItemNameBlockItem {
    public CMBerryItem(Block block, FoodProperties foodProperties) {
        super(block, new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(foodProperties));

    }
}

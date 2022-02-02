package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ChrispyModFoodItem extends Item {
    public ChrispyModFoodItem(FoodProperties chrispyModFood) {
        super(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(chrispyModFood));
    }
}

package github.cjcj55.chrispymod.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;

public class BerryItem extends ItemNameBlockItem {
    public BerryItem(Block block, FoodProperties foodProperties) {
        super(block, new Item.Properties().food(foodProperties));
    }
}
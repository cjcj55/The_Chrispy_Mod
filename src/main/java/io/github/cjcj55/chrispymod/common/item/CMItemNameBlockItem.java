package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class CMItemNameBlockItem extends BlockItem {
    public CMItemNameBlockItem(RegistryObject<Block> block, FoodProperties chrispyModFood) {
        super(block.get(), new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(chrispyModFood));
    }

    /**
     * Returns the unlocalized name of this item.
     */
    public String getDescriptionId() {
        return this.getOrCreateDescriptionId();
    }
}

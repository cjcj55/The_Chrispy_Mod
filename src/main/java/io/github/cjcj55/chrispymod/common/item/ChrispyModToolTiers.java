package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.core.init.ChrispyModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeTier;

public class ChrispyModToolTiers {
    /*
    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(ItemTags.PLANKS);
    }),
    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
        return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
    }),
    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),
    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    });
    */
    public static final ForgeTier RUBY = new ForgeTier(         2, 750,     6.0f, 2.0f, 14, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ChrispyModItems.RUBY.get()));
    public static final ForgeTier OPAL = new ForgeTier(         2, 250,     4.5f, 1.0f, 17, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ChrispyModItems.OPAL.get()));
    public static final ForgeTier TANGERINE = new ForgeTier(    2, 280,     3.0f, 1.0f, 8, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ChrispyModItems.TANGERINE.get()));
    public static final ForgeTier COBALT = new ForgeTier(       3, 600,     7.0f, 2.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ChrispyModItems.COBALT.get()));
    public static final ForgeTier BLUE_EMERALD = new ForgeTier( 3, 1675,    8.5f, 3.0f, 11, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ChrispyModItems.BLUE_EMERALD.get()));
    public static final ForgeTier PARYTH = new ForgeTier(       2, 382,     5.5f, 1.5f, 6, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ChrispyModItems.PARYTH.get()));
    public static final ForgeTier LIGHTNING = new ForgeTier(    3, 850,     8.0f, 0.0f, 9, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ChrispyModItems.LIGHTNING.get()));
    public static final ForgeTier FLAME = new ForgeTier(        2, 275,     6.0f, 2.0f, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ChrispyModItems.FLAME.get()));
    public static final ForgeTier REDSTONE = new ForgeTier(     2, 250,     6.0f, 2.0f, 14, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ChrispyModItems.REDSTONE_INGOT.get()));
    public static final ForgeTier EMERALD = new ForgeTier(      3, 550,     7.0f, 2.5f, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.EMERALD));
    public static final ForgeTier HONEY = new ForgeTier(        2, 400,     4.0f, 1.5f, 15, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.HONEY_BLOCK));
}

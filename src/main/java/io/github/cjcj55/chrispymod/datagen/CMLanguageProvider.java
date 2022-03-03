package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups.CHRISPY_BLOCKS_TAB;
import static io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups.CHRISPY_ITEMS_TAB;

public class CMLanguageProvider extends LanguageProvider {

    public CMLanguageProvider(DataGenerator gen, String locale) {
        super(gen, ChrispyMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ItemInit.RUBY.get(), "Ruby");
        add(ItemInit.RUBY_PICKAXE.get(), "Ruby Pickaxe");
        add(ItemInit.RUBY_SWORD.get(), "Ruby Sword");
        add(ItemInit.RUBY_AXE.get(), "Ruby Axe");
        add(ItemInit.RUBY_SHOVEL.get(), "Ruby Shovel");
        add(ItemInit.RUBY_HOE.get(), "Ruby Hoe");
        add(ItemInit.RUBY_HELMET.get(), "Ruby Helmet");
        add(ItemInit.RUBY_CHESTPLATE.get(), "Ruby Chestplate");
        add(ItemInit.RUBY_LEGGINGS.get(), "Ruby Leggings");
        add(ItemInit.RUBY_BOOTS.get(), "Ruby Boots");
        add(BlockInit.RUBY_BLOCK.get(), "Ruby Block");
        add(BlockInit.RUBY_ORE.get(), "Ruby Ore");
        add(BlockInit.DEEPSLATE_RUBY_ORE.get(), "Deepslate Ruby Ore");
        add(BlockInit.RUBY_ORE_NETHER.get(), "Nether Ruby Ore");

        add(ItemInit.OPAL.get(), "Opal");
        add(ItemInit.OPAL_PICKAXE.get(), "Opal Pickaxe");
        add(ItemInit.OPAL_SWORD.get(), "Opal Sword");
        add(ItemInit.OPAL_AXE.get(), "Opal Axe");
        add(ItemInit.OPAL_SHOVEL.get(), "Opal Shovel");
        add(ItemInit.OPAL_HOE.get(), "Opal Hoe");
        add(ItemInit.OPAL_HELMET.get(), "Opal Helmet");
        add(ItemInit.OPAL_CHESTPLATE.get(), "Opal Chestplate");
        add(ItemInit.OPAL_LEGGINGS.get(), "Opal Leggings");
        add(ItemInit.OPAL_BOOTS.get(), "Opal Boots");
        add(BlockInit.OPAL_BLOCK.get(), "Opal Block");
        add(BlockInit.OPAL_ORE.get(), "Opal Ore");
        add(BlockInit.DEEPSLATE_OPAL_ORE.get(), "Deepslate Opal Ore");

        add(ItemInit.TANGERINE.get(), "Tangerine");
        add(ItemInit.TANGERINE_PICKAXE.get(), "Tangerine Pickaxe");
        add(ItemInit.TANGERINE_SWORD.get(), "Tangerine Sword");
        add(ItemInit.TANGERINE_AXE.get(), "Tangerine Axe");
        add(ItemInit.TANGERINE_SHOVEL.get(), "Tangerine Shovel");
        add(ItemInit.TANGERINE_HOE.get(), "Tangerine Hoe");
        add(ItemInit.TANGERINE_HELMET.get(), "Tangerine Helmet");
        add(ItemInit.TANGERINE_CHESTPLATE.get(), "Tangerine Chestplate");
        add(ItemInit.TANGERINE_LEGGINGS.get(), "Tangerine Leggings");
        add(ItemInit.TANGERINE_BOOTS.get(), "Tangerine Boots");
        add(BlockInit.TANGERINE_BLOCK.get(), "Tangerine Block");
        add(BlockInit.TANGERINE_ORE.get(), "Tangerine Ore");
        add(BlockInit.DEEPSLATE_TANGERINE_ORE.get(), "Deepslate Tangerine Ore");

        add(ItemInit.COBALT.get(), "Cobalt");
        add(ItemInit.COBALT_PICKAXE.get(), "Cobalt Pickaxe");
        add(ItemInit.COBALT_SWORD.get(), "Cobalt Sword");
        add(ItemInit.COBALT_AXE.get(), "Cobalt Axe");
        add(ItemInit.COBALT_SHOVEL.get(), "Cobalt Shovel");
        add(ItemInit.COBALT_HOE.get(), "Cobalt Hoe");
        add(ItemInit.COBALT_HELMET.get(), "Cobalt Helmet");
        add(ItemInit.COBALT_CHESTPLATE.get(), "Cobalt Chestplate");
        add(ItemInit.COBALT_LEGGINGS.get(), "Cobalt Leggings");
        add(ItemInit.COBALT_BOOTS.get(), "Cobalt Boots");
        add(BlockInit.COBALT_BLOCK.get(), "Cobalt Block");
        add(BlockInit.COBALT_ORE.get(), "Cobalt Ore");
        add(BlockInit.DEEPSLATE_COBALT_ORE.get(), "Deepslate Cobalt Ore");

        add(ItemInit.BLUE_EMERALD.get(), "Blue Emerald");
        add(ItemInit.BLUE_EMERALD_PICKAXE.get(), "Blue Emerald Pickaxe");
        add(ItemInit.BLUE_EMERALD_SWORD.get(), "Blue Emerald Sword");
        add(ItemInit.BLUE_EMERALD_AXE.get(), "Blue Emerald Axe");
        add(ItemInit.BLUE_EMERALD_SHOVEL.get(), "Blue Emerald Shovel");
        add(ItemInit.BLUE_EMERALD_HOE.get(), "Blue Emerald Hoe");
        add(ItemInit.BLUE_EMERALD_HELMET.get(), "Blue Emerald Helmet");
        add(ItemInit.BLUE_EMERALD_CHESTPLATE.get(), "Blue Emerald Chestplate");
        add(ItemInit.BLUE_EMERALD_LEGGINGS.get(), "Blue Emerald Leggings");
        add(ItemInit.BLUE_EMERALD_BOOTS.get(), "Blue Emerald Boots");
        add(BlockInit.BLUE_EMERALD_BLOCK.get(), "Blue Emerald Block");

        add(ItemInit.PARYTH.get(), "Paryth");
        add(ItemInit.PARYTH_PICKAXE.get(), "Paryth Pickaxe");
        add(ItemInit.PARYTH_SWORD.get(), "Paryth Sword");
        add(ItemInit.PARYTH_AXE.get(), "Paryth Axe");
        add(ItemInit.PARYTH_SHOVEL.get(), "Paryth Shovel");
        add(ItemInit.PARYTH_HOE.get(), "Paryth Hoe");
        add(ItemInit.PARYTH_HELMET.get(), "Paryth Helmet");
        add(ItemInit.PARYTH_CHESTPLATE.get(), "Paryth Chestplate");
        add(ItemInit.PARYTH_LEGGINGS.get(), "Paryth Leggings");
        add(ItemInit.PARYTH_BOOTS.get(), "Paryth Boots");
        add(BlockInit.PARYTH_BLOCK.get(), "Paryth Block");
        add(BlockInit.PARYTH_ORE.get(), "Paryth Ore");
        add(BlockInit.DEEPSLATE_PARYTH_ORE.get(), "Deepslate Paryth Ore");

        add(ItemInit.LIGHTNING.get(), "§eLightning");
        add(ItemInit.LIGHTNING_PICKAXE.get(), "§eLightning Pickaxe");
        add(ItemInit.LIGHTNING_SWORD.get(), "§eLightning Sword");
        add(ItemInit.LIGHTNING_AXE.get(), "§eLightning Axe");
        add(ItemInit.LIGHTNING_SHOVEL.get(), "§eLightning Shovel");
        add(ItemInit.LIGHTNING_HOE.get(), "§eLightning Hoe");
        add(ItemInit.LIGHTNING_WAND.get(), "§eLightning Wand");
        add(ItemInit.LIGHTNING_HELMET.get(), "§eLightning Helmet");
        add(ItemInit.LIGHTNING_CHESTPLATE.get(), "§eLightning Chestplate");
        add(ItemInit.LIGHTNING_LEGGINGS.get(), "§eLightning Leggings");
        add(ItemInit.LIGHTNING_BOOTS.get(), "§eLightning Boots");
        add(BlockInit.LIGHTNING_BLOCK.get(), "§eLightning Block");

        add(ItemInit.FLAME.get(), "§4Flame");
        add(ItemInit.FLAME_PICKAXE.get(), "§4Flame Pickaxe");
        add(ItemInit.FLAME_SWORD.get(), "§4Flame Sword");
        add(ItemInit.FLAME_AXE.get(), "§4Flame Axe");
        add(ItemInit.FLAME_SHOVEL.get(), "§4Flame Shovel");
        add(ItemInit.FLAME_HOE.get(), "§4Flame Hoe");
        add(ItemInit.FLAME_WAND.get(), "§4Flame Wand");
        add(ItemInit.FLAME_HELMET.get(), "§4Flame Helmet");
        add(ItemInit.FLAME_CHESTPLATE.get(), "§4Flame Chestplate");
        add(ItemInit.FLAME_LEGGINGS.get(), "§4Flame Leggings");
        add(ItemInit.FLAME_BOOTS.get(), "§4Flame Boots");
        add(BlockInit.FLAME_BLOCK.get(), "§4Flame Block");
        add(BlockInit.FLAME_ORE_NETHER.get(), "§4Nether Flame Ore");

        add(ItemInit.REDSTONE_INGOT.get(), "Hardened Redstone Ingot");
        add(ItemInit.REDSTONE_PICKAXE.get(), "Redstone Pickaxe");
        add(ItemInit.REDSTONE_SWORD.get(), "Redstone Sword");
        add(ItemInit.REDSTONE_AXE.get(), "Redstone Axe");
        add(ItemInit.REDSTONE_SHOVEL.get(), "Redstone Shovel");
        add(ItemInit.REDSTONE_HOE.get(), "Redstone Hoe");
        add(ItemInit.REDSTONE_HELMET.get(), "Redstone Helmet");
        add(ItemInit.REDSTONE_CHESTPLATE.get(), "Redstone Chestplate");
        add(ItemInit.REDSTONE_LEGGINGS.get(), "Redstone Leggings");
        add(ItemInit.REDSTONE_BOOTS.get(), "Redstone Boots");
        add(BlockInit.HARDENED_REDSTONE_BLOCK.get(), "Hardened Redstone Block");

        add(ItemInit.EMERALD_PICKAXE.get(), "Emerald Pickaxe");
        add(ItemInit.EMERALD_SWORD.get(), "Emerald Sword");
        add(ItemInit.EMERALD_AXE.get(), "Emerald Axe");
        add(ItemInit.EMERALD_SHOVEL.get(), "Emerald Shovel");
        add(ItemInit.EMERALD_HOE.get(), "Emerald Hoe");
        add(ItemInit.EMERALD_HELMET.get(), "Emerald Helmet");
        add(ItemInit.EMERALD_CHESTPLATE.get(), "Emerald Chestplate");
        add(ItemInit.EMERALD_LEGGINGS.get(), "Emerald Leggings");
        add(ItemInit.EMERALD_BOOTS.get(), "Emerald Boots");

        add(ItemInit.HONEY_STICK.get(), "§6Honey Stick");
        add(ItemInit.HONEY_PICKAXE.get(), "§6Honey Pickaxe");
        add(ItemInit.HONEY_SWORD.get(), "§6Honey Sword");
        add(ItemInit.HONEY_AXE.get(), "§6Honey Axe");
        add(ItemInit.HONEY_SHOVEL.get(), "§6Honey Shovel");
        add(ItemInit.HONEY_HOE.get(), "§6Honey Hoe");
        add(ItemInit.HONEY_HELMET.get(), "§6Honey Helmet");
        add(ItemInit.HONEY_CHESTPLATE.get(), "§6Honey Chestplate");
        add(ItemInit.HONEY_LEGGINGS.get(), "§6Honey Leggings");
        add(ItemInit.HONEY_BOOTS.get(), "§6Honey Boots");

        add(ItemInit.WHITE_DWARF_STAR.get(), "White Dwarf Star");
        add(ItemInit.WHITE_DWARF_STAR_HELMET.get(), "White Dwarf Star Helmet");
        add(ItemInit.WHITE_DWARF_STAR_CHESTPLATE.get(), "White Dwarf Star Chestplate");
        add(ItemInit.WHITE_DWARF_STAR_LEGGINGS.get(), "White Dwarf Star Leggings");
        add(ItemInit.WHITE_DWARF_STAR_BOOTS.get(), "White Dwarf Star Boots");
        add(BlockInit.WHITE_DWARF_STAR_ORE.get(), "White Dwarf Star Ore");
        add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get(), "Deepslate White Dwarf Star Ore");

        add(BlockInit.NATURAL_ESSENCE_ORE.get(), "Natural Essence Ore");
        add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get(), "Deepslate Natural Essence Ore");
        add(ItemInit.NATURAL_ESSENCE.get(), "Natural Essence");

        add(BlockInit.EXPERIENCE_ORE.get(), "Experience Ore");
        add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get(), "Deepslate Experience Ore");
        add(ItemInit.EDIBLE_EXPERIENCE.get(), "§2Edible Experience");

        add(BlockInit.HELLFIRE_ORE_NETHER.get(), "Hellfire Ore");
        add(ItemInit.HELLFIRE.get(), "Hellfire");

        add(ItemInit.COOKED_CARROT.get(), "Cooked Carrot");
        add(ItemInit.BLACK_CANDY_CANE.get(), "Black Candy Cane");
        add(ItemInit.BLUE_CANDY_CANE.get(), "Blue Candy Cane");
        add(ItemInit.BROWN_CANDY_CANE.get(), "Brown Candy Cane");
        add(ItemInit.CYAN_CANDY_CANE.get(), "Cyan Candy Cane");
        add(ItemInit.GRAY_CANDY_CANE.get(), "Gray Candy Cane");
        add(ItemInit.GREEN_CANDY_CANE.get(), "Green Candy Cane");
        add(ItemInit.LIGHT_BLUE_CANDY_CANE.get(), "Light Blue Candy Cane");
        add(ItemInit.LIGHT_GRAY_CANDY_CANE.get(), "Light Gray Candy Cane");
        add(ItemInit.LIME_CANDY_CANE.get(), "Lime Candy Cane");
        add(ItemInit.MAGENTA_CANDY_CANE.get(), "Magenta Candy Cane");
        add(ItemInit.ORANGE_CANDY_CANE.get(), "Orange Candy Cane");
        add(ItemInit.PINK_CANDY_CANE.get(), "Pink Candy Cane");
        add(ItemInit.PURPLE_CANDY_CANE.get(), "Purple Candy Cane");
        add(ItemInit.RED_CANDY_CANE.get(), "Red Candy Cane");
        add(ItemInit.WHITE_CANDY_CANE.get(), "White Candy Cane");
        add(ItemInit.YELLOW_CANDY_CANE.get(), "Yellow Candy Cane");
        
        add(ItemInit.STRAWBERRY.get(), "Strawberry");
        add(ItemInit.BLUEBERRY.get(), "Blueberry");
        add(ItemInit.LOGANBERRY.get(), "Loganberry");
        add(ItemInit.RED_RASPBERRY.get(), "Red Raspberry");
        add(ItemInit.BLACK_RASPBERRY.get(), "Black Raspberry");
        add(ItemInit.GOLDEN_RASPBERRY.get(), "Golden Raspberry");
        add(ItemInit.WHITE_RASPBERRY.get(), "White Raspberry");
        add(ItemInit.MARIONBERRY.get(), "Marionberry");
        add(ItemInit.BLACKCURRANT.get(), "Blackcurrant");
        add(ItemInit.REDCURRANT.get(), "Redcurrant");
        add(ItemInit.HUCKLEBERRY.get(), "Huckleberry");
        add(ItemInit.WINEBERRY.get(), "Wineberry");
        add(ItemInit.ELDERBERRY.get(), "Elderberry");
        add(ItemInit.BLACKBERRY.get(), "Blackberry");
        add(ItemInit.BOYSENBERRY.get(), "Boysenberry");
        add(ItemInit.GROUND_CHERRY.get(), "Ground Cherry");
        add(ItemInit.ARONIA_BERRY.get(), "Aronia Berry");
        add(ItemInit.SERVICEBERRY.get(), "Serviceberry");
        add(ItemInit.WONDERBERRY.get(), "Wonderberry");
        add(ItemInit.MULBERRY.get(), "Mulberry");
        add(ItemInit.LINGONBERRY.get(), "Lingonberry");
        add(ItemInit.CRANBERRY.get(), "Cranberry");
        add(ItemInit.DEWBERRY.get(), "Dewberry");
        add(ItemInit.THIMBLEBERRY.get(), "Thimbleberry");
        add(ItemInit.GOOSEBERRY.get(), "Gooseberry");
        add(ItemInit.CHOKEBERRY.get(), "Chokeberry");
        add(ItemInit.OLALLIEBERRY.get(), "Olallieberry");
        add(ItemInit.ACEROLA_CHERRY.get(), "Acerola Cherry");
        add(ItemInit.BARBERRY.get(), "Barberry");
        add(ItemInit.BAYBERRY.get(), "Bayberry");
        add(ItemInit.GOGI_BERRY.get(), "Gogi Berry");

        add(ItemInit.STRAWBERRY_JAM.get(), "Strawberry Jam");
        add(ItemInit.BLUEBERRY_JAM.get(), "Blueberry Jam");
        add(ItemInit.LOGANBERRY_JAM.get(), "Loganberry Jam");
        add(ItemInit.RED_RASPBERRY_JAM.get(), "Red Raspberry Jam");
        add(ItemInit.BLACK_RASPBERRY_JAM.get(), "Black Raspberry Jam");
        add(ItemInit.GOLDEN_RASPBERRY_JAM.get(), "Golden Raspberry Jam");
        add(ItemInit.WHITE_RASPBERRY_JAM.get(), "White Raspberry Jam");
        add(ItemInit.MARIONBERRY_JAM.get(), "Marionberry Jam");
        add(ItemInit.BLACKCURRANT_JAM.get(), "Blackcurrant Jam");
        add(ItemInit.REDCURRANT_JAM.get(), "Redcurrant Jam");
        add(ItemInit.HUCKLEBERRY_JAM.get(), "Huckleberry Jam");
        add(ItemInit.WINEBERRY_JAM.get(), "Wineberry Jam");
        add(ItemInit.ELDERBERRY_JAM.get(), "Elderberry Jam");
        add(ItemInit.BLACKBERRY_JAM.get(), "Blackberry Jam");
        add(ItemInit.BOYSENBERRY_JAM.get(), "Boysenberry Jam");
        add(ItemInit.GROUND_CHERRY_JAM.get(), "Ground Cherry Jam");
        add(ItemInit.ARONIA_BERRY_JAM.get(), "Aronia Berry Jam");
        add(ItemInit.SERVICEBERRY_JAM.get(), "Serviceberry Jam");
        add(ItemInit.WONDERBERRY_JAM.get(), "Wonderberry Jam");
        add(ItemInit.MULBERRY_JAM.get(), "Mulberry Jam");
        add(ItemInit.LINGONBERRY_JAM.get(), "Lingonberry Jam");
        add(ItemInit.CRANBERRY_JAM.get(), "Cranberry Jam");
        add(ItemInit.DEWBERRY_JAM.get(), "Dewberry Jam");
        add(ItemInit.THIMBLEBERRY_JAM.get(), "Thimbleberry Jam");
        add(ItemInit.GOOSEBERRY_JAM.get(), "Gooseberry Jam");
        add(ItemInit.CHOKEBERRY_JAM.get(), "Chokeberry Jam");
        add(ItemInit.OLALLIEBERRY_JAM.get(), "Olallieberry Jam");
        add(ItemInit.ACEROLA_CHERRY_JAM.get(), "Acerola Cherry Jam");
        add(ItemInit.BARBERRY_JAM.get(), "Barberry Jam");
        add(ItemInit.BAYBERRY_JAM.get(), "Bayberry Jam");
        add(ItemInit.GOGI_BERRY_JAM.get(), "Gogi Berry Jam");

        add(BlockInit.STRAWBERRY_BUSH.get(), "Strawberry Bush");
        add(BlockInit.BLUEBERRY_BUSH.get(), "Blueberry Bush");
        add(BlockInit.LOGANBERRY_BUSH.get(), "Loganberry Bush");
        add(BlockInit.RED_RASPBERRY_BUSH.get(), "Red Raspberry Bush");
        add(BlockInit.BLACK_RASPBERRY_BUSH.get(), "Black Raspberry Bush");
        add(BlockInit.GOLDEN_RASPBERRY_BUSH.get(), "Golden Raspberry Bush");
        add(BlockInit.WHITE_RASPBERRY_BUSH.get(), "White Raspberry Bush");
        add(BlockInit.MARIONBERRY_BUSH.get(), "Marionberry Bush");
        add(BlockInit.BLACKCURRANT_BUSH.get(), "Blackcurrant Bush");
        add(BlockInit.REDCURRANT_BUSH.get(), "Redcurrant Bush");
        add(BlockInit.HUCKLEBERRY_BUSH.get(), "Huckleberry Bush");
        add(BlockInit.WINEBERRY_BUSH.get(), "Wineberry Bush");
        add(BlockInit.ELDERBERRY_BUSH.get(), "Elderberry Bush");
        add(BlockInit.BLACKBERRY_BUSH.get(), "Blackberry Bush");
        add(BlockInit.BOYSENBERRY_BUSH.get(), "Boysenberry Bush");
        add(BlockInit.GROUND_CHERRY_BUSH.get(), "Ground Cherry Bush");
        add(BlockInit.ARONIA_BERRY_BUSH.get(), "Aronia Berry Bush");
        add(BlockInit.SERVICEBERRY_BUSH.get(), "Serviceberry Bush");
        add(BlockInit.WONDERBERRY_BUSH.get(), "Wonderberry Bush");
        add(BlockInit.MULBERRY_BUSH.get(), "Mulberry Bush");
        add(BlockInit.LINGONBERRY_BUSH.get(), "Lingonberry Bush");
        add(BlockInit.CRANBERRY_BUSH.get(), "Cranberry Bush");
        add(BlockInit.DEWBERRY_BUSH.get(), "Dewberry Bush");
        add(BlockInit.THIMBLEBERRY_BUSH.get(), "Thimbleberry Bush");
        add(BlockInit.GOOSEBERRY_BUSH.get(), "Gooseberry Bush");
        add(BlockInit.CHOKEBERRY_BUSH.get(), "Chokeberry Bush");
        add(BlockInit.OLALLIEBERRY_BUSH.get(), "Olallieberry Bush");
        add(BlockInit.ACEROLA_CHERRY_BUSH.get(), "Acerola Cherry Bush");
        add(BlockInit.BARBERRY_BUSH.get(), "Barberry Bush");
        add(BlockInit.BAYBERRY_BUSH.get(), "Bayberry Bush");
        add(BlockInit.GOGI_BERRY_BUSH.get(), "Gogi Berry Bush");

        add(ItemInit.MASON_JAR.get(), "Mason Jar");

        add(BlockInit.SUGAR_BLOCK.get(), "Sugar Block");
        add(BlockInit.SUGAR_CANE_BLOCK.get(), "Sugar Cane Block");

        add(BlockInit.LAVA_SPONGE.get(), "Lava Sponge");
        add(BlockInit.WET_LAVA_SPONGE.get(), "Saturated Lava Sponge");

        add(BlockInit.SKINNY_SLANTED_BRICKS.get(), "Skinny Slanted Bricks");
        add(BlockInit.SLANTED_BRICKS.get(), "Slanted Bricks");
        add(BlockInit.SKINNY_BRICKS.get(), "Skinny Bricks");
        add(BlockInit.CIRCULAR_BRICKS.get(), "Circular Bricks");
        add(BlockInit.CRACKED_BRICKS.get(), "Cracked Bricks");
        add(BlockInit.ENCASED_BRICKS.get(), "Encased Bricks");
        add(BlockInit.MOSAIC_BRICKS.get(), "Mosaic Bricks");
        add(BlockInit.ORNATE_BRICKS.get(), "Ornate Bricks");
        add(BlockInit.ROAD_BRICKS.get(), "Road Bricks");
        add(BlockInit.SOLID_BRICKS.get(), "Solid Bricks");
        add(BlockInit.WEAVER_BRICKS.get(), "Weaver Bricks");

        add(BlockInit.BAMBOO_BLOCK.get(), "Bamboo Block");
        add(BlockInit.BAMBOO_STAIRS.get(), "Bamboo Stairs");
        add(BlockInit.BAMBOO_SLAB.get(), "Bamboo Slab");
        add(BlockInit.BAMBOO_WALL.get(), "Bamboo Wall");
        add(BlockInit.BAMBOO_DOOR.get(), "Bamboo Door");

        add(BlockInit.BLACK_REDSTONE_LAMP.get(), "Black Redstone Lamp");
        add(BlockInit.BLUE_REDSTONE_LAMP.get(), "Blue Redstone Lamp");
        add(BlockInit.BROWN_REDSTONE_LAMP.get(), "Brown Redstone Lamp");
        add(BlockInit.CYAN_REDSTONE_LAMP.get(), "Cyan Redstone Lamp");
        add(BlockInit.GRAY_REDSTONE_LAMP.get(), "Gray Redstone Lamp");
        add(BlockInit.GREEN_REDSTONE_LAMP.get(), "Green Redstone Lamp");
        add(BlockInit.LIGHT_BLUE_REDSTONE_LAMP.get(), "Light Blue Redstone Lamp");
        add(BlockInit.LIGHT_GRAY_REDSTONE_LAMP.get(), "Light Gray Redstone Lamp");
        add(BlockInit.LIME_REDSTONE_LAMP.get(), "Lime Redstone Lamp");
        add(BlockInit.MAGENTA_REDSTONE_LAMP.get(), "Magenta Redstone Lamp");
        add(BlockInit.ORANGE_REDSTONE_LAMP.get(), "Orange Redstone Lamp");
        add(BlockInit.PINK_REDSTONE_LAMP.get(), "Pink Redstone Lamp");
        add(BlockInit.PURPLE_REDSTONE_LAMP.get(), "Purple Redstone Lamp");
        add(BlockInit.RED_REDSTONE_LAMP.get(), "Red Redstone Lamp");
        add(BlockInit.WHITE_REDSTONE_LAMP.get(), "White Redstone Lamp");
        add(BlockInit.YELLOW_REDSTONE_LAMP.get(), "Yellow Redstone Lamp");

        add(BlockInit.ALLOY_FURNACE.get(), "Alloy Furnace");
        add("container.chrispymod.alloy_furnace", "Alloy Furnace");
        add(BlockInit.JAM_AND_JELLY_MAKER.get(), "Jam and Jelly Maker");
        add("container.chrispymod.jam_and_jelly_maker", "Jam and Jelly Maker");

        add("itemGroup.chrispymod", "Chrispy Mod Items");
        add("itemGroup.chrispymod1", "Chrispy Mod Blocks");
    }
}

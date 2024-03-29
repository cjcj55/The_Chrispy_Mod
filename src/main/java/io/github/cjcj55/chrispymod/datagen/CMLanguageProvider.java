package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

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

        add(BlockInit.ALUMINUM_ORE.get(), "Aluminum Ore");
        add(BlockInit.DEEPSLATE_ALUMINUM_ORE.get(), "Deepslate Aluminum Ore");
        add(BlockInit.ANTIMONY_ORE.get(), "Antimony Ore");
        add(BlockInit.DEEPSLATE_ANTIMONY_ORE.get(), "Deepslate Antimony Ore");
        add(BlockInit.ARSENIC_ORE.get(), "Arsenic Ore");
        add(BlockInit.DEEPSLATE_ARSENIC_ORE.get(), "Deepslate Arsenic Ore");
        add(BlockInit.BARIUM_ORE.get(), "Barium Ore");
        add(BlockInit.DEEPSLATE_BARIUM_ORE.get(), "Deepslate Barium Ore");
        add(BlockInit.BERYLLIUM_ORE.get(), "Beryllium Ore");
        add(BlockInit.DEEPSLATE_BERYLLIUM_ORE.get(), "Deepslate Beryllium Ore");
        add(BlockInit.BISMUTH_ORE.get(), "Bismuth Ore");
        add(BlockInit.DEEPSLATE_BISMUTH_ORE.get(), "Deepslate Bismuth Ore");
        add(BlockInit.BORON_ORE.get(), "Boron Ore");
        add(BlockInit.DEEPSLATE_BORON_ORE.get(), "Deepslate Boron Ore");
        add(BlockInit.CADMIUM_ORE.get(), "Cadmium Ore");
        add(BlockInit.DEEPSLATE_CADMIUM_ORE.get(), "Deepslate Cadmium Ore");
        add(BlockInit.CALCIUM_ORE.get(), "Calcium Ore");
        add(BlockInit.DEEPSLATE_CALCIUM_ORE.get(), "Deepslate Calcium Ore");
        add(BlockInit.CERIUM_ORE.get(), "Cerium Ore");
        add(BlockInit.DEEPSLATE_CERIUM_ORE.get(), "Deepslate Cerium Ore");
        add(BlockInit.CESIUM_ORE.get(), "Cesium Ore");
        add(BlockInit.DEEPSLATE_CESIUM_ORE.get(), "Deepslate Cesium Ore");
        add(BlockInit.CHROMIUM_ORE.get(), "Chromium Ore");
        add(BlockInit.DEEPSLATE_CHROMIUM_ORE.get(), "Deepslate Chromium Ore");
        add(BlockInit.DYSPROSIUM_ORE.get(), "Dysprosium Ore");
        add(BlockInit.DEEPSLATE_DYSPROSIUM_ORE.get(), "Deepslate Dysprosium Ore");
        add(BlockInit.ERBIUM_ORE.get(), "Erbium Ore");
        add(BlockInit.DEEPSLATE_ERBIUM_ORE.get(), "Deepslate Erbium Ore");
        add(BlockInit.EUROPIUM_ORE.get(), "Europium Ore");
        add(BlockInit.DEEPSLATE_EUROPIUM_ORE.get(), "Deepslate Europium Ore");
        add(BlockInit.FRANCIUM_ORE.get(), "Francium Ore");
        add(BlockInit.DEEPSLATE_FRANCIUM_ORE.get(), "Deepslate Francium Ore");
        add(BlockInit.GADOLINIUM_ORE.get(), "Gadolinium Ore");
        add(BlockInit.DEEPSLATE_GADOLINIUM_ORE.get(), "Deepslate Gadolinium Ore");
        add(BlockInit.GALLIUM_ORE.get(), "Gallium Ore");
        add(BlockInit.DEEPSLATE_GALLIUM_ORE.get(), "Deepslate Gallium Ore");
        add(BlockInit.GERMANIUM_ORE.get(), "Germanium Ore");
        add(BlockInit.DEEPSLATE_GERMANIUM_ORE.get(), "Deepslate Germanium Ore");
        add(BlockInit.HAFNIUM_ORE.get(), "Hafnium Ore");
        add(BlockInit.DEEPSLATE_HAFNIUM_ORE.get(), "Deepslate Hafnium Ore");
        add(BlockInit.HOLMIUM_ORE.get(), "Holmium Ore");
        add(BlockInit.DEEPSLATE_HOLMIUM_ORE.get(), "Deepslate Holmium Ore");
        add(BlockInit.INDIUM_ORE.get(), "Indium Ore");
        add(BlockInit.DEEPSLATE_INDIUM_ORE.get(), "Deepslate Indium Ore");
        add(BlockInit.IRIDIUM_ORE.get(), "Iridium Ore");
        add(BlockInit.DEEPSLATE_IRIDIUM_ORE.get(), "Deepslate Iridium Ore");
        add(BlockInit.LANTHANUM_ORE.get(), "Lanthanum Ore");
        add(BlockInit.DEEPSLATE_LANTHANUM_ORE.get(), "Deepslate Lanthanum Ore");
        add(BlockInit.LEAD_ORE.get(), "Lead Ore");
        add(BlockInit.DEEPSLATE_LEAD_ORE.get(), "Deepslate Lead Ore");
        add(BlockInit.LITHIUM_ORE.get(), "Lithium Ore");
        add(BlockInit.DEEPSLATE_LITHIUM_ORE.get(), "Deepslate Lithium Ore");
        add(BlockInit.LUTETIUM_ORE.get(), "Lutetium Ore");
        add(BlockInit.DEEPSLATE_LUTETIUM_ORE.get(), "Deepslate Lutetium Ore");
        add(BlockInit.MAGNESIUM_ORE.get(), "Magnesium Ore");
        add(BlockInit.DEEPSLATE_MAGNESIUM_ORE.get(), "Deepslate Magnesium Ore");
        add(BlockInit.MANGANESE_ORE.get(), "Manganese Ore");
        add(BlockInit.DEEPSLATE_MANGANESE_ORE.get(), "Deepslate Manganeses Ore");
        add(BlockInit.MERCURY_ORE.get(), "Mercury Ore");
        add(BlockInit.DEEPSLATE_MERCURY_ORE.get(), "Deepslate Mercury Ore");
        add(BlockInit.MYTHRIL_ORE.get(), "Mythril Ore");
        add(BlockInit.DEEPSLATE_MYTHRIL_ORE.get(), "Deepslate Mythril Ore");
        add(BlockInit.MOLYBDENUM_ORE.get(), "Molybdenum Ore");
        add(BlockInit.DEEPSLATE_MOLYBDENUM_ORE.get(), "Deepslate Molybdenum Ore");
        add(BlockInit.NEODYMIUM_ORE.get(), "Neodymium Ore");
        add(BlockInit.DEEPSLATE_NEODYMIUM_ORE.get(), "Deepslate Neodymium Ore");
        add(BlockInit.NICKEL_ORE.get(), "Nickel Ore");
        add(BlockInit.DEEPSLATE_NICKEL_ORE.get(), "Deepslate Nickel Ore");
        add(BlockInit.OSMIUM_ORE.get(), "Osmium Ore");
        add(BlockInit.DEEPSLATE_OSMIUM_ORE.get(), "Deepslate Osmium Ore");
        add(BlockInit.PALLADIUM_ORE.get(), "Palladium Ore");
        add(BlockInit.DEEPSLATE_PALLADIUM_ORE.get(), "Deepslate Palladium Ore");
        add(BlockInit.PLATINUM_ORE.get(), "Platinum Ore");
        add(BlockInit.DEEPSLATE_PLATINUM_ORE.get(), "Deepslate Platinum Ore");
        add(BlockInit.PLUTONIUM_ORE.get(), "Plutonium Ore");
        add(BlockInit.DEEPSLATE_PLUTONIUM_ORE.get(), "Deepslate Plutonium Ore");
        add(BlockInit.POLONIUM_ORE.get(), "Polonium Ore");
        add(BlockInit.DEEPSLATE_POLONIUM_ORE.get(), "Deepslate Polonium Ore");
        add(BlockInit.POTASSIUM_ORE.get(), "Potassium Ore");
        add(BlockInit.DEEPSLATE_POTASSIUM_ORE.get(), "Deepslate Potassium Ore");
        add(BlockInit.PRASEODYMIUM_ORE.get(), "Praseodymium Ore");
        add(BlockInit.DEEPSLATE_PRASEODYMIUM_ORE.get(), "Deepslate Praseodymium Ore");
        add(BlockInit.PROMETHIUM_ORE.get(), "Promethium Ore");
        add(BlockInit.DEEPSLATE_PROMETHIUM_ORE.get(), "Deepslate Promethium Ore");
        add(BlockInit.RADIUM_ORE.get(), "Radium Ore");
        add(BlockInit.DEEPSLATE_RADIUM_ORE.get(), "Deepslate Radium Ore");
        add(BlockInit.RHODIUM_ORE.get(), "Rhodium Ore");
        add(BlockInit.DEEPSLATE_RHODIUM_ORE.get(), "Deepslate Rhodium Ore");
        add(BlockInit.RUTHENIUM_ORE.get(), "Ruthenium Ore");
        add(BlockInit.DEEPSLATE_RUTHENIUM_ORE.get(), "Deepslate Ruthenium Ore");
        add(BlockInit.SAMARIUM_ORE.get(), "Samarium Ore");
        add(BlockInit.DEEPSLATE_SAMARIUM_ORE.get(), "Deepslate Samarium Ore");
        add(BlockInit.SCANDIUM_ORE.get(), "Scandium Ore");
        add(BlockInit.DEEPSLATE_SCANDIUM_ORE.get(), "Deepslate Scandium Ore");
        add(BlockInit.SELENIUM_ORE.get(), "Selenium Ore");
        add(BlockInit.DEEPSLATE_SELENIUM_ORE.get(), "Deepslate Selenium Ore");
        add(BlockInit.SILICON_ORE.get(), "Silicon Ore");
        add(BlockInit.DEEPSLATE_SILICON_ORE.get(), "Deepslate Silicon Ore");
        add(BlockInit.SILVER_ORE.get(), "Silver Ore");
        add(BlockInit.DEEPSLATE_SILVER_ORE.get(), "Deepslate Silver Ore");
        add(BlockInit.SODIUM_ORE.get(), "Sodium Ore");
        add(BlockInit.DEEPSLATE_SODIUM_ORE.get(), "Deepslate Sodium Ore");
        add(BlockInit.STRONTIUM_ORE.get(), "Strontium Ore");
        add(BlockInit.DEEPSLATE_STRONTIUM_ORE.get(), "Deepslate Strontium Ore");
        add(BlockInit.TELLURIUM_ORE.get(), "Tellurium Ore");
        add(BlockInit.DEEPSLATE_TELLURIUM_ORE.get(), "Deepslate Tellurium Ore");
        add(BlockInit.TERBIUM_ORE.get(), "Terbium Ore");
        add(BlockInit.DEEPSLATE_TERBIUM_ORE.get(), "Deepslate Terbium Ore");
        add(BlockInit.THALLIUM_ORE.get(), "Thallium Ore");
        add(BlockInit.DEEPSLATE_THALLIUM_ORE.get(), "Deepslate Thallium Ore");
        add(BlockInit.THORIUM_ORE.get(), "Thorium Ore");
        add(BlockInit.DEEPSLATE_THORIUM_ORE.get(), "Deepslate Thorium Ore");
        add(BlockInit.THULIUM_ORE.get(), "Thulium Ore");
        add(BlockInit.DEEPSLATE_THULIUM_ORE.get(), "Deepslate Thulium Ore");
        add(BlockInit.TIN_ORE.get(), "Tin Ore");
        add(BlockInit.DEEPSLATE_TIN_ORE.get(), "Deepslate Tin Ore");
        add(BlockInit.TITANIUM_ORE.get(), "Titanium Ore");
        add(BlockInit.DEEPSLATE_TITANIUM_ORE.get(), "Deepslate Titanium Ore");
        add(BlockInit.URANIUM_ORE.get(), "Uranium Ore");
        add(BlockInit.DEEPSLATE_URANIUM_ORE.get(), "Deepslate Uranium Ore");
        add(BlockInit.VANADIUM_ORE.get(), "Vanadium Ore");
        add(BlockInit.DEEPSLATE_VANADIUM_ORE.get(), "Deepslate Vanadium Ore");
        add(BlockInit.VIBRANIUM_ORE.get(), "Vibranium Ore");
        add(BlockInit.DEEPSLATE_VIBRANIUM_ORE.get(), "Deepslate Vibranium Ore");
        add(BlockInit.YTTERBIUM_ORE.get(), "Ytterbium Ore");
        add(BlockInit.DEEPSLATE_YTTERBIUM_ORE.get(), "Deepslate Ytterbium Ore");
        add(BlockInit.YTTRIUM_ORE.get(), "Yttrium Ore");
        add(BlockInit.DEEPSLATE_YTTRIUM_ORE.get(), "Deepslate Yttrium Ore");
        add(BlockInit.ZIRCONIUM_ORE.get(), "Zirconium Ore");
        add(BlockInit.DEEPSLATE_ZIRCONIUM_ORE.get(), "Deepslate Zirconium Ore");

        add(ItemInit.ALUMINUM.get(), "Aluminum");
        add(ItemInit.RAW_ALUMINUM.get(), "Raw Aluminum");
        add(ItemInit.ANTIMONY.get(), "Antimony");
        add(ItemInit.RAW_ANTIMONY.get(), "Raw Antimony");
        add(ItemInit.ARSENIC.get(), "Arsenic");
        add(ItemInit.RAW_ARSENIC.get(), "Raw Arsenic");
        add(ItemInit.BARIUM.get(), "Barium");
        add(ItemInit.RAW_BARIUM.get(), "Raw Barium");
        add(ItemInit.BERYLLIUM.get(), "Beryllium");
        add(ItemInit.RAW_BERYLLIUM.get(), "Raw Beryllium");
        add(ItemInit.BISMUTH.get(), "Bismuth");
        add(ItemInit.RAW_BISMUTH.get(), "Raw Bismuth");
        add(ItemInit.BORON.get(), "Boron");
        add(ItemInit.RAW_BORON.get(), "Raw Boron");
        add(ItemInit.CADMIUM.get(), "Cadmium");
        add(ItemInit.RAW_CADMIUM.get(), "Raw Cadmium");
        add(ItemInit.CALCIUM.get(), "Calcium");
        add(ItemInit.RAW_CALCIUM.get(), "Raw Calcium");
        add(ItemInit.CERIUM.get(), "Cerium");
        add(ItemInit.RAW_CERIUM.get(), "Raw Cerium");
        add(ItemInit.CESIUM.get(), "Cesium");
        add(ItemInit.RAW_CESIUM.get(), "Raw Cesium");
        add(ItemInit.CHROMIUM.get(), "Chromium");
        add(ItemInit.RAW_CHROMIUM.get(), "Raw Chromium");
        add(ItemInit.DYSPROSIUM.get(), "Dysprosium");
        add(ItemInit.RAW_DYSPROSIUM.get(), "Raw Dysprosium");
        add(ItemInit.ERBIUM.get(), "Erbium");
        add(ItemInit.RAW_ERBIUM.get(), "Raw Erbium");
        add(ItemInit.EUROPIUM.get(), "Europium");
        add(ItemInit.RAW_EUROPIUM.get(), "Raw Europium");
        add(ItemInit.FRANCIUM.get(), "Francium");
        add(ItemInit.RAW_FRANCIUM.get(), "Raw Francium");
        add(ItemInit.GADOLINIUM.get(), "Gadolinium");
        add(ItemInit.RAW_GADOLINIUM.get(), "Raw Gadolinium");
        add(ItemInit.GALLIUM.get(), "Gallium");
        add(ItemInit.RAW_GALLIUM.get(), "Raw Gallium");
        add(ItemInit.GERMANIUM.get(), "Germanium");
        add(ItemInit.RAW_GERMANIUM.get(), "Raw Germanium");
        add(ItemInit.HAFNIUM.get(), "Hafnium");
        add(ItemInit.RAW_HAFNIUM.get(), "Raw Hafnium");
        add(ItemInit.HOLMIUM.get(), "Holmium");
        add(ItemInit.RAW_HOLMIUM.get(), "Raw Holmium");
        add(ItemInit.INDIUM.get(), "Indium");
        add(ItemInit.RAW_INDIUM.get(), "Raw Indium");
        add(ItemInit.IRIDIUM.get(), "Iridium");
        add(ItemInit.RAW_IRIDIUM.get(), "Raw Iridium");
        add(ItemInit.LANTHANUM.get(), "Lanthanum");
        add(ItemInit.RAW_LANTHANUM.get(), "Raw Lanthanum");
        add(ItemInit.LEAD.get(), "Lead");
        add(ItemInit.RAW_LEAD.get(), "Raw Lead");
        add(ItemInit.LITHIUM.get(), "Lithium");
        add(ItemInit.RAW_LITHIUM.get(), "Raw Lithium");
        add(ItemInit.LUTETIUM.get(), "Lutetium");
        add(ItemInit.RAW_LUTETIUM.get(), "Raw Lutetium");
        add(ItemInit.MAGNESIUM.get(), "Magnesium");
        add(ItemInit.RAW_MAGNESIUM.get(), "Raw Magnesium");
        add(ItemInit.MANGANESE.get(), "Manganese");
        add(ItemInit.RAW_MANGANESE.get(), "Raw Manganeses");
        add(ItemInit.MERCURY.get(), "Mercury");
        add(ItemInit.RAW_MERCURY.get(), "Raw Mercury");
        add(ItemInit.MYTHRIL.get(), "Mythril");
        add(ItemInit.RAW_MYTHRIL.get(), "Raw Mythril");
        add(ItemInit.MOLYBDENUM.get(), "Molybdenum");
        add(ItemInit.RAW_MOLYBDENUM.get(), "Raw Molybdenum");
        add(ItemInit.NEODYMIUM.get(), "Neodymium");
        add(ItemInit.RAW_NEODYMIUM.get(), "Raw Neodymium");
        add(ItemInit.NICKEL.get(), "Nickel");
        add(ItemInit.RAW_NICKEL.get(), "Raw Nickel");
        add(ItemInit.OSMIUM.get(), "Osmium");
        add(ItemInit.RAW_OSMIUM.get(), "Raw Osmium");
        add(ItemInit.PALLADIUM.get(), "Palladium");
        add(ItemInit.RAW_PALLADIUM.get(), "Raw Palladium");
        add(ItemInit.PLATINUM.get(), "Platinum");
        add(ItemInit.RAW_PLATINUM.get(), "Raw Platinum");
        add(ItemInit.PLUTONIUM.get(), "Plutonium");
        add(ItemInit.RAW_PLUTONIUM.get(), "Raw Plutonium");
        add(ItemInit.POLONIUM.get(), "Polonium");
        add(ItemInit.RAW_POLONIUM.get(), "Raw Polonium");
        add(ItemInit.POTASSIUM.get(), "Potassium");
        add(ItemInit.RAW_POTASSIUM.get(), "Raw Potassium");
        add(ItemInit.PRASEODYMIUM.get(), "Praseodymium");
        add(ItemInit.RAW_PRASEODYMIUM.get(), "Raw Praseodymium");
        add(ItemInit.PROMETHIUM.get(), "Promethium");
        add(ItemInit.RAW_PROMETHIUM.get(), "Raw Promethium");
        add(ItemInit.RADIUM.get(), "Radium");
        add(ItemInit.RAW_RADIUM.get(), "Raw Radium");
        add(ItemInit.RHODIUM.get(), "Rhodium");
        add(ItemInit.RAW_RHODIUM.get(), "Raw Rhodium");
        add(ItemInit.RUTHENIUM.get(), "Ruthenium");
        add(ItemInit.RAW_RUTHENIUM.get(), "Raw Ruthenium");
        add(ItemInit.SAMARIUM.get(), "Samarium");
        add(ItemInit.RAW_SAMARIUM.get(), "Raw Samarium");
        add(ItemInit.SCANDIUM.get(), "Scandium");
        add(ItemInit.RAW_SCANDIUM.get(), "Raw Scandium");
        add(ItemInit.SELENIUM.get(), "Selenium");
        add(ItemInit.RAW_SELENIUM.get(), "Raw Selenium");
        add(ItemInit.SILICON.get(), "Silicon");
        add(ItemInit.RAW_SILICON.get(), "Raw Silicon");
        add(ItemInit.SILVER.get(), "Silver");
        add(ItemInit.RAW_SILVER.get(), "Raw Silver");
        add(ItemInit.SODIUM.get(), "Sodium");
        add(ItemInit.RAW_SODIUM.get(), "Raw Sodium");
        add(ItemInit.STRONTIUM.get(), "Strontium");
        add(ItemInit.RAW_STRONTIUM.get(), "Raw Strontium");
        add(ItemInit.TELLURIUM.get(), "Tellurium");
        add(ItemInit.RAW_TELLURIUM.get(), "Raw Tellurium");
        add(ItemInit.TERBIUM.get(), "Terbium");
        add(ItemInit.RAW_TERBIUM.get(), "Raw Terbium");
        add(ItemInit.THALLIUM.get(), "Thallium");
        add(ItemInit.RAW_THALLIUM.get(), "Raw Thallium");
        add(ItemInit.THORIUM.get(), "Thorium");
        add(ItemInit.RAW_THORIUM.get(), "Raw Thorium");
        add(ItemInit.THULIUM.get(), "Thulium");
        add(ItemInit.RAW_THULIUM.get(), "Raw Thulium");
        add(ItemInit.TIN.get(), "Tin");
        add(ItemInit.RAW_TIN.get(), "Raw Tin");
        add(ItemInit.TITANIUM.get(), "Titanium");
        add(ItemInit.RAW_TITANIUM.get(), "Raw Titanium");
        add(ItemInit.URANIUM.get(), "Uranium");
        add(ItemInit.RAW_URANIUM.get(), "Raw Uranium");
        add(ItemInit.VANADIUM.get(), "Vanadium");
        add(ItemInit.RAW_VANADIUM.get(), "Raw Vanadium");
        add(ItemInit.VIBRANIUM.get(), "Vibranium");
        add(ItemInit.RAW_VIBRANIUM.get(), "Raw Vibranium");
        add(ItemInit.YTTERBIUM.get(), "Ytterbium");
        add(ItemInit.RAW_YTTERBIUM.get(), "Raw Ytterbium");
        add(ItemInit.YTTRIUM.get(), "Yttrium");
        add(ItemInit.RAW_YTTRIUM.get(), "Raw Yttrium");
        add(ItemInit.ZIRCONIUM.get(), "Zirconium");
        add(ItemInit.RAW_ZIRCONIUM.get(), "Raw Zirconium");

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

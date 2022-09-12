package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.tags.ModBlockTags;
import io.github.cjcj55.chrispymod.common.tags.ModItemTags;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CMItemTagProvider extends ItemTagsProvider {

    public CMItemTagProvider(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, ChrispyMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(BlockInit.RUBY_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem())
                .add(BlockInit.RUBY_ORE_NETHER.get().asItem())
                .add(BlockInit.OPAL_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_OPAL_ORE.get().asItem())
                .add(BlockInit.TANGERINE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TANGERINE_ORE.get().asItem())
                .add(BlockInit.COBALT_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_COBALT_ORE.get().asItem())
                .add(BlockInit.PARYTH_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PARYTH_ORE.get().asItem())
                .add(BlockInit.WHITE_DWARF_STAR_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().asItem())
                .add(BlockInit.NATURAL_ESSENCE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get().asItem())
                .add(BlockInit.EXPERIENCE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get().asItem())
                .add(BlockInit.FLAME_ORE_NETHER.get().asItem())
                .add(BlockInit.HELLFIRE_ORE_NETHER.get().asItem())
                .add(BlockInit.ALUMINUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ALUMINUM_ORE.get().asItem())
                .add(BlockInit.ANTIMONY_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ANTIMONY_ORE.get().asItem())
                .add(BlockInit.ARSENIC_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ARSENIC_ORE.get().asItem())
                .add(BlockInit.BARIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_BARIUM_ORE.get().asItem())
                .add(BlockInit.BERYLLIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_BERYLLIUM_ORE.get().asItem())
                .add(BlockInit.BISMUTH_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_BISMUTH_ORE.get().asItem())
                .add(BlockInit.BORON_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_BORON_ORE.get().asItem())
                .add(BlockInit.CADMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CADMIUM_ORE.get().asItem())
                .add(BlockInit.CALCIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CALCIUM_ORE.get().asItem())
                .add(BlockInit.CERIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CERIUM_ORE.get().asItem())
                .add(BlockInit.CESIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CESIUM_ORE.get().asItem())
                .add(BlockInit.CHROMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CHROMIUM_ORE.get().asItem())
                .add(BlockInit.DYSPROSIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_DYSPROSIUM_ORE.get().asItem())
                .add(BlockInit.ERBIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ERBIUM_ORE.get().asItem())
                .add(BlockInit.EUROPIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_EUROPIUM_ORE.get().asItem())
                .add(BlockInit.FRANCIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_FRANCIUM_ORE.get().asItem())
                .add(BlockInit.GADOLINIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_GADOLINIUM_ORE.get().asItem())
                .add(BlockInit.GALLIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_GALLIUM_ORE.get().asItem())
                .add(BlockInit.GERMANIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_GERMANIUM_ORE.get().asItem())
                .add(BlockInit.HAFNIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_HAFNIUM_ORE.get().asItem())
                .add(BlockInit.HOLMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_HOLMIUM_ORE.get().asItem())
                .add(BlockInit.INDIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_INDIUM_ORE.get().asItem())
                .add(BlockInit.IRIDIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_IRIDIUM_ORE.get().asItem())
                .add(BlockInit.LANTHANUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_LANTHANUM_ORE.get().asItem())
                .add(BlockInit.LEAD_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_LEAD_ORE.get().asItem())
                .add(BlockInit.LITHIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_LITHIUM_ORE.get().asItem())
                .add(BlockInit.LUTETIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_LUTETIUM_ORE.get().asItem())
                .add(BlockInit.MAGNESIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MAGNESIUM_ORE.get().asItem())
                .add(BlockInit.MANGANESE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MANGANESE_ORE.get().asItem())
                .add(BlockInit.MERCURY_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MERCURY_ORE.get().asItem())
                .add(BlockInit.MYTHRIL_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MYTHRIL_ORE.get().asItem())
                .add(BlockInit.MOLYBDENUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MOLYBDENUM_ORE.get().asItem())
                .add(BlockInit.NEODYMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_NEODYMIUM_ORE.get().asItem())
                .add(BlockInit.NICKEL_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_NICKEL_ORE.get().asItem())
                .add(BlockInit.OSMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_OSMIUM_ORE.get().asItem())
                .add(BlockInit.PALLADIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PALLADIUM_ORE.get().asItem())
                .add(BlockInit.PLATINUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PLATINUM_ORE.get().asItem())
                .add(BlockInit.PLUTONIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PLUTONIUM_ORE.get().asItem())
                .add(BlockInit.POLONIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_POLONIUM_ORE.get().asItem())
                .add(BlockInit.POTASSIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_POTASSIUM_ORE.get().asItem())
                .add(BlockInit.PRASEODYMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PRASEODYMIUM_ORE.get().asItem())
                .add(BlockInit.PROMETHIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PROMETHIUM_ORE.get().asItem())
                .add(BlockInit.RADIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RADIUM_ORE.get().asItem())
                .add(BlockInit.RHODIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RHODIUM_ORE.get().asItem())
                .add(BlockInit.RUTHENIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RUTHENIUM_ORE.get().asItem())
                .add(BlockInit.SAMARIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SAMARIUM_ORE.get().asItem())
                .add(BlockInit.SCANDIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SCANDIUM_ORE.get().asItem())
                .add(BlockInit.SELENIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SELENIUM_ORE.get().asItem())
                .add(BlockInit.SILICON_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SILICON_ORE.get().asItem())
                .add(BlockInit.SILVER_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SILVER_ORE.get().asItem())
                .add(BlockInit.SODIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SODIUM_ORE.get().asItem())
                .add(BlockInit.STRONTIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_STRONTIUM_ORE.get().asItem())
                .add(BlockInit.TELLURIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TELLURIUM_ORE.get().asItem())
                .add(BlockInit.TERBIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TERBIUM_ORE.get().asItem())
                .add(BlockInit.THALLIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_THALLIUM_ORE.get().asItem())
                .add(BlockInit.THORIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_THORIUM_ORE.get().asItem())
                .add(BlockInit.THULIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_THULIUM_ORE.get().asItem())
                .add(BlockInit.TIN_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TIN_ORE.get().asItem())
                .add(BlockInit.TITANIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TITANIUM_ORE.get().asItem())
                .add(BlockInit.URANIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_URANIUM_ORE.get().asItem())
                .add(BlockInit.VANADIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_VANADIUM_ORE.get().asItem())
                .add(BlockInit.VIBRANIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_VIBRANIUM_ORE.get().asItem())
                .add(BlockInit.YTTERBIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_YTTERBIUM_ORE.get().asItem())
                .add(BlockInit.YTTRIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_YTTRIUM_ORE.get().asItem())
                .add(BlockInit.ZIRCONIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ZIRCONIUM_ORE.get().asItem());
        tag(Tags.Items.GEMS)
                .add(ItemInit.BLUE_EMERALD.get())
                .add(ItemInit.COBALT.get())
                .add(ItemInit.OPAL.get())
                .add(ItemInit.RUBY.get())
                .add(ItemInit.WHITE_DWARF_STAR.get())
                .add(ItemInit.COBALT.get());
        tag(Tags.Items.RAW_MATERIALS)
                .add(ItemInit.RAW_ALUMINUM.get())
                .add(ItemInit.RAW_ANTIMONY.get())
                .add(ItemInit.RAW_ARSENIC.get())
                .add(ItemInit.RAW_BARIUM.get())
                .add(ItemInit.RAW_BERYLLIUM.get())
                .add(ItemInit.RAW_BISMUTH.get())
                .add(ItemInit.RAW_BORON.get())
                .add(ItemInit.RAW_CADMIUM.get())
                .add(ItemInit.RAW_CALCIUM.get())
                .add(ItemInit.RAW_CERIUM.get())
                .add(ItemInit.RAW_CESIUM.get())
                .add(ItemInit.RAW_CHROMIUM.get())
                .add(ItemInit.RAW_DYSPROSIUM.get())
                .add(ItemInit.RAW_ERBIUM.get())
                .add(ItemInit.RAW_EUROPIUM.get())
                .add(ItemInit.RAW_FRANCIUM.get())
                .add(ItemInit.RAW_GADOLINIUM.get())
                .add(ItemInit.RAW_GALLIUM.get())
                .add(ItemInit.RAW_GERMANIUM.get())
                .add(ItemInit.RAW_HAFNIUM.get())
                .add(ItemInit.RAW_HOLMIUM.get())
                .add(ItemInit.RAW_INDIUM.get())
                .add(ItemInit.RAW_IRIDIUM.get())
                .add(ItemInit.RAW_LANTHANUM.get())
                .add(ItemInit.RAW_LEAD.get())
                .add(ItemInit.RAW_LITHIUM.get())
                .add(ItemInit.RAW_LUTETIUM.get())
                .add(ItemInit.RAW_MAGNESIUM.get())
                .add(ItemInit.RAW_MANGANESE.get())
                .add(ItemInit.RAW_MERCURY.get())
                .add(ItemInit.RAW_MYTHRIL.get())
                .add(ItemInit.RAW_MOLYBDENUM.get())
                .add(ItemInit.RAW_NEODYMIUM.get())
                .add(ItemInit.RAW_NICKEL.get())
                .add(ItemInit.RAW_OSMIUM.get())
                .add(ItemInit.RAW_PALLADIUM.get())
                .add(ItemInit.RAW_PLATINUM.get())
                .add(ItemInit.RAW_PLUTONIUM.get())
                .add(ItemInit.RAW_POLONIUM.get())
                .add(ItemInit.RAW_POTASSIUM.get())
                .add(ItemInit.RAW_PRASEODYMIUM.get())
                .add(ItemInit.RAW_PROMETHIUM.get())
                .add(ItemInit.RAW_RADIUM.get())
                .add(ItemInit.RAW_RHODIUM.get())
                .add(ItemInit.RAW_RUTHENIUM.get())
                .add(ItemInit.RAW_SAMARIUM.get())
                .add(ItemInit.RAW_SCANDIUM.get())
                .add(ItemInit.RAW_SELENIUM.get())
                .add(ItemInit.RAW_SILICON.get())
                .add(ItemInit.RAW_SILVER.get())
                .add(ItemInit.RAW_SODIUM.get())
                .add(ItemInit.RAW_STRONTIUM.get())
                .add(ItemInit.RAW_TELLURIUM.get())
                .add(ItemInit.RAW_TERBIUM.get())
                .add(ItemInit.RAW_THALLIUM.get())
                .add(ItemInit.RAW_THORIUM.get())
                .add(ItemInit.RAW_THULIUM.get())
                .add(ItemInit.RAW_TIN.get())
                .add(ItemInit.RAW_TITANIUM.get())
                .add(ItemInit.RAW_URANIUM.get())
                .add(ItemInit.RAW_VANADIUM.get())
                .add(ItemInit.RAW_VIBRANIUM.get())
                .add(ItemInit.RAW_YTTERBIUM.get())
                .add(ItemInit.RAW_YTTRIUM.get())
                .add(ItemInit.RAW_ZIRCONIUM.get());

        tag(ModItemTags.RUBY_ORE)
                .add(BlockInit.RUBY_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem())
                .add(BlockInit.RUBY_ORE_NETHER.get().asItem());
        tag(ModItemTags.OPAL_ORE)
                .add(BlockInit.OPAL_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_OPAL_ORE.get().asItem());
        tag(ModItemTags.TANGERINE_ORE)
                .add(BlockInit.TANGERINE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TANGERINE_ORE.get().asItem());
        tag(ModItemTags.COBALT_ORE)
                .add(BlockInit.COBALT_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_COBALT_ORE.get().asItem());
        tag(ModItemTags.PARYTH_ORE)
                .add(BlockInit.PARYTH_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PARYTH_ORE.get().asItem());
        tag(ModItemTags.WHITE_DWARF_STAR_ORE)
                .add(BlockInit.WHITE_DWARF_STAR_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().asItem());
        tag(ModItemTags.NATURAL_ESSENCE_ORE)
                .add(BlockInit.NATURAL_ESSENCE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get().asItem());
        tag(ModItemTags.EXPERIENCE_ORE)
                .add(BlockInit.EXPERIENCE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get().asItem());
        tag(ModItemTags.ALUMINUM_ORE)
                .add(BlockInit.ALUMINUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ALUMINUM_ORE.get().asItem());
        tag(ModItemTags.ANTIMONY_ORE)
                .add(BlockInit.ANTIMONY_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ANTIMONY_ORE.get().asItem());
        tag(ModItemTags.ARSENIC_ORE)
                .add(BlockInit.ARSENIC_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ARSENIC_ORE.get().asItem());
        tag(ModItemTags.BARIUM_ORE)
                .add(BlockInit.BARIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_BARIUM_ORE.get().asItem());
        tag(ModItemTags.BERYLLIUM_ORE)
                .add(BlockInit.BERYLLIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_BERYLLIUM_ORE.get().asItem());
        tag(ModItemTags.BISMUTH_ORE)
                .add(BlockInit.BISMUTH_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_BISMUTH_ORE.get().asItem());
        tag(ModItemTags.BORON_ORE)
                .add(BlockInit.BORON_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_BORON_ORE.get().asItem());
        tag(ModItemTags.CADMIUM_ORE)
                .add(BlockInit.CADMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CADMIUM_ORE.get().asItem());
        tag(ModItemTags.CALCIUM_ORE)
                .add(BlockInit.CALCIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CALCIUM_ORE.get().asItem());
        tag(ModItemTags.CERIUM_ORE)
                .add(BlockInit.CERIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CERIUM_ORE.get().asItem());
        tag(ModItemTags.CESIUM_ORE)
                .add(BlockInit.CESIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CESIUM_ORE.get().asItem());
        tag(ModItemTags.CHROMIUM_ORE)
                .add(BlockInit.CHROMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_CHROMIUM_ORE.get().asItem());
        tag(ModItemTags.DYSPROSIUM_ORE)
                .add(BlockInit.DYSPROSIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_DYSPROSIUM_ORE.get().asItem());
        tag(ModItemTags.ERBIUM_ORE)
                .add(BlockInit.ERBIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ERBIUM_ORE.get().asItem());
        tag(ModItemTags.EUROPIUM_ORE)
                .add(BlockInit.EUROPIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_EUROPIUM_ORE.get().asItem());
        tag(ModItemTags.FRANCIUM_ORE)
                .add(BlockInit.FRANCIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_FRANCIUM_ORE.get().asItem());
        tag(ModItemTags.GADOLINIUM_ORE)
                .add(BlockInit.GADOLINIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_GADOLINIUM_ORE.get().asItem());
        tag(ModItemTags.GALLIUM_ORE)
                .add(BlockInit.GALLIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_GALLIUM_ORE.get().asItem());
        tag(ModItemTags.GERMANIUM_ORE)
                .add(BlockInit.GERMANIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_GERMANIUM_ORE.get().asItem());
        tag(ModItemTags.HAFNIUM_ORE)
                .add(BlockInit.HAFNIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_HAFNIUM_ORE.get().asItem());
        tag(ModItemTags.HOLMIUM_ORE)
                .add(BlockInit.HOLMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_HOLMIUM_ORE.get().asItem());
        tag(ModItemTags.INDIUM_ORE)
                .add(BlockInit.INDIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_INDIUM_ORE.get().asItem());
        tag(ModItemTags.IRIDIUM_ORE)
                .add(BlockInit.IRIDIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_IRIDIUM_ORE.get().asItem());
        tag(ModItemTags.LANTHANUM_ORE)
                .add(BlockInit.LANTHANUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_LANTHANUM_ORE.get().asItem());
        tag(ModItemTags.LEAD_ORE)
                .add(BlockInit.LEAD_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_LEAD_ORE.get().asItem());
        tag(ModItemTags.LITHIUM_ORE)
                .add(BlockInit.LITHIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_LITHIUM_ORE.get().asItem());
        tag(ModItemTags.LUTETIUM_ORE)
                .add(BlockInit.LUTETIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_LUTETIUM_ORE.get().asItem());
        tag(ModItemTags.MAGNESIUM_ORE)
                .add(BlockInit.MAGNESIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MAGNESIUM_ORE.get().asItem());
        tag(ModItemTags.MANGANESE_ORE)
                .add(BlockInit.MANGANESE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MANGANESE_ORE.get().asItem());
        tag(ModItemTags.MERCURY_ORE)
                .add(BlockInit.MERCURY_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MERCURY_ORE.get().asItem());
        tag(ModItemTags.MYTHRIL_ORE)
                .add(BlockInit.MYTHRIL_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MYTHRIL_ORE.get().asItem());
        tag(ModItemTags.MOLYBDENUM_ORE)
                .add(BlockInit.MOLYBDENUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_MOLYBDENUM_ORE.get().asItem());
        tag(ModItemTags.NEODYMIUM_ORE)
                .add(BlockInit.NEODYMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_NEODYMIUM_ORE.get().asItem());
        tag(ModItemTags.NICKEL_ORE)
                .add(BlockInit.NICKEL_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_NICKEL_ORE.get().asItem());
        tag(ModItemTags.OSMIUM_ORE)
                .add(BlockInit.OSMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_OSMIUM_ORE.get().asItem());
        tag(ModItemTags.PALLADIUM_ORE)
                .add(BlockInit.PALLADIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PALLADIUM_ORE.get().asItem());
        tag(ModItemTags.PLATINUM_ORE)
                .add(BlockInit.PLATINUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PLATINUM_ORE.get().asItem());
        tag(ModItemTags.PLUTONIUM_ORE)
                .add(BlockInit.PLUTONIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PLUTONIUM_ORE.get().asItem());
        tag(ModItemTags.POLONIUM_ORE)
                .add(BlockInit.POLONIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_POLONIUM_ORE.get().asItem());
        tag(ModItemTags.POTASSIUM_ORE)
                .add(BlockInit.POTASSIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_POTASSIUM_ORE.get().asItem());
        tag(ModItemTags.PRASEODYMIUM_ORE)
                .add(BlockInit.PRASEODYMIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PRASEODYMIUM_ORE.get().asItem());
        tag(ModItemTags.PROMETHIUM_ORE)
                .add(BlockInit.PROMETHIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PROMETHIUM_ORE.get().asItem());
        tag(ModItemTags.RADIUM_ORE)
                .add(BlockInit.RADIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RADIUM_ORE.get().asItem());
        tag(ModItemTags.RHODIUM_ORE)
                .add(BlockInit.RHODIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RHODIUM_ORE.get().asItem());
        tag(ModItemTags.RUTHENIUM_ORE)
                .add(BlockInit.RUTHENIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RUTHENIUM_ORE.get().asItem());
        tag(ModItemTags.SAMARIUM_ORE)
                .add(BlockInit.SAMARIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SAMARIUM_ORE.get().asItem());
        tag(ModItemTags.SCANDIUM_ORE)
                .add(BlockInit.SCANDIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SCANDIUM_ORE.get().asItem());
        tag(ModItemTags.SELENIUM_ORE)
                .add(BlockInit.SELENIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SELENIUM_ORE.get().asItem());
        tag(ModItemTags.SILICON_ORE)
                .add(BlockInit.SILICON_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SILICON_ORE.get().asItem());
        tag(ModItemTags.SILVER_ORE)
                .add(BlockInit.SILVER_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SILVER_ORE.get().asItem());
        tag(ModItemTags.SODIUM_ORE)
                .add(BlockInit.SODIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_SODIUM_ORE.get().asItem());
        tag(ModItemTags.STRONTIUM_ORE)
                .add(BlockInit.STRONTIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_STRONTIUM_ORE.get().asItem());
        tag(ModItemTags.TELLURIUM_ORE)
                .add(BlockInit.TELLURIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TELLURIUM_ORE.get().asItem());
        tag(ModItemTags.TERBIUM_ORE)
                .add(BlockInit.TERBIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TERBIUM_ORE.get().asItem());
        tag(ModItemTags.THALLIUM_ORE)
                .add(BlockInit.THALLIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_THALLIUM_ORE.get().asItem());
        tag(ModItemTags.THORIUM_ORE)
                .add(BlockInit.THORIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_THORIUM_ORE.get().asItem());
        tag(ModItemTags.THULIUM_ORE)
                .add(BlockInit.THULIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_THULIUM_ORE.get().asItem());
        tag(ModItemTags.TIN_ORE)
                .add(BlockInit.TIN_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TIN_ORE.get().asItem());
        tag(ModItemTags.TITANIUM_ORE)
                .add(BlockInit.TITANIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TITANIUM_ORE.get().asItem());
        tag(ModItemTags.URANIUM_ORE)
                .add(BlockInit.URANIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_URANIUM_ORE.get().asItem());
        tag(ModItemTags.VANADIUM_ORE)
                .add(BlockInit.VANADIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_VANADIUM_ORE.get().asItem());
        tag(ModItemTags.VIBRANIUM_ORE)
                .add(BlockInit.VIBRANIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_VIBRANIUM_ORE.get().asItem());
        tag(ModItemTags.YTTERBIUM_ORE)
                .add(BlockInit.YTTERBIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_YTTERBIUM_ORE.get().asItem());
        tag(ModItemTags.YTTRIUM_ORE)
                .add(BlockInit.YTTRIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_YTTRIUM_ORE.get().asItem());
        tag(ModItemTags.ZIRCONIUM_ORE)
                .add(BlockInit.ZIRCONIUM_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_ZIRCONIUM_ORE.get().asItem());
        tag(ModItemTags.BERRIES)
                .add(ItemInit.STRAWBERRY.get())
                .add(ItemInit.BLUEBERRY.get())
                .add(ItemInit.LOGANBERRY.get())
                .add(ItemInit.RED_RASPBERRY.get())
                .add(ItemInit.BLACK_RASPBERRY.get())
                .add(ItemInit.GOLDEN_RASPBERRY.get())
                .add(ItemInit.WHITE_RASPBERRY.get())
                .add(ItemInit.MARIONBERRY.get())
                .add(ItemInit.BLACKCURRANT.get())
                .add(ItemInit.REDCURRANT.get())
                .add(ItemInit.HUCKLEBERRY.get())
                .add(ItemInit.WINEBERRY.get())
                .add(ItemInit.ELDERBERRY.get())
                .add(ItemInit.BLACKBERRY.get())
                .add(ItemInit.BOYSENBERRY.get())
                .add(ItemInit.GROUND_CHERRY.get())
                .add(ItemInit.ARONIA_BERRY.get())
                .add(ItemInit.SERVICEBERRY.get())
                .add(ItemInit.WONDERBERRY.get())
                .add(ItemInit.MULBERRY.get())
                .add(ItemInit.LINGONBERRY.get())
                .add(ItemInit.CRANBERRY.get())
                .add(ItemInit.DEWBERRY.get())
                .add(ItemInit.THIMBLEBERRY.get())
                .add(ItemInit.GOOSEBERRY.get())
                .add(ItemInit.CHOKEBERRY.get())
                .add(ItemInit.OLALLIEBERRY.get())
                .add(ItemInit.ACEROLA_CHERRY.get())
                .add(ItemInit.BARBERRY.get())
                .add(ItemInit.BAYBERRY.get())
                .add(ItemInit.GOGI_BERRY.get())
                .add(Items.SWEET_BERRIES);
        tag(ModItemTags.BERRY_JAMS)
                .add(ItemInit.STRAWBERRY_JAM.get())
                .add(ItemInit.BLUEBERRY_JAM.get())
                .add(ItemInit.LOGANBERRY_JAM.get())
                .add(ItemInit.RED_RASPBERRY_JAM.get())
                .add(ItemInit.BLACK_RASPBERRY_JAM.get())
                .add(ItemInit.GOLDEN_RASPBERRY_JAM.get())
                .add(ItemInit.WHITE_RASPBERRY_JAM.get())
                .add(ItemInit.MARIONBERRY_JAM.get())
                .add(ItemInit.BLACKCURRANT_JAM.get())
                .add(ItemInit.REDCURRANT_JAM.get())
                .add(ItemInit.HUCKLEBERRY_JAM.get())
                .add(ItemInit.WINEBERRY_JAM.get())
                .add(ItemInit.ELDERBERRY_JAM.get())
                .add(ItemInit.BLACKBERRY_JAM.get())
                .add(ItemInit.BOYSENBERRY_JAM.get())
                .add(ItemInit.GROUND_CHERRY_JAM.get())
                .add(ItemInit.ARONIA_BERRY_JAM.get())
                .add(ItemInit.SERVICEBERRY_JAM.get())
                .add(ItemInit.WONDERBERRY_JAM.get())
                .add(ItemInit.MULBERRY_JAM.get())
                .add(ItemInit.LINGONBERRY_JAM.get())
                .add(ItemInit.CRANBERRY_JAM.get())
                .add(ItemInit.DEWBERRY_JAM.get())
                .add(ItemInit.THIMBLEBERRY_JAM.get())
                .add(ItemInit.GOOSEBERRY_JAM.get())
                .add(ItemInit.CHOKEBERRY_JAM.get())
                .add(ItemInit.OLALLIEBERRY_JAM.get())
                .add(ItemInit.ACEROLA_CHERRY_JAM.get())
                .add(ItemInit.BARBERRY_JAM.get())
                .add(ItemInit.BAYBERRY_JAM.get())
                .add(ItemInit.GOGI_BERRY_JAM.get());

        /*tag(Tags.Items.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.MYSTERIOUS_INGOT.get());
        tag(Registration.MYSTERIOUS_ORE_ITEM)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());*/
    }

    @Override
    public String getName() {
        return "Chrispy Mod Tags";
    }
}
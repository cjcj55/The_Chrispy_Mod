package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.registry.CMBlocks;
import github.cjcj55.chrispymod.registry.CMItems;
import github.cjcj55.chrispymod.util.CMItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CMItemTagGenerator extends ItemTagsProvider {
    public CMItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, ChrispyMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(Tags.Items.ORES)
                .add(CMBlocks.RUBY_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_RUBY_ORE.get().asItem())
                .add(CMBlocks.RUBY_ORE_NETHER.get().asItem())
                .add(CMBlocks.OPAL_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_OPAL_ORE.get().asItem())
                .add(CMBlocks.TANGERINE_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_TANGERINE_ORE.get().asItem())
                .add(CMBlocks.COBALT_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_COBALT_ORE.get().asItem())
                .add(CMBlocks.PARYTH_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_PARYTH_ORE.get().asItem())
                .add(CMBlocks.WHITE_DWARF_STAR_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().asItem())
                .add(CMBlocks.NATURAL_ESSENCE_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get().asItem())
                .add(CMBlocks.EXPERIENCE_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_EXPERIENCE_ORE.get().asItem())
                .add(CMBlocks.FLAME_ORE_NETHER.get().asItem())
                .add(CMBlocks.HELLFIRE_ORE_NETHER.get().asItem());
//                .add(CMBlocks.ALUMINUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ALUMINUM_ORE.get().asItem())
//                .add(CMBlocks.ANTIMONY_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ANTIMONY_ORE.get().asItem())
//                .add(CMBlocks.ARSENIC_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ARSENIC_ORE.get().asItem())
//                .add(CMBlocks.BARIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_BARIUM_ORE.get().asItem())
//                .add(CMBlocks.BERYLLIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_BERYLLIUM_ORE.get().asItem())
//                .add(CMBlocks.BISMUTH_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_BISMUTH_ORE.get().asItem())
//                .add(CMBlocks.BORON_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_BORON_ORE.get().asItem())
//                .add(CMBlocks.CADMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CADMIUM_ORE.get().asItem())
//                .add(CMBlocks.CALCIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CALCIUM_ORE.get().asItem())
//                .add(CMBlocks.CERIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CERIUM_ORE.get().asItem())
//                .add(CMBlocks.CESIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CESIUM_ORE.get().asItem())
//                .add(CMBlocks.CHROMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CHROMIUM_ORE.get().asItem())
//                .add(CMBlocks.DYSPROSIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_DYSPROSIUM_ORE.get().asItem())
//                .add(CMBlocks.ERBIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ERBIUM_ORE.get().asItem())
//                .add(CMBlocks.EUROPIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_EUROPIUM_ORE.get().asItem())
//                .add(CMBlocks.FRANCIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_FRANCIUM_ORE.get().asItem())
//                .add(CMBlocks.GADOLINIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_GADOLINIUM_ORE.get().asItem())
//                .add(CMBlocks.GALLIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_GALLIUM_ORE.get().asItem())
//                .add(CMBlocks.GERMANIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_GERMANIUM_ORE.get().asItem())
//                .add(CMBlocks.HAFNIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_HAFNIUM_ORE.get().asItem())
//                .add(CMBlocks.HOLMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_HOLMIUM_ORE.get().asItem())
//                .add(CMBlocks.INDIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_INDIUM_ORE.get().asItem())
//                .add(CMBlocks.IRIDIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_IRIDIUM_ORE.get().asItem())
//                .add(CMBlocks.LANTHANUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_LANTHANUM_ORE.get().asItem())
//                .add(CMBlocks.LEAD_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_LEAD_ORE.get().asItem())
//                .add(CMBlocks.LITHIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_LITHIUM_ORE.get().asItem())
//                .add(CMBlocks.LUTETIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_LUTETIUM_ORE.get().asItem())
//                .add(CMBlocks.MAGNESIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MAGNESIUM_ORE.get().asItem())
//                .add(CMBlocks.MANGANESE_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MANGANESE_ORE.get().asItem())
//                .add(CMBlocks.MERCURY_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MERCURY_ORE.get().asItem())
//                .add(CMBlocks.MYTHRIL_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MYTHRIL_ORE.get().asItem())
//                .add(CMBlocks.MOLYBDENUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MOLYBDENUM_ORE.get().asItem())
//                .add(CMBlocks.NEODYMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_NEODYMIUM_ORE.get().asItem())
//                .add(CMBlocks.NICKEL_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_NICKEL_ORE.get().asItem())
//                .add(CMBlocks.OSMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_OSMIUM_ORE.get().asItem())
//                .add(CMBlocks.PALLADIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PALLADIUM_ORE.get().asItem())
//                .add(CMBlocks.PLATINUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PLATINUM_ORE.get().asItem())
//                .add(CMBlocks.PLUTONIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PLUTONIUM_ORE.get().asItem())
//                .add(CMBlocks.POLONIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_POLONIUM_ORE.get().asItem())
//                .add(CMBlocks.POTASSIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_POTASSIUM_ORE.get().asItem())
//                .add(CMBlocks.PRASEODYMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PRASEODYMIUM_ORE.get().asItem())
//                .add(CMBlocks.PROMETHIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PROMETHIUM_ORE.get().asItem())
//                .add(CMBlocks.RADIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_RADIUM_ORE.get().asItem())
//                .add(CMBlocks.RHODIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_RHODIUM_ORE.get().asItem())
//                .add(CMBlocks.RUTHENIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_RUTHENIUM_ORE.get().asItem())
//                .add(CMBlocks.SAMARIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SAMARIUM_ORE.get().asItem())
//                .add(CMBlocks.SCANDIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SCANDIUM_ORE.get().asItem())
//                .add(CMBlocks.SELENIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SELENIUM_ORE.get().asItem())
//                .add(CMBlocks.SILICON_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SILICON_ORE.get().asItem())
//                .add(CMBlocks.SILVER_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SILVER_ORE.get().asItem())
//                .add(CMBlocks.SODIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SODIUM_ORE.get().asItem())
//                .add(CMBlocks.STRONTIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_STRONTIUM_ORE.get().asItem())
//                .add(CMBlocks.TELLURIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_TELLURIUM_ORE.get().asItem())
//                .add(CMBlocks.TERBIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_TERBIUM_ORE.get().asItem())
//                .add(CMBlocks.THALLIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_THALLIUM_ORE.get().asItem())
//                .add(CMBlocks.THORIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_THORIUM_ORE.get().asItem())
//                .add(CMBlocks.THULIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_THULIUM_ORE.get().asItem())
//                .add(CMBlocks.TIN_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_TIN_ORE.get().asItem())
//                .add(CMBlocks.TITANIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_TITANIUM_ORE.get().asItem())
//                .add(CMBlocks.URANIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_URANIUM_ORE.get().asItem())
//                .add(CMBlocks.VANADIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_VANADIUM_ORE.get().asItem())
//                .add(CMBlocks.VIBRANIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_VIBRANIUM_ORE.get().asItem())
//                .add(CMBlocks.YTTERBIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_YTTERBIUM_ORE.get().asItem())
//                .add(CMBlocks.YTTRIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_YTTRIUM_ORE.get().asItem())
//                .add(CMBlocks.ZIRCONIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ZIRCONIUM_ORE.get().asItem());
        this.tag(Tags.Items.GEMS)
                .add(CMItems.BLUE_EMERALD.get())
                .add(CMItems.COBALT.get())
                .add(CMItems.OPAL.get())
                .add(CMItems.RUBY.get())
                .add(CMItems.WHITE_DWARF_STAR.get())
                .add(CMItems.COBALT.get());
//        this.tag(Tags.Items.RAW_MATERIALS)
//                .add(CMItems.RAW_ALUMINUM.get())
//                .add(CMItems.RAW_ANTIMONY.get())
//                .add(CMItems.RAW_ARSENIC.get())
//                .add(CMItems.RAW_BARIUM.get())
//                .add(CMItems.RAW_BERYLLIUM.get())
//                .add(CMItems.RAW_BISMUTH.get())
//                .add(CMItems.RAW_BORON.get())
//                .add(CMItems.RAW_CADMIUM.get())
//                .add(CMItems.RAW_CALCIUM.get())
//                .add(CMItems.RAW_CERIUM.get())
//                .add(CMItems.RAW_CESIUM.get())
//                .add(CMItems.RAW_CHROMIUM.get())
//                .add(CMItems.RAW_DYSPROSIUM.get())
//                .add(CMItems.RAW_ERBIUM.get())
//                .add(CMItems.RAW_EUROPIUM.get())
//                .add(CMItems.RAW_FRANCIUM.get())
//                .add(CMItems.RAW_GADOLINIUM.get())
//                .add(CMItems.RAW_GALLIUM.get())
//                .add(CMItems.RAW_GERMANIUM.get())
//                .add(CMItems.RAW_HAFNIUM.get())
//                .add(CMItems.RAW_HOLMIUM.get())
//                .add(CMItems.RAW_INDIUM.get())
//                .add(CMItems.RAW_IRIDIUM.get())
//                .add(CMItems.RAW_LANTHANUM.get())
//                .add(CMItems.RAW_LEAD.get())
//                .add(CMItems.RAW_LITHIUM.get())
//                .add(CMItems.RAW_LUTETIUM.get())
//                .add(CMItems.RAW_MAGNESIUM.get())
//                .add(CMItems.RAW_MANGANESE.get())
//                .add(CMItems.RAW_MERCURY.get())
//                .add(CMItems.RAW_MYTHRIL.get())
//                .add(CMItems.RAW_MOLYBDENUM.get())
//                .add(CMItems.RAW_NEODYMIUM.get())
//                .add(CMItems.RAW_NICKEL.get())
//                .add(CMItems.RAW_OSMIUM.get())
//                .add(CMItems.RAW_PALLADIUM.get())
//                .add(CMItems.RAW_PLATINUM.get())
//                .add(CMItems.RAW_PLUTONIUM.get())
//                .add(CMItems.RAW_POLONIUM.get())
//                .add(CMItems.RAW_POTASSIUM.get())
//                .add(CMItems.RAW_PRASEODYMIUM.get())
//                .add(CMItems.RAW_PROMETHIUM.get())
//                .add(CMItems.RAW_RADIUM.get())
//                .add(CMItems.RAW_RHODIUM.get())
//                .add(CMItems.RAW_RUTHENIUM.get())
//                .add(CMItems.RAW_SAMARIUM.get())
//                .add(CMItems.RAW_SCANDIUM.get())
//                .add(CMItems.RAW_SELENIUM.get())
//                .add(CMItems.RAW_SILICON.get())
//                .add(CMItems.RAW_SILVER.get())
//                .add(CMItems.RAW_SODIUM.get())
//                .add(CMItems.RAW_STRONTIUM.get())
//                .add(CMItems.RAW_TELLURIUM.get())
//                .add(CMItems.RAW_TERBIUM.get())
//                .add(CMItems.RAW_THALLIUM.get())
//                .add(CMItems.RAW_THORIUM.get())
//                .add(CMItems.RAW_THULIUM.get())
//                .add(CMItems.RAW_TIN.get())
//                .add(CMItems.RAW_TITANIUM.get())
//                .add(CMItems.RAW_URANIUM.get())
//                .add(CMItems.RAW_VANADIUM.get())
//                .add(CMItems.RAW_VIBRANIUM.get())
//                .add(CMItems.RAW_YTTERBIUM.get())
//                .add(CMItems.RAW_YTTRIUM.get())
//                .add(CMItems.RAW_ZIRCONIUM.get());
        this.tag(CMItemTags.RUBY_ORE)
                .add(CMBlocks.RUBY_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_RUBY_ORE.get().asItem())
                .add(CMBlocks.RUBY_ORE_NETHER.get().asItem());
        this.tag(CMItemTags.OPAL_ORE)
                .add(CMBlocks.OPAL_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_OPAL_ORE.get().asItem());
        this.tag(CMItemTags.TANGERINE_ORE)
                .add(CMBlocks.TANGERINE_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_TANGERINE_ORE.get().asItem());
        this.tag(CMItemTags.COBALT_ORE)
                .add(CMBlocks.COBALT_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_COBALT_ORE.get().asItem());
        this.tag(CMItemTags.PARYTH_ORE)
                .add(CMBlocks.PARYTH_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_PARYTH_ORE.get().asItem());
        this.tag(CMItemTags.WHITE_DWARF_STAR_ORE)
                .add(CMBlocks.WHITE_DWARF_STAR_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().asItem());
        this.tag(CMItemTags.NATURAL_ESSENCE_ORE)
                .add(CMBlocks.NATURAL_ESSENCE_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get().asItem());
        this.tag(CMItemTags.EXPERIENCE_ORE)
                .add(CMBlocks.EXPERIENCE_ORE.get().asItem())
                .add(CMBlocks.DEEPSLATE_EXPERIENCE_ORE.get().asItem());
//        this.tag(CMItemTags.ALUMINUM_ORE)
//                .add(CMBlocks.ALUMINUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ALUMINUM_ORE.get().asItem());
//        this.tag(CMItemTags.ANTIMONY_ORE)
//                .add(CMBlocks.ANTIMONY_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ANTIMONY_ORE.get().asItem());
//        this.tag(CMItemTags.ARSENIC_ORE)
//                .add(CMBlocks.ARSENIC_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ARSENIC_ORE.get().asItem());
//        this.tag(CMItemTags.BARIUM_ORE)
//                .add(CMBlocks.BARIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_BARIUM_ORE.get().asItem());
//        this.tag(CMItemTags.BERYLLIUM_ORE)
//                .add(CMBlocks.BERYLLIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_BERYLLIUM_ORE.get().asItem());
//        this.tag(CMItemTags.BISMUTH_ORE)
//                .add(CMBlocks.BISMUTH_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_BISMUTH_ORE.get().asItem());
//        this.tag(CMItemTags.BORON_ORE)
//                .add(CMBlocks.BORON_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_BORON_ORE.get().asItem());
//        this.tag(CMItemTags.CADMIUM_ORE)
//                .add(CMBlocks.CADMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CADMIUM_ORE.get().asItem());
//        this.tag(CMItemTags.CALCIUM_ORE)
//                .add(CMBlocks.CALCIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CALCIUM_ORE.get().asItem());
//        this.tag(CMItemTags.CERIUM_ORE)
//                .add(CMBlocks.CERIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CERIUM_ORE.get().asItem());
//        this.tag(CMItemTags.CESIUM_ORE)
//                .add(CMBlocks.CESIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CESIUM_ORE.get().asItem());
//        this.tag(CMItemTags.CHROMIUM_ORE)
//                .add(CMBlocks.CHROMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_CHROMIUM_ORE.get().asItem());
//        this.tag(CMItemTags.DYSPROSIUM_ORE)
//                .add(CMBlocks.DYSPROSIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_DYSPROSIUM_ORE.get().asItem());
//        this.tag(CMItemTags.ERBIUM_ORE)
//                .add(CMBlocks.ERBIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ERBIUM_ORE.get().asItem());
//        this.tag(CMItemTags.EUROPIUM_ORE)
//                .add(CMBlocks.EUROPIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_EUROPIUM_ORE.get().asItem());
//        this.tag(CMItemTags.FRANCIUM_ORE)
//                .add(CMBlocks.FRANCIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_FRANCIUM_ORE.get().asItem());
//        this.tag(CMItemTags.GADOLINIUM_ORE)
//                .add(CMBlocks.GADOLINIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_GADOLINIUM_ORE.get().asItem());
//        this.tag(CMItemTags.GALLIUM_ORE)
//                .add(CMBlocks.GALLIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_GALLIUM_ORE.get().asItem());
//        this.tag(CMItemTags.GERMANIUM_ORE)
//                .add(CMBlocks.GERMANIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_GERMANIUM_ORE.get().asItem());
//        this.tag(CMItemTags.HAFNIUM_ORE)
//                .add(CMBlocks.HAFNIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_HAFNIUM_ORE.get().asItem());
//        this.tag(CMItemTags.HOLMIUM_ORE)
//                .add(CMBlocks.HOLMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_HOLMIUM_ORE.get().asItem());
//        this.tag(CMItemTags.INDIUM_ORE)
//                .add(CMBlocks.INDIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_INDIUM_ORE.get().asItem());
//        this.tag(CMItemTags.IRIDIUM_ORE)
//                .add(CMBlocks.IRIDIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_IRIDIUM_ORE.get().asItem());
//        this.tag(CMItemTags.LANTHANUM_ORE)
//                .add(CMBlocks.LANTHANUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_LANTHANUM_ORE.get().asItem());
//        this.tag(CMItemTags.LEAD_ORE)
//                .add(CMBlocks.LEAD_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_LEAD_ORE.get().asItem());
//        this.tag(CMItemTags.LITHIUM_ORE)
//                .add(CMBlocks.LITHIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_LITHIUM_ORE.get().asItem());
//        this.tag(CMItemTags.LUTETIUM_ORE)
//                .add(CMBlocks.LUTETIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_LUTETIUM_ORE.get().asItem());
//        this.tag(CMItemTags.MAGNESIUM_ORE)
//                .add(CMBlocks.MAGNESIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MAGNESIUM_ORE.get().asItem());
//        this.tag(CMItemTags.MANGANESE_ORE)
//                .add(CMBlocks.MANGANESE_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MANGANESE_ORE.get().asItem());
//        this.tag(CMItemTags.MERCURY_ORE)
//                .add(CMBlocks.MERCURY_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MERCURY_ORE.get().asItem());
//        this.tag(CMItemTags.MYTHRIL_ORE)
//                .add(CMBlocks.MYTHRIL_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MYTHRIL_ORE.get().asItem());
//        this.tag(CMItemTags.MOLYBDENUM_ORE)
//                .add(CMBlocks.MOLYBDENUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_MOLYBDENUM_ORE.get().asItem());
//        this.tag(CMItemTags.NEODYMIUM_ORE)
//                .add(CMBlocks.NEODYMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_NEODYMIUM_ORE.get().asItem());
//        this.tag(CMItemTags.NICKEL_ORE)
//                .add(CMBlocks.NICKEL_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_NICKEL_ORE.get().asItem());
//        this.tag(CMItemTags.OSMIUM_ORE)
//                .add(CMBlocks.OSMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_OSMIUM_ORE.get().asItem());
//        this.tag(CMItemTags.PALLADIUM_ORE)
//                .add(CMBlocks.PALLADIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PALLADIUM_ORE.get().asItem());
//        this.tag(CMItemTags.PLATINUM_ORE)
//                .add(CMBlocks.PLATINUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PLATINUM_ORE.get().asItem());
//        this.tag(CMItemTags.PLUTONIUM_ORE)
//                .add(CMBlocks.PLUTONIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PLUTONIUM_ORE.get().asItem());
//        this.tag(CMItemTags.POLONIUM_ORE)
//                .add(CMBlocks.POLONIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_POLONIUM_ORE.get().asItem());
//        this.tag(CMItemTags.POTASSIUM_ORE)
//                .add(CMBlocks.POTASSIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_POTASSIUM_ORE.get().asItem());
//        this.tag(CMItemTags.PRASEODYMIUM_ORE)
//                .add(CMBlocks.PRASEODYMIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PRASEODYMIUM_ORE.get().asItem());
//        this.tag(CMItemTags.PROMETHIUM_ORE)
//                .add(CMBlocks.PROMETHIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_PROMETHIUM_ORE.get().asItem());
//        this.tag(CMItemTags.RADIUM_ORE)
//                .add(CMBlocks.RADIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_RADIUM_ORE.get().asItem());
//        this.tag(CMItemTags.RHODIUM_ORE)
//                .add(CMBlocks.RHODIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_RHODIUM_ORE.get().asItem());
//        this.tag(CMItemTags.RUTHENIUM_ORE)
//                .add(CMBlocks.RUTHENIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_RUTHENIUM_ORE.get().asItem());
//        this.tag(CMItemTags.SAMARIUM_ORE)
//                .add(CMBlocks.SAMARIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SAMARIUM_ORE.get().asItem());
//        this.tag(CMItemTags.SCANDIUM_ORE)
//                .add(CMBlocks.SCANDIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SCANDIUM_ORE.get().asItem());
//        this.tag(CMItemTags.SELENIUM_ORE)
//                .add(CMBlocks.SELENIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SELENIUM_ORE.get().asItem());
//        this.tag(CMItemTags.SILICON_ORE)
//                .add(CMBlocks.SILICON_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SILICON_ORE.get().asItem());
//        this.tag(CMItemTags.SILVER_ORE)
//                .add(CMBlocks.SILVER_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SILVER_ORE.get().asItem());
//        this.tag(CMItemTags.SODIUM_ORE)
//                .add(CMBlocks.SODIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_SODIUM_ORE.get().asItem());
//        this.tag(CMItemTags.STRONTIUM_ORE)
//                .add(CMBlocks.STRONTIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_STRONTIUM_ORE.get().asItem());
//        this.tag(CMItemTags.TELLURIUM_ORE)
//                .add(CMBlocks.TELLURIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_TELLURIUM_ORE.get().asItem());
//        this.tag(CMItemTags.TERBIUM_ORE)
//                .add(CMBlocks.TERBIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_TERBIUM_ORE.get().asItem());
//        this.tag(CMItemTags.THALLIUM_ORE)
//                .add(CMBlocks.THALLIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_THALLIUM_ORE.get().asItem());
//        this.tag(CMItemTags.THORIUM_ORE)
//                .add(CMBlocks.THORIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_THORIUM_ORE.get().asItem());
//        this.tag(CMItemTags.THULIUM_ORE)
//                .add(CMBlocks.THULIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_THULIUM_ORE.get().asItem());
//        this.tag(CMItemTags.TIN_ORE)
//                .add(CMBlocks.TIN_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_TIN_ORE.get().asItem());
//        this.tag(CMItemTags.TITANIUM_ORE)
//                .add(CMBlocks.TITANIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_TITANIUM_ORE.get().asItem());
//        this.tag(CMItemTags.URANIUM_ORE)
//                .add(CMBlocks.URANIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_URANIUM_ORE.get().asItem());
//        this.tag(CMItemTags.VANADIUM_ORE)
//                .add(CMBlocks.VANADIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_VANADIUM_ORE.get().asItem());
//        this.tag(CMItemTags.VIBRANIUM_ORE)
//                .add(CMBlocks.VIBRANIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_VIBRANIUM_ORE.get().asItem());
//        this.tag(CMItemTags.YTTERBIUM_ORE)
//                .add(CMBlocks.YTTERBIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_YTTERBIUM_ORE.get().asItem());
//        this.tag(CMItemTags.YTTRIUM_ORE)
//                .add(CMBlocks.YTTRIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_YTTRIUM_ORE.get().asItem());
//        this.tag(CMItemTags.ZIRCONIUM_ORE)
//                .add(CMBlocks.ZIRCONIUM_ORE.get().asItem())
//                .add(CMBlocks.DEEPSLATE_ZIRCONIUM_ORE.get().asItem());
        this.tag(CMItemTags.BERRIES)
                .add(CMItems.STRAWBERRY.get())
                .add(CMItems.BLUEBERRY.get())
                .add(CMItems.LOGANBERRY.get())
                .add(CMItems.RED_RASPBERRY.get())
                .add(CMItems.BLACK_RASPBERRY.get())
                .add(CMItems.GOLDEN_RASPBERRY.get())
                .add(CMItems.WHITE_RASPBERRY.get())
                .add(CMItems.MARIONBERRY.get())
                .add(CMItems.BLACKCURRANT.get())
                .add(CMItems.REDCURRANT.get())
                .add(CMItems.HUCKLEBERRY.get())
                .add(CMItems.WINEBERRY.get())
                .add(CMItems.ELDERBERRY.get())
                .add(CMItems.BLACKBERRY.get())
                .add(CMItems.BOYSENBERRY.get())
                .add(CMItems.GROUND_CHERRY.get())
                .add(CMItems.ARONIA_BERRY.get())
                .add(CMItems.SERVICEBERRY.get())
                .add(CMItems.WONDERBERRY.get())
                .add(CMItems.MULBERRY.get())
                .add(CMItems.LINGONBERRY.get())
                .add(CMItems.CRANBERRY.get())
                .add(CMItems.DEWBERRY.get())
                .add(CMItems.THIMBLEBERRY.get())
                .add(CMItems.GOOSEBERRY.get())
                .add(CMItems.CHOKEBERRY.get())
                .add(CMItems.OLALLIEBERRY.get())
                .add(CMItems.ACEROLA_CHERRY.get())
                .add(CMItems.BARBERRY.get())
                .add(CMItems.BAYBERRY.get())
                .add(CMItems.GOGI_BERRY.get())
                .add(Items.SWEET_BERRIES);
        this.tag(CMItemTags.BERRY_JAMS)
                .add(CMItems.STRAWBERRY_JAM.get())
                .add(CMItems.BLUEBERRY_JAM.get())
                .add(CMItems.LOGANBERRY_JAM.get())
                .add(CMItems.RED_RASPBERRY_JAM.get())
                .add(CMItems.BLACK_RASPBERRY_JAM.get())
                .add(CMItems.GOLDEN_RASPBERRY_JAM.get())
                .add(CMItems.WHITE_RASPBERRY_JAM.get())
                .add(CMItems.MARIONBERRY_JAM.get())
                .add(CMItems.BLACKCURRANT_JAM.get())
                .add(CMItems.REDCURRANT_JAM.get())
                .add(CMItems.HUCKLEBERRY_JAM.get())
                .add(CMItems.WINEBERRY_JAM.get())
                .add(CMItems.ELDERBERRY_JAM.get())
                .add(CMItems.BLACKBERRY_JAM.get())
                .add(CMItems.BOYSENBERRY_JAM.get())
                .add(CMItems.GROUND_CHERRY_JAM.get())
                .add(CMItems.ARONIA_BERRY_JAM.get())
                .add(CMItems.SERVICEBERRY_JAM.get())
                .add(CMItems.WONDERBERRY_JAM.get())
                .add(CMItems.MULBERRY_JAM.get())
                .add(CMItems.LINGONBERRY_JAM.get())
                .add(CMItems.CRANBERRY_JAM.get())
                .add(CMItems.DEWBERRY_JAM.get())
                .add(CMItems.THIMBLEBERRY_JAM.get())
                .add(CMItems.GOOSEBERRY_JAM.get())
                .add(CMItems.CHOKEBERRY_JAM.get())
                .add(CMItems.OLALLIEBERRY_JAM.get())
                .add(CMItems.ACEROLA_CHERRY_JAM.get())
                .add(CMItems.BARBERRY_JAM.get())
                .add(CMItems.BAYBERRY_JAM.get())
                .add(CMItems.GOGI_BERRY_JAM.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
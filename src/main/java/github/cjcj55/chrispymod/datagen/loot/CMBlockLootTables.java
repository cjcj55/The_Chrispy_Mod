package github.cjcj55.chrispymod.datagen.loot;

import github.cjcj55.chrispymod.blocks.BaseBerryBlock;
import github.cjcj55.chrispymod.registry.CMBlocks;
import github.cjcj55.chrispymod.registry.CMItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class CMBlockLootTables extends BlockLootSubProvider {
    public CMBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
//        this.dropSelf(CMBlocks.ALLOY_FURNACE.get());
//        this.dropSelf(CMBlocks.JAM_AND_JELLY_MAKER.get());

        this.dropSelf(CMBlocks.BLUE_EMERALD_BLOCK.get());
        this.dropSelf(CMBlocks.HARDENED_REDSTONE_BLOCK.get());
        this.dropSelf(CMBlocks.LAVA_SPONGE.get());
        this.dropSelf(CMBlocks.WET_LAVA_SPONGE.get());
        this.dropSelf(CMBlocks.LIGHTNING_BLOCK.get());
        this.dropSelf(CMBlocks.SUGAR_CANE_BLOCK.get());
        this.dropSelf(CMBlocks.SUGAR_BLOCK.get());

        this.dropSelf(CMBlocks.COBALT_BLOCK.get());
        this.add(CMBlocks.COBALT_ORE.get(),
                (block) -> createOreDrop(CMBlocks.COBALT_ORE.get(), CMItems.COBALT.get()));
        this.add(CMBlocks.DEEPSLATE_COBALT_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_COBALT_ORE.get(), CMItems.COBALT.get()));

        this.add(CMBlocks.EXPERIENCE_ORE.get(),
                (block) -> createOreDrop(CMBlocks.EXPERIENCE_ORE.get(), CMItems.EDIBLE_EXPERIENCE.get()));
        this.add(CMBlocks.DEEPSLATE_EXPERIENCE_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_EXPERIENCE_ORE.get(), CMItems.EDIBLE_EXPERIENCE.get()));

        this.add(CMBlocks.NATURAL_ESSENCE_ORE.get(),
                (block) -> createOreDrop(CMBlocks.NATURAL_ESSENCE_ORE.get(), CMItems.NATURAL_ESSENCE.get()));
        this.add(CMBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get(), CMItems.NATURAL_ESSENCE.get()));

        this.dropSelf(CMBlocks.OPAL_BLOCK.get());
        this.add(CMBlocks.OPAL_ORE.get(),
                (block) -> createOreDrop(CMBlocks.OPAL_ORE.get(), CMItems.OPAL.get()));
        this.add(CMBlocks.DEEPSLATE_OPAL_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_OPAL_ORE.get(), CMItems.OPAL.get()));

        this.dropSelf(CMBlocks.PARYTH_BLOCK.get());
        this.add(CMBlocks.PARYTH_ORE.get(),
                (block) -> createOreDrop(CMBlocks.PARYTH_ORE.get(), CMItems.PARYTH.get()));
        this.add(CMBlocks.DEEPSLATE_PARYTH_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_PARYTH_ORE.get(), CMItems.PARYTH.get()));

        this.dropSelf(CMBlocks.RUBY_BLOCK.get());
        this.add(CMBlocks.RUBY_ORE.get(),
                (block) -> createOreDrop(CMBlocks.RUBY_ORE.get(), CMItems.RUBY.get()));
        this.add(CMBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_RUBY_ORE.get(), CMItems.RUBY.get()));

        this.dropSelf(CMBlocks.TANGERINE_BLOCK.get());
        this.add(CMBlocks.TANGERINE_ORE.get(),
                (block) -> createOreDrop(CMBlocks.TANGERINE_ORE.get(), CMItems.TANGERINE.get()));
        this.add(CMBlocks.DEEPSLATE_TANGERINE_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_TANGERINE_ORE.get(), CMItems.TANGERINE.get()));

        this.add(CMBlocks.WHITE_DWARF_STAR_ORE.get(),
                (block) -> createOreDrop(CMBlocks.WHITE_DWARF_STAR_ORE.get(), CMItems.WHITE_DWARF_STAR.get()));
        this.add(CMBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get(), CMItems.WHITE_DWARF_STAR.get()));

        this.add(CMBlocks.ALUMINUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.ALUMINUM_ORE.get(), CMItems.RAW_ALUMINUM.get()));
        this.add(CMBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_ALUMINUM_ORE.get(), CMItems.RAW_ALUMINUM.get()));

        this.add(CMBlocks.ANTIMONY_ORE.get(),
                (block) -> createOreDrop(CMBlocks.ANTIMONY_ORE.get(), CMItems.RAW_ANTIMONY.get()));
        this.add(CMBlocks.DEEPSLATE_ANTIMONY_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_ANTIMONY_ORE.get(), CMItems.RAW_ANTIMONY.get()));

        this.add(CMBlocks.ARSENIC_ORE.get(),
                (block) -> createOreDrop(CMBlocks.ARSENIC_ORE.get(), CMItems.RAW_ARSENIC.get()));
        this.add(CMBlocks.DEEPSLATE_ARSENIC_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_ARSENIC_ORE.get(), CMItems.RAW_ARSENIC.get()));

        this.add(CMBlocks.BARIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.BARIUM_ORE.get(), CMItems.RAW_BARIUM.get()));
        this.add(CMBlocks.DEEPSLATE_BARIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_BARIUM_ORE.get(), CMItems.RAW_BARIUM.get()));

        this.add(CMBlocks.BERYLLIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.BERYLLIUM_ORE.get(), CMItems.RAW_BERYLLIUM.get()));
        this.add(CMBlocks.DEEPSLATE_BERYLLIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_BERYLLIUM_ORE.get(), CMItems.RAW_BERYLLIUM.get()));

        this.add(CMBlocks.BISMUTH_ORE.get(),
                (block) -> createOreDrop(CMBlocks.BISMUTH_ORE.get(), CMItems.RAW_BISMUTH.get()));
        this.add(CMBlocks.DEEPSLATE_BISMUTH_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_BISMUTH_ORE.get(), CMItems.RAW_BISMUTH.get()));

        this.add(CMBlocks.BORON_ORE.get(),
                (block) -> createOreDrop(CMBlocks.BORON_ORE.get(), CMItems.RAW_BORON.get()));
        this.add(CMBlocks.DEEPSLATE_BORON_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_BORON_ORE.get(), CMItems.RAW_BORON.get()));

        this.add(CMBlocks.CADMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.CADMIUM_ORE.get(), CMItems.RAW_CADMIUM.get()));
        this.add(CMBlocks.DEEPSLATE_CADMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_CADMIUM_ORE.get(), CMItems.RAW_CADMIUM.get()));

        this.add(CMBlocks.CALCIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.CALCIUM_ORE.get(), CMItems.RAW_CALCIUM.get()));
        this.add(CMBlocks.DEEPSLATE_CALCIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_CALCIUM_ORE.get(), CMItems.RAW_CALCIUM.get()));

        this.add(CMBlocks.CERIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.CERIUM_ORE.get(), CMItems.RAW_CERIUM.get()));
        this.add(CMBlocks.DEEPSLATE_CERIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_CERIUM_ORE.get(), CMItems.RAW_CERIUM.get()));

        this.add(CMBlocks.CESIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.CESIUM_ORE.get(), CMItems.RAW_CESIUM.get()));
        this.add(CMBlocks.DEEPSLATE_CESIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_CESIUM_ORE.get(), CMItems.RAW_CESIUM.get()));

        this.add(CMBlocks.CHROMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.CHROMIUM_ORE.get(), CMItems.RAW_CHROMIUM.get()));
        this.add(CMBlocks.DEEPSLATE_CHROMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_CHROMIUM_ORE.get(), CMItems.RAW_CHROMIUM.get()));

        this.add(CMBlocks.DYSPROSIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DYSPROSIUM_ORE.get(), CMItems.RAW_DYSPROSIUM.get()));
        this.add(CMBlocks.DEEPSLATE_DYSPROSIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_DYSPROSIUM_ORE.get(), CMItems.RAW_DYSPROSIUM.get()));

        this.add(CMBlocks.ERBIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.ERBIUM_ORE.get(), CMItems.RAW_ERBIUM.get()));
        this.add(CMBlocks.DEEPSLATE_ERBIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_ERBIUM_ORE.get(), CMItems.RAW_ERBIUM.get()));

        this.add(CMBlocks.EUROPIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.EUROPIUM_ORE.get(), CMItems.RAW_EUROPIUM.get()));
        this.add(CMBlocks.DEEPSLATE_EUROPIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_EUROPIUM_ORE.get(), CMItems.RAW_EUROPIUM.get()));

        this.add(CMBlocks.FRANCIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.FRANCIUM_ORE.get(), CMItems.RAW_FRANCIUM.get()));
        this.add(CMBlocks.DEEPSLATE_FRANCIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_FRANCIUM_ORE.get(), CMItems.RAW_FRANCIUM.get()));

        this.add(CMBlocks.GADOLINIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.GADOLINIUM_ORE.get(), CMItems.RAW_GADOLINIUM.get()));
        this.add(CMBlocks.DEEPSLATE_GADOLINIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_GADOLINIUM_ORE.get(), CMItems.RAW_GADOLINIUM.get()));

        this.add(CMBlocks.GALLIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.GALLIUM_ORE.get(), CMItems.RAW_GALLIUM.get()));
        this.add(CMBlocks.DEEPSLATE_GALLIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_GALLIUM_ORE.get(), CMItems.RAW_GALLIUM.get()));

        this.add(CMBlocks.GERMANIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.GERMANIUM_ORE.get(), CMItems.RAW_GERMANIUM.get()));
        this.add(CMBlocks.DEEPSLATE_GERMANIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_GERMANIUM_ORE.get(), CMItems.RAW_GERMANIUM.get()));

        this.add(CMBlocks.HAFNIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.HAFNIUM_ORE.get(), CMItems.RAW_HAFNIUM.get()));
        this.add(CMBlocks.DEEPSLATE_HAFNIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_HAFNIUM_ORE.get(), CMItems.RAW_HAFNIUM.get()));

        this.add(CMBlocks.HOLMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.HOLMIUM_ORE.get(), CMItems.RAW_HOLMIUM.get()));
        this.add(CMBlocks.DEEPSLATE_HOLMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_HOLMIUM_ORE.get(), CMItems.RAW_HOLMIUM.get()));

        this.add(CMBlocks.INDIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.INDIUM_ORE.get(), CMItems.RAW_INDIUM.get()));
        this.add(CMBlocks.DEEPSLATE_INDIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_INDIUM_ORE.get(), CMItems.RAW_INDIUM.get()));

        this.add(CMBlocks.IRIDIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.IRIDIUM_ORE.get(), CMItems.RAW_IRIDIUM.get()));
        this.add(CMBlocks.DEEPSLATE_IRIDIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_IRIDIUM_ORE.get(), CMItems.RAW_IRIDIUM.get()));

        this.add(CMBlocks.LANTHANUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.LANTHANUM_ORE.get(), CMItems.RAW_LANTHANUM.get()));
        this.add(CMBlocks.DEEPSLATE_LANTHANUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_LANTHANUM_ORE.get(), CMItems.RAW_LANTHANUM.get()));

        this.add(CMBlocks.LEAD_ORE.get(),
                (block) -> createOreDrop(CMBlocks.LEAD_ORE.get(), CMItems.RAW_LEAD.get()));
        this.add(CMBlocks.DEEPSLATE_LEAD_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_LEAD_ORE.get(), CMItems.RAW_LEAD.get()));

        this.add(CMBlocks.LITHIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.LITHIUM_ORE.get(), CMItems.RAW_LITHIUM.get()));
        this.add(CMBlocks.DEEPSLATE_LITHIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_LITHIUM_ORE.get(), CMItems.RAW_LITHIUM.get()));

        this.add(CMBlocks.LUTETIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.LUTETIUM_ORE.get(), CMItems.RAW_LUTETIUM.get()));
        this.add(CMBlocks.DEEPSLATE_LUTETIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_LUTETIUM_ORE.get(), CMItems.RAW_LUTETIUM.get()));

        this.add(CMBlocks.MAGNESIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.MAGNESIUM_ORE.get(), CMItems.RAW_MAGNESIUM.get()));
        this.add(CMBlocks.DEEPSLATE_MAGNESIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), CMItems.RAW_MAGNESIUM.get()));

        this.add(CMBlocks.MANGANESE_ORE.get(),
                (block) -> createOreDrop(CMBlocks.MANGANESE_ORE.get(), CMItems.RAW_MANGANESE.get()));
        this.add(CMBlocks.DEEPSLATE_MANGANESE_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_MANGANESE_ORE.get(), CMItems.RAW_MANGANESE.get()));

        this.add(CMBlocks.MERCURY_ORE.get(),
                (block) -> createOreDrop(CMBlocks.MERCURY_ORE.get(), CMItems.RAW_MERCURY.get()));
        this.add(CMBlocks.DEEPSLATE_MERCURY_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_MERCURY_ORE.get(), CMItems.RAW_MERCURY.get()));

        this.add(CMBlocks.MYTHRIL_ORE.get(),
                (block) -> createOreDrop(CMBlocks.MYTHRIL_ORE.get(), CMItems.RAW_MYTHRIL.get()));
        this.add(CMBlocks.DEEPSLATE_MYTHRIL_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_MYTHRIL_ORE.get(), CMItems.RAW_MYTHRIL.get()));

        this.add(CMBlocks.MOLYBDENUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.MOLYBDENUM_ORE.get(), CMItems.RAW_MOLYBDENUM.get()));
        this.add(CMBlocks.DEEPSLATE_MOLYBDENUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_MOLYBDENUM_ORE.get(), CMItems.RAW_MOLYBDENUM.get()));

        this.add(CMBlocks.NEODYMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.NEODYMIUM_ORE.get(), CMItems.RAW_NEODYMIUM.get()));
        this.add(CMBlocks.DEEPSLATE_NEODYMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_NEODYMIUM_ORE.get(), CMItems.RAW_NEODYMIUM.get()));

        this.add(CMBlocks.NICKEL_ORE.get(),
                (block) -> createOreDrop(CMBlocks.NICKEL_ORE.get(), CMItems.RAW_NICKEL.get()));
        this.add(CMBlocks.DEEPSLATE_NICKEL_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_NICKEL_ORE.get(), CMItems.RAW_NICKEL.get()));

        this.add(CMBlocks.OSMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.OSMIUM_ORE.get(), CMItems.RAW_OSMIUM.get()));
        this.add(CMBlocks.DEEPSLATE_OSMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_OSMIUM_ORE.get(), CMItems.RAW_OSMIUM.get()));

        this.add(CMBlocks.PALLADIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.PALLADIUM_ORE.get(), CMItems.RAW_PALLADIUM.get()));
        this.add(CMBlocks.DEEPSLATE_PALLADIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_PALLADIUM_ORE.get(), CMItems.RAW_PALLADIUM.get()));

        this.add(CMBlocks.PLATINUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.PLATINUM_ORE.get(), CMItems.RAW_PLATINUM.get()));
        this.add(CMBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_PLATINUM_ORE.get(), CMItems.RAW_PLATINUM.get()));

        this.add(CMBlocks.PLUTONIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.PLUTONIUM_ORE.get(), CMItems.RAW_PLUTONIUM.get()));
        this.add(CMBlocks.DEEPSLATE_PLUTONIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_PLUTONIUM_ORE.get(), CMItems.RAW_PLUTONIUM.get()));

        this.add(CMBlocks.POLONIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.POLONIUM_ORE.get(), CMItems.RAW_POLONIUM.get()));
        this.add(CMBlocks.DEEPSLATE_POLONIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_POLONIUM_ORE.get(), CMItems.RAW_POLONIUM.get()));

        this.add(CMBlocks.POTASSIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.POTASSIUM_ORE.get(), CMItems.RAW_POTASSIUM.get()));
        this.add(CMBlocks.DEEPSLATE_POTASSIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_POTASSIUM_ORE.get(), CMItems.RAW_POTASSIUM.get()));

        this.add(CMBlocks.PRASEODYMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.PRASEODYMIUM_ORE.get(), CMItems.RAW_PRASEODYMIUM.get()));
        this.add(CMBlocks.DEEPSLATE_PRASEODYMIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_PRASEODYMIUM_ORE.get(), CMItems.RAW_PRASEODYMIUM.get()));

        this.add(CMBlocks.PROMETHIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.PROMETHIUM_ORE.get(), CMItems.RAW_PROMETHIUM.get()));
        this.add(CMBlocks.DEEPSLATE_PROMETHIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_PROMETHIUM_ORE.get(), CMItems.RAW_PROMETHIUM.get()));

        this.add(CMBlocks.RADIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.RADIUM_ORE.get(), CMItems.RAW_RADIUM.get()));
        this.add(CMBlocks.DEEPSLATE_RADIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_RADIUM_ORE.get(), CMItems.RAW_RADIUM.get()));

        this.add(CMBlocks.RHODIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.RHODIUM_ORE.get(), CMItems.RAW_RHODIUM.get()));
        this.add(CMBlocks.DEEPSLATE_RHODIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_RHODIUM_ORE.get(), CMItems.RAW_RHODIUM.get()));

        this.add(CMBlocks.RUTHENIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.RUTHENIUM_ORE.get(), CMItems.RAW_RUTHENIUM.get()));
        this.add(CMBlocks.DEEPSLATE_RUTHENIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_RUTHENIUM_ORE.get(), CMItems.RAW_RUTHENIUM.get()));

        this.add(CMBlocks.SAMARIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.SAMARIUM_ORE.get(), CMItems.RAW_SAMARIUM.get()));
        this.add(CMBlocks.DEEPSLATE_SAMARIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_SAMARIUM_ORE.get(), CMItems.RAW_SAMARIUM.get()));

        this.add(CMBlocks.SCANDIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.SCANDIUM_ORE.get(), CMItems.RAW_SCANDIUM.get()));
        this.add(CMBlocks.DEEPSLATE_SCANDIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_SCANDIUM_ORE.get(), CMItems.RAW_SCANDIUM.get()));

        this.add(CMBlocks.SELENIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.SELENIUM_ORE.get(), CMItems.RAW_SELENIUM.get()));
        this.add(CMBlocks.DEEPSLATE_SELENIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_SELENIUM_ORE.get(), CMItems.RAW_SELENIUM.get()));

        this.add(CMBlocks.SILICON_ORE.get(),
                (block) -> createOreDrop(CMBlocks.SILICON_ORE.get(), CMItems.RAW_SILICON.get()));
        this.add(CMBlocks.DEEPSLATE_SILICON_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_SILICON_ORE.get(), CMItems.RAW_SILICON.get()));

        this.add(CMBlocks.SILVER_ORE.get(),
                (block) -> createOreDrop(CMBlocks.SILVER_ORE.get(), CMItems.RAW_SILVER.get()));
        this.add(CMBlocks.DEEPSLATE_SILVER_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_SILVER_ORE.get(), CMItems.RAW_SILVER.get()));

        this.add(CMBlocks.SODIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.SODIUM_ORE.get(), CMItems.RAW_SODIUM.get()));
        this.add(CMBlocks.DEEPSLATE_SODIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_SODIUM_ORE.get(), CMItems.RAW_SODIUM.get()));

        this.add(CMBlocks.STRONTIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.STRONTIUM_ORE.get(), CMItems.RAW_STRONTIUM.get()));
        this.add(CMBlocks.DEEPSLATE_STRONTIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_STRONTIUM_ORE.get(), CMItems.RAW_STRONTIUM.get()));

        this.add(CMBlocks.TELLURIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.TELLURIUM_ORE.get(), CMItems.RAW_TELLURIUM.get()));
        this.add(CMBlocks.DEEPSLATE_TELLURIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_TELLURIUM_ORE.get(), CMItems.RAW_TELLURIUM.get()));

        this.add(CMBlocks.TERBIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.TERBIUM_ORE.get(), CMItems.RAW_TERBIUM.get()));
        this.add(CMBlocks.DEEPSLATE_TERBIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_TERBIUM_ORE.get(), CMItems.RAW_TERBIUM.get()));

        this.add(CMBlocks.THALLIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.THALLIUM_ORE.get(), CMItems.RAW_THALLIUM.get()));
        this.add(CMBlocks.DEEPSLATE_THALLIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_THALLIUM_ORE.get(), CMItems.RAW_THALLIUM.get()));

        this.add(CMBlocks.THORIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.THORIUM_ORE.get(), CMItems.RAW_THORIUM.get()));
        this.add(CMBlocks.DEEPSLATE_THORIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_THORIUM_ORE.get(), CMItems.RAW_THORIUM.get()));

        this.add(CMBlocks.THULIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.THULIUM_ORE.get(), CMItems.RAW_THULIUM.get()));
        this.add(CMBlocks.DEEPSLATE_THULIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_THULIUM_ORE.get(), CMItems.RAW_THULIUM.get()));

        this.add(CMBlocks.TIN_ORE.get(),
                (block) -> createOreDrop(CMBlocks.TIN_ORE.get(), CMItems.RAW_TIN.get()));
        this.add(CMBlocks.DEEPSLATE_TIN_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_TIN_ORE.get(), CMItems.RAW_TIN.get()));

        this.add(CMBlocks.TITANIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.TITANIUM_ORE.get(), CMItems.RAW_TITANIUM.get()));
        this.add(CMBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_TITANIUM_ORE.get(), CMItems.RAW_TITANIUM.get()));

        this.add(CMBlocks.URANIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.URANIUM_ORE.get(), CMItems.RAW_URANIUM.get()));
        this.add(CMBlocks.DEEPSLATE_URANIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_URANIUM_ORE.get(), CMItems.RAW_URANIUM.get()));

        this.add(CMBlocks.VANADIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.VANADIUM_ORE.get(), CMItems.RAW_VANADIUM.get()));
        this.add(CMBlocks.DEEPSLATE_VANADIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_VANADIUM_ORE.get(), CMItems.RAW_VANADIUM.get()));

        this.add(CMBlocks.VIBRANIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.VIBRANIUM_ORE.get(), CMItems.RAW_VIBRANIUM.get()));
        this.add(CMBlocks.DEEPSLATE_VIBRANIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_VIBRANIUM_ORE.get(), CMItems.RAW_VIBRANIUM.get()));

        this.add(CMBlocks.YTTERBIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.YTTERBIUM_ORE.get(), CMItems.RAW_YTTERBIUM.get()));
        this.add(CMBlocks.DEEPSLATE_YTTERBIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_YTTERBIUM_ORE.get(), CMItems.RAW_YTTERBIUM.get()));

        this.add(CMBlocks.YTTRIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.YTTRIUM_ORE.get(), CMItems.RAW_YTTRIUM.get()));
        this.add(CMBlocks.DEEPSLATE_YTTRIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_YTTRIUM_ORE.get(), CMItems.RAW_YTTRIUM.get()));

        this.add(CMBlocks.ZIRCONIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.ZIRCONIUM_ORE.get(), CMItems.RAW_ZIRCONIUM.get()));
        this.add(CMBlocks.DEEPSLATE_ZIRCONIUM_ORE.get(),
                (block) -> createOreDrop(CMBlocks.DEEPSLATE_ZIRCONIUM_ORE.get(), CMItems.RAW_ZIRCONIUM.get()));





        this.dropSelf(CMBlocks.FLAME_BLOCK.get());
        this.add(CMBlocks.FLAME_ORE_NETHER.get(),
                (block) -> createOreDrop(CMBlocks.FLAME_ORE_NETHER.get(), CMItems.FLAME.get()));

        this.add(CMBlocks.RUBY_ORE_NETHER.get(),
                (block) -> createOreDrop(CMBlocks.RUBY_ORE_NETHER.get(), CMItems.RUBY.get()));

        this.add(CMBlocks.HELLFIRE_ORE_NETHER.get(),
                (block) -> createOreDrop(CMBlocks.HELLFIRE_ORE_NETHER.get(), CMItems.HELLFIRE.get()));


        this.dropSelf(CMBlocks.CIRCULAR_BRICKS.get());
        this.dropSelf(CMBlocks.WEAVER_BRICKS.get());
        this.dropSelf(CMBlocks.SOLID_BRICKS.get());
        this.dropSelf(CMBlocks.ROAD_BRICKS.get());
        this.dropSelf(CMBlocks.ORNATE_BRICKS.get());
        this.dropSelf(CMBlocks.MOSAIC_BRICKS.get());
        this.dropSelf(CMBlocks.SLANTED_BRICKS.get());
        this.dropSelf(CMBlocks.SKINNY_BRICKS.get());
        this.dropSelf(CMBlocks.SKINNY_SLANTED_BRICKS.get());
        this.dropSelf(CMBlocks.CRACKED_BRICKS.get());
        this.dropSelf(CMBlocks.ENCASED_BRICKS.get());

        this.dropSelf(CMBlocks.BLACK_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.BLUE_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.BROWN_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.CYAN_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.GRAY_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.GREEN_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.LIGHT_BLUE_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.LIGHT_GRAY_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.LIME_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.MAGENTA_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.ORANGE_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.PINK_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.PURPLE_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.RED_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.WHITE_REDSTONE_LAMP.get());
        this.dropSelf(CMBlocks.YELLOW_REDSTONE_LAMP.get());


        addBerryBush(CMBlocks.STRAWBERRY_BUSH.get(), CMItems.STRAWBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.BLUEBERRY_BUSH.get(), CMItems.BLUEBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.LOGANBERRY_BUSH.get(), CMItems.LOGANBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.RED_RASPBERRY_BUSH.get(), CMItems.RED_RASPBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.BLACK_RASPBERRY_BUSH.get(), CMItems.BLACK_RASPBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.GOLDEN_RASPBERRY_BUSH.get(), CMItems.GOLDEN_RASPBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.WHITE_RASPBERRY_BUSH.get(), CMItems.WHITE_RASPBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.MARIONBERRY_BUSH.get(), CMItems.MARIONBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.BLACKCURRANT_BUSH.get(), CMItems.BLACKCURRANT.get(), 2, 3);
        addBerryBush(CMBlocks.REDCURRANT_BUSH.get(), CMItems.REDCURRANT.get(), 2, 3);
        addBerryBush(CMBlocks.HUCKLEBERRY_BUSH.get(), CMItems.HUCKLEBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.WINEBERRY_BUSH.get(), CMItems.WINEBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.ELDERBERRY_BUSH.get(), CMItems.ELDERBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.BLACKBERRY_BUSH.get(), CMItems.BLACKBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.BOYSENBERRY_BUSH.get(), CMItems.BOYSENBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.GROUND_CHERRY_BUSH.get(), CMItems.GROUND_CHERRY.get(), 2, 3);
        addBerryBush(CMBlocks.ARONIA_BERRY_BUSH.get(), CMItems.ARONIA_BERRY.get(), 2, 3);
        addBerryBush(CMBlocks.SERVICEBERRY_BUSH.get(), CMItems.SERVICEBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.WONDERBERRY_BUSH.get(), CMItems.WONDERBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.MULBERRY_BUSH.get(), CMItems.MULBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.LINGONBERRY_BUSH.get(), CMItems.LINGONBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.CRANBERRY_BUSH.get(), CMItems.CRANBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.DEWBERRY_BUSH.get(), CMItems.DEWBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.THIMBLEBERRY_BUSH.get(), CMItems.THIMBLEBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.GOOSEBERRY_BUSH.get(), CMItems.GOOSEBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.CHOKEBERRY_BUSH.get(), CMItems.CHOKEBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.OLALLIEBERRY_BUSH.get(), CMItems.OLALLIEBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.ACEROLA_CHERRY_BUSH.get(), CMItems.ACEROLA_CHERRY.get(), 2, 3);
        addBerryBush(CMBlocks.BARBERRY_BUSH.get(), CMItems.BARBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.BAYBERRY_BUSH.get(), CMItems.BAYBERRY.get(), 2, 3);
        addBerryBush(CMBlocks.GOGI_BERRY_BUSH.get(), CMItems.GOGI_BERRY.get(), 2, 3);
    }

    private void addBerryBush(Block block, Item item, int min, int max) {
        this.add(block, (p_124086_) -> {
            return applyExplosionDecay(p_124086_, LootTable.lootTable().withPool(LootPool.lootPool().when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BaseBerryBlock.AGE, 3))).add(LootItem.lootTableItem(item)).apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))).withPool(LootPool.lootPool().when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BaseBerryBlock.AGE, 2))).add(LootItem.lootTableItem(item)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))));
        });
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CMBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

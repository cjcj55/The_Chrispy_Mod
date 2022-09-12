package io.github.cjcj55.chrispymod.datagen.loot;

import io.github.cjcj55.chrispymod.common.block.BerryBlockBase;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class CMBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(BlockInit.ALLOY_FURNACE.get());
        this.dropSelf(BlockInit.JAM_AND_JELLY_MAKER.get());

        this.dropSelf(BlockInit.BLUE_EMERALD_BLOCK.get());
        this.dropSelf(BlockInit.HARDENED_REDSTONE_BLOCK.get());
        this.dropSelf(BlockInit.LAVA_SPONGE.get());
        this.dropSelf(BlockInit.WET_LAVA_SPONGE.get());
        this.dropSelf(BlockInit.LIGHTNING_BLOCK.get());
        this.dropSelf(BlockInit.SUGAR_CANE_BLOCK.get());
        this.dropSelf(BlockInit.SUGAR_BLOCK.get());

        this.dropSelf(BlockInit.COBALT_BLOCK.get());
        this.add(BlockInit.COBALT_ORE.get(),
                (block) -> createOreDrop(BlockInit.COBALT_ORE.get(), ItemInit.COBALT.get()));
        this.add(BlockInit.DEEPSLATE_COBALT_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_COBALT_ORE.get(), ItemInit.COBALT.get()));

        this.add(BlockInit.EXPERIENCE_ORE.get(),
                (block) -> createOreDrop(BlockInit.EXPERIENCE_ORE.get(), ItemInit.EDIBLE_EXPERIENCE.get()));
        this.add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get(), ItemInit.EDIBLE_EXPERIENCE.get()));

        this.add(BlockInit.NATURAL_ESSENCE_ORE.get(),
                (block) -> createOreDrop(BlockInit.NATURAL_ESSENCE_ORE.get(), ItemInit.NATURAL_ESSENCE.get()));
        this.add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get(), ItemInit.NATURAL_ESSENCE.get()));

        this.dropSelf(BlockInit.OPAL_BLOCK.get());
        this.add(BlockInit.OPAL_ORE.get(),
                (block) -> createOreDrop(BlockInit.OPAL_ORE.get(), ItemInit.OPAL.get()));
        this.add(BlockInit.DEEPSLATE_OPAL_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_OPAL_ORE.get(), ItemInit.OPAL.get()));

        this.dropSelf(BlockInit.PARYTH_BLOCK.get());
        this.add(BlockInit.PARYTH_ORE.get(),
                (block) -> createOreDrop(BlockInit.PARYTH_ORE.get(), ItemInit.PARYTH.get()));
        this.add(BlockInit.DEEPSLATE_PARYTH_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_PARYTH_ORE.get(), ItemInit.PARYTH.get()));

        this.dropSelf(BlockInit.RUBY_BLOCK.get());
        this.add(BlockInit.RUBY_ORE.get(),
                (block) -> createOreDrop(BlockInit.RUBY_ORE.get(), ItemInit.RUBY.get()));
        this.add(BlockInit.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_RUBY_ORE.get(), ItemInit.RUBY.get()));

        this.dropSelf(BlockInit.TANGERINE_BLOCK.get());
        this.add(BlockInit.TANGERINE_ORE.get(),
                (block) -> createOreDrop(BlockInit.TANGERINE_ORE.get(), ItemInit.TANGERINE.get()));
        this.add(BlockInit.DEEPSLATE_TANGERINE_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_TANGERINE_ORE.get(), ItemInit.TANGERINE.get()));

        this.add(BlockInit.WHITE_DWARF_STAR_ORE.get(),
                (block) -> createOreDrop(BlockInit.WHITE_DWARF_STAR_ORE.get(), ItemInit.WHITE_DWARF_STAR.get()));
        this.add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get(), ItemInit.WHITE_DWARF_STAR.get()));

        this.add(BlockInit.ALUMINUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.ALUMINUM_ORE.get(), ItemInit.RAW_ALUMINUM.get()));
        this.add(BlockInit.DEEPSLATE_ALUMINUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_ALUMINUM_ORE.get(), ItemInit.RAW_ALUMINUM.get()));

        this.add(BlockInit.ANTIMONY_ORE.get(),
                (block) -> createOreDrop(BlockInit.ANTIMONY_ORE.get(), ItemInit.RAW_ANTIMONY.get()));
        this.add(BlockInit.DEEPSLATE_ANTIMONY_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_ANTIMONY_ORE.get(), ItemInit.RAW_ANTIMONY.get()));

        this.add(BlockInit.ARSENIC_ORE.get(),
                (block) -> createOreDrop(BlockInit.ARSENIC_ORE.get(), ItemInit.RAW_ARSENIC.get()));
        this.add(BlockInit.DEEPSLATE_ARSENIC_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_ARSENIC_ORE.get(), ItemInit.RAW_ARSENIC.get()));

        this.add(BlockInit.BARIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.BARIUM_ORE.get(), ItemInit.RAW_BARIUM.get()));
        this.add(BlockInit.DEEPSLATE_BARIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_BARIUM_ORE.get(), ItemInit.RAW_BARIUM.get()));

        this.add(BlockInit.BERYLLIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.BERYLLIUM_ORE.get(), ItemInit.RAW_BERYLLIUM.get()));
        this.add(BlockInit.DEEPSLATE_BERYLLIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_BERYLLIUM_ORE.get(), ItemInit.RAW_BERYLLIUM.get()));

        this.add(BlockInit.BISMUTH_ORE.get(),
                (block) -> createOreDrop(BlockInit.BISMUTH_ORE.get(), ItemInit.RAW_BISMUTH.get()));
        this.add(BlockInit.DEEPSLATE_BISMUTH_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_BISMUTH_ORE.get(), ItemInit.RAW_BISMUTH.get()));

        this.add(BlockInit.BORON_ORE.get(),
                (block) -> createOreDrop(BlockInit.BORON_ORE.get(), ItemInit.RAW_BORON.get()));
        this.add(BlockInit.DEEPSLATE_BORON_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_BORON_ORE.get(), ItemInit.RAW_BORON.get()));

        this.add(BlockInit.CADMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.CADMIUM_ORE.get(), ItemInit.RAW_CADMIUM.get()));
        this.add(BlockInit.DEEPSLATE_CADMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_CADMIUM_ORE.get(), ItemInit.RAW_CADMIUM.get()));

        this.add(BlockInit.CALCIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.CALCIUM_ORE.get(), ItemInit.RAW_CALCIUM.get()));
        this.add(BlockInit.DEEPSLATE_CALCIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_CALCIUM_ORE.get(), ItemInit.RAW_CALCIUM.get()));

        this.add(BlockInit.CERIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.CERIUM_ORE.get(), ItemInit.RAW_CERIUM.get()));
        this.add(BlockInit.DEEPSLATE_CERIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_CERIUM_ORE.get(), ItemInit.RAW_CERIUM.get()));

        this.add(BlockInit.CESIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.CESIUM_ORE.get(), ItemInit.RAW_CESIUM.get()));
        this.add(BlockInit.DEEPSLATE_CESIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_CESIUM_ORE.get(), ItemInit.RAW_CESIUM.get()));

        this.add(BlockInit.CHROMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.CHROMIUM_ORE.get(), ItemInit.RAW_CHROMIUM.get()));
        this.add(BlockInit.DEEPSLATE_CHROMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_CHROMIUM_ORE.get(), ItemInit.RAW_CHROMIUM.get()));

        this.add(BlockInit.DYSPROSIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DYSPROSIUM_ORE.get(), ItemInit.RAW_DYSPROSIUM.get()));
        this.add(BlockInit.DEEPSLATE_DYSPROSIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_DYSPROSIUM_ORE.get(), ItemInit.RAW_DYSPROSIUM.get()));

        this.add(BlockInit.ERBIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.ERBIUM_ORE.get(), ItemInit.RAW_ERBIUM.get()));
        this.add(BlockInit.DEEPSLATE_ERBIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_ERBIUM_ORE.get(), ItemInit.RAW_ERBIUM.get()));

        this.add(BlockInit.EUROPIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.EUROPIUM_ORE.get(), ItemInit.RAW_EUROPIUM.get()));
        this.add(BlockInit.DEEPSLATE_EUROPIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_EUROPIUM_ORE.get(), ItemInit.RAW_EUROPIUM.get()));

        this.add(BlockInit.FRANCIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.FRANCIUM_ORE.get(), ItemInit.RAW_FRANCIUM.get()));
        this.add(BlockInit.DEEPSLATE_FRANCIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_FRANCIUM_ORE.get(), ItemInit.RAW_FRANCIUM.get()));

        this.add(BlockInit.GADOLINIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.GADOLINIUM_ORE.get(), ItemInit.RAW_GADOLINIUM.get()));
        this.add(BlockInit.DEEPSLATE_GADOLINIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_GADOLINIUM_ORE.get(), ItemInit.RAW_GADOLINIUM.get()));

        this.add(BlockInit.GALLIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.GALLIUM_ORE.get(), ItemInit.RAW_GALLIUM.get()));
        this.add(BlockInit.DEEPSLATE_GALLIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_GALLIUM_ORE.get(), ItemInit.RAW_GALLIUM.get()));

        this.add(BlockInit.GERMANIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.GERMANIUM_ORE.get(), ItemInit.RAW_GERMANIUM.get()));
        this.add(BlockInit.DEEPSLATE_GERMANIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_GERMANIUM_ORE.get(), ItemInit.RAW_GERMANIUM.get()));

        this.add(BlockInit.HAFNIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.HAFNIUM_ORE.get(), ItemInit.RAW_HAFNIUM.get()));
        this.add(BlockInit.DEEPSLATE_HAFNIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_HAFNIUM_ORE.get(), ItemInit.RAW_HAFNIUM.get()));

        this.add(BlockInit.HOLMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.HOLMIUM_ORE.get(), ItemInit.RAW_HOLMIUM.get()));
        this.add(BlockInit.DEEPSLATE_HOLMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_HOLMIUM_ORE.get(), ItemInit.RAW_HOLMIUM.get()));

        this.add(BlockInit.INDIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.INDIUM_ORE.get(), ItemInit.RAW_INDIUM.get()));
        this.add(BlockInit.DEEPSLATE_INDIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_INDIUM_ORE.get(), ItemInit.RAW_INDIUM.get()));

        this.add(BlockInit.IRIDIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.IRIDIUM_ORE.get(), ItemInit.RAW_IRIDIUM.get()));
        this.add(BlockInit.DEEPSLATE_IRIDIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_IRIDIUM_ORE.get(), ItemInit.RAW_IRIDIUM.get()));

        this.add(BlockInit.LANTHANUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.LANTHANUM_ORE.get(), ItemInit.RAW_LANTHANUM.get()));
        this.add(BlockInit.DEEPSLATE_LANTHANUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_LANTHANUM_ORE.get(), ItemInit.RAW_LANTHANUM.get()));

        this.add(BlockInit.LEAD_ORE.get(),
                (block) -> createOreDrop(BlockInit.LEAD_ORE.get(), ItemInit.RAW_LEAD.get()));
        this.add(BlockInit.DEEPSLATE_LEAD_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_LEAD_ORE.get(), ItemInit.RAW_LEAD.get()));

        this.add(BlockInit.LITHIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.LITHIUM_ORE.get(), ItemInit.RAW_LITHIUM.get()));
        this.add(BlockInit.DEEPSLATE_LITHIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_LITHIUM_ORE.get(), ItemInit.RAW_LITHIUM.get()));

        this.add(BlockInit.LUTETIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.LUTETIUM_ORE.get(), ItemInit.RAW_LUTETIUM.get()));
        this.add(BlockInit.DEEPSLATE_LUTETIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_LUTETIUM_ORE.get(), ItemInit.RAW_LUTETIUM.get()));

        this.add(BlockInit.MAGNESIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.MAGNESIUM_ORE.get(), ItemInit.RAW_MAGNESIUM.get()));
        this.add(BlockInit.DEEPSLATE_MAGNESIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_MAGNESIUM_ORE.get(), ItemInit.RAW_MAGNESIUM.get()));

        this.add(BlockInit.MANGANESE_ORE.get(),
                (block) -> createOreDrop(BlockInit.MANGANESE_ORE.get(), ItemInit.RAW_MANGANESE.get()));
        this.add(BlockInit.DEEPSLATE_MANGANESE_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_MANGANESE_ORE.get(), ItemInit.RAW_MANGANESE.get()));

        this.add(BlockInit.MERCURY_ORE.get(),
                (block) -> createOreDrop(BlockInit.MERCURY_ORE.get(), ItemInit.RAW_MERCURY.get()));
        this.add(BlockInit.DEEPSLATE_MERCURY_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_MERCURY_ORE.get(), ItemInit.RAW_MERCURY.get()));

        this.add(BlockInit.MYTHRIL_ORE.get(),
                (block) -> createOreDrop(BlockInit.MYTHRIL_ORE.get(), ItemInit.RAW_MYTHRIL.get()));
        this.add(BlockInit.DEEPSLATE_MYTHRIL_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_MYTHRIL_ORE.get(), ItemInit.RAW_MYTHRIL.get()));

        this.add(BlockInit.MOLYBDENUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.MOLYBDENUM_ORE.get(), ItemInit.RAW_MOLYBDENUM.get()));
        this.add(BlockInit.DEEPSLATE_MOLYBDENUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_MOLYBDENUM_ORE.get(), ItemInit.RAW_MOLYBDENUM.get()));

        this.add(BlockInit.NEODYMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.NEODYMIUM_ORE.get(), ItemInit.RAW_NEODYMIUM.get()));
        this.add(BlockInit.DEEPSLATE_NEODYMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_NEODYMIUM_ORE.get(), ItemInit.RAW_NEODYMIUM.get()));

        this.add(BlockInit.NICKEL_ORE.get(),
                (block) -> createOreDrop(BlockInit.NICKEL_ORE.get(), ItemInit.RAW_NICKEL.get()));
        this.add(BlockInit.DEEPSLATE_NICKEL_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_NICKEL_ORE.get(), ItemInit.RAW_NICKEL.get()));

        this.add(BlockInit.OSMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.OSMIUM_ORE.get(), ItemInit.RAW_OSMIUM.get()));
        this.add(BlockInit.DEEPSLATE_OSMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_OSMIUM_ORE.get(), ItemInit.RAW_OSMIUM.get()));

        this.add(BlockInit.PALLADIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.PALLADIUM_ORE.get(), ItemInit.RAW_PALLADIUM.get()));
        this.add(BlockInit.DEEPSLATE_PALLADIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_PALLADIUM_ORE.get(), ItemInit.RAW_PALLADIUM.get()));

        this.add(BlockInit.PLATINUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.PLATINUM_ORE.get(), ItemInit.RAW_PLATINUM.get()));
        this.add(BlockInit.DEEPSLATE_PLATINUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_PLATINUM_ORE.get(), ItemInit.RAW_PLATINUM.get()));

        this.add(BlockInit.PLUTONIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.PLUTONIUM_ORE.get(), ItemInit.RAW_PLUTONIUM.get()));
        this.add(BlockInit.DEEPSLATE_PLUTONIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_PLUTONIUM_ORE.get(), ItemInit.RAW_PLUTONIUM.get()));

        this.add(BlockInit.POLONIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.POLONIUM_ORE.get(), ItemInit.RAW_POLONIUM.get()));
        this.add(BlockInit.DEEPSLATE_POLONIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_POLONIUM_ORE.get(), ItemInit.RAW_POLONIUM.get()));

        this.add(BlockInit.POTASSIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.POTASSIUM_ORE.get(), ItemInit.RAW_POTASSIUM.get()));
        this.add(BlockInit.DEEPSLATE_POTASSIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_POTASSIUM_ORE.get(), ItemInit.RAW_POTASSIUM.get()));

        this.add(BlockInit.PRASEODYMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.PRASEODYMIUM_ORE.get(), ItemInit.RAW_PRASEODYMIUM.get()));
        this.add(BlockInit.DEEPSLATE_PRASEODYMIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_PRASEODYMIUM_ORE.get(), ItemInit.RAW_PRASEODYMIUM.get()));

        this.add(BlockInit.PROMETHIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.PROMETHIUM_ORE.get(), ItemInit.RAW_PROMETHIUM.get()));
        this.add(BlockInit.DEEPSLATE_PROMETHIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_PROMETHIUM_ORE.get(), ItemInit.RAW_PROMETHIUM.get()));

        this.add(BlockInit.RADIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.RADIUM_ORE.get(), ItemInit.RAW_RADIUM.get()));
        this.add(BlockInit.DEEPSLATE_RADIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_RADIUM_ORE.get(), ItemInit.RAW_RADIUM.get()));

        this.add(BlockInit.RHODIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.RHODIUM_ORE.get(), ItemInit.RAW_RHODIUM.get()));
        this.add(BlockInit.DEEPSLATE_RHODIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_RHODIUM_ORE.get(), ItemInit.RAW_RHODIUM.get()));

        this.add(BlockInit.RUTHENIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.RUTHENIUM_ORE.get(), ItemInit.RAW_RUTHENIUM.get()));
        this.add(BlockInit.DEEPSLATE_RUTHENIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_RUTHENIUM_ORE.get(), ItemInit.RAW_RUTHENIUM.get()));

        this.add(BlockInit.SAMARIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.SAMARIUM_ORE.get(), ItemInit.RAW_SAMARIUM.get()));
        this.add(BlockInit.DEEPSLATE_SAMARIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_SAMARIUM_ORE.get(), ItemInit.RAW_SAMARIUM.get()));

        this.add(BlockInit.SCANDIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.SCANDIUM_ORE.get(), ItemInit.RAW_SCANDIUM.get()));
        this.add(BlockInit.DEEPSLATE_SCANDIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_SCANDIUM_ORE.get(), ItemInit.RAW_SCANDIUM.get()));

        this.add(BlockInit.SELENIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.SELENIUM_ORE.get(), ItemInit.RAW_SELENIUM.get()));
        this.add(BlockInit.DEEPSLATE_SELENIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_SELENIUM_ORE.get(), ItemInit.RAW_SELENIUM.get()));

        this.add(BlockInit.SILICON_ORE.get(),
                (block) -> createOreDrop(BlockInit.SILICON_ORE.get(), ItemInit.RAW_SILICON.get()));
        this.add(BlockInit.DEEPSLATE_SILICON_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_SILICON_ORE.get(), ItemInit.RAW_SILICON.get()));

        this.add(BlockInit.SILVER_ORE.get(),
                (block) -> createOreDrop(BlockInit.SILVER_ORE.get(), ItemInit.RAW_SILVER.get()));
        this.add(BlockInit.DEEPSLATE_SILVER_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_SILVER_ORE.get(), ItemInit.RAW_SILVER.get()));

        this.add(BlockInit.SODIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.SODIUM_ORE.get(), ItemInit.RAW_SODIUM.get()));
        this.add(BlockInit.DEEPSLATE_SODIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_SODIUM_ORE.get(), ItemInit.RAW_SODIUM.get()));

        this.add(BlockInit.STRONTIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.STRONTIUM_ORE.get(), ItemInit.RAW_STRONTIUM.get()));
        this.add(BlockInit.DEEPSLATE_STRONTIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_STRONTIUM_ORE.get(), ItemInit.RAW_STRONTIUM.get()));

        this.add(BlockInit.TELLURIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.TELLURIUM_ORE.get(), ItemInit.RAW_TELLURIUM.get()));
        this.add(BlockInit.DEEPSLATE_TELLURIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_TELLURIUM_ORE.get(), ItemInit.RAW_TELLURIUM.get()));

        this.add(BlockInit.TERBIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.TERBIUM_ORE.get(), ItemInit.RAW_TERBIUM.get()));
        this.add(BlockInit.DEEPSLATE_TERBIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_TERBIUM_ORE.get(), ItemInit.RAW_TERBIUM.get()));

        this.add(BlockInit.THALLIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.THALLIUM_ORE.get(), ItemInit.RAW_THALLIUM.get()));
        this.add(BlockInit.DEEPSLATE_THALLIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_THALLIUM_ORE.get(), ItemInit.RAW_THALLIUM.get()));

        this.add(BlockInit.THORIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.THORIUM_ORE.get(), ItemInit.RAW_THORIUM.get()));
        this.add(BlockInit.DEEPSLATE_THORIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_THORIUM_ORE.get(), ItemInit.RAW_THORIUM.get()));

        this.add(BlockInit.THULIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.THULIUM_ORE.get(), ItemInit.RAW_THULIUM.get()));
        this.add(BlockInit.DEEPSLATE_THULIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_THULIUM_ORE.get(), ItemInit.RAW_THULIUM.get()));

        this.add(BlockInit.TIN_ORE.get(),
                (block) -> createOreDrop(BlockInit.TIN_ORE.get(), ItemInit.RAW_TIN.get()));
        this.add(BlockInit.DEEPSLATE_TIN_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_TIN_ORE.get(), ItemInit.RAW_TIN.get()));

        this.add(BlockInit.TITANIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.TITANIUM_ORE.get(), ItemInit.RAW_TITANIUM.get()));
        this.add(BlockInit.DEEPSLATE_TITANIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_TITANIUM_ORE.get(), ItemInit.RAW_TITANIUM.get()));

        this.add(BlockInit.URANIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.URANIUM_ORE.get(), ItemInit.RAW_URANIUM.get()));
        this.add(BlockInit.DEEPSLATE_URANIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_URANIUM_ORE.get(), ItemInit.RAW_URANIUM.get()));

        this.add(BlockInit.VANADIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.VANADIUM_ORE.get(), ItemInit.RAW_VANADIUM.get()));
        this.add(BlockInit.DEEPSLATE_VANADIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_VANADIUM_ORE.get(), ItemInit.RAW_VANADIUM.get()));

        this.add(BlockInit.VIBRANIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.VIBRANIUM_ORE.get(), ItemInit.RAW_VIBRANIUM.get()));
        this.add(BlockInit.DEEPSLATE_VIBRANIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_VIBRANIUM_ORE.get(), ItemInit.RAW_VIBRANIUM.get()));

        this.add(BlockInit.YTTERBIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.YTTERBIUM_ORE.get(), ItemInit.RAW_YTTERBIUM.get()));
        this.add(BlockInit.DEEPSLATE_YTTERBIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_YTTERBIUM_ORE.get(), ItemInit.RAW_YTTERBIUM.get()));

        this.add(BlockInit.YTTRIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.YTTRIUM_ORE.get(), ItemInit.RAW_YTTRIUM.get()));
        this.add(BlockInit.DEEPSLATE_YTTRIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_YTTRIUM_ORE.get(), ItemInit.RAW_YTTRIUM.get()));

        this.add(BlockInit.ZIRCONIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.ZIRCONIUM_ORE.get(), ItemInit.RAW_ZIRCONIUM.get()));
        this.add(BlockInit.DEEPSLATE_ZIRCONIUM_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_ZIRCONIUM_ORE.get(), ItemInit.RAW_ZIRCONIUM.get()));





        this.dropSelf(BlockInit.FLAME_BLOCK.get());
        this.add(BlockInit.FLAME_ORE_NETHER.get(),
                (block) -> createOreDrop(BlockInit.FLAME_ORE_NETHER.get(), ItemInit.FLAME.get()));

        this.add(BlockInit.RUBY_ORE_NETHER.get(),
                (block) -> createOreDrop(BlockInit.RUBY_ORE_NETHER.get(), ItemInit.RUBY.get()));

        this.add(BlockInit.HELLFIRE_ORE_NETHER.get(),
                (block) -> createOreDrop(BlockInit.HELLFIRE_ORE_NETHER.get(), ItemInit.HELLFIRE.get()));


        this.dropSelf(BlockInit.BAMBOO_BLOCK.get());
        this.add(BlockInit.BAMBOO_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.BAMBOO_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(BlockInit.BAMBOO_STAIRS.get());
        this.dropSelf(BlockInit.BAMBOO_WALL.get());

        this.dropSelf(BlockInit.CIRCULAR_BRICKS.get());
        this.dropSelf(BlockInit.WEAVER_BRICKS.get());
        this.dropSelf(BlockInit.SOLID_BRICKS.get());
        this.dropSelf(BlockInit.ROAD_BRICKS.get());
        this.dropSelf(BlockInit.ORNATE_BRICKS.get());
        this.dropSelf(BlockInit.MOSAIC_BRICKS.get());
        this.dropSelf(BlockInit.SLANTED_BRICKS.get());
        this.dropSelf(BlockInit.SKINNY_BRICKS.get());
        this.dropSelf(BlockInit.SKINNY_SLANTED_BRICKS.get());
        this.dropSelf(BlockInit.CRACKED_BRICKS.get());
        this.dropSelf(BlockInit.ENCASED_BRICKS.get());

        this.dropSelf(BlockInit.BLACK_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.BLUE_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.BROWN_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.CYAN_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.GRAY_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.GREEN_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.LIGHT_BLUE_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.LIGHT_GRAY_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.LIME_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.MAGENTA_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.ORANGE_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.PINK_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.PURPLE_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.RED_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.WHITE_REDSTONE_LAMP.get());
        this.dropSelf(BlockInit.YELLOW_REDSTONE_LAMP.get());


        addBerryBush(BlockInit.STRAWBERRY_BUSH.get(), ItemInit.STRAWBERRY.get(), 2, 3);
        addBerryBush(BlockInit.BLUEBERRY_BUSH.get(), ItemInit.BLUEBERRY.get(), 2, 3);
        addBerryBush(BlockInit.LOGANBERRY_BUSH.get(), ItemInit.LOGANBERRY.get(), 2, 3);
        addBerryBush(BlockInit.RED_RASPBERRY_BUSH.get(), ItemInit.RED_RASPBERRY.get(), 2, 3);
        addBerryBush(BlockInit.BLACK_RASPBERRY_BUSH.get(), ItemInit.BLACK_RASPBERRY.get(), 2, 3);
        addBerryBush(BlockInit.GOLDEN_RASPBERRY_BUSH.get(), ItemInit.GOLDEN_RASPBERRY.get(), 2, 3);
        addBerryBush(BlockInit.WHITE_RASPBERRY_BUSH.get(), ItemInit.WHITE_RASPBERRY.get(), 2, 3);
        addBerryBush(BlockInit.MARIONBERRY_BUSH.get(), ItemInit.MARIONBERRY.get(), 2, 3);
        addBerryBush(BlockInit.BLACKCURRANT_BUSH.get(), ItemInit.BLACKCURRANT.get(), 2, 3);
        addBerryBush(BlockInit.REDCURRANT_BUSH.get(), ItemInit.REDCURRANT.get(), 2, 3);
        addBerryBush(BlockInit.HUCKLEBERRY_BUSH.get(), ItemInit.HUCKLEBERRY.get(), 2, 3);
        addBerryBush(BlockInit.WINEBERRY_BUSH.get(), ItemInit.WINEBERRY.get(), 2, 3);
        addBerryBush(BlockInit.ELDERBERRY_BUSH.get(), ItemInit.ELDERBERRY.get(), 2, 3);
        addBerryBush(BlockInit.BLACKBERRY_BUSH.get(), ItemInit.BLACKBERRY.get(), 2, 3);
        addBerryBush(BlockInit.BOYSENBERRY_BUSH.get(), ItemInit.BOYSENBERRY.get(), 2, 3);
        addBerryBush(BlockInit.GROUND_CHERRY_BUSH.get(), ItemInit.GROUND_CHERRY.get(), 2, 3);
        addBerryBush(BlockInit.ARONIA_BERRY_BUSH.get(), ItemInit.ARONIA_BERRY.get(), 2, 3);
        addBerryBush(BlockInit.SERVICEBERRY_BUSH.get(), ItemInit.SERVICEBERRY.get(), 2, 3);
        addBerryBush(BlockInit.WONDERBERRY_BUSH.get(), ItemInit.WONDERBERRY.get(), 2, 3);
        addBerryBush(BlockInit.MULBERRY_BUSH.get(), ItemInit.MULBERRY.get(), 2, 3);
        addBerryBush(BlockInit.LINGONBERRY_BUSH.get(), ItemInit.LINGONBERRY.get(), 2, 3);
        addBerryBush(BlockInit.CRANBERRY_BUSH.get(), ItemInit.CRANBERRY.get(), 2, 3);
        addBerryBush(BlockInit.DEWBERRY_BUSH.get(), ItemInit.DEWBERRY.get(), 2, 3);
        addBerryBush(BlockInit.THIMBLEBERRY_BUSH.get(), ItemInit.THIMBLEBERRY.get(), 2, 3);
        addBerryBush(BlockInit.GOOSEBERRY_BUSH.get(), ItemInit.GOOSEBERRY.get(), 2, 3);
        addBerryBush(BlockInit.CHOKEBERRY_BUSH.get(), ItemInit.CHOKEBERRY.get(), 2, 3);
        addBerryBush(BlockInit.OLALLIEBERRY_BUSH.get(), ItemInit.OLALLIEBERRY.get(), 2, 3);
        addBerryBush(BlockInit.ACEROLA_CHERRY_BUSH.get(), ItemInit.ACEROLA_CHERRY.get(), 2, 3);
        addBerryBush(BlockInit.BARBERRY_BUSH.get(), ItemInit.BARBERRY.get(), 2, 3);
        addBerryBush(BlockInit.BAYBERRY_BUSH.get(), ItemInit.BAYBERRY.get(), 2, 3);
        addBerryBush(BlockInit.GOGI_BERRY_BUSH.get(), ItemInit.GOGI_BERRY.get(), 2, 3);
    }

    private void addBerryBush(Block block, Item item, int min, int max) {
        this.add(block, (p_124086_) -> {
            return applyExplosionDecay(p_124086_, LootTable.lootTable().withPool(LootPool.lootPool().when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BerryBlockBase.AGE, 2))).add(LootItem.lootTableItem(item)).apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))).withPool(LootPool.lootPool().when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BerryBlockBase.AGE, 1))).add(LootItem.lootTableItem(item)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))));
        });    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

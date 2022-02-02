package io.github.cjcj55.chrispymod.core.world.feature;

import io.github.cjcj55.chrispymod.core.init.ChrispyModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ChrispyModConfiguredFeature {
// Overworld
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RUBY_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ChrispyModBlocks.COBALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ChrispyModBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_OPAL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ChrispyModBlocks.OPAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ChrispyModBlocks.DEEPSLATE_OPAL_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TANGERINE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ChrispyModBlocks.TANGERINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ChrispyModBlocks.DEEPSLATE_TANGERINE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COBALT_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ChrispyModBlocks.COBALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ChrispyModBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PARYTH_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ChrispyModBlocks.PARYTH_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ChrispyModBlocks.DEEPSLATE_PARYTH_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_WHITE_DWARF_STAR_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ChrispyModBlocks.WHITE_DWARF_STAR_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ChrispyModBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_NATURAL_ESSENCE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ChrispyModBlocks.NATURAL_ESSENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ChrispyModBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_EXPERIENCE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ChrispyModBlocks.EXPERIENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ChrispyModBlocks.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState()));

// Nether
    public static final List<OreConfiguration.TargetBlockState> NETHER_RUBY_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ChrispyModBlocks.RUBY_ORE_NETHER.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_FLAME_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ChrispyModBlocks.FLAME_ORE_NETHER.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_HELLFIRE_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ChrispyModBlocks.HELLFIRE_ORE_NETHER.get().defaultBlockState()));




    public static final ConfiguredFeature<?, ?> RUBY_ORE = FeatureUtils.register("cobalt_ore", Feature.ORE.configured(new OreConfiguration(OVERWORLD_RUBY_ORES, 9)));
    public static final ConfiguredFeature<?, ?> OPAL_ORE = FeatureUtils.register("opal_ore", Feature.ORE.configured(new OreConfiguration(OVERWORLD_OPAL_ORES, 9)));
    public static final ConfiguredFeature<?, ?> TANGERINE_ORE = FeatureUtils.register("tangerine_ore", Feature.ORE.configured(new OreConfiguration(OVERWORLD_TANGERINE_ORES, 9)));
    public static final ConfiguredFeature<?, ?> COBALT_ORE = FeatureUtils.register("cobalt_ore", Feature.ORE.configured(new OreConfiguration(OVERWORLD_COBALT_ORES, 9)));
    public static final ConfiguredFeature<?, ?> PARYTH_ORE = FeatureUtils.register("paryth_ore", Feature.ORE.configured(new OreConfiguration(OVERWORLD_PARYTH_ORES, 9)));
    public static final ConfiguredFeature<?, ?> WHITE_DWARF_STAR_ORE = FeatureUtils.register("white_dwarf_star_ore", Feature.ORE.configured(new OreConfiguration(OVERWORLD_WHITE_DWARF_STAR_ORES, 9)));
    public static final ConfiguredFeature<?, ?> NATURAL_ESSENCE_ORE = FeatureUtils.register("natural_essence_ore", Feature.ORE.configured(new OreConfiguration(OVERWORLD_NATURAL_ESSENCE_ORES, 9)));
    public static final ConfiguredFeature<?, ?> EXPERIENCE_ORE = FeatureUtils.register("experience_ore", Feature.ORE.configured(new OreConfiguration(OVERWORLD_EXPERIENCE_ORES, 9)));

    public static final ConfiguredFeature<?, ?> RUBY_ORE_NETHER = FeatureUtils.register("ruby_ore_nether", Feature.ORE.configured(new OreConfiguration(NETHER_RUBY_ORES, 9)));
    public static final ConfiguredFeature<?, ?> FLAME_ORE_NETHER = FeatureUtils.register("flame_ore_nether", Feature.ORE.configured(new OreConfiguration(NETHER_FLAME_ORES, 9)));
    public static final ConfiguredFeature<?, ?> HELLFIRE_ORE_NETHER = FeatureUtils.register("hellfire_ore_nether", Feature.ORE.configured(new OreConfiguration(NETHER_HELLFIRE_ORES, 9)));
}

package io.github.cjcj55.chrispymod.core.world.feature;

import io.github.cjcj55.chrispymod.core.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ChrispyModConfiguredFeature {
// Overworld
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORE_RUBY_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.COBALT_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORE_OPAL_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.OPAL_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_OPAL_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORE_TANGERINE_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TANGERINE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_TANGERINE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORE_COBALT_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.COBALT_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORE_PARYTH_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.PARYTH_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_PARYTH_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORE_WHITE_DWARF_STAR_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.WHITE_DWARF_STAR_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORE_NATURAL_ESSENCE_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.NATURAL_ESSENCE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORE_EXPERIENCE_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.EXPERIENCE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState()));

// Nether
    public static final List<OreConfiguration.TargetBlockState> NETHER_ORE_RUBY_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.RUBY_ORE_NETHER.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> NETHER_ORE_FLAME_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.FLAME_ORE_NETHER.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> NETHER_ORE_HELLFIRE_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.HELLFIRE_ORE_NETHER.get().defaultBlockState()));




    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_RUBY_SMALL = FeatureUtils.register("overworld_ore_ruby_small", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_RUBY_TARGET_LIST, 5, 0.4F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_RUBY_LARGE = FeatureUtils.register("overworld_ore_ruby_large", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_RUBY_TARGET_LIST, 12, 0.6F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_RUBY_HIDDEN = FeatureUtils.register("overworld_ore_ruby_hidden", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_RUBY_TARGET_LIST, 10, 1.0F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_OPAL = FeatureUtils.register("overworld_ore_opal", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_OPAL_TARGET_LIST, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_OPAL_SMALL = FeatureUtils.register("overworld_ore_opal_small", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_OPAL_TARGET_LIST, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_TANGERINE = FeatureUtils.register("overworld_ore_tangerine", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_TANGERINE_TARGET_LIST, 8));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_TANGERINE_SMALL = FeatureUtils.register("overworld_ore_tangerine_small", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_TANGERINE_TARGET_LIST, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_COBALT_SMALL = FeatureUtils.register("overworld_ore_cobalt_small", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_COBALT_TARGET_LIST, 3, 0.5F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_COBALT_LARGE = FeatureUtils.register("overworld_ore_cobalt_large", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_COBALT_TARGET_LIST, 10, 0.7F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_COBALT_HIDDEN = FeatureUtils.register("overworld_ore_cobalt_hidden", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_COBALT_TARGET_LIST, 7, 1.0F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_PARYTH = FeatureUtils.register("overworld_ore_paryth", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_PARYTH_TARGET_LIST, 8));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_PARYTH_SMALL = FeatureUtils.register("overworld_ore_paryth_small", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_PARYTH_TARGET_LIST, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_WHITE_DWARF_STAR_SMALL = FeatureUtils.register("overworld_ore_white_dwarf_star_small", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_WHITE_DWARF_STAR_TARGET_LIST, 4, 0.5F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_WHITE_DWARF_STAR_HIDDEN = FeatureUtils.register("overworld_ore_white_dwarf_star_hidden", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_WHITE_DWARF_STAR_TARGET_LIST, 6, 1.0F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_NATURAL_ESSENCE_HIDDEN = FeatureUtils.register("overworld_ore_natural_essence_hidden", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_NATURAL_ESSENCE_TARGET_LIST, 5, 1.0F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_EXPERIENCE = FeatureUtils.register("overworld_ore_experience", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_EXPERIENCE_TARGET_LIST, 4, 0.1F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_ORE_EXPERIENCE_HIDDEN = FeatureUtils.register("overworld_ore_experience_hidden", Feature.ORE, new OreConfiguration(OVERWORLD_ORE_EXPERIENCE_TARGET_LIST, 5, 1.0F));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_ORE_RUBY = FeatureUtils.register("nether_ore_ruby", Feature.ORE, new OreConfiguration(NETHER_ORE_RUBY_TARGET_LIST, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_ORE_FLAME = FeatureUtils.register("nether_ore_flame", Feature.ORE, new OreConfiguration(NETHER_ORE_FLAME_TARGET_LIST, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_ORE_HELLFIRE = FeatureUtils.register("nether_ore_hellfire", Feature.ORE, new OreConfiguration(NETHER_ORE_HELLFIRE_TARGET_LIST, 9));
}

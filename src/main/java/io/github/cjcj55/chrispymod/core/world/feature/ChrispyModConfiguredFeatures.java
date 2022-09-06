package io.github.cjcj55.chrispymod.core.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ChrispyModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ChrispyMod.MODID);

// Overworld
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORE_RUBY_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.COBALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_COBALT_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORE_OPAL_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.OPAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_OPAL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORE_TANGERINE_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TANGERINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_TANGERINE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORE_COBALT_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.COBALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_COBALT_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORE_PARYTH_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.PARYTH_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_PARYTH_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORE_WHITE_DWARF_STAR_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.WHITE_DWARF_STAR_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORE_NATURAL_ESSENCE_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.NATURAL_ESSENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORE_EXPERIENCE_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.EXPERIENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState())));

// Nether
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_ORE_RUBY_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.RUBY_ORE_NETHER.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_ORE_FLAME_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.FLAME_ORE_NETHER.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_ORE_HELLFIRE_TARGET_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.HELLFIRE_ORE_NETHER.get().defaultBlockState())));
    // For END, instead of OreFeatures.NETHER_ORE_REPLACEABLES do:  new BlockMatchTest(Blocks.END_STONE)








//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_RUBY_SMALL = CONFIGURED_FEATURES.register("overworld_ore_ruby_small",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_RUBY_TARGET_LIST.get(), 5, 0.4F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_RUBY_LARGE = CONFIGURED_FEATURES.register("overworld_ore_ruby_large",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_RUBY_TARGET_LIST.get(), 12, 0.6F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_RUBY_HIDDEN = CONFIGURED_FEATURES.register("overworld_ore_ruby_hidden",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_RUBY_TARGET_LIST.get(), 10, 1.0F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_OPAL = CONFIGURED_FEATURES.register("overworld_ore_opal",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_OPAL_TARGET_LIST.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_OPAL_SMALL = CONFIGURED_FEATURES.register("overworld_ore_opal_small",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_OPAL_TARGET_LIST.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_TANGERINE = CONFIGURED_FEATURES.register("overworld_ore_tangerine",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_TANGERINE_TARGET_LIST.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_TANGERINE_SMALL = CONFIGURED_FEATURES.register("overworld_ore_tangerine_small",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_TANGERINE_TARGET_LIST.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_COBALT_SMALL = CONFIGURED_FEATURES.register("overworld_ore_cobalt_small",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_COBALT_TARGET_LIST.get(), 3, 0.5F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_COBALT_LARGE = CONFIGURED_FEATURES.register("overworld_ore_cobalt_large",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_COBALT_TARGET_LIST.get(), 10, 0.7F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_COBALT_HIDDEN = CONFIGURED_FEATURES.register("overworld_ore_cobalt_hidden",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_COBALT_TARGET_LIST.get(), 7, 1.0F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_PARYTH = CONFIGURED_FEATURES.register("overworld_ore_paryth",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_PARYTH_TARGET_LIST.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_PARYTH_SMALL = CONFIGURED_FEATURES.register("overworld_ore_paryth_small",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_PARYTH_TARGET_LIST.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_WHITE_DWARF_STAR_SMALL = CONFIGURED_FEATURES.register("overworld_ore_white_dwarf_star_small",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_WHITE_DWARF_STAR_TARGET_LIST.get(), 4, 0.5F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_WHITE_DWARF_STAR_HIDDEN = CONFIGURED_FEATURES.register("overworld_ore_white_dwarf_star_hidden",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_WHITE_DWARF_STAR_TARGET_LIST.get(), 6, 1.0F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_NATURAL_ESSENCE_HIDDEN = CONFIGURED_FEATURES.register("overworld_ore_natural_essence_hidden",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_NATURAL_ESSENCE_TARGET_LIST.get(), 5, 1.0F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_EXPERIENCE = CONFIGURED_FEATURES.register("overworld_ore_experience",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_EXPERIENCE_TARGET_LIST.get(), 4, 0.1F)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ORE_EXPERIENCE_HIDDEN = CONFIGURED_FEATURES.register("overworld_ore_experience_hidden",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORE_EXPERIENCE_TARGET_LIST.get(), 5, 1.0F)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_ORE_RUBY = CONFIGURED_FEATURES.register("nether_ore_ruby",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_RUBY_TARGET_LIST.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_ORE_FLAME = CONFIGURED_FEATURES.register("nether_ore_flame",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_FLAME_TARGET_LIST.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_ORE_HELLFIRE = CONFIGURED_FEATURES.register("nether_ore_hellfire",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_HELLFIRE_TARGET_LIST.get(), 9)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}

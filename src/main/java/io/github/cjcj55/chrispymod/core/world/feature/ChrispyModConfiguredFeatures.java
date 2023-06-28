package io.github.cjcj55.chrispymod.core.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ChrispyModConfiguredFeatures {
    private static final TagMatchTest STONE_ORES = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    private static final TagMatchTest DEEPSLATE_ORES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    private static final TagMatchTest NETHER_ORES = new TagMatchTest(BlockTags.BASE_STONE_NETHER);
    private static final BlockMatchTest END_ORES = new BlockMatchTest(Blocks.END_STONE);


// Overworld Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("overworld_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OPAL_ORE_KEY = registerKey("overworld_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TANGERINE_ORE_KEY = registerKey("overworld_tangerine_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("overworld_cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PARYTH_ORE_KEY = registerKey("overworld_paryth_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_WHITE_DWARF_STAR_ORE_KEY = registerKey("overworld_white_dwarf_star_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NATURAL_ESSENCE_ORE_KEY = registerKey("overworld_natural_essence_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EXPERIENCE_ORE_KEY = registerKey("overworld_experience_ore");
// Nether Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FLAME_ORE_KEY = registerKey("nether_flame_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_HELLFIRE_ORE_KEY = registerKey("nether_hellfire_ore");
// End Ores


// Overworld Ores
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = Suppliers.memoize(() -> List.of(
        OreConfiguration.target(STONE_ORES, BlockInit.RUBY_ORE.get().defaultBlockState()),
        OreConfiguration.target(DEEPSLATE_ORES, BlockInit.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_OPAL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(STONE_ORES, BlockInit.OPAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(DEEPSLATE_ORES, BlockInit.DEEPSLATE_OPAL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TANGERINE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(STONE_ORES, BlockInit.TANGERINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(DEEPSLATE_ORES, BlockInit.DEEPSLATE_TANGERINE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_COBALT_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(STONE_ORES, BlockInit.COBALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(DEEPSLATE_ORES, BlockInit.DEEPSLATE_COBALT_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PARYTH_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(STONE_ORES, BlockInit.PARYTH_ORE.get().defaultBlockState()),
            OreConfiguration.target(DEEPSLATE_ORES, BlockInit.DEEPSLATE_PARYTH_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_WHITE_DWARF_STAR_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(STONE_ORES, BlockInit.WHITE_DWARF_STAR_ORE.get().defaultBlockState()),
            OreConfiguration.target(DEEPSLATE_ORES, BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_NATURAL_ESSENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(STONE_ORES, BlockInit.NATURAL_ESSENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(DEEPSLATE_ORES, BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_EXPERIENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(STONE_ORES, BlockInit.EXPERIENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(DEEPSLATE_ORES, BlockInit.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState())));
// Nether Ores
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_RUBY_ORES = Suppliers.memoize(() -> List.of(
        OreConfiguration.target(NETHER_ORES, BlockInit.RUBY_ORE_NETHER.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_FLAME_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(NETHER_ORES, BlockInit.FLAME_ORE_NETHER.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_HELLFIRE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(NETHER_ORES, BlockInit.HELLFIRE_ORE_NETHER.get().defaultBlockState())));
// End Ores

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 5, 0.4F));
//        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 12, 0.6F));
//        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 10, 1.0F));
        register(context, OVERWORLD_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_OPAL_ORES.get(), 9));
//        register(context, OVERWORLD_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_OPAL_ORES.get(), 4));
        register(context, OVERWORLD_TANGERINE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TANGERINE_ORES.get(), 8));
//        register(context, OVERWORLD_TANGERINE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TANGERINE_ORES.get(), 4));
        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES.get(), 3, 0.5F));
//        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES.get(), 10, 0.7F));
//        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES.get(), 7, 1.0F));
        register(context, OVERWORLD_PARYTH_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_PARYTH_ORES.get(), 8));
//        register(context, OVERWORLD_PARYTH_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_PARYTH_ORES.get(), 4));
        register(context, OVERWORLD_WHITE_DWARF_STAR_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_WHITE_DWARF_STAR_ORES.get(), 4, 0.5F));
//        register(context, OVERWORLD_WHITE_DWARF_STAR_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_WHITE_DWARF_STAR_ORES.get(), 6, 1.0F));
        register(context, OVERWORLD_NATURAL_ESSENCE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_NATURAL_ESSENCE_ORES.get(), 5, 1.0F));
        register(context, OVERWORLD_EXPERIENCE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_EXPERIENCE_ORES.get(), 4, 0.1F));
//        register(context, OVERWORLD_EXPERIENCE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_EXPERIENCE_ORES.get(), 5, 1.0F));

        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_RUBY_ORES.get(), 9));
        register(context, NETHER_FLAME_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_FLAME_ORES.get(), 9));
        register(context, NETHER_HELLFIRE_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_HELLFIRE_ORES.get(), 9));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ChrispyMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

package github.cjcj55.chrispymod.worldgen.vegetation;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.registry.CMBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class CMVegetationConfiguredFeatures {
    // Berries
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_STRAWBERRY_BUSH_KEY= registerKey("patch_strawberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUEBERRY_BUSH_KEY= registerKey("patch_blueberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_LOGANBERRY_BUSH_KEY= registerKey("patch_loganberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_RED_RASPBERRY_BUSH_KEY= registerKey("patch_red_raspberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLACK_RASPBERRY_BUSH_KEY= registerKey("patch_black_raspberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GOLDEN_RASPBERRY_BUSH_KEY= registerKey("patch_golden_raspberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WHITE_RASPBERRY_BUSH_KEY= registerKey("patch_white_raspberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MARIONBERRY_BUSH_KEY= registerKey("patch_marionberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLACKCURRANT_BUSH_KEY= registerKey("patch_blackcurrant_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_REDCURRANT_BUSH_KEY= registerKey("patch_redcurrant_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_HUCKLEBERRY_BUSH_KEY= registerKey("patch_huckleberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WINEBERRY_BUSH_KEY= registerKey("patch_wineberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ELDERBERRY_BUSH_KEY= registerKey("patch_elderberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLACKBERRY_BUSH_KEY= registerKey("patch_blackberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BOYSENBERRY_BUSH_KEY= registerKey("patch_boysenberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GROUND_CHERRY_BUSH_KEY= registerKey("patch_ground_cherry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ARONIA_BERRY_BUSH_KEY= registerKey("patch_aronia_berry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SERVICEBERRY_BUSH_KEY= registerKey("patch_serviceberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WONDERBERRY_BUSH_KEY= registerKey("patch_wonderberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MULBERRY_BUSH_KEY= registerKey("patch_mulberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_LINGONBERRY_BUSH_KEY= registerKey("patch_lingonberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_CRANBERRY_BUSH_KEY= registerKey("patch_cranberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_DEWBERRY_BUSH_KEY= registerKey("patch_dewberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_THIMBLEBERRY_BUSH_KEY= registerKey("patch_thimbleberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GOOSEBERRY_BUSH_KEY= registerKey("patch_gooseberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_CHOKEBERRY_BUSH_KEY= registerKey("patch_chokeberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_OLALLIEBERRY_BUSH_KEY= registerKey("patch_olallieberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ACEROLA_CHERRY_BUSH_KEY= registerKey("patch_acerola_cherry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BARBERRY_BUSH_KEY= registerKey("patch_barberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BAYBERRY_BUSH_KEY= registerKey("patch_bayberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GOGI_BERRY_BUSH_KEY= registerKey("patch_gogi_berry_bush");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        // Berries
        register(context, PATCH_STRAWBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.STRAWBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_BLUEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.BLUEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_LOGANBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.LOGANBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_RED_RASPBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.RED_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_BLACK_RASPBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.BLACK_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_GOLDEN_RASPBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.GOLDEN_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_WHITE_RASPBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.WHITE_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_MARIONBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.MARIONBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_BLACKCURRANT_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.BLACKCURRANT_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_REDCURRANT_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.REDCURRANT_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_HUCKLEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.HUCKLEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_WINEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.WINEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_ELDERBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.ELDERBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_BLACKBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.BLACKBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_BOYSENBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.BOYSENBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_GROUND_CHERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.GROUND_CHERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_ARONIA_BERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.ARONIA_BERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_SERVICEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.SERVICEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_WONDERBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.WONDERBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_MULBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.MULBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_LINGONBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.LINGONBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_CRANBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.CRANBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_DEWBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.DEWBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_THIMBLEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.THIMBLEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_GOOSEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.GOOSEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_CHOKEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.CHOKEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_OLALLIEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.OLALLIEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_ACEROLA_CHERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.ACEROLA_CHERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_BARBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.BARBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_BAYBERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.BAYBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
        register(context, PATCH_GOGI_BERRY_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(CMBlocks.GOGI_BERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))))));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ChrispyMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

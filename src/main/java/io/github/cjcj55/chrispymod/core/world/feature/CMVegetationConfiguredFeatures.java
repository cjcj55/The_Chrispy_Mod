package io.github.cjcj55.chrispymod.core.world.feature;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
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
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CMVegetationConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRAWBERRY_BUSH_PATCH_KEY = registerKey("strawberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUEBERRY_BUSH_PATCH_KEY = registerKey("blueberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOGANBERRY_BUSH_PATCH_KEY = registerKey("loganberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_RASPBERRY_BUSH_PATCH_KEY = registerKey("red_raspberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_RASPBERRY_BUSH_PATCH_KEY = registerKey("black_raspberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_RASPBERRY_BUSH_PATCH_KEY = registerKey("golden_raspberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_RASPBERRY_BUSH_PATCH_KEY = registerKey("white_raspberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARIONBERRY_BUSH_PATCH_KEY = registerKey("marionberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKCURRANT_BUSH_PATCH_KEY = registerKey("blackcurrant_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDCURRANT_BUSH_PATCH_KEY = registerKey("redcurrant_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUCKLEBERRY_BUSH_PATCH_KEY = registerKey("huckleberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINEBERRY_BUSH_PATCH_KEY = registerKey("wineberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELDERBERRY_BUSH_PATCH_KEY = registerKey("elderberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKBERRY_BUSH_PATCH_KEY = registerKey("blackberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BOYSENBERRY_BUSH_PATCH_KEY = registerKey("boysenberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GROUND_CHERRY_BUSH_PATCH_KEY = registerKey("ground_cherry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ARONIA_BERRY_BUSH_PATCH_KEY = registerKey("aronia_berry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SERVICEBERRY_BUSH_PATCH_KEY = registerKey("serviceberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WONDERBERRY_BUSH_PATCH_KEY = registerKey("wonderberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MULBERRY_BUSH_PATCH_KEY = registerKey("mulberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LINGONBERRY_BUSH_PATCH_KEY = registerKey("lingonberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRANBERRY_BUSH_PATCH_KEY = registerKey("cranberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEWBERRY_BUSH_PATCH_KEY = registerKey("dewberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THIMBLEBERRY_BUSH_PATCH_KEY = registerKey("thimbleberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOOSEBERRY_BUSH_PATCH_KEY = registerKey("gooseberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHOKEBERRY_BUSH_PATCH_KEY = registerKey("chokeberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OLALLIEBERRY_BUSH_PATCH_KEY = registerKey("olallieberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ACEROLA_CHERRY_BUSH_PATCH_KEY = registerKey("acerola_cherry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BARBERRY_BUSH_PATCH_KEY = registerKey("barberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BAYBERRY_BUSH_PATCH_KEY = registerKey("bayberry_bush_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOGI_BERRY_BUSH_PATCH_KEY = registerKey("gogi_berry_bush_patch");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        
        register(context, STRAWBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.STRAWBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));

        register(context, STRAWBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.STRAWBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, BLUEBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLUEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, LOGANBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.LOGANBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, RED_RASPBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.RED_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, BLACK_RASPBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLACK_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, GOLDEN_RASPBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GOLDEN_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, WHITE_RASPBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.WHITE_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, MARIONBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.MARIONBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, BLACKCURRANT_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLACKCURRANT_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, REDCURRANT_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.REDCURRANT_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, HUCKLEBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.HUCKLEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, WINEBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.WINEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, ELDERBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.ELDERBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, BLACKBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLACKBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, BOYSENBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BOYSENBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, GROUND_CHERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GROUND_CHERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, ARONIA_BERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.ARONIA_BERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, SERVICEBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.SERVICEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, WONDERBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.WONDERBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, MULBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.MULBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, LINGONBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.LINGONBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, CRANBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.CRANBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, DEWBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.DEWBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, THIMBLEBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.THIMBLEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, GOOSEBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GOOSEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, CHOKEBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.CHOKEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, OLALLIEBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.OLALLIEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, ACEROLA_CHERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.ACEROLA_CHERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, BARBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BARBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, BAYBERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BAYBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
        register(context, GOGI_BERRY_BUSH_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GOGI_BERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))))));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ChrispyMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

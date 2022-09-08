package io.github.cjcj55.chrispymod.core.world.feature;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CMVegetationFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_VEGETATION_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ChrispyMod.MODID);

    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_STRAWBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_strawberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.STRAWBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_BLUEBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_blueberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLUEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_LOGANBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_loganberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.LOGANBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_RED_RASPBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_red_raspberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.RED_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_BLACK_RASPBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_black_raspberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLACK_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_GOLDEN_RASPBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_golden_raspberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GOLDEN_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_WHITE_RASPBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_white_raspberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.WHITE_RASPBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_MARIONBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_marionberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.MARIONBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_BLACKCURRANT_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_blackcurrant_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLACKCURRANT_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_REDCURRANT_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_redcurrant_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.REDCURRANT_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_HUCKLEBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_huckleberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.HUCKLEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_WINEBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_wineberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.WINEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_ELDERBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_elderberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.ELDERBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_BLACKBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_blackberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLACKBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_BOYSENBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_boysenberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BOYSENBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_GROUND_CHERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_ground_cherry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GROUND_CHERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_ARONIA_BERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_aronia_berry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.ARONIA_BERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_SERVICEBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_serviceberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.SERVICEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_WONDERBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_wonderberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.WONDERBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_MULBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_mulberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.MULBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_LINGONBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_lingonberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.LINGONBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_CRANBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_cranberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.CRANBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_DEWBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_dewberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.DEWBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_THIMBLEBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_thimbleberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.THIMBLEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_GOOSEBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_gooseberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GOOSEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_CHOKEBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_chokeberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.CHOKEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_OLALLIEBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_olallieberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.OLALLIEBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_ACEROLA_CHERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_acerola_cherry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.ACEROLA_CHERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_BARBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_barberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BARBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_BAYBERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_bayberry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BAYBERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PATCH_GOGI_BERRY_BUSH = CONFIGURED_VEGETATION_FEATURES.register("patch_gogi_berry_bush",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GOGI_BERRY_BUSH.get().defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3))))))));


    public static void register(IEventBus eventBus) {
        CONFIGURED_VEGETATION_FEATURES.register(eventBus);
    }
}

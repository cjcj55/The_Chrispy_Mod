package github.cjcj55.chrispymod.worldgen.vegetation;

import github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class CMVegetationPlacedFeatures {
    // Berries
    public static final ResourceKey<PlacedFeature> PATCH_STRAWBERRY_BUSH_PLACED_KEY = registerKey("patch_strawberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_BLUEBERRY_BUSH_PLACED_KEY = registerKey("patch_blueberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_LOGANBERRY_BUSH_PLACED_KEY = registerKey("patch_loganberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_RED_RASPBERRY_BUSH_PLACED_KEY = registerKey("patch_red_raspberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_BLACK_RASPBERRY_BUSH_PLACED_KEY = registerKey("patch_black_raspberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_GOLDEN_RASPBERRY_BUSH_PLACED_KEY = registerKey("patch_golden_raspberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_WHITE_RASPBERRY_BUSH_PLACED_KEY = registerKey("patch_white_raspberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_MARIONBERRY_BUSH_PLACED_KEY = registerKey("patch_marionberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_BLACKCURRANT_BUSH_PLACED_KEY = registerKey("patch_blackcurrant_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_REDCURRANT_BUSH_PLACED_KEY = registerKey("patch_redcurrant_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_HUCKLEBERRY_BUSH_PLACED_KEY = registerKey("patch_huckleberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_WINEBERRY_BUSH_PLACED_KEY = registerKey("patch_wineberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_ELDERBERRY_BUSH_PLACED_KEY = registerKey("patch_elderberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_BLACKBERRY_BUSH_PLACED_KEY = registerKey("patch_blackberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_BOYSENBERRY_BUSH_PLACED_KEY = registerKey("patch_boysenberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_GROUND_CHERRY_BUSH_PLACED_KEY = registerKey("patch_ground_cherry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_ARONIA_BERRY_BUSH_PLACED_KEY = registerKey("patch_aronia_berry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_SERVICEBERRY_BUSH_PLACED_KEY = registerKey("patch_serviceberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_WONDERBERRY_BUSH_PLACED_KEY = registerKey("patch_wonderberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_MULBERRY_BUSH_PLACED_KEY = registerKey("patch_mulberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_LINGONBERRY_BUSH_PLACED_KEY = registerKey("patch_lingonberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_CRANBERRY_BUSH_PLACED_KEY = registerKey("patch_cranberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_DEWBERRY_BUSH_PLACED_KEY = registerKey("patch_dewberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_THIMBLEBERRY_BUSH_PLACED_KEY = registerKey("patch_thimbleberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_GOOSEBERRY_BUSH_PLACED_KEY = registerKey("patch_gooseberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_CHOKEBERRY_BUSH_PLACED_KEY = registerKey("patch_chokeberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_OLALLIEBERRY_BUSH_PLACED_KEY = registerKey("patch_olallieberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_ACEROLA_CHERRY_BUSH_PLACED_KEY = registerKey("patch_acerola_cherry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_BARBERRY_BUSH_PLACED_KEY = registerKey("patch_barberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_BAYBERRY_BUSH_PLACED_KEY = registerKey("patch_bayberry_bush_placed");
    public static final ResourceKey<PlacedFeature> PATCH_GOGI_BERRY_BUSH_PLACED_KEY = registerKey("patch_gogi_berry_bush_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // Berries
        register(context, PATCH_STRAWBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_STRAWBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_BLUEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_BLUEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_LOGANBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_LOGANBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_RED_RASPBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_RED_RASPBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_BLACK_RASPBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_BLACK_RASPBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_GOLDEN_RASPBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_GOLDEN_RASPBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_WHITE_RASPBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_WHITE_RASPBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_MARIONBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_MARIONBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_BLACKCURRANT_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_BLACKCURRANT_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_REDCURRANT_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_REDCURRANT_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_HUCKLEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_HUCKLEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_WINEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_WINEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_ELDERBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_ELDERBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_BLACKBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_BLACKBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_BOYSENBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_BOYSENBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_GROUND_CHERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_GROUND_CHERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_ARONIA_BERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_ARONIA_BERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_SERVICEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_SERVICEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_WONDERBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_WONDERBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_MULBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_MULBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_LINGONBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_LINGONBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_CRANBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_CRANBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_DEWBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_DEWBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_THIMBLEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_THIMBLEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_GOOSEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_GOOSEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_CHOKEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_CHOKEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_OLALLIEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_OLALLIEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_ACEROLA_CHERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_ACEROLA_CHERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_BARBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_BARBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_BAYBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_BAYBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PATCH_GOGI_BERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(CMVegetationConfiguredFeatures.PATCH_GOGI_BERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ChrispyMod.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

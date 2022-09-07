package io.github.cjcj55.chrispymod.core.world.feature;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class CMVegetationPlacements {
    public static final DeferredRegister<PlacedFeature> PLACED_VEGETATION_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ChrispyMod.MODID);

    //public static final Holder<PlacedFeature> PATCH_STRAWBERRY_COMMON = PlacementUtils.register("patch_strawberry_common", CMVegetationFeatures.PATCH_STRAWBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_BLUEBERRY_COMMON = PlacementUtils.register("patch_blueberry_common", CMVegetationFeatures.PATCH_BLUEBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_LOGANBERRY_COMMON = PlacementUtils.register("patch_loganberry_common", CMVegetationFeatures.PATCH_LOGANBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_RED_RASPBERRY_COMMON = PlacementUtils.register("patch_red_raspberry_common", CMVegetationFeatures.PATCH_RED_RASPBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_BLACK_RASPBERRY_COMMON = PlacementUtils.register("patch_black_raspberry_common", CMVegetationFeatures.PATCH_BLACK_RASPBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_GOLDEN_RASPBERRY_COMMON = PlacementUtils.register("patch_golden_raspberry_common", CMVegetationFeatures.PATCH_GOLDEN_RASPBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_WHITE_RASPBERRY_COMMON = PlacementUtils.register("patch_white_raspberry_common", CMVegetationFeatures.PATCH_WHITE_RASPBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_MARIONBERRY_COMMON = PlacementUtils.register("patch_marionberry_common", CMVegetationFeatures.PATCH_MARIONBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_BLACKCURRANT_COMMON = PlacementUtils.register("patch_blackcurrant_common", CMVegetationFeatures.PATCH_BLACKCURRANT_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_REDCURRANT_COMMON = PlacementUtils.register("patch_redcurrant_common", CMVegetationFeatures.PATCH_REDCURRANT_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_HUCKLEBERRY_COMMON = PlacementUtils.register("patch_huckleberry_common", CMVegetationFeatures.PATCH_HUCKLEBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_WINEBERRY_COMMON = PlacementUtils.register("patch_wineberry_common", CMVegetationFeatures.PATCH_WINEBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_ELDERBERRY_COMMON = PlacementUtils.register("patch_elderberry_common", CMVegetationFeatures.PATCH_ELDERBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_BLACKBERRY_COMMON = PlacementUtils.register("patch_blackberry_common", CMVegetationFeatures.PATCH_BLACKBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_BOYSENBERRY_COMMON = PlacementUtils.register("patch_boysenberry_common", CMVegetationFeatures.PATCH_BOYSENBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_GROUND_CHERRY_COMMON = PlacementUtils.register("patch_ground_cherry_common", CMVegetationFeatures.PATCH_GROUND_CHERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_ARONIA_BERRY_COMMON = PlacementUtils.register("patch_aronia_berry_common", CMVegetationFeatures.PATCH_ARONIA_BERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_SERVICEBERRY_COMMON = PlacementUtils.register("patch_serviceberry_common", CMVegetationFeatures.PATCH_SERVICEBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_WONDERBERRY_COMMON = PlacementUtils.register("patch_wonderberry_common", CMVegetationFeatures.PATCH_WONDERBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_MULBERRY_COMMON = PlacementUtils.register("patch_mulberry_common", CMVegetationFeatures.PATCH_MULBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_LINGONBERRY_COMMON = PlacementUtils.register("patch_lingonberry_common", CMVegetationFeatures.PATCH_LINGONBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_CRANBERRY_COMMON = PlacementUtils.register("patch_cranberry_common", CMVegetationFeatures.PATCH_CRANBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_DEWBERRY_COMMON = PlacementUtils.register("patch_dewberry_common", CMVegetationFeatures.PATCH_DEWBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_THIMBLEBERRY_COMMON = PlacementUtils.register("patch_thimbleberry_common", CMVegetationFeatures.PATCH_THIMBLEBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_GOOSEBERRY_COMMON = PlacementUtils.register("patch_gooseberry_common", CMVegetationFeatures.PATCH_GOOSEBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_CHOKEBERRY_COMMON = PlacementUtils.register("patch_chokeberry_common", CMVegetationFeatures.PATCH_CHOKEBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_OLALLIEBERRY_COMMON = PlacementUtils.register("patch_olallieberry_common", CMVegetationFeatures.PATCH_OLALLIEBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_ACEROLA_CHERRY_COMMON = PlacementUtils.register("patch_acerola_cherry_common", CMVegetationFeatures.PATCH_ACEROLA_CHERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_BARBERRY_COMMON = PlacementUtils.register("patch_barberry_common", CMVegetationFeatures.PATCH_BARBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_BAYBERRY_COMMON = PlacementUtils.register("patch_bayberry_common", CMVegetationFeatures.PATCH_BAYBERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    //public static final Holder<PlacedFeature> PATCH_GOGI_BERRY_COMMON = PlacementUtils.register("patch_gogi_berry_common", CMVegetationFeatures.PATCH_GOGI_BERRY_BUSH, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());

    public static final RegistryObject<PlacedFeature> PATCH_STRAWBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_strawberry_common",
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_STRAWBERRY_BUSH.getHolder().get(),
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));




    public static List<PlacementModifier> berryPlacement(PlacementModifier placementModifier1, PlacementModifier placementModifier2) {
        return List.of(placementModifier1, InSquarePlacement.spread(), placementModifier2, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonBerryPlacement(int amount, PlacementModifier placementModifier) {
        return berryPlacement(CountPlacement.of(amount), placementModifier);
    }

    public static List<PlacementModifier> rareBerryPlacement(int rarity, PlacementModifier placementModifier) {
        return berryPlacement(RarityFilter.onAverageOnceEvery(rarity), placementModifier);
    }

    public static void register(IEventBus eventBus) {
        PLACED_VEGETATION_FEATURES.register(eventBus);
    }
}

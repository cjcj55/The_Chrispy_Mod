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

    public static final RegistryObject<PlacedFeature> PATCH_STRAWBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_strawberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_STRAWBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_BLUEBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_blueberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_BLUEBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_LOGANBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_loganberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_LOGANBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_RED_RASPBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_red_raspberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_RED_RASPBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_BLACK_RASPBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_black_raspberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_BLACK_RASPBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_GOLDEN_RASPBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_golden_raspberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_GOLDEN_RASPBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_WHITE_RASPBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_white_raspberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_WHITE_RASPBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_MARIONBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_marionberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_MARIONBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_BLACKCURRANT_COMMON = PLACED_VEGETATION_FEATURES.register("patch_blackcurrant_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_BLACKCURRANT_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_REDCURRANT_COMMON = PLACED_VEGETATION_FEATURES.register("patch_redcurrant_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_REDCURRANT_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_HUCKLEBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_huckleberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_HUCKLEBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_WINEBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_wineberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_WINEBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_ELDERBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_elderberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_ELDERBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_BLACKBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_blackberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_BLACKBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_BOYSENBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_boysenberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_BOYSENBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_GROUND_CHERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_ground_cherry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_GROUND_CHERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_ARONIA_BERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_aronia_berry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_ARONIA_BERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_SERVICEBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_serviceberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_SERVICEBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_WONDERBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_wonderberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_WONDERBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_MULBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_mulberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_MULBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_LINGONBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_lingonberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_LINGONBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_CRANBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_cranberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_CRANBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_DEWBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_dewberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_DEWBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_THIMBLEBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_thimbleberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_THIMBLEBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_GOOSEBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_gooseberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_GOOSEBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_CHOKEBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_chokeberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_CHOKEBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_OLALLIEBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_olallieberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_OLALLIEBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_ACEROLA_CHERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_acerola_cherry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_ACEROLA_CHERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_BARBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_barberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_BARBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_BAYBERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_bayberry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_BAYBERRY_BUSH.getHolder().get(), 
                    rareBerryPlacement(128, PlacementUtils.HEIGHTMAP_WORLD_SURFACE)));
    public static final RegistryObject<PlacedFeature> PATCH_GOGI_BERRY_COMMON = PLACED_VEGETATION_FEATURES.register("patch_gogi_berry_common", 
            () -> new PlacedFeature(CMVegetationFeatures.PATCH_GOGI_BERRY_BUSH.getHolder().get(),
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

package io.github.cjcj55.chrispymod.core.world.gen;

import io.github.cjcj55.chrispymod.core.world.feature.CMVegetationPlacements;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class CMVegetationGeneration {
    public static void generateBerries(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        /*base.add(() -> CMVegetationPlacements.PATCH_STRAWBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_BLUEBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_LOGANBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_RED_RASPBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_BLACK_RASPBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_GOLDEN_RASPBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_WHITE_RASPBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_MARIONBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_BLACKCURRANT_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_REDCURRANT_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_HUCKLEBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_WINEBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_ELDERBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_BLACKBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_BOYSENBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_GROUND_CHERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_ARONIA_BERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_SERVICEBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_WONDERBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_MULBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_LINGONBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_CRANBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_DEWBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_THIMBLEBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_GOOSEBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_CHOKEBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_OLALLIEBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_ACEROLA_CHERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_BARBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_BAYBERRY_COMMON);
        base.add(() -> CMVegetationPlacements.PATCH_GOGI_BERRY_COMMON);*/

        if(types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(() -> CMVegetationPlacements.PATCH_STRAWBERRY_COMMON);
        }

        if(types.contains(BiomeDictionary.Type.HOT)) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(() -> CMVegetationPlacements.PATCH_STRAWBERRY_COMMON);
        }

        if(types.contains(BiomeDictionary.Type.COLD)) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(() -> CMVegetationPlacements.PATCH_STRAWBERRY_COMMON);
        }

        if(types.contains(BiomeDictionary.Type.DRY) || types.contains(BiomeDictionary.Type.SAVANNA)) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(() -> CMVegetationPlacements.PATCH_STRAWBERRY_COMMON);
        }

        if(types.contains(BiomeDictionary.Type.SNOWY)) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(() -> CMVegetationPlacements.PATCH_STRAWBERRY_COMMON);
        }

        if(types.contains(BiomeDictionary.Type.JUNGLE) || types.contains(BiomeDictionary.Type.LUSH)) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(() -> CMVegetationPlacements.PATCH_STRAWBERRY_COMMON);
        }

        if(types.contains(BiomeDictionary.Type.FOREST)) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(() -> CMVegetationPlacements.PATCH_STRAWBERRY_COMMON);
        }
    }
}

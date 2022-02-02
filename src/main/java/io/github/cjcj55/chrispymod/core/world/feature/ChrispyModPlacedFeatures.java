package io.github.cjcj55.chrispymod.core.world.feature;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ChrispyModPlacedFeatures {
// Overworld
    public static final PlacedFeature RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            ChrispyModConfiguredFeature.RUBY_ORE.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature OPAL_ORE_PLACED = PlacementUtils.register("opal_ore_placed",
            ChrispyModConfiguredFeature.OPAL_ORE.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature TANGERINE_ORE_PLACED = PlacementUtils.register("tangerine_ore_placed",
            ChrispyModConfiguredFeature.TANGERINE_ORE.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature COBALT_ORE_PLACED = PlacementUtils.register("cobalt_ore_placed",
            ChrispyModConfiguredFeature.COBALT_ORE.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature PARYTH_ORE_PLACED = PlacementUtils.register("paryth_ore_placed",
            ChrispyModConfiguredFeature.PARYTH_ORE.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature WHITE_DWARF_STAR_ORE_PLACED = PlacementUtils.register("white_dwarf_star_ore_placed",
            ChrispyModConfiguredFeature.WHITE_DWARF_STAR_ORE.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature NATURAL_ESSENCE_ORE_PLACED = PlacementUtils.register("natural_essence_ore_placed",
            ChrispyModConfiguredFeature.NATURAL_ESSENCE_ORE.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature EXPERIENCE_ORE_PLACED = PlacementUtils.register("experience_ore_placed",
            ChrispyModConfiguredFeature.EXPERIENCE_ORE.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));




// Nether
    public static final PlacedFeature RUBY_ORE_NETHER_PLACED = PlacementUtils.register("ruby_ore_nether_placed",
            ChrispyModConfiguredFeature.RUBY_ORE_NETHER.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature FLAME_ORE_NETHER_PLACED = PlacementUtils.register("flame_ore_nether_placed",
            ChrispyModConfiguredFeature.FLAME_ORE_NETHER.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature HELLFIRE_ORE_NETHER_PLACED = PlacementUtils.register("hellfire_ore_nether_placed",
            ChrispyModConfiguredFeature.HELLFIRE_ORE_NETHER.placed(ChrispyModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
}

package io.github.cjcj55.chrispymod.core.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ChrispyModPlacedFeatures {
// Overworld
    public static final Holder<PlacedFeature> OVERWORLD_ORE_RUBY_SMALL_PLACED = PlacementUtils.register("overworld_ore_ruby_small_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_RUBY_SMALL, ChrispyModOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_RUBY_LARGE_PLACED = PlacementUtils.register("overworld_ore_ruby_large_placed_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_RUBY_LARGE, ChrispyModOrePlacement.rareOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_RUBY_HIDDEN_PLACED = PlacementUtils.register("overworld_ore_ruby_hidden_placed_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_RUBY_HIDDEN, ChrispyModOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_OPAL_PLACED = PlacementUtils.register("overworld_ore_opal_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_OPAL, ChrispyModOrePlacement.commonOrePlacement(30, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_OPAL_SMALL_PLACED = PlacementUtils.register("overworld_ore_opal_small_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_OPAL_SMALL, ChrispyModOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_TANGERINE_PLACED = PlacementUtils.register("overworld_ore_tangerine_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_TANGERINE, ChrispyModOrePlacement.commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_TANGERINE_SMALL_PLACED = PlacementUtils.register("overworld_ore_tangerine_small_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_TANGERINE_SMALL, ChrispyModOrePlacement.commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(70))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_COBALT_SMALL_PLACED = PlacementUtils.register("overworld_ore_cobalt_small_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_COBALT_SMALL, ChrispyModOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_COBALT_LARGE_PLACED = PlacementUtils.register("overworld_ore_cobalt_large_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_COBALT_LARGE, ChrispyModOrePlacement.rareOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_COBALT_HIDDEN_PLACED = PlacementUtils.register("overworld_ore_cobalt_hidden_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_COBALT_HIDDEN, ChrispyModOrePlacement.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_PARYTH_PLACED = PlacementUtils.register("overworld_ore_paryth_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_PARYTH, ChrispyModOrePlacement.commonOrePlacement(25, HeightRangePlacement.triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(180))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_PARYTH_SMALL_PLACED = PlacementUtils.register("overworld_ore_paryth_small_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_PARYTH_SMALL, ChrispyModOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(180))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_WHITE_DWARF_STAR_SMALL_PLACED = PlacementUtils.register("overworld_ore_white_dwarf_star_small_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_WHITE_DWARF_STAR_SMALL, ChrispyModOrePlacement.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_WHITE_DWARF_STAR_HIDDEN_PLACED = PlacementUtils.register("overworld_ore_white_dwarf_star_hidden_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_WHITE_DWARF_STAR_HIDDEN, ChrispyModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_NATURAL_ESSENCE_HIDDEN_PLACED = PlacementUtils.register("overworld_ore_natural_essence_hidden_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_NATURAL_ESSENCE_HIDDEN, ChrispyModOrePlacement.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_EXPERIENCE_PLACED = PlacementUtils.register("overworld_ore_experience_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_EXPERIENCE, ChrispyModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.top())));
    public static final Holder<PlacedFeature> OVERWORLD_ORE_EXPERIENCE_HIDDEN_PLACED = PlacementUtils.register("overworld_ore_experience_hidden_placed", ChrispyModConfiguredFeature.OVERWORLD_ORE_EXPERIENCE_HIDDEN, ChrispyModOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));

// Nether
    public static final Holder<PlacedFeature> NETHER_ORE_RUBY_PLACED = PlacementUtils.register("nether_ore_ruby_placed", ChrispyModConfiguredFeature.NETHER_ORE_RUBY, ChrispyModOrePlacement.commonOrePlacement(7, PlacementUtils.RANGE_10_10));
    public static final Holder<PlacedFeature> NETHER_ORE_FLAME_PLACED = PlacementUtils.register("nether_ore_flame_placed", ChrispyModConfiguredFeature.NETHER_ORE_FLAME, ChrispyModOrePlacement.commonOrePlacement(8, PlacementUtils.RANGE_10_10));
    public static final Holder<PlacedFeature> NETHER_ORE_HELLFIRE_PLACED = PlacementUtils.register("nether_ore_hellfire_placed", ChrispyModConfiguredFeature.NETHER_ORE_HELLFIRE, ChrispyModOrePlacement.commonOrePlacement(10, PlacementUtils.RANGE_10_10));
}
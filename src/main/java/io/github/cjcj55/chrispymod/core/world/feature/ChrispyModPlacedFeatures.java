package io.github.cjcj55.chrispymod.core.world.feature;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ChrispyModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ChrispyMod.MODID);

// Overworld
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_RUBY_SMALL_PLACED = PLACED_FEATURES.register("overworld_ore_ruby_small_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_RUBY_SMALL.getHolder().get(),
                    commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_RUBY_LARGE_PLACED = PLACED_FEATURES.register("overworld_ore_ruby_large_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_RUBY_LARGE.getHolder().get(),
                    rareOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_RUBY_HIDDEN_PLACED = PLACED_FEATURES.register("overworld_ore_ruby_hidden_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_RUBY_HIDDEN.getHolder().get(),
                    commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_OPAL_PLACED = PLACED_FEATURES.register("overworld_ore_opal_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_OPAL.getHolder().get(),
                    commonOrePlacement(30, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_OPAL_SMALL_PLACED = PLACED_FEATURES.register("overworld_ore_opal_small_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_OPAL_SMALL.getHolder().get(),
                    commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_TANGERINE_PLACED = PLACED_FEATURES.register("overworld_ore_tangerine_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_TANGERINE.getHolder().get(),
                    commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_TANGERINE_SMALL_PLACED = PLACED_FEATURES.register("overworld_ore_tangerine_small_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_TANGERINE_SMALL.getHolder().get(),
                    commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(70)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_COBALT_SMALL_PLACED = PLACED_FEATURES.register("overworld_ore_cobalt_small_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_COBALT_SMALL.getHolder().get(),
                    commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_COBALT_LARGE_PLACED = PLACED_FEATURES.register("overworld_ore_cobalt_large_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_COBALT_LARGE.getHolder().get(),
                    rareOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_COBALT_HIDDEN_PLACED = PLACED_FEATURES.register("overworld_ore_cobalt_hidden_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_COBALT_HIDDEN.getHolder().get(),
                    commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_PARYTH_PLACED = PLACED_FEATURES.register("overworld_ore_paryth_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_PARYTH.getHolder().get(),
                    commonOrePlacement(25, HeightRangePlacement.triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(180)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_PARYTH_SMALL_PLACED = PLACED_FEATURES.register("overworld_ore_paryth_small_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_PARYTH_SMALL.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(180)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_WHITE_DWARF_STAR_SMALL_PLACED = PLACED_FEATURES.register("overworld_ore_white_dwarf_star_small_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_WHITE_DWARF_STAR_SMALL.getHolder().get(),
                    commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_WHITE_DWARF_STAR_HIDDEN_PLACED = PLACED_FEATURES.register("overworld_ore_white_dwarf_star_hidden_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_WHITE_DWARF_STAR_HIDDEN.getHolder().get(),
                    commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_NATURAL_ESSENCE_HIDDEN_PLACED = PLACED_FEATURES.register("overworld_ore_natural_essence_hidden_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_NATURAL_ESSENCE_HIDDEN.getHolder().get(),
                    commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32)))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_EXPERIENCE_PLACED = PLACED_FEATURES.register("overworld_ore_experience_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_EXPERIENCE.getHolder().get(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.top()))));
    public static final RegistryObject<PlacedFeature> OVERWORLD_ORE_EXPERIENCE_HIDDEN_PLACED = PLACED_FEATURES.register("overworld_ore_experience_hidden_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.OVERWORLD_ORE_EXPERIENCE_HIDDEN.getHolder().get(),
                    commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));

// Nether
    public static final RegistryObject<PlacedFeature> NETHER_ORE_RUBY_PLACED = PLACED_FEATURES.register("nether_ore_ruby_placed",
        () -> new PlacedFeature(ChrispyModConfiguredFeatures.NETHER_ORE_RUBY.getHolder().get(),
                commonOrePlacement(7, PlacementUtils.RANGE_10_10)));
    public static final RegistryObject<PlacedFeature> NETHER_ORE_FLAME_PLACED = PLACED_FEATURES.register("nether_ore_flame_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.NETHER_ORE_FLAME.getHolder().get(),
                    commonOrePlacement(8, PlacementUtils.RANGE_10_10)));
    public static final RegistryObject<PlacedFeature> NETHER_ORE_HELLFIRE_PLACED = PLACED_FEATURES.register("nether_ore_hellfire_placed",
            () -> new PlacedFeature(ChrispyModConfiguredFeatures.NETHER_ORE_HELLFIRE.getHolder().get(),
                    commonOrePlacement(10, PlacementUtils.RANGE_10_10)));






    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int veinsPerChunk, PlacementModifier placementModifier) {
        return orePlacement(CountPlacement.of(veinsPerChunk), placementModifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int veinsPerChunk, PlacementModifier placementModifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(veinsPerChunk), placementModifier);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
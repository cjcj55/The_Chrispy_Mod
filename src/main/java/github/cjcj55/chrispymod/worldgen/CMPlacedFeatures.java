package github.cjcj55.chrispymod.worldgen;

import github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class CMPlacedFeatures {
    // Overworld Ores
    public static final ResourceKey<PlacedFeature> OVERWORLD_RUBY_ORE_SMALL_PLACED_KEY = registerKey("ruby_ore_small_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_RUBY_ORE_LARGE_PLACED_KEY = registerKey("ruby_ore_large_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_RUBY_ORE_HIDDEN_PLACED_KEY = registerKey("ruby_ore_hidden_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_OPAL_ORE_PLACED_KEY = registerKey("opal_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_OPAL_ORE_SMALL_PLACED_KEY = registerKey("opal_ore_small_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TANGERINE_ORE_PLACED_KEY = registerKey("tangerine_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TANGERINE_ORE_SMALL_PLACED_KEY = registerKey("tangerine_ore_small_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COBALT_ORE_SMALL_PLACED_KEY = registerKey("cobalt_ore_small_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COBALT_ORE_LARGE_PLACED_KEY = registerKey("cobalt_ore_large_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COBALT_ORE_HIDDEN_PLACED_KEY = registerKey("cobalt_ore_hidden_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_PARYTH_ORE_PLACED_KEY = registerKey("paryth_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_PARYTH_ORE_SMALL_PLACED_KEY = registerKey("paryth_ore_small_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_WHITE_DWARF_STAR_ORE_SMALL_PLACED_KEY = registerKey("white_dwarf_star_ore_small_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_WHITE_DWARF_STAR_ORE_HIDDEN_PLACED_KEY = registerKey("white_dwarf_star_ore_hidden_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_NATURAL_ESSENCE_ORE_HIDDEN_PLACED_KEY = registerKey("natural_essence_ore_hidden_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_EXPERIENCE_ORE_PLACED_KEY = registerKey("experience_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_EXPERIENCE_ORE_HIDDEN_PLACED_KEY = registerKey("experience_ore_hidden_placed");
    // Nether Ores
    public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_FLAME_ORE_PLACED_KEY = registerKey("nether_flame_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_HELLFIRE_ORE_PLACED_KEY = registerKey("nether_hellfire_ore_placed");
    // End Ores
    
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // NUMBER IS VEINS PER CHUNK
        // Overworld Ores
        register(context, OVERWORLD_RUBY_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_RUBY_ORE_SMALL_KEY),
                CMOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, OVERWORLD_RUBY_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_RUBY_ORE_LARGE_KEY),
                CMOrePlacement.rareOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, OVERWORLD_RUBY_ORE_HIDDEN_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_RUBY_ORE_HIDDEN_KEY),
                CMOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, OVERWORLD_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_OPAL_ORE_KEY),
                CMOrePlacement.commonOrePlacement(30, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
        register(context, OVERWORLD_OPAL_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_OPAL_ORE_SMALL_KEY),
                CMOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80))));
        register(context, OVERWORLD_TANGERINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_TANGERINE_ORE_KEY),
                CMOrePlacement.commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
        register(context, OVERWORLD_TANGERINE_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_TANGERINE_ORE_SMALL_KEY),
                CMOrePlacement.commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(70))));
        register(context, OVERWORLD_COBALT_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_COBALT_ORE_SMALL_KEY),
                CMOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, OVERWORLD_COBALT_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_COBALT_ORE_LARGE_KEY),
                CMOrePlacement.rareOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, OVERWORLD_COBALT_ORE_HIDDEN_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_COBALT_ORE_HIDDEN_KEY),
                CMOrePlacement.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, OVERWORLD_PARYTH_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_PARYTH_ORE_KEY),
                CMOrePlacement.commonOrePlacement(25, HeightRangePlacement.triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(180))));
        register(context, OVERWORLD_PARYTH_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_PARYTH_ORE_SMALL_KEY),
                CMOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(180))));
        register(context, OVERWORLD_WHITE_DWARF_STAR_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_WHITE_DWARF_STAR_ORE_SMALL_KEY),
                CMOrePlacement.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, OVERWORLD_WHITE_DWARF_STAR_ORE_HIDDEN_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_WHITE_DWARF_STAR_ORE_HIDDEN_KEY),
                CMOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, OVERWORLD_NATURAL_ESSENCE_ORE_HIDDEN_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_NATURAL_ESSENCE_ORE_HIDDEN_KEY),
                CMOrePlacement.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));
        register(context, OVERWORLD_EXPERIENCE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_EXPERIENCE_ORE_KEY),
                CMOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.top())));
        register(context, OVERWORLD_EXPERIENCE_ORE_HIDDEN_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.OVERWORLD_EXPERIENCE_ORE_HIDDEN_KEY),
                CMOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
        // Nether Ores
        register(context, NETHER_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                CMOrePlacement.commonOrePlacement(7, PlacementUtils.RANGE_10_10));
        register(context, NETHER_FLAME_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.NETHER_FLAME_ORE_KEY),
                CMOrePlacement.commonOrePlacement(8, PlacementUtils.RANGE_10_10));
        register(context, NETHER_HELLFIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CMConfiguredFeatures.NETHER_HELLFIRE_ORE_KEY),
                CMOrePlacement.commonOrePlacement(10, PlacementUtils.RANGE_10_10));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ChrispyMod.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

package github.cjcj55.chrispymod.worldgen.ore;

import github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class CMOreBiomeModifiers {
    // Overworld Ores
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_RUBY_ORE_SMALL = registerKey("add_ruby_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_RUBY_ORE_LARGE = registerKey("add_ruby_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_RUBY_ORE_HIDDEN = registerKey("add_ruby_ore_hidden");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_OPAL_ORE = registerKey("add_opal_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_OPAL_ORE_SMALL = registerKey("add_opal_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TANGERINE_ORE = registerKey("add_tangerine_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TANGERINE_ORE_SMALL = registerKey("add_tangerine_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COBALT_ORE_SMALL = registerKey("add_cobalt_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COBALT_ORE_LARGE = registerKey("add_cobalt_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COBALT_ORE_HIDDEN = registerKey("add_cobalt_ore_hidden");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_PARYTH_ORE = registerKey("add_paryth_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_PARYTH_ORE_SMALL = registerKey("add_paryth_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_WHITE_DWARF_STAR_ORE_SMALL = registerKey("add_white_dwarf_star_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_WHITE_DWARF_STAR_ORE_HIDDEN = registerKey("add_white_dwarf_star_ore_hidden");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_NATURAL_ESSENCE_ORE_HIDDEN = registerKey("add_natural_essence_ore_hidden");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_EXPERIENCE_ORE = registerKey("add_experience_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_EXPERIENCE_ORE_HIDDEN = registerKey("add_experience_ore_hidden");
    // Nether Ores
    public static final ResourceKey<BiomeModifier> ADD_NETHER_RUBY_ORE = registerKey("add_nether_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_FLAME_ORE = registerKey("add_nether_flame_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_HELLFIRE_ORE = registerKey("add_nether_hellfire_ore");
    // End Ores
    
    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // Overworld Ores
        context.register(ADD_OVERWORLD_RUBY_ORE_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_RUBY_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_RUBY_ORE_LARGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_RUBY_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_RUBY_ORE_HIDDEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_RUBY_ORE_HIDDEN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_OPAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_OPAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_OPAL_ORE_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_OPAL_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_TANGERINE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_TANGERINE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_TANGERINE_ORE_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_TANGERINE_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_COBALT_ORE_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_COBALT_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_COBALT_ORE_LARGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_COBALT_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_COBALT_ORE_HIDDEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_COBALT_ORE_HIDDEN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_PARYTH_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_PARYTH_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_PARYTH_ORE_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_PARYTH_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_WHITE_DWARF_STAR_ORE_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_WHITE_DWARF_STAR_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_WHITE_DWARF_STAR_ORE_HIDDEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_WHITE_DWARF_STAR_ORE_HIDDEN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_NATURAL_ESSENCE_ORE_HIDDEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_NATURAL_ESSENCE_ORE_HIDDEN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_EXPERIENCE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_EXPERIENCE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_EXPERIENCE_ORE_HIDDEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.OVERWORLD_EXPERIENCE_ORE_HIDDEN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        // Nether Ores
        context.register(ADD_NETHER_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.NETHER_RUBY_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_FLAME_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.NETHER_FLAME_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_HELLFIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(CMOrePlacedFeatures.NETHER_HELLFIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ChrispyMod.MODID, name));
    }
}
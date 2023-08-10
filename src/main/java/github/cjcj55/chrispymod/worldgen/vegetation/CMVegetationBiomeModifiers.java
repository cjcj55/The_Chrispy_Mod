package github.cjcj55.chrispymod.worldgen.vegetation;

import github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class CMVegetationBiomeModifiers {
    // Berries
    public static final ResourceKey<BiomeModifier> ADD_STRAWBERRY_BUSH_PATCH = registerKey("add_strawberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_BLUEBERRY_BUSH_PATCH = registerKey("add_blueberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_LOGANBERRY_BUSH_PATCH = registerKey("add_loganberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_RED_RASPBERRY_BUSH_PATCH = registerKey("add_red_raspberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_RASPBERRY_BUSH_PATCH = registerKey("add_black_raspberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_GOLDEN_RASPBERRY_BUSH_PATCH = registerKey("add_golden_raspberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_WHITE_RASPBERRY_BUSH_PATCH = registerKey("add_white_raspberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_MARIONBERRY_BUSH_PATCH = registerKey("add_marionberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_BLACKCURRANT_BUSH_PATCH = registerKey("add_blackcurrant_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_REDCURRANT_BUSH_PATCH = registerKey("add_redcurrant_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_HUCKLEBERRY_BUSH_PATCH = registerKey("add_huckleberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_WINEBERRY_BUSH_PATCH = registerKey("add_wineberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_ELDERBERRY_BUSH_PATCH = registerKey("add_elderberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_BLACKBERRY_BUSH_PATCH = registerKey("add_blackberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_BOYSENBERRY_BUSH_PATCH = registerKey("add_boysenberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_GROUND_CHERRY_BUSH_PATCH = registerKey("add_ground_cherry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_ARONIA_BERRY_BUSH_PATCH = registerKey("add_aronia_berry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_SERVICEBERRY_BUSH_PATCH = registerKey("add_serviceberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_WONDERBERRY_BUSH_PATCH = registerKey("add_wonderberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_MULBERRY_BUSH_PATCH = registerKey("add_mulberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_LINGONBERRY_BUSH_PATCH = registerKey("add_lingonberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_CRANBERRY_BUSH_PATCH = registerKey("add_cranberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_DEWBERRY_BUSH_PATCH = registerKey("add_dewberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_THIMBLEBERRY_BUSH_PATCH = registerKey("add_thimbleberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_GOOSEBERRY_BUSH_PATCH = registerKey("add_gooseberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_CHOKEBERRY_BUSH_PATCH = registerKey("add_chokeberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_OLALLIEBERRY_BUSH_PATCH = registerKey("add_olallieberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_ACEROLA_CHERRY_BUSH_PATCH = registerKey("add_acerola_cherry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_BARBERRY_BUSH_PATCH = registerKey("add_barberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_BAYBERRY_BUSH_PATCH = registerKey("add_bayberry_bush_patch");
    public static final ResourceKey<BiomeModifier> ADD_GOGI_BERRY_BUSH_PATCH = registerKey("add_gogi_berry_bush_patch");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // Berries
        context.register(ADD_STRAWBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_STRAWBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_BLUEBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_BLUEBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_ELDERBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_ELDERBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_THIMBLEBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_THIMBLEBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_RED_RASPBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_RED_RASPBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_BLACKBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_BLACKBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_GROUND_CHERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_GROUND_CHERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_ACEROLA_CHERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_ACEROLA_CHERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_WHITE_RASPBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_WHITE_RASPBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_BLACKCURRANT_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_BLACKCURRANT_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_REDCURRANT_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_REDCURRANT_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_HUCKLEBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_HUCKLEBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_LINGONBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_LINGONBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_LOGANBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_LOGANBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_ARONIA_BERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_ARONIA_BERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_SERVICEBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_SERVICEBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BLACK_RASPBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_LUSH),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_BLACK_RASPBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_WONDERBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_LUSH),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_WONDERBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CHOKEBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_LUSH),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_CHOKEBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_GOGI_BERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_LUSH),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_GOGI_BERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_WINEBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_CONIFEROUS),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_WINEBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_MULBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_CONIFEROUS),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_MULBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_DEWBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_CONIFEROUS),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_DEWBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_OLALLIEBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_CONIFEROUS),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_OLALLIEBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_GOLDEN_RASPBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_GOLDEN_RASPBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CRANBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_CRANBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_GOOSEBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_GOOSEBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_BAYBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_BAYBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_MARIONBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_MARIONBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_BOYSENBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_BOYSENBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_BARBERRY_BUSH_PATCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(CMVegetationPlacedFeatures.PATCH_BARBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ChrispyMod.MODID, name));
    }
}
package io.github.cjcj55.chrispymod.datagen;

import com.mojang.serialization.JsonOps;
import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.world.feature.CMVegetationPlacements;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers.AddFeaturesBiomeModifier;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CMBiomeModifierProvider {

    public static JsonCodecProvider<BiomeModifier> create(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        RegistryAccess access = RegistryAccess.builtinCopy();
        Registry<Biome> biomeRegistry = access.registryOrThrow(Registry.BIOME_REGISTRY);
        Registry<PlacedFeature> placedFeatures = access.registryOrThrow(Registry.PLACED_FEATURE_REGISTRY);
        HashMap<ResourceLocation, BiomeModifier> modifiers = new HashMap<>();

        addModifier(modifiers, "add_feature/strawberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_PLAINS), of(placedFeatures, CMVegetationPlacements.PATCH_STRAWBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/blueberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_PLAINS), of(placedFeatures, CMVegetationPlacements.PATCH_BLUEBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/loganberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_DRY_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_LOGANBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/red_raspberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_HOT_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_RED_RASPBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/black_raspberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_LUSH), of(placedFeatures, CMVegetationPlacements.PATCH_BLACK_RASPBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/golden_raspberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_SWAMP), of(placedFeatures, CMVegetationPlacements.PATCH_GOLDEN_RASPBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/white_raspberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_COLD_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_WHITE_RASPBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/marionberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_MOUNTAIN), of(placedFeatures, CMVegetationPlacements.PATCH_MARIONBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/blackcurrant_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_COLD_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_BLACKCURRANT_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/redcurrant_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_COLD_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_REDCURRANT_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/huckleberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_COLD_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_HUCKLEBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/wineberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, BiomeTags.IS_FOREST), of(placedFeatures, CMVegetationPlacements.PATCH_WINEBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/elderberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_PLAINS), of(placedFeatures, CMVegetationPlacements.PATCH_ELDERBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/blackberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_HOT_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_BLACKBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/boysenberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_MOUNTAIN), of(placedFeatures, CMVegetationPlacements.PATCH_BOYSENBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/ground_cherry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_HOT_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_GROUND_CHERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/aronia_berry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_DRY_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_ARONIA_BERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/serviceberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_DRY_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_SERVICEBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/wonderberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_LUSH), of(placedFeatures, CMVegetationPlacements.PATCH_WONDERBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/mulberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, BiomeTags.IS_FOREST), of(placedFeatures, CMVegetationPlacements.PATCH_MULBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/lingonberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_COLD_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_LINGONBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/cranberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_SWAMP), of(placedFeatures, CMVegetationPlacements.PATCH_CRANBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/dewberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, BiomeTags.IS_FOREST), of(placedFeatures, CMVegetationPlacements.PATCH_DEWBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/thimbleberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_PLAINS), of(placedFeatures, CMVegetationPlacements.PATCH_THIMBLEBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/gooseberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_SWAMP), of(placedFeatures, CMVegetationPlacements.PATCH_GOOSEBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/chokeberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_LUSH), of(placedFeatures, CMVegetationPlacements.PATCH_CHOKEBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/olallieberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, BiomeTags.IS_FOREST), of(placedFeatures, CMVegetationPlacements.PATCH_OLALLIEBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/acerola_cherry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_HOT_OVERWORLD), of(placedFeatures, CMVegetationPlacements.PATCH_ACEROLA_CHERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/barberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_MOUNTAIN), of(placedFeatures, CMVegetationPlacements.PATCH_BARBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/bayberry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_SWAMP), of(placedFeatures, CMVegetationPlacements.PATCH_BAYBERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));
        addModifier(modifiers, "add_feature/gogi_berry_bush", new AddFeaturesBiomeModifier(tag(biomeRegistry, Tags.Biomes.IS_LUSH), of(placedFeatures, CMVegetationPlacements.PATCH_GOGI_BERRY_COMMON), GenerationStep.Decoration.VEGETAL_DECORATION));



        //addModifier(modifiers, "add_feature/adzuki_sprouts", new AddFeaturesBiomeModifier(tag(biomeRegistry, NeapolitanBiomeTags.HAS_ADZUKI_SPROUTS), of(placedFeatures, NeapolitanPlacedFeatures.PATCH_ADZUKI_SPROUTS), GenerationStep.Decoration.VEGETAL_DECORATION));
        //addModifier(modifiers, "add_feature/vanilla_vine", new AddFeaturesBiomeModifier(tag(biomeRegistry, NeapolitanBiomeTags.HAS_VANILLA_VINE), of(placedFeatures, NeapolitanPlacedFeatures.PATCH_VANILLA_VINE), GenerationStep.Decoration.VEGETAL_DECORATION));
        //addModifier(modifiers, "add_feature/mint_pond", new AddFeaturesBiomeModifier(tag(biomeRegistry, NeapolitanBiomeTags.HAS_MINT_POND), of(placedFeatures, NeapolitanPlacedFeatures.MINT_POND), GenerationStep.Decoration.VEGETAL_DECORATION));

        //addModifier(modifiers, "add_feature/banana_plant/common", new AddFeaturesBiomeModifier(tag(biomeRegistry, NeapolitanBiomeTags.HAS_COMMON_BANANA_PLANT), of(placedFeatures, NeapolitanPlacedFeatures.BANANA_PLANT_JUNGLE), GenerationStep.Decoration.VEGETAL_DECORATION));
        //addModifier(modifiers, "add_feature/banana_plant/uncommon", new AddFeaturesBiomeModifier(tag(biomeRegistry, NeapolitanBiomeTags.HAS_UNCOMMON_BANANA_PLANT), of(placedFeatures, NeapolitanPlacedFeatures.BANANA_PLANT_RARE), GenerationStep.Decoration.VEGETAL_DECORATION));
        //addModifier(modifiers, "add_feature/banana_plant/rare", new AddFeaturesBiomeModifier(tag(biomeRegistry, NeapolitanBiomeTags.HAS_RARE_BANANA_PLANT), of(placedFeatures, NeapolitanPlacedFeatures.BANANA_PLANT_VERY_RARE), GenerationStep.Decoration.VEGETAL_DECORATION));
        //addModifier(modifiers, "add_feature/banana_plant/sparse", new AddFeaturesBiomeModifier(tag(biomeRegistry, NeapolitanBiomeTags.HAS_SPARSE_BANANA_PLANT), of(placedFeatures, NeapolitanPlacedFeatures.BANANA_PLANT_BEACH), GenerationStep.Decoration.VEGETAL_DECORATION));

        return JsonCodecProvider.forDatapackRegistry(generator, existingFileHelper, ChrispyMod.MODID, RegistryOps.create(JsonOps.INSTANCE, access), ForgeRegistries.Keys.BIOME_MODIFIERS, modifiers);
    }

    private static HolderSet<Biome> tag(Registry<Biome> biomeRegistry, TagKey<Biome> tagKey) {
        return new HolderSet.Named<>(biomeRegistry, tagKey);
    }

    private static void addModifier(HashMap<ResourceLocation, BiomeModifier> modifiers, String name, BiomeModifier modifier) {
        modifiers.put(new ResourceLocation(ChrispyMod.MODID, name), modifier);
    }

    @SuppressWarnings("ConstantConditions")
    private static HolderSet<PlacedFeature> of(Registry<PlacedFeature> placedFeatures, Holder<PlacedFeature> features) {
        return HolderSet.direct(Stream.of(features).map(registryObject -> placedFeatures.getOrCreateHolderOrThrow(registryObject.unwrapKey().get())).collect(Collectors.toList()));
    }

    @SafeVarargs
    @SuppressWarnings("ConstantConditions")
    private static HolderSet<PlacedFeature> of(Registry<PlacedFeature> placedFeatures, RegistryObject<PlacedFeature>... features) {
        return HolderSet.direct(Stream.of(features).map(registryObject -> placedFeatures.getOrCreateHolderOrThrow(registryObject.getKey())).collect(Collectors.toList()));
    }
}

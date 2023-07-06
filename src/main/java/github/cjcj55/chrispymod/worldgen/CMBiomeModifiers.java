package github.cjcj55.chrispymod.worldgen;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.registry.CMBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class CMBiomeModifiers {
    // Overworld Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OPAL_ORE_KEY = registerKey("opal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TANGERINE_ORE_KEY = registerKey("tangerine_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PARYTH_ORE_KEY = registerKey("paryth_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_WHITE_DWARF_STAR_ORE_KEY = registerKey("white_dwarf_star_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NATURAL_ESSENCE_ORE_KEY = registerKey("natural_essence_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EXPERIENCE_ORE_KEY = registerKey("experience_ore");
    // Nether Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FLAME_ORE_KEY = registerKey("nether_flame_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_HELLFIRE_ORE_KEY = registerKey("nether_hellfire_ore");
    // End Ores

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        TagMatchTest STONE_ORES = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        TagMatchTest DEEPSLATE_ORES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        TagMatchTest NETHER_ORES = new TagMatchTest(BlockTags.BASE_STONE_NETHER);
        BlockMatchTest END_ORES = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(STONE_ORES, CMBlocks.RUBY_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORES, CMBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldOpalOres = List.of(OreConfiguration.target(STONE_ORES, CMBlocks.OPAL_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORES, CMBlocks.DEEPSLATE_OPAL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTangerineOres = List.of(OreConfiguration.target(STONE_ORES, CMBlocks.TANGERINE_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORES, CMBlocks.DEEPSLATE_TANGERINE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldCobaltOres = List.of(OreConfiguration.target(STONE_ORES, CMBlocks.COBALT_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORES, CMBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldParythOres = List.of(OreConfiguration.target(STONE_ORES, CMBlocks.PARYTH_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORES, CMBlocks.DEEPSLATE_PARYTH_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldWhiteDwarfStarOres = List.of(OreConfiguration.target(STONE_ORES, CMBlocks.WHITE_DWARF_STAR_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORES, CMBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldNaturalEssenceOres = List.of(OreConfiguration.target(STONE_ORES, CMBlocks.NATURAL_ESSENCE_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORES, CMBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldExperienceOres = List.of(OreConfiguration.target(STONE_ORES, CMBlocks.EXPERIENCE_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORES, CMBlocks.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 6));
        register(context, OVERWORLD_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOpalOres, 8));
        register(context, OVERWORLD_TANGERINE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTangerineOres, 9));
        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, 5));
        register(context, OVERWORLD_PARYTH_ORE_KEY, Feature.ORE, new OreConfiguration(overworldParythOres, 8));
        register(context, OVERWORLD_WHITE_DWARF_STAR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldWhiteDwarfStarOres, 4));
        register(context, OVERWORLD_NATURAL_ESSENCE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNaturalEssenceOres, 3));
        register(context, OVERWORLD_EXPERIENCE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldExperienceOres, 4));

        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_ORES, CMBlocks.RUBY_ORE_NETHER.get().defaultBlockState(), 6));
        register(context, NETHER_FLAME_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_ORES, CMBlocks.FLAME_ORE_NETHER.get().defaultBlockState(), 7));
        register(context, NETHER_HELLFIRE_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_ORES, CMBlocks.HELLFIRE_ORE_NETHER.get().defaultBlockState(), 7));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ChrispyMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
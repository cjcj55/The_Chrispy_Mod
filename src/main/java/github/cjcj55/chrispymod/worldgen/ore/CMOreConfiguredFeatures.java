package github.cjcj55.chrispymod.worldgen.ore;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.registry.CMBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class CMOreConfiguredFeatures {
    // Overworld Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_SMALL_KEY = registerKey("ruby_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_LARGE_KEY = registerKey("ruby_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_HIDDEN_KEY = registerKey("ruby_ore_hidden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OPAL_ORE_KEY = registerKey("opal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OPAL_ORE_SMALL_KEY = registerKey("opal_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TANGERINE_ORE_KEY = registerKey("tangerine_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TANGERINE_ORE_SMALL_KEY = registerKey("tangerine_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_SMALL_KEY = registerKey("cobalt_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_LARGE_KEY = registerKey("cobalt_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_HIDDEN_KEY = registerKey("cobalt_ore_hidden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PARYTH_ORE_KEY = registerKey("paryth_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PARYTH_ORE_SMALL_KEY = registerKey("paryth_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_WHITE_DWARF_STAR_ORE_SMALL_KEY = registerKey("white_dwarf_star_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_WHITE_DWARF_STAR_ORE_HIDDEN_KEY = registerKey("white_dwarf_star_ore_hidden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NATURAL_ESSENCE_ORE_HIDDEN_KEY = registerKey("natural_essence_ore_hidden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EXPERIENCE_ORE_KEY = registerKey("experience_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EXPERIENCE_ORE_HIDDEN_KEY = registerKey("experience_ore_hidden");
    // Nether Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FLAME_ORE_KEY = registerKey("nether_flame_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_HELLFIRE_ORE_KEY = registerKey("nether_hellfire_ore");
    // End Ores

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplacables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplacables, CMBlocks.RUBY_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplacables, CMBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldOpalOres = List.of(OreConfiguration.target(stoneReplacables, CMBlocks.OPAL_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplacables, CMBlocks.DEEPSLATE_OPAL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTangerineOres = List.of(OreConfiguration.target(stoneReplacables, CMBlocks.TANGERINE_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplacables, CMBlocks.DEEPSLATE_TANGERINE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldCobaltOres = List.of(OreConfiguration.target(stoneReplacables, CMBlocks.COBALT_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplacables, CMBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldParythOres = List.of(OreConfiguration.target(stoneReplacables, CMBlocks.PARYTH_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplacables, CMBlocks.DEEPSLATE_PARYTH_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldWhiteDwarfStarOres = List.of(OreConfiguration.target(stoneReplacables, CMBlocks.WHITE_DWARF_STAR_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplacables, CMBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldNaturalEssenceOres = List.of(OreConfiguration.target(stoneReplacables, CMBlocks.NATURAL_ESSENCE_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplacables, CMBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldExperienceOres = List.of(OreConfiguration.target(stoneReplacables, CMBlocks.EXPERIENCE_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplacables, CMBlocks.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState()));

        // NUMBER IS VEIN SIZE
        // Overworld Ores
        register(context, OVERWORLD_RUBY_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 5, 0.4f));
        register(context, OVERWORLD_RUBY_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 12, 0.6f));
        register(context, OVERWORLD_RUBY_ORE_HIDDEN_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 10, 1.0f));
        register(context, OVERWORLD_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOpalOres, 9));
        register(context, OVERWORLD_OPAL_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldOpalOres, 4));
        register(context, OVERWORLD_TANGERINE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTangerineOres, 8));
        register(context, OVERWORLD_TANGERINE_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldTangerineOres, 4));
        register(context, OVERWORLD_COBALT_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, 3, 0.5f));
        register(context, OVERWORLD_COBALT_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, 10, 0.7f));
        register(context, OVERWORLD_COBALT_ORE_HIDDEN_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, 7, 1.0f));
        register(context, OVERWORLD_PARYTH_ORE_KEY, Feature.ORE, new OreConfiguration(overworldParythOres, 8));
        register(context, OVERWORLD_PARYTH_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldParythOres, 4));
        register(context, OVERWORLD_WHITE_DWARF_STAR_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldWhiteDwarfStarOres, 4, 0.5f));
        register(context, OVERWORLD_WHITE_DWARF_STAR_ORE_HIDDEN_KEY, Feature.ORE, new OreConfiguration(overworldWhiteDwarfStarOres, 6, 1.0f));
        register(context, OVERWORLD_NATURAL_ESSENCE_ORE_HIDDEN_KEY, Feature.SCATTERED_ORE, new OreConfiguration(overworldNaturalEssenceOres, 5, 1.0f));
        register(context, OVERWORLD_EXPERIENCE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldExperienceOres, 4, 0.1f));
        register(context, OVERWORLD_EXPERIENCE_ORE_HIDDEN_KEY, Feature.ORE, new OreConfiguration(overworldExperienceOres, 5, 1.0f));
        // Nether Ores
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplacables, CMBlocks.RUBY_ORE_NETHER.get().defaultBlockState(), 7));
        register(context, NETHER_FLAME_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplacables, CMBlocks.FLAME_ORE_NETHER.get().defaultBlockState(), 8));
        register(context, NETHER_HELLFIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplacables, CMBlocks.HELLFIRE_ORE_NETHER.get().defaultBlockState(), 8));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ChrispyMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
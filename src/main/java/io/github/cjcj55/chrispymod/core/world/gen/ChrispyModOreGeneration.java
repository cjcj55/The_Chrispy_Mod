package io.github.cjcj55.chrispymod.core.world.gen;

import io.github.cjcj55.chrispymod.core.world.feature.ChrispyModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class ChrispyModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

// Overworld
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_RUBY_SMALL_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_RUBY_LARGE_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_RUBY_HIDDEN_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_OPAL_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_OPAL_SMALL_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_TANGERINE_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_TANGERINE_SMALL_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_COBALT_SMALL_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_COBALT_LARGE_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_COBALT_HIDDEN_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_PARYTH_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_PARYTH_SMALL_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_WHITE_DWARF_STAR_SMALL_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_WHITE_DWARF_STAR_HIDDEN_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_NATURAL_ESSENCE_HIDDEN_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_EXPERIENCE_PLACED);
        base.add(ChrispyModPlacedFeatures.OVERWORLD_ORE_EXPERIENCE_HIDDEN_PLACED);

// Nether
        base.add(ChrispyModPlacedFeatures.NETHER_ORE_RUBY_PLACED);
        base.add(ChrispyModPlacedFeatures.NETHER_ORE_FLAME_PLACED);
        base.add(ChrispyModPlacedFeatures.NETHER_ORE_HELLFIRE_PLACED);
    }
}

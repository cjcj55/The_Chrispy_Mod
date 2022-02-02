package io.github.cjcj55.chrispymod.core.world.gen;

import io.github.cjcj55.chrispymod.core.world.feature.ChrispyModPlacedFeatures;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class ChrispyModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

// Overworld
        base.add(() -> ChrispyModPlacedFeatures.RUBY_ORE_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.OPAL_ORE_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.TANGERINE_ORE_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.COBALT_ORE_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.PARYTH_ORE_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.WHITE_DWARF_STAR_ORE_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.NATURAL_ESSENCE_ORE_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.EXPERIENCE_ORE_PLACED);

// Nether
        base.add(() -> ChrispyModPlacedFeatures.RUBY_ORE_NETHER_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.FLAME_ORE_NETHER_PLACED);
        base.add(() -> ChrispyModPlacedFeatures.HELLFIRE_ORE_NETHER_PLACED);
    }
}

package github.cjcj55.chrispymod.worldgen;

import github.cjcj55.chrispymod.worldgen.ore.CMOreConfiguredFeatures;
import github.cjcj55.chrispymod.worldgen.vegetation.CMVegetationConfiguredFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class CMConfiguredFeatures {
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        CMOreConfiguredFeatures.bootstrap(context);
        CMVegetationConfiguredFeatures.bootstrap(context);
    }
}

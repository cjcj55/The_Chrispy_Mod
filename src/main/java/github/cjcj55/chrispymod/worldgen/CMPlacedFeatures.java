package github.cjcj55.chrispymod.worldgen;

import github.cjcj55.chrispymod.worldgen.ore.CMOrePlacedFeatures;
import github.cjcj55.chrispymod.worldgen.vegetation.CMVegetationPlacedFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class CMPlacedFeatures {
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        CMOrePlacedFeatures.bootstrap(context);
        CMVegetationPlacedFeatures.bootstrap(context);
    }
}

package github.cjcj55.chrispymod.worldgen;

import github.cjcj55.chrispymod.worldgen.ore.CMOreBiomeModifiers;
import github.cjcj55.chrispymod.worldgen.vegetation.CMVegetationBiomeModifiers;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraftforge.common.world.BiomeModifier;

public class CMBiomeModifiers {
    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        CMOreBiomeModifiers.bootstrap(context);
        CMVegetationBiomeModifiers.bootstrap(context);
    }
}

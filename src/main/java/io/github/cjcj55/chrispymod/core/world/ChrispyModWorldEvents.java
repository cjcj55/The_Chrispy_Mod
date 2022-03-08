package io.github.cjcj55.chrispymod.core.world;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.world.gen.CMVegetationGeneration;
import io.github.cjcj55.chrispymod.core.world.gen.ChrispyModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ChrispyMod.MODID)
public class ChrispyModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ChrispyModOreGeneration.generateOres(event);
        CMVegetationGeneration.generateBerries(event);

        //ChrispyModTreeGeneration.generateTrees(event);
        //ChrispyModFlowerGeneration.generateFlowers(event);
    }
}

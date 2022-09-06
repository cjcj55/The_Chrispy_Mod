package io.github.cjcj55.chrispymod;

import io.github.cjcj55.chrispymod.core.init.*;
import io.github.cjcj55.chrispymod.core.world.feature.CMVegetationFeatures;
import io.github.cjcj55.chrispymod.core.world.feature.CMVegetationPlacements;
import io.github.cjcj55.chrispymod.core.world.feature.ChrispyModConfiguredFeatures;
import io.github.cjcj55.chrispymod.core.world.feature.ChrispyModPlacedFeatures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ChrispyMod.MODID)
public class ChrispyMod {

    public static final String MODID = "chrispymod";
    private static final Logger LOGGER = LogManager.getLogger();

    public ChrispyMod() {
        // Register the setup method for modloading
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(bus);
        BlockInit.register(bus);

        PaintingsInit.register(bus);

        ChrispyModConfiguredFeatures.register(bus);
        //CMVegetationFeatures.register(bus);
        ChrispyModPlacedFeatures.register(bus);
        //CMVegetationPlacements.register(bus);

        BlockEntityInit.register(bus);
        MenuTypesInit.register(bus);

        RecipeInit.register(bus);

        bus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}

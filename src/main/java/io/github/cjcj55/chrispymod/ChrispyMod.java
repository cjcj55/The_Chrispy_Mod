package io.github.cjcj55.chrispymod;

import io.github.cjcj55.chrispymod.client.screen.AlloyFurnaceScreen;
import io.github.cjcj55.chrispymod.client.screen.JamAndJellyMakerScreen;
import io.github.cjcj55.chrispymod.core.init.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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

        BlockEntityInit.register(bus);
        MenuTypesInit.register(bus);

        RecipeInit.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BAMBOO_DOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LOGANBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_RASPBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACK_RASPBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLDEN_RASPBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_RASPBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.MARIONBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKCURRANT_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.REDCURRANT_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.HUCKLEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.WINEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ELDERBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BOYSENBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GROUND_CHERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ARONIA_BERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.SERVICEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.WONDERBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.MULBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LINGONBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CRANBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.DEWBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.THIMBLEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GOOSEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOKEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.OLALLIEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ACEROLA_CHERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BARBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BAYBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GOGI_BERRY_BUSH.get(), RenderType.cutout());

        MenuScreens.register(MenuTypesInit.ALLOY_FURNACE_MENU.get(), AlloyFurnaceScreen::new);
        MenuScreens.register(MenuTypesInit.JAM_AND_JELLY_MAKER_MENU.get(), JamAndJellyMakerScreen::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}

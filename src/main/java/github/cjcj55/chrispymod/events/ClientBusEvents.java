package github.cjcj55.chrispymod.events;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.blocks.entity.screen.AlloyFurnaceScreen;
import github.cjcj55.chrispymod.blocks.entity.screen.JamAndJellyMakerScreen;
import github.cjcj55.chrispymod.entity.client.SandyCowRenderer;
import github.cjcj55.chrispymod.items.properties.CMItemProperties;
import github.cjcj55.chrispymod.particle.SandySmokeParticle;
import github.cjcj55.chrispymod.registry.CMEntities;
import github.cjcj55.chrispymod.registry.CMMenuTypes;
import github.cjcj55.chrispymod.registry.CMParticles;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ChrispyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientBusEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            CMItemProperties.addCustomItemProperties();

            MenuScreens.register(CMMenuTypes.ALLOY_FURNACE_MENU.get(), AlloyFurnaceScreen::new);
            MenuScreens.register(CMMenuTypes.JAM_AND_JELLY_MAKER_MENU.get(), JamAndJellyMakerScreen::new);

            EntityRenderers.register(CMEntities.SANDY_COW.get(), SandyCowRenderer::new);

            EntityRenderers.register(CMEntities.DYNAMITE_PROJECTILE.get(), ThrownItemRenderer::new);
        });
    }

    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(CMParticles.SANDY_SMOKE_PARTICLE.get(), SandySmokeParticle.Provider::new);
    }

//    @SubscribeEvent
//    public static void registerBlockEntityRenderer(EntityRenderersEvent.RegisterRenderers event) {
//        event.registerBlockEntityRenderer(CMBlockEntities.ALLOY_FURNACE_BLOCK_ENTITY.get(), AlloyFurnaceBlockEntityRenderer::new);
//    }
}
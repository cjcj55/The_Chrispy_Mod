package github.cjcj55.chrispymod.client;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.client.screen.AlloyFurnaceScreen;
import github.cjcj55.chrispymod.client.screen.JamAndJellyMakerScreen;
import github.cjcj55.chrispymod.registry.CMMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ChrispyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(CMMenuTypes.ALLOY_FURNACE_MENU.get(), AlloyFurnaceScreen::new);
            MenuScreens.register(CMMenuTypes.JAM_AND_JELLY_MAKER_MENU.get(), JamAndJellyMakerScreen::new);
        });
    }
}
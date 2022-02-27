package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.client.screen.JamAndJellyMakerMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuTypesInit {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.CONTAINERS, ChrispyMod.MODID);

    public static final RegistryObject<MenuType<JamAndJellyMakerMenu>> JAM_AND_JELLY_MAKER_MENU = registerMenuType(JamAndJellyMakerMenu::new, "jam_and_jelly_maker_menu");


    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}

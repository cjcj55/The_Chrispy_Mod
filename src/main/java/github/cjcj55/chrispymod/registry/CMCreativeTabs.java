package github.cjcj55.chrispymod.registry;

import github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CMCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChrispyMod.MODID);

    public static RegistryObject<CreativeModeTab> CHRISPY_MOD_TAB = CREATIVE_TABS.register(ChrispyMod.MODID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.chrispymod"))
                    .icon(() -> new ItemStack(CMItems.BLUE_EMERALD.get()))
                    .withSearchBar()
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}

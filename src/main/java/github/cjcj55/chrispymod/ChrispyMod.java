package github.cjcj55.chrispymod;

import com.mojang.logging.LogUtils;
import github.cjcj55.chrispymod.registry.*;
import github.cjcj55.chrispymod.client.screen.AlloyFurnaceScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod("chrispymod")
public class ChrispyMod {
    public static final String MODID = "chrispymod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ChrispyMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CMCreativeTabs.register(modEventBus);

        CMBlocks.register(modEventBus);
        CMItems.register(modEventBus);

        CMBlockEntities.register(modEventBus);
        CMMenuTypes.register(modEventBus);

        CMRecipes.register(modEventBus);

        CMEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == CMCreativeTabs.CHRISPY_MOD_TAB.get()) {
            for (RegistryObject<Item> item : CMItems.ITEMS.getEntries()) {
                event.accept(item);
            }
            for (RegistryObject<Block> block : CMBlocks.BLOCKS.getEntries()) {
                event.accept(block);
            }
        }
    }
}

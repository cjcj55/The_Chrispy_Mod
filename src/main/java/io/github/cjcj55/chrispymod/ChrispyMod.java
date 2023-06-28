package io.github.cjcj55.chrispymod;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import io.github.cjcj55.chrispymod.core.init.*;
//import io.github.cjcj55.chrispymod.core.world.feature.CMVegetationConfiguredFeatures;
//import io.github.cjcj55.chrispymod.core.world.feature.CMVegetationPlacedFeatures;
//import io.github.cjcj55.chrispymod.core.world.feature.ChrispyModConfiguredFeatures;
//import io.github.cjcj55.chrispymod.core.world.feature.ChrispyModPlacedFeatures;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
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

//        ChrispyModConfiguredFeatures.register(bus);
//        CMVegetationConfiguredFeatures.register(bus);
//        ChrispyModPlacedFeatures.register(bus);
//        CMVegetationPlacedFeatures.register(bus);

        BlockEntityInit.register(bus);
        MenuTypesInit.register(bus);

        RecipeInit.register(bus);

        bus.addListener(this::setup);

        bus.addListener(this::addCreative);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ChrispyModItemGroups.CHRISPY_ITEMS_TAB) {
            for (RegistryObject<Item> item : ItemInit.ITEMS.getEntries()) {
                event.accept(item);
            }
        }

        if (event.getTab() == ChrispyModItemGroups.CHRISPY_BLOCKS_TAB) {
            for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
                event.accept(block);
            }
        }
    }
}

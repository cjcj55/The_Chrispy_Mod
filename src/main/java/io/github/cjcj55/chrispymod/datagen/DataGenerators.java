package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ChrispyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        boolean includeServer = event.includeServer();

        generator.addProvider(includeServer, new CMRecipes(generator));
        generator.addProvider(includeServer, new CMLootTables(generator));
        CMBlockTags blockTags = new CMBlockTags(generator, existingFileHelper);
        generator.addProvider(includeServer, blockTags);
        generator.addProvider(includeServer, new CMItemTags(generator, blockTags, existingFileHelper));
        generator.addProvider(includeServer, CMBiomeModifierProvider.create(generator, existingFileHelper));

        generator.addProvider(includeServer, new CMBlockStates(generator, existingFileHelper));
        generator.addProvider(includeServer, new CMItemModels(generator, existingFileHelper));
        generator.addProvider(includeServer, new CMLanguageProvider(generator, "en_us"));
    }
}

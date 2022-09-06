package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ChrispyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(true, new CMRecipes(generator));
            generator.addProvider(true, new CMLootTables(generator));
            CMBlockTags blockTags = new CMBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(true, blockTags);
            generator.addProvider(true, new CMItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(true, new CMBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new CMItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new CMLanguageProvider(generator, "en_us"));
        }
    }
}

package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ChrispyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        boolean includeServer = event.includeServer();
        boolean includeClient = event.includeClient();

        generator.addProvider(includeServer, new CMRecipeProvider(packOutput));
        generator.addProvider(includeServer, CMLootTableProvider.create(packOutput));
        generator.addProvider(includeServer, new CMBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(includeClient, new CMItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(includeClient, new CMBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(includeServer, new CMLanguageProvider(packOutput, "en_us"));
    }
}

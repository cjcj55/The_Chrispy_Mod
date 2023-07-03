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

        generator.addProvider(event.includeServer(), new CMRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), CMLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new CMBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new CMItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new CMBlockStateProvider(packOutput, existingFileHelper));
    }
}

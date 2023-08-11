package github.cjcj55.chrispymod.events;

import github.cjcj55.chrispymod.registry.CMItems;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class CommonSetupEvents {
    public static void enqueue(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(CMItems.STRAWBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.BLUEBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.LOGANBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.RED_RASPBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.BLACK_RASPBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.GOLDEN_RASPBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.WHITE_RASPBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.MARIONBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.BLACKCURRANT.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.REDCURRANT.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.HUCKLEBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.WINEBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.ELDERBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.BLACKBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.BOYSENBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.GROUND_CHERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.ARONIA_BERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.SERVICEBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.WONDERBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.MULBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.LINGONBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.CRANBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.DEWBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.THIMBLEBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.GOOSEBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.CHOKEBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.OLALLIEBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.ACEROLA_CHERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.BARBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.BAYBERRY.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CMItems.GOGI_BERRY.get(), 0.3f);
        });
    }
}

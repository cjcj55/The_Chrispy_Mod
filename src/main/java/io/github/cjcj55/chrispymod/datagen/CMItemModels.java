package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CMItemModels extends ItemModelProvider {

    public CMItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ChrispyMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(ItemInit.STRAWBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/strawberry"));
        singleTexture(ItemInit.BLUEBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blueberry"));
        singleTexture(ItemInit.LOGANBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/loganberry"));
        singleTexture(ItemInit.RED_RASPBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/red_raspberry"));
        singleTexture(ItemInit.BLACK_RASPBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/black_raspberry"));
        singleTexture(ItemInit.GOLDEN_RASPBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/golden_raspberry"));
        singleTexture(ItemInit.WHITE_RASPBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/white_raspberry"));
        singleTexture(ItemInit.MARIONBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/marionberry"));
        singleTexture(ItemInit.BLACKCURRANT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blackcurrant"));
        singleTexture(ItemInit.REDCURRANT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/redcurrant"));
        singleTexture(ItemInit.HUCKLEBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/huckleberry"));
        singleTexture(ItemInit.WINEBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wineberry"));
        singleTexture(ItemInit.ELDERBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/elderberry"));
        singleTexture(ItemInit.BLACKBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blackberry"));
        singleTexture(ItemInit.BOYSENBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/boysenberry"));
        singleTexture(ItemInit.GROUND_CHERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ground_cherry"));
        singleTexture(ItemInit.ARONIA_BERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aronia_berry"));
        singleTexture(ItemInit.SERVICEBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/serviceberry"));
        singleTexture(ItemInit.WONDERBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wonderberry"));
        singleTexture(ItemInit.MULBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/mulberry"));
        singleTexture(ItemInit.LINGONBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lingonberry"));
        singleTexture(ItemInit.CRANBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/cranberry"));
        singleTexture(ItemInit.DEWBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/dewberry"));
        singleTexture(ItemInit.THIMBLEBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/thimbleberry"));
        singleTexture(ItemInit.GOOSEBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/gooseberry"));
        singleTexture(ItemInit.CHOKEBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/chokeberry"));
        singleTexture(ItemInit.OLALLIEBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/olallieberry"));
        singleTexture(ItemInit.ACEROLA_CHERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/acerola_cherry"));
        singleTexture(ItemInit.BARBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/barberry"));
        singleTexture(ItemInit.BAYBERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/bayberry"));
        singleTexture(ItemInit.GOGI_BERRY.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/gogi_berry"));

        singleTexture(ItemInit.MASON_JAR.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/mason_jar"));

        /*withExistingParent(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_overworld"));
        withExistingParent(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_nether"));
        withExistingParent(Registration.MYSTERIOUS_ORE_END_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_end"));
        withExistingParent(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_deepslate"));

        withExistingParent(Registration.GENERATOR_ITEM.get().getRegistryName().getPath(), modLoc("block/generator"));
        withExistingParent(Registration.POWERGEN_ITEM.get().getRegistryName().getPath(), modLoc("block/powergen/main"));
        withExistingParent(Registration.PORTAL_ITEM.get().getRegistryName().getPath(), modLoc("block/portal"));

        withExistingParent(Registration.THIEF_EGG.get().getRegistryName().getPath(), mcLoc("item/template_spawn_egg"));

        singleTexture(Registration.RAW_MYSTERIOUS_CHUNK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_mysterious_chunk"));
        singleTexture(Registration.MYSTERIOUS_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/mysterious_ingot"));*/
    }
}

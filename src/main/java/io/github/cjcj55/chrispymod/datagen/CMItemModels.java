package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CMItemModels extends ItemModelProvider {

    public CMItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ChrispyMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.STRAWBERRY);
        simpleItem(ItemInit.BLUEBERRY);
        simpleItem(ItemInit.LOGANBERRY);
        simpleItem(ItemInit.RED_RASPBERRY);
        simpleItem(ItemInit.BLACK_RASPBERRY);
        simpleItem(ItemInit.GOLDEN_RASPBERRY);
        simpleItem(ItemInit.WHITE_RASPBERRY);
        simpleItem(ItemInit.MARIONBERRY);
        simpleItem(ItemInit.BLACKCURRANT);
        simpleItem(ItemInit.REDCURRANT);
        simpleItem(ItemInit.HUCKLEBERRY);
        simpleItem(ItemInit.WINEBERRY);
        simpleItem(ItemInit.ELDERBERRY);
        simpleItem(ItemInit.BLACKBERRY);
        simpleItem(ItemInit.BOYSENBERRY);
        simpleItem(ItemInit.GROUND_CHERRY);
        simpleItem(ItemInit.ARONIA_BERRY);
        simpleItem(ItemInit.SERVICEBERRY);
        simpleItem(ItemInit.WONDERBERRY);
        simpleItem(ItemInit.MULBERRY);
        simpleItem(ItemInit.LINGONBERRY);
        simpleItem(ItemInit.CRANBERRY);
        simpleItem(ItemInit.DEWBERRY);
        simpleItem(ItemInit.THIMBLEBERRY);
        simpleItem(ItemInit.GOOSEBERRY);
        simpleItem(ItemInit.CHOKEBERRY);
        simpleItem(ItemInit.OLALLIEBERRY);
        simpleItem(ItemInit.ACEROLA_CHERRY);
        simpleItem(ItemInit.BARBERRY);
        simpleItem(ItemInit.BAYBERRY);
        simpleItem(ItemInit.GOGI_BERRY);

        /*simpleItem(BlockInit.STRAWBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/strawberry_bush/stage_3
        simpleItem(BlockInit.BLUEBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/blueberry_bush/stage_3
        simpleItem(BlockInit.LOGANBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/loganberry_bush/stage_3
        simpleItem(BlockInit.RED_RASPBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/red_raspberry_bush/stage_3
        simpleItem(BlockInit.BLACK_RASPBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/black_raspberry_bush/stage_3
        simpleItem(BlockInit.GOLDEN_RASPBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/golden_raspberry_bush/stage_3
        simpleItem(BlockInit.WHITE_RASPBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/white_raspberry_bush/stage_3
        simpleItem(BlockInit.MARIONBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/marionberry_bush/stage_3
        simpleItem(BlockInit.BLACKCURRANT_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/blackcurrant_bush/stage_3
        simpleItem(BlockInit.REDCURRANT_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/redcurrant_bush/stage_3
        simpleItem(BlockInit.HUCKLEBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/huckleberry_bush/stage_3
        simpleItem(BlockInit.WINEBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/wineberry_bush/stage_3
        simpleItem(BlockInit.ELDERBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/elderberry_bush/stage_3
        simpleItem(BlockInit.BLACKBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/blackberry_bush/stage_3
        simpleItem(BlockInit.BOYSENBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/boysenberry_bush/stage_3
        simpleItem(BlockInit.GROUND_CHERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/ground_cherry_bush/stage_3
        simpleItem(BlockInit.ARONIA_BERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/aronia_berry_bush/stage_3
        simpleItem(BlockInit.SERVICEBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/serviceberry_bush/stage_3
        simpleItem(BlockInit.WONDERBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/wonderberry_bush/stage_3
        simpleItem(BlockInit.MULBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/mulberry_bush/stage_3
        simpleItem(BlockInit.LINGONBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/lingonberry_bush/stage_3
        simpleItem(BlockInit.CRANBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/cranberry_bush/stage_3
        simpleItem(BlockInit.DEWBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/dewberry_bush/stage_3
        simpleItem(BlockInit.THIMBLEBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/thimbleberry_bush/stage_3
        simpleItem(BlockInit.GOOSEBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/gooseberry_bush/stage_3
        simpleItem(BlockInit.CHOKEBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/chokeberry_bush/stage_3
        simpleItem(BlockInit.OLALLIEBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/olallieberry_bush/stage_3
        simpleItem(BlockInit.ACEROLA_CHERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/acerola_cherry_bush/stage_3
        simpleItem(BlockInit.BARBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/barberry_bush/stage_3
        simpleItem(BlockInit.BAYBERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/bayberry_bush/stage_3
        simpleItem(BlockInit.GOGI_BERRY_BUSH.get().getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/gogi_berry_bush/stage_3*/
        
        simpleItem(ItemInit.MASON_JAR);

        simpleItem(ItemInit.STRAWBERRY_JAM);
        simpleItem(ItemInit.BLUEBERRY_JAM);
        simpleItem(ItemInit.LOGANBERRY_JAM);
        simpleItem(ItemInit.RED_RASPBERRY_JAM);
        simpleItem(ItemInit.BLACK_RASPBERRY_JAM);
        simpleItem(ItemInit.GOLDEN_RASPBERRY_JAM);
        simpleItem(ItemInit.WHITE_RASPBERRY_JAM);
        simpleItem(ItemInit.MARIONBERRY_JAM);
        simpleItem(ItemInit.BLACKCURRANT_JAM);
        simpleItem(ItemInit.REDCURRANT_JAM);
        simpleItem(ItemInit.HUCKLEBERRY_JAM);
        simpleItem(ItemInit.WINEBERRY_JAM);
        simpleItem(ItemInit.ELDERBERRY_JAM);
        simpleItem(ItemInit.BLACKBERRY_JAM);
        simpleItem(ItemInit.BOYSENBERRY_JAM);
        simpleItem(ItemInit.GROUND_CHERRY_JAM);
        simpleItem(ItemInit.ARONIA_BERRY_JAM);
        simpleItem(ItemInit.SERVICEBERRY_JAM);
        simpleItem(ItemInit.WONDERBERRY_JAM);
        simpleItem(ItemInit.MULBERRY_JAM);
        simpleItem(ItemInit.LINGONBERRY_JAM);
        simpleItem(ItemInit.CRANBERRY_JAM);
        simpleItem(ItemInit.DEWBERRY_JAM);
        simpleItem(ItemInit.THIMBLEBERRY_JAM);
        simpleItem(ItemInit.GOOSEBERRY_JAM);
        simpleItem(ItemInit.CHOKEBERRY_JAM);
        simpleItem(ItemInit.OLALLIEBERRY_JAM);
        simpleItem(ItemInit.ACEROLA_CHERRY_JAM);
        simpleItem(ItemInit.BARBERRY_JAM);
        simpleItem(ItemInit.BAYBERRY_JAM);
        simpleItem(ItemInit.GOGI_BERRY_JAM);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ChrispyMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ChrispyMod.MODID,"item/" + item.getId().getPath()));
    }
}

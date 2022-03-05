package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
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

        singleTexture(BlockInit.STRAWBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/strawberry_bush/stage_3"));
        singleTexture(BlockInit.BLUEBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/blueberry_bush/stage_3"));
        singleTexture(BlockInit.LOGANBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/loganberry_bush/stage_3"));
        singleTexture(BlockInit.RED_RASPBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/red_raspberry_bush/stage_3"));
        singleTexture(BlockInit.BLACK_RASPBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/black_raspberry_bush/stage_3"));
        singleTexture(BlockInit.GOLDEN_RASPBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/golden_raspberry_bush/stage_3"));
        singleTexture(BlockInit.WHITE_RASPBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/white_raspberry_bush/stage_3"));
        singleTexture(BlockInit.MARIONBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/marionberry_bush/stage_3"));
        singleTexture(BlockInit.BLACKCURRANT_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/blackcurrant_bush/stage_3"));
        singleTexture(BlockInit.REDCURRANT_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/redcurrant_bush/stage_3"));
        singleTexture(BlockInit.HUCKLEBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/huckleberry_bush/stage_3"));
        singleTexture(BlockInit.WINEBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/wineberry_bush/stage_3"));
        singleTexture(BlockInit.ELDERBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/elderberry_bush/stage_3"));
        singleTexture(BlockInit.BLACKBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/blackberry_bush/stage_3"));
        singleTexture(BlockInit.BOYSENBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/boysenberry_bush/stage_3"));
        singleTexture(BlockInit.GROUND_CHERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/ground_cherry_bush/stage_3"));
        singleTexture(BlockInit.ARONIA_BERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/aronia_berry_bush/stage_3"));
        singleTexture(BlockInit.SERVICEBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/serviceberry_bush/stage_3"));
        singleTexture(BlockInit.WONDERBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/wonderberry_bush/stage_3"));
        singleTexture(BlockInit.MULBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/mulberry_bush/stage_3"));
        singleTexture(BlockInit.LINGONBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/lingonberry_bush/stage_3"));
        singleTexture(BlockInit.CRANBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/cranberry_bush/stage_3"));
        singleTexture(BlockInit.DEWBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/dewberry_bush/stage_3"));
        singleTexture(BlockInit.THIMBLEBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/thimbleberry_bush/stage_3"));
        singleTexture(BlockInit.GOOSEBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/gooseberry_bush/stage_3"));
        singleTexture(BlockInit.CHOKEBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/chokeberry_bush/stage_3"));
        singleTexture(BlockInit.OLALLIEBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/olallieberry_bush/stage_3"));
        singleTexture(BlockInit.ACEROLA_CHERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/acerola_cherry_bush/stage_3"));
        singleTexture(BlockInit.BARBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/barberry_bush/stage_3"));
        singleTexture(BlockInit.BAYBERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/bayberry_bush/stage_3"));
        singleTexture(BlockInit.GOGI_BERRY_BUSH.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_bushes/gogi_berry_bush/stage_3"));
        
        singleTexture(ItemInit.MASON_JAR.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/mason_jar"));

        singleTexture(ItemInit.STRAWBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/strawberry_jam"));
        singleTexture(ItemInit.BLUEBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blueberry_jam"));
        singleTexture(ItemInit.LOGANBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/loganberry_jam"));
        singleTexture(ItemInit.RED_RASPBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/red_raspberry_jam"));
        singleTexture(ItemInit.BLACK_RASPBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/black_raspberry_jam"));
        singleTexture(ItemInit.GOLDEN_RASPBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/golden_raspberry_jam"));
        singleTexture(ItemInit.WHITE_RASPBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/white_raspberry_jam"));
        singleTexture(ItemInit.MARIONBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/marionberry_jam"));
        singleTexture(ItemInit.BLACKCURRANT_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blackcurrant_jam"));
        singleTexture(ItemInit.REDCURRANT_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/redcurrant_jam"));
        singleTexture(ItemInit.HUCKLEBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/huckleberry_jam"));
        singleTexture(ItemInit.WINEBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wineberry_jam"));
        singleTexture(ItemInit.ELDERBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/elderberry_jam"));
        singleTexture(ItemInit.BLACKBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blackberry_jam"));
        singleTexture(ItemInit.BOYSENBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/boysenberry_jam"));
        singleTexture(ItemInit.GROUND_CHERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ground_cherry_jam"));
        singleTexture(ItemInit.ARONIA_BERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aronia_berry_jam"));
        singleTexture(ItemInit.SERVICEBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/serviceberry_jam"));
        singleTexture(ItemInit.WONDERBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wonderberry_jam"));
        singleTexture(ItemInit.MULBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/mulberry_jam"));
        singleTexture(ItemInit.LINGONBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lingonberry_jam"));
        singleTexture(ItemInit.CRANBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/cranberry_jam"));
        singleTexture(ItemInit.DEWBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/dewberry_jam"));
        singleTexture(ItemInit.THIMBLEBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/thimbleberry_jam"));
        singleTexture(ItemInit.GOOSEBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/gooseberry_jam"));
        singleTexture(ItemInit.CHOKEBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/chokeberry_jam"));
        singleTexture(ItemInit.OLALLIEBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/olallieberry_jam"));
        singleTexture(ItemInit.ACEROLA_CHERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/acerola_cherry_jam"));
        singleTexture(ItemInit.BARBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/barberry_jam"));
        singleTexture(ItemInit.BAYBERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/bayberry_jam"));
        singleTexture(ItemInit.GOGI_BERRY_JAM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/gogi_berry_jam"));

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

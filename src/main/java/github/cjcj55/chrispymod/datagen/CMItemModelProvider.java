package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.registry.CMItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CMItemModelProvider extends ItemModelProvider {
    public CMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChrispyMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(CMItems.STRAWBERRY);
        simpleItem(CMItems.BLUEBERRY);
        simpleItem(CMItems.LOGANBERRY);
        simpleItem(CMItems.RED_RASPBERRY);
        simpleItem(CMItems.BLACK_RASPBERRY);
        simpleItem(CMItems.GOLDEN_RASPBERRY);
        simpleItem(CMItems.WHITE_RASPBERRY);
        simpleItem(CMItems.MARIONBERRY);
        simpleItem(CMItems.BLACKCURRANT);
        simpleItem(CMItems.REDCURRANT);
        simpleItem(CMItems.HUCKLEBERRY);
        simpleItem(CMItems.WINEBERRY);
        simpleItem(CMItems.ELDERBERRY);
        simpleItem(CMItems.BLACKBERRY);
        simpleItem(CMItems.BOYSENBERRY);
        simpleItem(CMItems.GROUND_CHERRY);
        simpleItem(CMItems.ARONIA_BERRY);
        simpleItem(CMItems.SERVICEBERRY);
        simpleItem(CMItems.WONDERBERRY);
        simpleItem(CMItems.MULBERRY);
        simpleItem(CMItems.LINGONBERRY);
        simpleItem(CMItems.CRANBERRY);
        simpleItem(CMItems.DEWBERRY);
        simpleItem(CMItems.THIMBLEBERRY);
        simpleItem(CMItems.GOOSEBERRY);
        simpleItem(CMItems.CHOKEBERRY);
        simpleItem(CMItems.OLALLIEBERRY);
        simpleItem(CMItems.ACEROLA_CHERRY);
        simpleItem(CMItems.BARBERRY);
        simpleItem(CMItems.BAYBERRY);
        simpleItem(CMItems.GOGI_BERRY);

        simpleItem(CMItems.MASON_JAR);

        simpleItem(CMItems.STRAWBERRY_JAM);
        simpleItem(CMItems.BLUEBERRY_JAM);
        simpleItem(CMItems.LOGANBERRY_JAM);
        simpleItem(CMItems.RED_RASPBERRY_JAM);
        simpleItem(CMItems.BLACK_RASPBERRY_JAM);
        simpleItem(CMItems.GOLDEN_RASPBERRY_JAM);
        simpleItem(CMItems.WHITE_RASPBERRY_JAM);
        simpleItem(CMItems.MARIONBERRY_JAM);
        simpleItem(CMItems.BLACKCURRANT_JAM);
        simpleItem(CMItems.REDCURRANT_JAM);
        simpleItem(CMItems.HUCKLEBERRY_JAM);
        simpleItem(CMItems.WINEBERRY_JAM);
        simpleItem(CMItems.ELDERBERRY_JAM);
        simpleItem(CMItems.BLACKBERRY_JAM);
        simpleItem(CMItems.BOYSENBERRY_JAM);
        simpleItem(CMItems.GROUND_CHERRY_JAM);
        simpleItem(CMItems.ARONIA_BERRY_JAM);
        simpleItem(CMItems.SERVICEBERRY_JAM);
        simpleItem(CMItems.WONDERBERRY_JAM);
        simpleItem(CMItems.MULBERRY_JAM);
        simpleItem(CMItems.LINGONBERRY_JAM);
        simpleItem(CMItems.CRANBERRY_JAM);
        simpleItem(CMItems.DEWBERRY_JAM);
        simpleItem(CMItems.THIMBLEBERRY_JAM);
        simpleItem(CMItems.GOOSEBERRY_JAM);
        simpleItem(CMItems.CHOKEBERRY_JAM);
        simpleItem(CMItems.OLALLIEBERRY_JAM);
        simpleItem(CMItems.ACEROLA_CHERRY_JAM);
        simpleItem(CMItems.BARBERRY_JAM);
        simpleItem(CMItems.BAYBERRY_JAM);
        simpleItem(CMItems.GOGI_BERRY_JAM);

//        simpleItem(CMItems.ALUMINUM);
//        simpleItem(CMItems.RAW_ALUMINUM);
//        simpleItem(CMItems.ANTIMONY);
//        simpleItem(CMItems.RAW_ANTIMONY);
//        simpleItem(CMItems.ARSENIC);
//        simpleItem(CMItems.RAW_ARSENIC);
//        simpleItem(CMItems.BARIUM);
//        simpleItem(CMItems.RAW_BARIUM);
//        simpleItem(CMItems.BERYLLIUM);
//        simpleItem(CMItems.RAW_BERYLLIUM);
//        simpleItem(CMItems.BISMUTH);
//        simpleItem(CMItems.RAW_BISMUTH);
//        simpleItem(CMItems.BORON);
//        simpleItem(CMItems.RAW_BORON);
//        simpleItem(CMItems.CADMIUM);
//        simpleItem(CMItems.RAW_CADMIUM);
//        simpleItem(CMItems.CALCIUM);
//        simpleItem(CMItems.RAW_CALCIUM);
//        simpleItem(CMItems.CERIUM);
//        simpleItem(CMItems.RAW_CERIUM);
//        simpleItem(CMItems.CESIUM);
//        simpleItem(CMItems.RAW_CESIUM);
//        simpleItem(CMItems.CHROMIUM);
//        simpleItem(CMItems.RAW_CHROMIUM);
//        simpleItem(CMItems.DYSPROSIUM);
//        simpleItem(CMItems.RAW_DYSPROSIUM);
//        simpleItem(CMItems.ERBIUM);
//        simpleItem(CMItems.RAW_ERBIUM);
//        simpleItem(CMItems.EUROPIUM);
//        simpleItem(CMItems.RAW_EUROPIUM);
//        simpleItem(CMItems.FRANCIUM);
//        simpleItem(CMItems.RAW_FRANCIUM);
//        simpleItem(CMItems.GADOLINIUM);
//        simpleItem(CMItems.RAW_GADOLINIUM);
//        simpleItem(CMItems.GALLIUM);
//        simpleItem(CMItems.RAW_GALLIUM);
//        simpleItem(CMItems.GERMANIUM);
//        simpleItem(CMItems.RAW_GERMANIUM);
//        simpleItem(CMItems.HAFNIUM);
//        simpleItem(CMItems.RAW_HAFNIUM);
//        simpleItem(CMItems.HOLMIUM);
//        simpleItem(CMItems.RAW_HOLMIUM);
//        simpleItem(CMItems.INDIUM);
//        simpleItem(CMItems.RAW_INDIUM);
//        simpleItem(CMItems.IRIDIUM);
//        simpleItem(CMItems.RAW_IRIDIUM);
//        simpleItem(CMItems.LANTHANUM);
//        simpleItem(CMItems.RAW_LANTHANUM);
//        simpleItem(CMItems.LEAD);
//        simpleItem(CMItems.RAW_LEAD);
//        simpleItem(CMItems.LITHIUM);
//        simpleItem(CMItems.RAW_LITHIUM);
//        simpleItem(CMItems.LUTETIUM);
//        simpleItem(CMItems.RAW_LUTETIUM);
//        simpleItem(CMItems.MAGNESIUM);
//        simpleItem(CMItems.RAW_MAGNESIUM);
//        simpleItem(CMItems.MANGANESE);
//        simpleItem(CMItems.RAW_MANGANESE);
//        simpleItem(CMItems.MERCURY);
//        simpleItem(CMItems.RAW_MERCURY);
//        simpleItem(CMItems.MYTHRIL);
//        simpleItem(CMItems.RAW_MYTHRIL);
//        simpleItem(CMItems.MOLYBDENUM);
//        simpleItem(CMItems.RAW_MOLYBDENUM);
//        simpleItem(CMItems.NEODYMIUM);
//        simpleItem(CMItems.RAW_NEODYMIUM);
//        simpleItem(CMItems.NICKEL);
//        simpleItem(CMItems.RAW_NICKEL);
//        simpleItem(CMItems.OSMIUM);
//        simpleItem(CMItems.RAW_OSMIUM);
//        simpleItem(CMItems.PALLADIUM);
//        simpleItem(CMItems.RAW_PALLADIUM);
//        simpleItem(CMItems.PLATINUM);
//        simpleItem(CMItems.RAW_PLATINUM);
//        simpleItem(CMItems.PLUTONIUM);
//        simpleItem(CMItems.RAW_PLUTONIUM);
//        simpleItem(CMItems.POLONIUM);
//        simpleItem(CMItems.RAW_POLONIUM);
//        simpleItem(CMItems.POTASSIUM);
//        simpleItem(CMItems.RAW_POTASSIUM);
//        simpleItem(CMItems.PRASEODYMIUM);
//        simpleItem(CMItems.RAW_PRASEODYMIUM);
//        simpleItem(CMItems.PROMETHIUM);
//        simpleItem(CMItems.RAW_PROMETHIUM);
//        simpleItem(CMItems.RADIUM);
//        simpleItem(CMItems.RAW_RADIUM);
//        simpleItem(CMItems.RHODIUM);
//        simpleItem(CMItems.RAW_RHODIUM);
//        simpleItem(CMItems.RUTHENIUM);
//        simpleItem(CMItems.RAW_RUTHENIUM);
//        simpleItem(CMItems.SAMARIUM);
//        simpleItem(CMItems.RAW_SAMARIUM);
//        simpleItem(CMItems.SCANDIUM);
//        simpleItem(CMItems.RAW_SCANDIUM);
//        simpleItem(CMItems.SELENIUM);
//        simpleItem(CMItems.RAW_SELENIUM);
//        simpleItem(CMItems.SILICON);
//        simpleItem(CMItems.RAW_SILICON);
//        simpleItem(CMItems.SILVER);
//        simpleItem(CMItems.RAW_SILVER);
//        simpleItem(CMItems.SODIUM);
//        simpleItem(CMItems.RAW_SODIUM);
//        simpleItem(CMItems.STRONTIUM);
//        simpleItem(CMItems.RAW_STRONTIUM);
//        simpleItem(CMItems.TELLURIUM);
//        simpleItem(CMItems.RAW_TELLURIUM);
//        simpleItem(CMItems.TERBIUM);
//        simpleItem(CMItems.RAW_TERBIUM);
//        simpleItem(CMItems.THALLIUM);
//        simpleItem(CMItems.RAW_THALLIUM);
//        simpleItem(CMItems.THORIUM);
//        simpleItem(CMItems.RAW_THORIUM);
//        simpleItem(CMItems.THULIUM);
//        simpleItem(CMItems.RAW_THULIUM);
//        simpleItem(CMItems.TIN);
//        simpleItem(CMItems.RAW_TIN);
//        simpleItem(CMItems.TITANIUM);
//        simpleItem(CMItems.RAW_TITANIUM);
//        simpleItem(CMItems.URANIUM);
//        simpleItem(CMItems.RAW_URANIUM);
//        simpleItem(CMItems.VANADIUM);
//        simpleItem(CMItems.RAW_VANADIUM);
//        simpleItem(CMItems.VIBRANIUM);
//        simpleItem(CMItems.RAW_VIBRANIUM);
//        simpleItem(CMItems.YTTERBIUM);
//        simpleItem(CMItems.RAW_YTTERBIUM);
//        simpleItem(CMItems.YTTRIUM);
//        simpleItem(CMItems.RAW_YTTRIUM);
//        simpleItem(CMItems.ZIRCONIUM);
//        simpleItem(CMItems.RAW_ZIRCONIUM);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ChrispyMod.MODID, "item/" + item.getId().getPath()));
    }
}
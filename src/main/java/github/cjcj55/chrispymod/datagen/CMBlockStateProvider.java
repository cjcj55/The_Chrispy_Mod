package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.blocks.BaseBerryBlock;
import github.cjcj55.chrispymod.registry.CMBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CMBlockStateProvider extends BlockStateProvider {
    public CMBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChrispyMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //registerJamAndJellyMaker();

        berryBush(CMBlocks.STRAWBERRY_BUSH);
        berryBush(CMBlocks.BLUEBERRY_BUSH);
        berryBush(CMBlocks.LOGANBERRY_BUSH);
        berryBush(CMBlocks.RED_RASPBERRY_BUSH);
        berryBush(CMBlocks.BLACK_RASPBERRY_BUSH);
        berryBush(CMBlocks.GOLDEN_RASPBERRY_BUSH);
        berryBush(CMBlocks.WHITE_RASPBERRY_BUSH);
        berryBush(CMBlocks.MARIONBERRY_BUSH);
        berryBush(CMBlocks.BLACKCURRANT_BUSH);
        berryBush(CMBlocks.REDCURRANT_BUSH);
        berryBush(CMBlocks.HUCKLEBERRY_BUSH);
        berryBush(CMBlocks.WINEBERRY_BUSH);
        berryBush(CMBlocks.ELDERBERRY_BUSH);
        berryBush(CMBlocks.BLACKBERRY_BUSH);
        berryBush(CMBlocks.BOYSENBERRY_BUSH);
        berryBush(CMBlocks.GROUND_CHERRY_BUSH);
        berryBush(CMBlocks.ARONIA_BERRY_BUSH);
        berryBush(CMBlocks.SERVICEBERRY_BUSH);
        berryBush(CMBlocks.WONDERBERRY_BUSH);
        berryBush(CMBlocks.MULBERRY_BUSH);
        berryBush(CMBlocks.LINGONBERRY_BUSH);
        berryBush(CMBlocks.CRANBERRY_BUSH);
        berryBush(CMBlocks.DEWBERRY_BUSH);
        berryBush(CMBlocks.THIMBLEBERRY_BUSH);
        berryBush(CMBlocks.GOOSEBERRY_BUSH);
        berryBush(CMBlocks.CHOKEBERRY_BUSH);
        berryBush(CMBlocks.OLALLIEBERRY_BUSH);
        berryBush(CMBlocks.ACEROLA_CHERRY_BUSH);
        berryBush(CMBlocks.BARBERRY_BUSH);
        berryBush(CMBlocks.BAYBERRY_BUSH);
        berryBush(CMBlocks.GOGI_BERRY_BUSH);

//        blockWithItem(CMBlocks.ALUMINUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_ALUMINUM_ORE);
//        blockWithItem(CMBlocks.ANTIMONY_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_ANTIMONY_ORE);
//        blockWithItem(CMBlocks.ARSENIC_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_ARSENIC_ORE);
//        blockWithItem(CMBlocks.BARIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_BARIUM_ORE);
//        blockWithItem(CMBlocks.BERYLLIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_BERYLLIUM_ORE);
//        blockWithItem(CMBlocks.BISMUTH_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_BISMUTH_ORE);
//        blockWithItem(CMBlocks.BORON_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_BORON_ORE);
//        blockWithItem(CMBlocks.CADMIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_CADMIUM_ORE);
//        blockWithItem(CMBlocks.CALCIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_CALCIUM_ORE);
//        blockWithItem(CMBlocks.CERIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_CERIUM_ORE);
//        blockWithItem(CMBlocks.CESIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_CESIUM_ORE);
//        blockWithItem(CMBlocks.CHROMIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_CHROMIUM_ORE);
//        blockWithItem(CMBlocks.DYSPROSIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_DYSPROSIUM_ORE);
//        blockWithItem(CMBlocks.ERBIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_ERBIUM_ORE);
//        blockWithItem(CMBlocks.EUROPIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_EUROPIUM_ORE);
//        blockWithItem(CMBlocks.FRANCIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_FRANCIUM_ORE);
//        blockWithItem(CMBlocks.GADOLINIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_GADOLINIUM_ORE);
//        blockWithItem(CMBlocks.GALLIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_GALLIUM_ORE);
//        blockWithItem(CMBlocks.GERMANIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_GERMANIUM_ORE);
//        blockWithItem(CMBlocks.HAFNIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_HAFNIUM_ORE);
//        blockWithItem(CMBlocks.HOLMIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_HOLMIUM_ORE);
//        blockWithItem(CMBlocks.INDIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_INDIUM_ORE);
//        blockWithItem(CMBlocks.IRIDIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_IRIDIUM_ORE);
//        blockWithItem(CMBlocks.LANTHANUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_LANTHANUM_ORE);
//        blockWithItem(CMBlocks.LEAD_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_LEAD_ORE);
//        blockWithItem(CMBlocks.LITHIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_LITHIUM_ORE);
//        blockWithItem(CMBlocks.LUTETIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_LUTETIUM_ORE);
//        blockWithItem(CMBlocks.MAGNESIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_MAGNESIUM_ORE);
//        blockWithItem(CMBlocks.MANGANESE_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_MANGANESE_ORE);
//        blockWithItem(CMBlocks.MERCURY_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_MERCURY_ORE);
//        blockWithItem(CMBlocks.MYTHRIL_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_MYTHRIL_ORE);
//        blockWithItem(CMBlocks.MOLYBDENUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_MOLYBDENUM_ORE);
//        blockWithItem(CMBlocks.NEODYMIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_NEODYMIUM_ORE);
//        blockWithItem(CMBlocks.NICKEL_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_NICKEL_ORE);
//        blockWithItem(CMBlocks.OSMIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_OSMIUM_ORE);
//        blockWithItem(CMBlocks.PALLADIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_PALLADIUM_ORE);
//        blockWithItem(CMBlocks.PLATINUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_PLATINUM_ORE);
//        blockWithItem(CMBlocks.PLUTONIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_PLUTONIUM_ORE);
//        blockWithItem(CMBlocks.POLONIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_POLONIUM_ORE);
//        blockWithItem(CMBlocks.POTASSIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_POTASSIUM_ORE);
//        blockWithItem(CMBlocks.PRASEODYMIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_PRASEODYMIUM_ORE);
//        blockWithItem(CMBlocks.PROMETHIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_PROMETHIUM_ORE);
//        blockWithItem(CMBlocks.RADIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_RADIUM_ORE);
//        blockWithItem(CMBlocks.RHODIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_RHODIUM_ORE);
//        blockWithItem(CMBlocks.RUTHENIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_RUTHENIUM_ORE);
//        blockWithItem(CMBlocks.SAMARIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_SAMARIUM_ORE);
//        blockWithItem(CMBlocks.SCANDIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_SCANDIUM_ORE);
//        blockWithItem(CMBlocks.SELENIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_SELENIUM_ORE);
//        blockWithItem(CMBlocks.SILICON_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_SILICON_ORE);
//        blockWithItem(CMBlocks.SILVER_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_SILVER_ORE);
//        blockWithItem(CMBlocks.SODIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_SODIUM_ORE);
//        blockWithItem(CMBlocks.STRONTIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_STRONTIUM_ORE);
//        blockWithItem(CMBlocks.TELLURIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_TELLURIUM_ORE);
//        blockWithItem(CMBlocks.TERBIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_TERBIUM_ORE);
//        blockWithItem(CMBlocks.THALLIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_THALLIUM_ORE);
//        blockWithItem(CMBlocks.THORIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_THORIUM_ORE);
//        blockWithItem(CMBlocks.THULIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_THULIUM_ORE);
//        blockWithItem(CMBlocks.TIN_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_TIN_ORE);
//        blockWithItem(CMBlocks.TITANIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_TITANIUM_ORE);
//        blockWithItem(CMBlocks.URANIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_URANIUM_ORE);
//        blockWithItem(CMBlocks.VANADIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_VANADIUM_ORE);
//        blockWithItem(CMBlocks.VIBRANIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_VIBRANIUM_ORE);
//        blockWithItem(CMBlocks.YTTERBIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_YTTERBIUM_ORE);
//        blockWithItem(CMBlocks.YTTRIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_YTTRIUM_ORE);
//        blockWithItem(CMBlocks.ZIRCONIUM_ORE);
//        blockWithItem(CMBlocks.DEEPSLATE_ZIRCONIUM_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void cross(Block block) {
        getVariantBuilder(block).partialState().setModels(new ConfiguredModel(crossModel(block, blockTexture(block))));
    }

    public void berryBush(RegistryObject<Block> block) {
        getVariantBuilder(block.get()).partialState().with(BaseBerryBlock.AGE, 0).modelForState()
                .modelFile(models().cross("block/berry_bushes/" + name(block.get()) + "_0", berryBushModel(block.get(), 0)).renderType("cutout")).addModel()
                .partialState().with(BaseBerryBlock.AGE, 1).modelForState()
                .modelFile(models().cross("block/berry_bushes/" + name(block.get()) + "_1", berryBushModel(block.get(), 1)).renderType("cutout")).addModel()
                .partialState().with(BaseBerryBlock.AGE, 2).modelForState()
                .modelFile(models().cross("block/berry_bushes/" + name(block.get()) + "_2", berryBushModel(block.get(), 2)).renderType("cutout")).addModel()
                .partialState().with(BaseBerryBlock.AGE, 3).modelForState()
                .modelFile(models().cross("block/berry_bushes/" + name(block.get()) + "_3", berryBushModel(block.get(), 3)).renderType("cutout")).addModel();
    }

    public String name(Block block) {
        String blockName = block.getLootTable().toString();
        blockName = blockName.replaceAll("chrispymod:blocks/", "");
        return blockName;
    }

    public ModelFile crossModel(Block block, ResourceLocation name) {
        return models().cross(name(block), name);
    }

    public ResourceLocation berryBushModel(Block block, int age) {
        return new ResourceLocation(ChrispyMod.MODID, "block/berry_bushes/" + name(block) + "/stage_" + age);
    }
}

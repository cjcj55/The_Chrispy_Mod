package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.block.BerryBlockBase;
import io.github.cjcj55.chrispymod.common.block.JamAndJellyMakerBlock;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.datafixers.CMResourceLocation;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CMBlockStateProvider extends BlockStateProvider {

    public CMBlockStateProvider(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, ChrispyMod.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        //registerJamAndJellyMaker();

        berryBush(BlockInit.STRAWBERRY_BUSH.get());
        berryBush(BlockInit.BLUEBERRY_BUSH.get());
        berryBush(BlockInit.LOGANBERRY_BUSH.get());
        berryBush(BlockInit.RED_RASPBERRY_BUSH.get());
        berryBush(BlockInit.BLACK_RASPBERRY_BUSH.get());
        berryBush(BlockInit.GOLDEN_RASPBERRY_BUSH.get());
        berryBush(BlockInit.WHITE_RASPBERRY_BUSH.get());
        berryBush(BlockInit.MARIONBERRY_BUSH.get());
        berryBush(BlockInit.BLACKCURRANT_BUSH.get());
        berryBush(BlockInit.REDCURRANT_BUSH.get());
        berryBush(BlockInit.HUCKLEBERRY_BUSH.get());
        berryBush(BlockInit.WINEBERRY_BUSH.get());
        berryBush(BlockInit.ELDERBERRY_BUSH.get());
        berryBush(BlockInit.BLACKBERRY_BUSH.get());
        berryBush(BlockInit.BOYSENBERRY_BUSH.get());
        berryBush(BlockInit.GROUND_CHERRY_BUSH.get());
        berryBush(BlockInit.ARONIA_BERRY_BUSH.get());
        berryBush(BlockInit.SERVICEBERRY_BUSH.get());
        berryBush(BlockInit.WONDERBERRY_BUSH.get());
        berryBush(BlockInit.MULBERRY_BUSH.get());
        berryBush(BlockInit.LINGONBERRY_BUSH.get());
        berryBush(BlockInit.CRANBERRY_BUSH.get());
        berryBush(BlockInit.DEWBERRY_BUSH.get());
        berryBush(BlockInit.THIMBLEBERRY_BUSH.get());
        berryBush(BlockInit.GOOSEBERRY_BUSH.get());
        berryBush(BlockInit.CHOKEBERRY_BUSH.get());
        berryBush(BlockInit.OLALLIEBERRY_BUSH.get());
        berryBush(BlockInit.ACEROLA_CHERRY_BUSH.get());
        berryBush(BlockInit.BARBERRY_BUSH.get());
        berryBush(BlockInit.BAYBERRY_BUSH.get());
        berryBush(BlockInit.GOGI_BERRY_BUSH.get());

        simpleBlock(BlockInit.ALUMINUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_ALUMINUM_ORE.get());
        simpleBlock(BlockInit.ANTIMONY_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_ANTIMONY_ORE.get());
        simpleBlock(BlockInit.ARSENIC_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_ARSENIC_ORE.get());
        simpleBlock(BlockInit.BARIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_BARIUM_ORE.get());
        simpleBlock(BlockInit.BERYLLIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_BERYLLIUM_ORE.get());
        simpleBlock(BlockInit.BISMUTH_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_BISMUTH_ORE.get());
        simpleBlock(BlockInit.BORON_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_BORON_ORE.get());
        simpleBlock(BlockInit.CADMIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_CADMIUM_ORE.get());
        simpleBlock(BlockInit.CALCIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_CALCIUM_ORE.get());
        simpleBlock(BlockInit.CERIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_CERIUM_ORE.get());
        simpleBlock(BlockInit.CESIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_CESIUM_ORE.get());
        simpleBlock(BlockInit.CHROMIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_CHROMIUM_ORE.get());
        simpleBlock(BlockInit.DYSPROSIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_DYSPROSIUM_ORE.get());
        simpleBlock(BlockInit.ERBIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_ERBIUM_ORE.get());
        simpleBlock(BlockInit.EUROPIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_EUROPIUM_ORE.get());
        simpleBlock(BlockInit.FRANCIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_FRANCIUM_ORE.get());
        simpleBlock(BlockInit.GADOLINIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_GADOLINIUM_ORE.get());
        simpleBlock(BlockInit.GALLIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_GALLIUM_ORE.get());
        simpleBlock(BlockInit.GERMANIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_GERMANIUM_ORE.get());
        simpleBlock(BlockInit.HAFNIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_HAFNIUM_ORE.get());
        simpleBlock(BlockInit.HOLMIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_HOLMIUM_ORE.get());
        simpleBlock(BlockInit.INDIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_INDIUM_ORE.get());
        simpleBlock(BlockInit.IRIDIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_IRIDIUM_ORE.get());
        simpleBlock(BlockInit.LANTHANUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_LANTHANUM_ORE.get());
        simpleBlock(BlockInit.LEAD_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_LEAD_ORE.get());
        simpleBlock(BlockInit.LITHIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_LITHIUM_ORE.get());
        simpleBlock(BlockInit.LUTETIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_LUTETIUM_ORE.get());
        simpleBlock(BlockInit.MAGNESIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_MAGNESIUM_ORE.get());
        simpleBlock(BlockInit.MANGANESE_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_MANGANESE_ORE.get());
        simpleBlock(BlockInit.MERCURY_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_MERCURY_ORE.get());
        simpleBlock(BlockInit.MYTHRIL_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_MYTHRIL_ORE.get());
        simpleBlock(BlockInit.MOLYBDENUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_MOLYBDENUM_ORE.get());
        simpleBlock(BlockInit.NEODYMIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_NEODYMIUM_ORE.get());
        simpleBlock(BlockInit.NICKEL_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_NICKEL_ORE.get());
        simpleBlock(BlockInit.OSMIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_OSMIUM_ORE.get());
        simpleBlock(BlockInit.PALLADIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_PALLADIUM_ORE.get());
        simpleBlock(BlockInit.PLATINUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_PLATINUM_ORE.get());
        simpleBlock(BlockInit.PLUTONIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_PLUTONIUM_ORE.get());
        simpleBlock(BlockInit.POLONIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_POLONIUM_ORE.get());
        simpleBlock(BlockInit.POTASSIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_POTASSIUM_ORE.get());
        simpleBlock(BlockInit.PRASEODYMIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_PRASEODYMIUM_ORE.get());
        simpleBlock(BlockInit.PROMETHIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_PROMETHIUM_ORE.get());
        simpleBlock(BlockInit.RADIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_RADIUM_ORE.get());
        simpleBlock(BlockInit.RHODIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_RHODIUM_ORE.get());
        simpleBlock(BlockInit.RUTHENIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_RUTHENIUM_ORE.get());
        simpleBlock(BlockInit.SAMARIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_SAMARIUM_ORE.get());
        simpleBlock(BlockInit.SCANDIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_SCANDIUM_ORE.get());
        simpleBlock(BlockInit.SELENIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_SELENIUM_ORE.get());
        simpleBlock(BlockInit.SILICON_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_SILICON_ORE.get());
        simpleBlock(BlockInit.SILVER_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_SILVER_ORE.get());
        simpleBlock(BlockInit.SODIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_SODIUM_ORE.get());
        simpleBlock(BlockInit.STRONTIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_STRONTIUM_ORE.get());
        simpleBlock(BlockInit.TELLURIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_TELLURIUM_ORE.get());
        simpleBlock(BlockInit.TERBIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_TERBIUM_ORE.get());
        simpleBlock(BlockInit.THALLIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_THALLIUM_ORE.get());
        simpleBlock(BlockInit.THORIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_THORIUM_ORE.get());
        simpleBlock(BlockInit.THULIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_THULIUM_ORE.get());
        simpleBlock(BlockInit.TIN_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_TIN_ORE.get());
        simpleBlock(BlockInit.TITANIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_TITANIUM_ORE.get());
        simpleBlock(BlockInit.URANIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_URANIUM_ORE.get());
        simpleBlock(BlockInit.VANADIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_VANADIUM_ORE.get());
        simpleBlock(BlockInit.VIBRANIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_VIBRANIUM_ORE.get());
        simpleBlock(BlockInit.YTTERBIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_YTTERBIUM_ORE.get());
        simpleBlock(BlockInit.YTTRIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_YTTRIUM_ORE.get());
        simpleBlock(BlockInit.ZIRCONIUM_ORE.get());
        simpleBlock(BlockInit.DEEPSLATE_ZIRCONIUM_ORE.get());
    }

    /*private void registerJamAndJellyMaker() {
        ResourceLocation top = modLoc("block/jam_and_jelly_maker_top");
        ResourceLocation side = modLoc("block/jam_and_jelly_maker_side");
        ResourceLocation side_handle = modLoc("block/jam_and_jelly_maker_side_handle");
        ResourceLocation bottom = modLoc("block/jam_and_jelly_maker_bottom");
        ResourceLocation front_off = modLoc("block/jam_and_jelly_maker_front");
        ResourceLocation front_on = modLoc("block/jam_and_jelly_maker_front_on");

        getVariantBuilder(BlockInit.JAM_AND_JELLY_MAKER.get()).partialState().with(JamAndJellyMakerBlock.LIT, false).modelForState()
                .modelFile(models().cube(BlockInit.JAM_AND_JELLY_MAKER.get().getRegistryName().getPath(), bottom, top, front_off, side, side_handle, side)).addModel()
                .partialState().with(JamAndJellyMakerBlock.LIT, true).modelForState()
                .modelFile(models().cube(BlockInit.JAM_AND_JELLY_MAKER.get().getRegistryName().getPath(), bottom, top, front_on, side, side_handle, side)).addModel();
    }*/

    private void cross(Block block) {
        getVariantBuilder(block).partialState().setModels(new ConfiguredModel(crossModel(block, blockTexture(block))));
    }

    public void berryBush(Block block) {
        getVariantBuilder(block).partialState().with(BerryBlockBase.AGE, 0).modelForState()
                .modelFile(models().cross("block/berry_bushes/" + name(block) + "_0", berryBushModel(block, 0))).addModel()
                .partialState().with(BerryBlockBase.AGE, 1).modelForState()
                .modelFile(models().cross("block/berry_bushes/" + name(block) + "_1", berryBushModel(block, 1))).addModel()
                .partialState().with(BerryBlockBase.AGE, 2).modelForState()
                .modelFile(models().cross("block/berry_bushes/" + name(block) + "_2", berryBushModel(block, 2))).addModel()
                .partialState().with(BerryBlockBase.AGE, 3).modelForState()
                .modelFile(models().cross("block/berry_bushes/" + name(block) + "_3", berryBushModel(block, 3))).addModel();
    }

    public void basicBlock(Block block) {
        simpleBlock(block, cubeAll(block));
    }

    public void cropBlock(Block block) {
        getVariantBuilder(block).partialState().with(CropBlock.AGE, 0).modelForState()
            .modelFile(models().cross("block/crop/" + name(block) + "_0", cropModel(block, 0))).addModel()
            .partialState().with(CropBlock.AGE, 1).modelForState()
            .modelFile(models().cross("block/crop/" + name(block) + "_1", cropModel(block, 1))).addModel()
            .partialState().with(CropBlock.AGE, 2).modelForState()
            .modelFile(models().cross("block/crop/" + name(block) + "_2", cropModel(block, 2))).addModel()
            .partialState().with(CropBlock.AGE, 3).modelForState()
            .modelFile(models().cross("block/crop/" + name(block) + "_3", cropModel(block, 3))).addModel()
            .partialState().with(CropBlock.AGE, 4).modelForState()
            .modelFile(models().cross("block/crop/" + name(block) + "_4", cropModel(block, 4))).addModel()
            .partialState().with(CropBlock.AGE, 5).modelForState()
            .modelFile(models().cross("block/crop/" + name(block) + "_5", cropModel(block, 5))).addModel()
            .partialState().with(CropBlock.AGE, 6).modelForState()
            .modelFile(models().cross("block/crop/" + name(block) + "_6", cropModel(block, 6))).addModel()
            .partialState().with(CropBlock.AGE, 7).modelForState()
            .modelFile(models().cross("block/crop/" + name(block) + "_7", cropModel(block, 7))).addModel();
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

    public ResourceLocation cropModel(Block block, int age) {
        return new ResourceLocation(ChrispyMod.MODID, "block/crops/" + name(block) + "/stage_" + age);
    }

    public void logBlock(Block block) {
        axisBlock((RotatedPillarBlock) block, blockTexture(block), extend(blockTexture(block), "_top"));
    }

    @Override
    public ResourceLocation blockTexture(Block block) {
        ResourceLocation name = block.getLootTable();
        return new ResourceLocation(name.getNamespace(), "block" + "/" + name.getPath());
    }

    private ResourceLocation extend(ResourceLocation rl, String suffix) {
        return new ResourceLocation(rl.getNamespace(), rl.getPath() + suffix);
    }

    public ModelFile cubeAll(Block block) {
        return models().cubeAll(name(block), new CMResourceLocation("block/" + name(block)));
    }
}

package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.block.BerryBlockBase;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.datafixers.CMResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CMBlockStates extends BlockStateProvider {

    public CMBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, ChrispyMod.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
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
    }

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
        return block.getRegistryName().getPath();
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
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(), "blocks" + "/" + name.getPath());
    }

    private ResourceLocation extend(ResourceLocation rl, String suffix) {
        return new ResourceLocation(rl.getNamespace(), rl.getPath() + suffix);
    }

    public ModelFile cubeAll(Block block, String texturePath) {
        return models().cubeAll(name(block), new CMResourceLocation("blocks/" + texturePath));
    }
}

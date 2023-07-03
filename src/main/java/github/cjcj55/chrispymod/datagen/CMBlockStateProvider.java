package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CMBlockStateProvider extends BlockStateProvider {
    public CMBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChrispyMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

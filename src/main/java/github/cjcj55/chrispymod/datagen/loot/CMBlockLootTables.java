package github.cjcj55.chrispymod.datagen.loot;

import github.cjcj55.chrispymod.registry.CMBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class CMBlockLootTables extends BlockLootSubProvider {
    public CMBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //this.dropSelf(CMBlocks.RUBY_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CMBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

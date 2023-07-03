package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CMBlockTagGenerator extends BlockTagsProvider {
    public CMBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ChrispyMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
//        this.tag(CM Tags.Blocks.METAL_DETECTOR_VALUABLES).add(CMBlocks.RUBY_ORE.get()).addTag(Tags.Blocks.ORES);
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}

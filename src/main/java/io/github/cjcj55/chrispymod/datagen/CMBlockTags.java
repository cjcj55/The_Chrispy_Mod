package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CMBlockTags extends BlockTagsProvider {

    public CMBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, ChrispyMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Blocks.ORES)
                .add(BlockInit.RUBY_ORE.get())
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get())
                .add(BlockInit.RUBY_ORE_NETHER.get())
                .add(BlockInit.OPAL_ORE.get())
                .add(BlockInit.DEEPSLATE_OPAL_ORE.get())
                .add(BlockInit.TANGERINE_ORE.get())
                .add(BlockInit.DEEPSLATE_TANGERINE_ORE.get())
                .add(BlockInit.COBALT_ORE.get())
                .add(BlockInit.DEEPSLATE_COBALT_ORE.get())
                .add(BlockInit.PARYTH_ORE.get())
                .add(BlockInit.DEEPSLATE_PARYTH_ORE.get())
                .add(BlockInit.WHITE_DWARF_STAR_ORE.get())
                .add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get())
                .add(BlockInit.NATURAL_ESSENCE_ORE.get())
                .add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get())
                .add(BlockInit.EXPERIENCE_ORE.get())
                .add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get())
                .add(BlockInit.FLAME_ORE_NETHER.get())
                .add(BlockInit.HELLFIRE_ORE_NETHER.get());
       /* tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.GENERATOR.get())
                .add(Registration.POWERGEN.get())
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.GENERATOR.get())
                .add(Registration.POWERGEN.get())
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());

        tag(Registration.MYSTERIOUS_ORE)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());*/
    }

    @Override
    public String getName() {
        return "Chrispy Mod Tags";
    }
}

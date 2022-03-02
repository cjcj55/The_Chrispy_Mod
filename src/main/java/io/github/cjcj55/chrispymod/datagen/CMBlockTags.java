package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.tags.CMTags;
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
        //tag(BlockTags.CROPS)
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

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.BLUE_EMERALD_BLOCK.get())
                .add(BlockInit.COBALT_BLOCK.get())
                .add(BlockInit.COBALT_ORE.get())
                .add(BlockInit.DEEPSLATE_COBALT_ORE.get())
                .add(BlockInit.EXPERIENCE_ORE.get())
                .add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get())
                .add(BlockInit.FLAME_BLOCK.get())
                .add(BlockInit.FLAME_ORE_NETHER.get())
                .add(BlockInit.HARDENED_REDSTONE_BLOCK.get())
                .add(BlockInit.HELLFIRE_ORE_NETHER.get())
                .add(BlockInit.LIGHTNING_BLOCK.get())
                .add(BlockInit.NATURAL_ESSENCE_ORE.get())
                .add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get())
                .add(BlockInit.OPAL_BLOCK.get())
                .add(BlockInit.OPAL_ORE.get())
                .add(BlockInit.DEEPSLATE_OPAL_ORE.get())
                .add(BlockInit.PARYTH_BLOCK.get())
                .add(BlockInit.PARYTH_ORE.get())
                .add(BlockInit.DEEPSLATE_PARYTH_ORE.get())
                .add(BlockInit.TANGERINE_BLOCK.get())
                .add(BlockInit.TANGERINE_ORE.get())
                .add(BlockInit.DEEPSLATE_TANGERINE_ORE.get())
                .add(BlockInit.RUBY_BLOCK.get())
                .add(BlockInit.RUBY_ORE.get())
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get())
                .add(BlockInit.RUBY_ORE_NETHER.get())
                .add(BlockInit.WHITE_DWARF_STAR_ORE.get())
                .add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get())
                .add(BlockInit.SKINNY_SLANTED_BRICKS.get())
                .add(BlockInit.SLANTED_BRICKS.get())
                .add(BlockInit.SKINNY_BRICKS.get())
                .add(BlockInit.CIRCULAR_BRICKS.get())
                .add(BlockInit.CRACKED_BRICKS.get())
                .add(BlockInit.ENCASED_BRICKS.get())
                .add(BlockInit.MOSAIC_BRICKS.get())
                .add(BlockInit.ORNATE_BRICKS.get())
                .add(BlockInit.ROAD_BRICKS.get())
                .add(BlockInit.SOLID_BRICKS.get())
                .add(BlockInit.WEAVER_BRICKS.get())
                .add(BlockInit.ALLOY_FURNACE.get())
                .add(BlockInit.JAM_AND_JELLY_MAKER.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockInit.BAMBOO_BLOCK.get())
                .add(BlockInit.BAMBOO_STAIRS.get())
                .add(BlockInit.BAMBOO_SLAB.get())
                .add(BlockInit.BAMBOO_DOOR.get())
                .add(BlockInit.BAMBOO_WALL.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BlockInit.EXPERIENCE_ORE.get())
                .add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get())
                .add(BlockInit.OPAL_BLOCK.get())
                .add(BlockInit.OPAL_ORE.get())
                .add(BlockInit.DEEPSLATE_OPAL_ORE.get())
                .add(BlockInit.SKINNY_SLANTED_BRICKS.get())
                .add(BlockInit.SLANTED_BRICKS.get())
                .add(BlockInit.SKINNY_BRICKS.get())
                .add(BlockInit.CIRCULAR_BRICKS.get())
                .add(BlockInit.CRACKED_BRICKS.get())
                .add(BlockInit.ENCASED_BRICKS.get())
                .add(BlockInit.MOSAIC_BRICKS.get())
                .add(BlockInit.ORNATE_BRICKS.get())
                .add(BlockInit.ROAD_BRICKS.get())
                .add(BlockInit.SOLID_BRICKS.get())
                .add(BlockInit.WEAVER_BRICKS.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.FLAME_BLOCK.get())
                .add(BlockInit.FLAME_ORE_NETHER.get())
                .add(BlockInit.HARDENED_REDSTONE_BLOCK.get())
                .add(BlockInit.HELLFIRE_ORE_NETHER.get())
                .add(BlockInit.NATURAL_ESSENCE_ORE.get())
                .add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get())
                .add(BlockInit.PARYTH_BLOCK.get())
                .add(BlockInit.PARYTH_ORE.get())
                .add(BlockInit.DEEPSLATE_PARYTH_ORE.get())
                .add(BlockInit.RUBY_BLOCK.get())
                .add(BlockInit.RUBY_ORE.get())
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get())
                .add(BlockInit.RUBY_ORE_NETHER.get())
                .add(BlockInit.TANGERINE_BLOCK.get())
                .add(BlockInit.TANGERINE_ORE.get())
                .add(BlockInit.DEEPSLATE_TANGERINE_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.BLUE_EMERALD_BLOCK.get())
                .add(BlockInit.COBALT_BLOCK.get())
                .add(BlockInit.COBALT_ORE.get())
                .add(BlockInit.DEEPSLATE_COBALT_ORE.get())
                .add(BlockInit.LIGHTNING_BLOCK.get())
                .add(BlockInit.WHITE_DWARF_STAR_ORE.get())
                .add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get());


        tag(BlockTags.WALLS)
                .add(BlockInit.BAMBOO_WALL.get());

        tag(CMTags.RUBY_ORE)
                .add(BlockInit.RUBY_ORE.get())
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get())
                .add(BlockInit.RUBY_ORE_NETHER.get());
        tag(CMTags.OPAL_ORE)
                .add(BlockInit.OPAL_ORE.get())
                .add(BlockInit.DEEPSLATE_OPAL_ORE.get());
        tag(CMTags.TANGERINE_ORE)
                .add(BlockInit.TANGERINE_ORE.get())
                .add(BlockInit.DEEPSLATE_TANGERINE_ORE.get());
        tag(CMTags.COBALT_ORE)
                .add(BlockInit.COBALT_ORE.get())
                .add(BlockInit.DEEPSLATE_COBALT_ORE.get());
        tag(CMTags.PARYTH_ORE)
                .add(BlockInit.PARYTH_ORE.get())
                .add(BlockInit.DEEPSLATE_PARYTH_ORE.get());
        tag(CMTags.WHITE_DWARF_STAR_ORE)
                .add(BlockInit.WHITE_DWARF_STAR_ORE.get())
                .add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get());
        tag(CMTags.NATURAL_ESSENCE_ORE)
                .add(BlockInit.NATURAL_ESSENCE_ORE.get())
                .add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get());
        tag(CMTags.EXPERIENCE_ORE)
                .add(BlockInit.EXPERIENCE_ORE.get())
                .add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get());

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

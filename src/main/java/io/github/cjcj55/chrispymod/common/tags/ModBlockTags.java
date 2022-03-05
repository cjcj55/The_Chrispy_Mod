package io.github.cjcj55.chrispymod.common.tags;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModBlockTags {
    public static final Tags.IOptionalNamedTag<Block> RUBY_ORE = BlockTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "ruby_ore"));
    public static final Tags.IOptionalNamedTag<Block> OPAL_ORE = BlockTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "opal_ore"));
    public static final Tags.IOptionalNamedTag<Block> TANGERINE_ORE = BlockTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "tangerine_ore"));
    public static final Tags.IOptionalNamedTag<Block> COBALT_ORE = BlockTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "cobalt_ore"));
    public static final Tags.IOptionalNamedTag<Block> PARYTH_ORE = BlockTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "paryth_ore"));
    public static final Tags.IOptionalNamedTag<Block> WHITE_DWARF_STAR_ORE = BlockTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "white_dwarf_star_ore"));
    public static final Tags.IOptionalNamedTag<Block> NATURAL_ESSENCE_ORE = BlockTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "natural_essence_ore"));
    public static final Tags.IOptionalNamedTag<Block> EXPERIENCE_ORE = BlockTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "experience_ore"));

    //public static final Tags.IOptionalNamedTag<Item> MYSTERIOUS_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(TutorialV3.MODID, "mysterious_ore"));
}

package io.github.cjcj55.chrispymod.common.tags;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class ModItemTags {
    public static final Tags.IOptionalNamedTag<Item> RUBY_ORE = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "ruby_ore"));
    public static final Tags.IOptionalNamedTag<Item> OPAL_ORE = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "opal_ore"));
    public static final Tags.IOptionalNamedTag<Item> TANGERINE_ORE = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "tangerine_ore"));
    public static final Tags.IOptionalNamedTag<Item> COBALT_ORE = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "cobalt_ore"));
    public static final Tags.IOptionalNamedTag<Item> PARYTH_ORE = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "paryth_ore"));
    public static final Tags.IOptionalNamedTag<Item> WHITE_DWARF_STAR_ORE = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "white_dwarf_star_ore"));
    public static final Tags.IOptionalNamedTag<Item> NATURAL_ESSENCE_ORE = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "natural_essence_ore"));
    public static final Tags.IOptionalNamedTag<Item> EXPERIENCE_ORE = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "experience_ore"));

    public static final Tags.IOptionalNamedTag<Item> BERRIES = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "berries"));
    public static final Tags.IOptionalNamedTag<Item> BERRY_JAMS = ItemTags.createOptional(new ResourceLocation(ChrispyMod.MODID, "berry_jams"));

    //public static final Tags.IOptionalNamedTag<Item> MYSTERIOUS_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(TutorialV3.MODID, "mysterious_ore"));
}

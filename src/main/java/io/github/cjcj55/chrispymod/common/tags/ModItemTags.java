package io.github.cjcj55.chrispymod.common.tags;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class ModItemTags {
    public static final TagKey<Item> RUBY_ORE = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "ruby_ore"));
    public static final TagKey<Item> OPAL_ORE = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "opal_ore"));
    public static final TagKey<Item> TANGERINE_ORE = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "tangerine_ore"));
    public static final TagKey<Item> COBALT_ORE = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "cobalt_ore"));
    public static final TagKey<Item> PARYTH_ORE = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "paryth_ore"));
    public static final TagKey<Item> WHITE_DWARF_STAR_ORE = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "white_dwarf_star_ore"));
    public static final TagKey<Item> NATURAL_ESSENCE_ORE = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "natural_essence_ore"));
    public static final TagKey<Item> EXPERIENCE_ORE = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "experience_ore"));

    public static final TagKey<Item> BERRIES = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "berries"));
    public static final TagKey<Item> BERRY_JAMS = ItemTags.create(new ResourceLocation(ChrispyMod.MODID, "berry_jams"));

    //public static final Tags.IOptionalNamedTag<Item> MYSTERIOUS_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(TutorialV3.MODID, "mysterious_ore"));
}

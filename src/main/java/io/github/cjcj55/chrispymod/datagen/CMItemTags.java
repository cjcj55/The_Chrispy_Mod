package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CMItemTags extends ItemTagsProvider {

    public CMItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, ChrispyMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(BlockInit.RUBY_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem())
                .add(BlockInit.RUBY_ORE_NETHER.get().asItem())
                .add(BlockInit.OPAL_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_OPAL_ORE.get().asItem())
                .add(BlockInit.TANGERINE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TANGERINE_ORE.get().asItem())
                .add(BlockInit.COBALT_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_COBALT_ORE.get().asItem())
                .add(BlockInit.PARYTH_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PARYTH_ORE.get().asItem())
                .add(BlockInit.WHITE_DWARF_STAR_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().asItem())
                .add(BlockInit.NATURAL_ESSENCE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get().asItem())
                .add(BlockInit.EXPERIENCE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get().asItem())
                .add(BlockInit.FLAME_ORE_NETHER.get().asItem())
                .add(BlockInit.HELLFIRE_ORE_NETHER.get().asItem());
        tag(Tags.Items.GEMS)
                .add(ItemInit.BLUE_EMERALD.get())
                .add(ItemInit.COBALT.get())
                .add(ItemInit.OPAL.get())
                .add(ItemInit.RUBY.get())
                .add(ItemInit.WHITE_DWARF_STAR.get())
                .add(ItemInit.COBALT.get())
                .add(ItemInit.COBALT.get());
        /*tag(Tags.Items.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.MYSTERIOUS_INGOT.get());
        tag(Registration.MYSTERIOUS_ORE_ITEM)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());*/
    }

    @Override
    public String getName() {
        return "Chrispy Mod Tags";
    }
}

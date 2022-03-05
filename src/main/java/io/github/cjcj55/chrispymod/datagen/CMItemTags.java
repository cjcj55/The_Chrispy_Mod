package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.tags.ModBlockTags;
import io.github.cjcj55.chrispymod.common.tags.ModItemTags;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
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
                .add(ItemInit.COBALT.get());

        tag(ModItemTags.RUBY_ORE)
                .add(BlockInit.RUBY_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem())
                .add(BlockInit.RUBY_ORE_NETHER.get().asItem());
        tag(ModItemTags.OPAL_ORE)
                .add(BlockInit.OPAL_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_OPAL_ORE.get().asItem());
        tag(ModItemTags.TANGERINE_ORE)
                .add(BlockInit.TANGERINE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_TANGERINE_ORE.get().asItem());
        tag(ModItemTags.COBALT_ORE)
                .add(BlockInit.COBALT_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_COBALT_ORE.get().asItem());
        tag(ModItemTags.PARYTH_ORE)
                .add(BlockInit.PARYTH_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_PARYTH_ORE.get().asItem());
        tag(ModItemTags.WHITE_DWARF_STAR_ORE)
                .add(BlockInit.WHITE_DWARF_STAR_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().asItem());
        tag(ModItemTags.NATURAL_ESSENCE_ORE)
                .add(BlockInit.NATURAL_ESSENCE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_NATURAL_ESSENCE_ORE.get().asItem());
        tag(ModItemTags.EXPERIENCE_ORE)
                .add(BlockInit.EXPERIENCE_ORE.get().asItem())
                .add(BlockInit.DEEPSLATE_EXPERIENCE_ORE.get().asItem());
        tag(ModItemTags.BERRIES)
                .add(ItemInit.STRAWBERRY.get())
                .add(ItemInit.BLUEBERRY.get())
                .add(ItemInit.LOGANBERRY.get())
                .add(ItemInit.RED_RASPBERRY.get())
                .add(ItemInit.BLACK_RASPBERRY.get())
                .add(ItemInit.GOLDEN_RASPBERRY.get())
                .add(ItemInit.WHITE_RASPBERRY.get())
                .add(ItemInit.MARIONBERRY.get())
                .add(ItemInit.BLACKCURRANT.get())
                .add(ItemInit.REDCURRANT.get())
                .add(ItemInit.HUCKLEBERRY.get())
                .add(ItemInit.WINEBERRY.get())
                .add(ItemInit.ELDERBERRY.get())
                .add(ItemInit.BLACKBERRY.get())
                .add(ItemInit.BOYSENBERRY.get())
                .add(ItemInit.GROUND_CHERRY.get())
                .add(ItemInit.ARONIA_BERRY.get())
                .add(ItemInit.SERVICEBERRY.get())
                .add(ItemInit.WONDERBERRY.get())
                .add(ItemInit.MULBERRY.get())
                .add(ItemInit.LINGONBERRY.get())
                .add(ItemInit.CRANBERRY.get())
                .add(ItemInit.DEWBERRY.get())
                .add(ItemInit.THIMBLEBERRY.get())
                .add(ItemInit.GOOSEBERRY.get())
                .add(ItemInit.CHOKEBERRY.get())
                .add(ItemInit.OLALLIEBERRY.get())
                .add(ItemInit.ACEROLA_CHERRY.get())
                .add(ItemInit.BARBERRY.get())
                .add(ItemInit.BAYBERRY.get())
                .add(ItemInit.GOGI_BERRY.get())
                .add(Items.SWEET_BERRIES);
        tag(ModItemTags.BERRY_JAMS)
                .add(ItemInit.STRAWBERRY_JAM.get())
                .add(ItemInit.BLUEBERRY_JAM.get())
                .add(ItemInit.LOGANBERRY_JAM.get())
                .add(ItemInit.RED_RASPBERRY_JAM.get())
                .add(ItemInit.BLACK_RASPBERRY_JAM.get())
                .add(ItemInit.GOLDEN_RASPBERRY_JAM.get())
                .add(ItemInit.WHITE_RASPBERRY_JAM.get())
                .add(ItemInit.MARIONBERRY_JAM.get())
                .add(ItemInit.BLACKCURRANT_JAM.get())
                .add(ItemInit.REDCURRANT_JAM.get())
                .add(ItemInit.HUCKLEBERRY_JAM.get())
                .add(ItemInit.WINEBERRY_JAM.get())
                .add(ItemInit.ELDERBERRY_JAM.get())
                .add(ItemInit.BLACKBERRY_JAM.get())
                .add(ItemInit.BOYSENBERRY_JAM.get())
                .add(ItemInit.GROUND_CHERRY_JAM.get())
                .add(ItemInit.ARONIA_BERRY_JAM.get())
                .add(ItemInit.SERVICEBERRY_JAM.get())
                .add(ItemInit.WONDERBERRY_JAM.get())
                .add(ItemInit.MULBERRY_JAM.get())
                .add(ItemInit.LINGONBERRY_JAM.get())
                .add(ItemInit.CRANBERRY_JAM.get())
                .add(ItemInit.DEWBERRY_JAM.get())
                .add(ItemInit.THIMBLEBERRY_JAM.get())
                .add(ItemInit.GOOSEBERRY_JAM.get())
                .add(ItemInit.CHOKEBERRY_JAM.get())
                .add(ItemInit.OLALLIEBERRY_JAM.get())
                .add(ItemInit.ACEROLA_CHERRY_JAM.get())
                .add(ItemInit.BARBERRY_JAM.get())
                .add(ItemInit.BAYBERRY_JAM.get())
                .add(ItemInit.GOGI_BERRY_JAM.get());

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

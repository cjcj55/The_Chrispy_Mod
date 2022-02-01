package io.github.cjcj55.chrispymod.common.itemgroups;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.ChrispyModBlocks;
import io.github.cjcj55.chrispymod.core.init.ChrispyModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ChrispyModItemGroups {
	public static final CreativeModeTab CHRISPY_ITEMS_TAB = new CreativeModeTab(ChrispyMod.MODID) {
		@Override
		public ItemStack makeIcon() {
			return ChrispyModItems.RUBY.get().getDefaultInstance();
			// return ItemInit.OUR_ITEM.get().getDefaultInstance();
		}
	};

	public static final CreativeModeTab CHRISPY_BLOCKS_TAB = new CreativeModeTab(ChrispyMod.MODID) {
		@Override
		public ItemStack makeIcon() {
			return ChrispyModBlocks.BLUE_EMERALD_BLOCK.get().getCloneItemStack();
			// return ItemInit.OUR_ITEM.get().getDefaultInstance();
		}
	};
}

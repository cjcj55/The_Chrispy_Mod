package io.github.cjcj55.chrispymod.common.itemgroups;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ChrispyModItemGroups {
	public static final CreativeModeTab CHRISPY_ITEMS_TAB = new CreativeModeTab(ChrispyMod.MODID) {
		@Override
		public ItemStack makeIcon() {
			return ItemInit.RUBY.get().getDefaultInstance();
			// return ItemInit.OUR_ITEM.get().getDefaultInstance();
		}
	};

	public static final CreativeModeTab CHRISPY_BLOCKS_TAB = new CreativeModeTab(ChrispyMod.MODID.concat("1")) {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.BLUE_EMERALD_BLOCK.get());
			// return ItemInit.OUR_ITEM.get().getDefaultInstance();
		}
	};
}
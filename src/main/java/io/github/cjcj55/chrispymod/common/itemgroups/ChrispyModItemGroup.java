package io.github.cjcj55.chrispymod.common.itemgroups;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ChrispyModItemGroup {
	public static final CreativeModeTab CHRISPY_TAB = new CreativeModeTab(ChrispyMod.MODID) {
		@Override
		public ItemStack makeIcon() {
			return Items.DIAMOND.getDefaultInstance();
			// return ItemInit.OUR_ITEM.get().getDefaultInstance();
		}
	};
}

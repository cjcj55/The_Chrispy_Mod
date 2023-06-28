package io.github.cjcj55.chrispymod.common.itemgroups;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ChrispyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChrispyModItemGroups {
	public static CreativeModeTab CHRISPY_ITEMS_TAB;
	public static CreativeModeTab CHRISPY_BLOCKS_TAB;

	@SubscribeEvent
	public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
		CHRISPY_ITEMS_TAB = event.registerCreativeModeTab(new ResourceLocation(ChrispyMod.MODID, "chrispy_mod_items_tab"),
				builder -> builder.icon(() -> new ItemStack(ItemInit.RUBY.get())).title(Component.literal("Chrispy Mod Items Tab")).build());
		CHRISPY_BLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(ChrispyMod.MODID, "chrispy_mod_blocks_tab"),
				builder -> builder.icon(() -> new ItemStack(BlockInit.BLUE_EMERALD_BLOCK.get())).title(Component.literal("Chrispy Mod Blockss Tab")).build());
	}
}
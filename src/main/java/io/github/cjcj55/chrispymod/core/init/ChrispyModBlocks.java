package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ChrispyModBlocks {
    private ChrispyModBlocks() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChrispyMod.MODID);

    // BLOCKS (FROM ORE)
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.1f, 31.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).strength(4.5f, 31.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TANGERINE_BLOCK = registerBlock("tangerine_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.3f, 31.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_BLUE).strength(6.0f, 45.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BLUE_EMERALD_BLOCK = registerBlock("blue_emerald_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(9.0f, 50.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> PARYTH_BLOCK = registerBlock("paryth_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).strength(5.6f, 35.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> LIGHTNING_BLOCK = registerBlock("lightning_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(8.5f, 40.0f).sound(SoundType.METAL).lightLevel((p_235464_0_) -> {return 15;})));
    public static final RegistryObject<Block> FLAME_BLOCK = registerBlock("flame_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.1f, 40.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> HARDENED_REDSTONE_BLOCK = registerBlock("hardened_redstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(3.2f, 18.0f).sound(SoundType.METAL)));
    // ORES
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(5.0f, 15.0f).sound(SoundType.METAL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OPAL_ORE = registerBlock("opal_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(3.8f, 12.0f).sound(SoundType.METAL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TANGERINE_ORE = registerBlock("tangerine_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(5.5f, 25.0f).sound(SoundType.METAL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLUE).strength(6.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PARYTH_ORE = registerBlock("paryth_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(5.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_DWARF_STAR_ORE = registerBlock("white_dwarf_star_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(6.0f, 200.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NATURAL_ESSENCE_ORE = registerBlock("natural_essence_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GREEN).strength(2.0f, 8.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> EXPERIENCE_ORE = registerBlock("experience_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(4.0f, 13.0f).sound(SoundType.STONE)));
    // NETHER ORES
    public static final RegistryObject<Block> RUBY_ORE_NETHER = registerBlock("ruby_ore_nether", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FLAME_ORE_NETHER = registerBlock("flame_ore_nether", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HELLFIRE_ORE_NETHER = registerBlock("hellfire_ore_nether", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE)));







    // helper methods with 2 params
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ChrispyModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_BLOCKS_TAB)));
    }


    // helper methods with 3 params
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ChrispyModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.redstone.Redstone;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ChrispyModBlocks {
    private ChrispyModBlocks() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChrispyMod.MODID);

    // BLOCKS (FROM ORE)
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.1f, 31.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).strength(4.5f, 31.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TANGERINE_BLOCK = registerBlock("tangerine_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.3f, 31.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_BLUE).strength(6.0f, 45.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_EMERALD_BLOCK = registerBlock("blue_emerald_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(9.0f, 50.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PARYTH_BLOCK = registerBlock("paryth_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).strength(5.6f, 35.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHTNING_BLOCK = registerBlock("lightning_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(8.5f, 40.0f).sound(SoundType.METAL).requiresCorrectToolForDrops().lightLevel((p_235464_0_) -> {return 15;})));
    public static final RegistryObject<Block> FLAME_BLOCK = registerBlock("flame_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.1f, 40.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HARDENED_REDSTONE_BLOCK = registerBlock("hardened_redstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(3.2f, 18.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    // ORES
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(5.0f, 15.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OPAL_ORE = registerBlock("opal_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(3.8f, 12.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TANGERINE_ORE = registerBlock("tangerine_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(5.5f, 25.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLUE).strength(6.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PARYTH_ORE = registerBlock("paryth_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(5.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_DWARF_STAR_ORE = registerBlock("white_dwarf_star_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(6.0f, 200.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NATURAL_ESSENCE_ORE = registerBlock("natural_essence_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GREEN).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EXPERIENCE_ORE = registerBlock("experience_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(4.0f, 13.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    // NETHER ORES
    public static final RegistryObject<Block> RUBY_ORE_NETHER = registerBlock("ruby_ore_nether", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLAME_ORE_NETHER = registerBlock("flame_ore_nether", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HELLFIRE_ORE_NETHER = registerBlock("hellfire_ore_nether", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    // BRICKS
    public static final RegistryObject<Block> SKINNY_SLANTED_BRICKS = registerBlock("skinny_slanted_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SLANTED_BRICKS = registerBlock("slanted_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SKINNY_BRICKS = registerBlock("skinny_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CIRCULAR_BRICKS = registerBlock("circular_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_BRICKS = registerBlock("cracked_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ENCASED_BRICKS = registerBlock("encased_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSAIC_BRICKS = registerBlock("mosaic_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORNATE_BRICKS = registerBlock("ornate_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROAD_BRICKS = registerBlock("road_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SOLID_BRICKS = registerBlock("solid_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WEAVER_BRICKS = registerBlock("weaver_bricks", () -> new Block(BlockBehaviour.Properties.copy(SKINNY_SLANTED_BRICKS.get()).requiresCorrectToolForDrops()));
    // REDSTONE LAMPS
    public static final RegistryObject<Block> BLACK_REDSTONE_LAMP = registerBlock("black_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)));
    public static final RegistryObject<Block> BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> BROWN_REDSTONE_LAMP = registerBlock("brown_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> CYAN_REDSTONE_LAMP = registerBlock("cyan_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN)));
    public static final RegistryObject<Block> GRAY_REDSTONE_LAMP = registerBlock("gray_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GRAY)));
    public static final RegistryObject<Block> GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GREEN)));
    public static final RegistryObject<Block> LIGHT_BLUE_REDSTONE_LAMP = registerBlock("light_blue_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> LIGHT_GRAY_REDSTONE_LAMP = registerBlock("light_gray_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> LIME_REDSTONE_LAMP = registerBlock("lime_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> MAGENTA_REDSTONE_LAMP = registerBlock("magenta_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PINK)));
    public static final RegistryObject<Block> PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.TERRACOTTA_WHITE)));
    public static final RegistryObject<Block> YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)));
    // MISC BLOCKS
    public static final RegistryObject<Block> SUGAR_BLOCK = registerBlock("sugar_block", () -> new Block(BlockBehaviour.Properties.of(Material.BAMBOO, MaterialColor.COLOR_GREEN).strength(1.0f, 8.0f).sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.BAMBOO, MaterialColor.COLOR_GREEN).strength(1.2f, 10.0f).sound(SoundType.CROP)));
    public static final RegistryObject<Block> BAMBOO_BLOCK = registerBlock("bamboo_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.BAMBOO, MaterialColor.COLOR_GREEN).strength(1.5f, 12.0f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<Block> BAMBOO_STAIRS = registerBlock("bamboo_stairs", () -> new StairBlock(BAMBOO_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_SLAB = registerBlock("bamboo_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_WALL = registerBlock("bamboo_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_DOOR = registerBlock("bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(BAMBOO_BLOCK.get()).noOcclusion()));






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
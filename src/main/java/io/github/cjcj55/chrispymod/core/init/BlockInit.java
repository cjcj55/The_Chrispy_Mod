package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.block.*;
import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    private BlockInit() {}

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
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(5.0f, 15.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(5.0f, 15.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));
    public static final RegistryObject<Block> OPAL_ORE = registerBlock("opal_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(3.8f, 12.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(3.8f, 12.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> TANGERINE_ORE = registerBlock("tangerine_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(5.5f, 25.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(1, 2)));
    public static final RegistryObject<Block> DEEPSLATE_TANGERINE_ORE = registerBlock("deepslate_tangerine_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(5.5f, 25.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(1, 2)));
    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLUE).strength(6.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 3)));
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLUE).strength(6.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 3)));
    public static final RegistryObject<Block> PARYTH_ORE = registerBlock("paryth_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(5.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> DEEPSLATE_PARYTH_ORE = registerBlock("deepslate_paryth_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(5.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> WHITE_DWARF_STAR_ORE = registerBlock("white_dwarf_star_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(6.0f, 200.0f).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(4, 8)));
    public static final RegistryObject<Block> DEEPSLATE_WHITE_DWARF_STAR_ORE = registerBlock("deepslate_white_dwarf_star_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(6.0f, 200.0f).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(4, 8)));
    public static final RegistryObject<Block> NATURAL_ESSENCE_ORE = registerBlock("natural_essence_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GREEN).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));
    public static final RegistryObject<Block> DEEPSLATE_NATURAL_ESSENCE_ORE = registerBlock("deepslate_natural_essence_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GREEN).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));
    public static final RegistryObject<Block> EXPERIENCE_ORE = registerBlock("experience_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(4.0f, 13.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_EXPERIENCE_ORE = registerBlock("deepslate_experience_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(4.0f, 13.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    // NETHER ORES
    public static final RegistryObject<Block> RUBY_ORE_NETHER = registerBlock("ruby_ore_nether", () -> new OreBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLAME_ORE_NETHER = registerBlock("flame_ore_nether", () -> new OreBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HELLFIRE_ORE_NETHER = registerBlock("hellfire_ore_nether", () -> new OreBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

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
    public static final RegistryObject<Block> BAMBOO_STAIRS = registerBlock("bamboo_stairs", () -> new StairBlock(() -> BAMBOO_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_SLAB = registerBlock("bamboo_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_WALL = registerBlock("bamboo_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_DOOR = registerBlock("bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(BAMBOO_BLOCK.get()).noOcclusion()));

    public static final RegistryObject<Block> LAVA_SPONGE = registerBlock("lava_sponge", () -> new LavaSpongeBlock(BlockBehaviour.Properties.of(Material.SPONGE, MaterialColor.COLOR_BLACK).strength(0.6f).sound(SoundType.GRASS)), new Item.Properties().fireResistant());
    public static final RegistryObject<Block> WET_LAVA_SPONGE = registerBlock("wet_lava_sponge", () -> new WetLavaSpongeBlock(BlockBehaviour.Properties.of(Material.SPONGE, MaterialColor.FIRE).strength(0.6f).sound(SoundType.GRASS)), new Item.Properties().fireResistant());

    public static final RegistryObject<Block> ALLOY_FURNACE = registerBlock("alloy_furnace", () -> new AlloyFurnaceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(4.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> JAM_AND_JELLY_MAKER = registerBlock("jam_and_jelly_maker", () -> new JamAndJellyMakerBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(3.8f, 4.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    // BERRY BLOCKS
    public static final RegistryObject<Block> STRAWBERRY_BUSH = registerBlock("strawberry_bush", () -> new BerryBlockBase(ItemInit.STRAWBERRY, false, false));
    public static final RegistryObject<Block> BLUEBERRY_BUSH = registerBlock("blueberry_bush", () -> new BerryBlockBase(ItemInit.BLUEBERRY, false, false));
    public static final RegistryObject<Block> LOGANBERRY_BUSH = registerBlock("loganberry_bush", () -> new BerryBlockBase(ItemInit.LOGANBERRY, false, false));
    public static final RegistryObject<Block> RED_RASPBERRY_BUSH = registerBlock("red_raspberry_bush", () -> new BerryBlockBase(ItemInit.RED_RASPBERRY, false, false));
    public static final RegistryObject<Block> BLACK_RASPBERRY_BUSH = registerBlock("black_raspberry_bush", () -> new BerryBlockBase(ItemInit.BLACK_RASPBERRY, false, false));
    public static final RegistryObject<Block> GOLDEN_RASPBERRY_BUSH = registerBlock("golden_raspberry_bush", () -> new BerryBlockBase(ItemInit.GOLDEN_RASPBERRY, false, false));
    public static final RegistryObject<Block> WHITE_RASPBERRY_BUSH = registerBlock("white_raspberry_bush", () -> new BerryBlockBase(ItemInit.WHITE_RASPBERRY, false, false));
    public static final RegistryObject<Block> MARIONBERRY_BUSH = registerBlock("marionberry_bush", () -> new BerryBlockBase(ItemInit.MARIONBERRY, false, false));
    public static final RegistryObject<Block> BLACKCURRANT_BUSH = registerBlock("blackcurrant_bush", () -> new BerryBlockBase(ItemInit.BLACKCURRANT, false, false));
    public static final RegistryObject<Block> REDCURRANT_BUSH = registerBlock("redcurrant_bush", () -> new BerryBlockBase(ItemInit.REDCURRANT, false, false));
    public static final RegistryObject<Block> HUCKLEBERRY_BUSH = registerBlock("huckleberry_bush", () -> new BerryBlockBase(ItemInit.HUCKLEBERRY, false, false));
    public static final RegistryObject<Block> WINEBERRY_BUSH = registerBlock("wineberry_bush", () -> new BerryBlockBase(ItemInit.WINEBERRY, false, false));
    public static final RegistryObject<Block> ELDERBERRY_BUSH = registerBlock("elderberry_bush", () -> new BerryBlockBase(ItemInit.ELDERBERRY, false, false));
    public static final RegistryObject<Block> BLACKBERRY_BUSH = registerBlock("blackberry_bush", () -> new BerryBlockBase(ItemInit.BLACKBERRY, false, false));
    public static final RegistryObject<Block> BOYSENBERRY_BUSH = registerBlock("boysenberry_bush", () -> new BerryBlockBase(ItemInit.BOYSENBERRY, false, false));
    public static final RegistryObject<Block> GROUND_CHERRY_BUSH = registerBlock("ground_cherry_bush", () -> new BerryBlockBase(ItemInit.GROUND_CHERRY, false, false));
    public static final RegistryObject<Block> ARONIA_BERRY_BUSH = registerBlock("aronia_berry_bush", () -> new BerryBlockBase(ItemInit.ARONIA_BERRY, false, false));
    public static final RegistryObject<Block> SERVICEBERRY_BUSH = registerBlock("serviceberry_bush", () -> new BerryBlockBase(ItemInit.SERVICEBERRY, false, false));
    public static final RegistryObject<Block> WONDERBERRY_BUSH = registerBlock("wonderberry_bush", () -> new BerryBlockBase(ItemInit.WONDERBERRY, false, false));
    public static final RegistryObject<Block> MULBERRY_BUSH = registerBlock("mulberry_bush", () -> new BerryBlockBase(ItemInit.MULBERRY, false, false));
    public static final RegistryObject<Block> LINGONBERRY_BUSH = registerBlock("lingonberry_bush", () -> new BerryBlockBase(ItemInit.LINGONBERRY, false, false));
    public static final RegistryObject<Block> CRANBERRY_BUSH = registerBlock("cranberry_bush", () -> new BerryBlockBase(ItemInit.CRANBERRY, false, false));
    public static final RegistryObject<Block> DEWBERRY_BUSH = registerBlock("dewberry_bush", () -> new BerryBlockBase(ItemInit.DEWBERRY, false, false));
    public static final RegistryObject<Block> THIMBLEBERRY_BUSH = registerBlock("thimbleberry_bush", () -> new BerryBlockBase(ItemInit.THIMBLEBERRY, false, false));
    public static final RegistryObject<Block> GOOSEBERRY_BUSH = registerBlock("gooseberry_bush", () -> new BerryBlockBase(ItemInit.GOOSEBERRY, false, false));
    public static final RegistryObject<Block> CHOKEBERRY_BUSH = registerBlock("chokeberry_bush", () -> new BerryBlockBase(ItemInit.CHOKEBERRY, false, false));
    public static final RegistryObject<Block> OLALLIEBERRY_BUSH = registerBlock("olallieberry_bush", () -> new BerryBlockBase(ItemInit.OLALLIEBERRY, false, false));
    public static final RegistryObject<Block> ACEROLA_CHERRY_BUSH = registerBlock("acerola_cherry_bush", () -> new BerryBlockBase(ItemInit.ACEROLA_CHERRY, false, false));
    public static final RegistryObject<Block> BARBERRY_BUSH = registerBlock("barberry_bush", () -> new BerryBlockBase(ItemInit.BARBERRY, false, false));
    public static final RegistryObject<Block> BAYBERRY_BUSH = registerBlock("bayberry_bush", () -> new BerryBlockBase(ItemInit.BAYBERRY, false, false));
    public static final RegistryObject<Block> GOGI_BERRY_BUSH = registerBlock("gogi_berry_bush", () -> new BerryBlockBase(ItemInit.GOGI_BERRY, false, false));





    // helper methods with 2 params
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_BLOCKS_TAB)));
    }


    // helper methods with 3 params
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, Item.Properties properties) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, properties);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, Item.Properties properties) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
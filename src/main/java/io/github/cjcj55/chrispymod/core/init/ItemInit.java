package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.item.*;
import io.github.cjcj55.chrispymod.core.materials.ArmorMaterials;
import io.github.cjcj55.chrispymod.core.materials.ToolMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChrispyMod.MODID);

// ITEMS
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new ChrispyModItem());
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new ChrispyModItem());
    public static final RegistryObject<Item> TANGERINE = ITEMS.register("tangerine", () -> new ChrispyModItem());
    public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt", () -> new ChrispyModItem());
    public static final RegistryObject<Item> BLUE_EMERALD = ITEMS.register("blue_emerald", () -> new ChrispyModItem());
    public static final RegistryObject<Item> PARYTH = ITEMS.register("paryth", () -> new ChrispyModItem());
    public static final RegistryObject<Item> LIGHTNING = ITEMS.register("lightning", () -> new ChrispyModItem());
    public static final RegistryObject<Item> FLAME = ITEMS.register("flame", () -> new ChrispyModItem());
    public static final RegistryObject<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot", () -> new ChrispyModItem());
    public static final RegistryObject<Item> HELLFIRE = ITEMS.register("hellfire", () -> new HellfireItem());
    public static final RegistryObject<Item> WHITE_DWARF_STAR = ITEMS.register("white_dwarf_star", () -> new WhiteDwarfStarItem());
    public static final RegistryObject<Item> NATURAL_ESSENCE = ITEMS.register("natural_essence", () -> new ChrispyModItem());
    public static final RegistryObject<Item> HONEY_STICK = ITEMS.register("honey_stick", () -> new ChrispyModItem());
    public static final RegistryObject<Item> EDIBLE_EXPERIENCE = ITEMS.register("edible_experience", () -> new EdibleExperienceItem());

// TOOLS
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new ChrispyModSwordItem(ToolMaterials.RUBY, 3, -2.4F));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ChrispyModShovelItem(ToolMaterials.RUBY, 1.5F, -3.0F));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.RUBY, 1, -2.8F));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new ChrispyModAxeItem(ToolMaterials.RUBY, 6.0F, -3.2F));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new ChrispyModHoeItem(ToolMaterials.RUBY, 0, -3.0F));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.RUBY, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.RUBY, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.RUBY, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ChrispyModArmorItem(ArmorMaterials.RUBY, EquipmentSlot.FEET));

    public static final RegistryObject<Item> OPAL_SWORD = ITEMS.register("opal_sword", () -> new ChrispyModSwordItem(ToolMaterials.OPAL, 3, -2.4F));
    public static final RegistryObject<Item> OPAL_SHOVEL = ITEMS.register("opal_shovel", () -> new ChrispyModShovelItem(ToolMaterials.OPAL, 1.5F, -3.0F));
    public static final RegistryObject<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.OPAL, 1, -2.8F));
    public static final RegistryObject<Item> OPAL_AXE = ITEMS.register("opal_axe", () -> new ChrispyModAxeItem(ToolMaterials.OPAL, 6.0F, -3.2F));
    public static final RegistryObject<Item> OPAL_HOE = ITEMS.register("opal_hoe", () -> new ChrispyModHoeItem(ToolMaterials.OPAL, 0, -3.0F));
    public static final RegistryObject<Item> OPAL_HELMET = ITEMS.register("opal_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.OPAL, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.OPAL, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> OPAL_LEGGINGS = ITEMS.register("opal_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.OPAL, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> OPAL_BOOTS = ITEMS.register("opal_boots", () -> new ChrispyModArmorItem(ArmorMaterials.OPAL, EquipmentSlot.FEET));

    public static final RegistryObject<Item> TANGERINE_SWORD = ITEMS.register("tangerine_sword", () -> new ChrispyModSwordItem(ToolMaterials.TANGERINE, 3, -2.4F));
    public static final RegistryObject<Item> TANGERINE_SHOVEL = ITEMS.register("tangerine_shovel", () -> new ChrispyModShovelItem(ToolMaterials.TANGERINE, 1.5F, -3.0F));
    public static final RegistryObject<Item> TANGERINE_PICKAXE = ITEMS.register("tangerine_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.TANGERINE, 1, -2.8F));
    public static final RegistryObject<Item> TANGERINE_AXE = ITEMS.register("tangerine_axe", () -> new ChrispyModAxeItem(ToolMaterials.TANGERINE, 6.0F, -3.2F));
    public static final RegistryObject<Item> TANGERINE_HOE = ITEMS.register("tangerine_hoe", () -> new ChrispyModHoeItem(ToolMaterials.TANGERINE, 0, -3.0F));
    public static final RegistryObject<Item> TANGERINE_HELMET = ITEMS.register("tangerine_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.TANGERINE, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> TANGERINE_CHESTPLATE = ITEMS.register("tangerine_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.TANGERINE, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> TANGERINE_LEGGINGS = ITEMS.register("tangerine_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.TANGERINE, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> TANGERINE_BOOTS = ITEMS.register("tangerine_boots", () -> new ChrispyModArmorItem(ArmorMaterials.TANGERINE, EquipmentSlot.FEET));

    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new ChrispyModSwordItem(ToolMaterials.COBALT, 3, -2.4F));
    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ChrispyModShovelItem(ToolMaterials.COBALT, 1.5F, -3.0F));
    public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.COBALT, 1, -2.8F));
    public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new ChrispyModAxeItem(ToolMaterials.COBALT, 6.0F, -3.2F));
    public static final RegistryObject<Item> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new ChrispyModHoeItem(ToolMaterials.COBALT, 0, -3.0F));
    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.COBALT, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.COBALT, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.COBALT, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ChrispyModArmorItem(ArmorMaterials.COBALT, EquipmentSlot.FEET));

    public static final RegistryObject<Item> BLUE_EMERALD_SWORD = ITEMS.register("blue_emerald_sword", () -> new ChrispyModSwordItem(ToolMaterials.BLUE_EMERALD, 3, -2.4F));
    public static final RegistryObject<Item> BLUE_EMERALD_SHOVEL = ITEMS.register("blue_emerald_shovel", () -> new ChrispyModShovelItem(ToolMaterials.BLUE_EMERALD, 1.5F, -3.0F));
    public static final RegistryObject<Item> BLUE_EMERALD_PICKAXE = ITEMS.register("blue_emerald_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.BLUE_EMERALD, 1, -2.8F));
    public static final RegistryObject<Item> BLUE_EMERALD_AXE = ITEMS.register("blue_emerald_axe", () -> new ChrispyModAxeItem(ToolMaterials.BLUE_EMERALD, 6.0F, -3.2F));
    public static final RegistryObject<Item> BLUE_EMERALD_HOE = ITEMS.register("blue_emerald_hoe", () -> new ChrispyModHoeItem(ToolMaterials.BLUE_EMERALD, 0, -3.0F));
    public static final RegistryObject<Item> BLUE_EMERALD_HELMET = ITEMS.register("blue_emerald_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.BLUE_EMERALD, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> BLUE_EMERALD_CHESTPLATE = ITEMS.register("blue_emerald_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.BLUE_EMERALD, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> BLUE_EMERALD_LEGGINGS = ITEMS.register("blue_emerald_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.BLUE_EMERALD, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> BLUE_EMERALD_BOOTS = ITEMS.register("blue_emerald_boots", () -> new ChrispyModArmorItem(ArmorMaterials.BLUE_EMERALD, EquipmentSlot.FEET));

    public static final RegistryObject<Item> PARYTH_SWORD = ITEMS.register("paryth_sword", () -> new ChrispyModSwordItem(ToolMaterials.PARYTH, 3, -2.4F));
    public static final RegistryObject<Item> PARYTH_SHOVEL = ITEMS.register("paryth_shovel", () -> new ChrispyModShovelItem(ToolMaterials.PARYTH, 1.5F, -3.0F));
    public static final RegistryObject<Item> PARYTH_PICKAXE = ITEMS.register("paryth_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.PARYTH, 1, -2.8F));
    public static final RegistryObject<Item> PARYTH_AXE = ITEMS.register("paryth_axe", () -> new ChrispyModAxeItem(ToolMaterials.PARYTH, 6.0F, -3.2F));
    public static final RegistryObject<Item> PARYTH_HOE = ITEMS.register("paryth_hoe", () -> new ChrispyModHoeItem(ToolMaterials.PARYTH, 0, -3.0F));
    public static final RegistryObject<Item> PARYTH_HELMET = ITEMS.register("paryth_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.PARYTH, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> PARYTH_CHESTPLATE = ITEMS.register("paryth_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.PARYTH, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> PARYTH_LEGGINGS = ITEMS.register("paryth_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.PARYTH, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> PARYTH_BOOTS = ITEMS.register("paryth_boots", () -> new ChrispyModArmorItem(ArmorMaterials.PARYTH, EquipmentSlot.FEET));

    public static final RegistryObject<Item> LIGHTNING_SWORD = ITEMS.register("lightning_sword", () -> new LightningSwordItem(ToolMaterials.LIGHTNING, 3, -2.4F));
    public static final RegistryObject<Item> LIGHTNING_SHOVEL = ITEMS.register("lightning_shovel", () -> new ChrispyModShovelItem(ToolMaterials.LIGHTNING, 1.5F, -3.0F));
    public static final RegistryObject<Item> LIGHTNING_PICKAXE = ITEMS.register("lightning_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.LIGHTNING, 1, -2.8F));
    public static final RegistryObject<Item> LIGHTNING_AXE = ITEMS.register("lightning_axe", () -> new ChrispyModAxeItem(ToolMaterials.LIGHTNING, 6.0F, -3.2F));
    public static final RegistryObject<Item> LIGHTNING_HOE = ITEMS.register("lightning_hoe", () -> new ChrispyModHoeItem(ToolMaterials.LIGHTNING, 0, -3.0F));
    public static final RegistryObject<Item> LIGHTNING_HELMET = ITEMS.register("lightning_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.LIGHTNING, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> LIGHTNING_CHESTPLATE = ITEMS.register("lightning_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.LIGHTNING, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> LIGHTNING_LEGGINGS = ITEMS.register("lightning_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.LIGHTNING, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> LIGHTNING_BOOTS = ITEMS.register("lightning_boots", () -> new ChrispyModArmorItem(ArmorMaterials.LIGHTNING, EquipmentSlot.FEET));
    // Lightning Wand
    public static final RegistryObject<Item> LIGHTNING_WAND = ITEMS.register("lightning_wand", () -> new LightningWandItem());
    public static final RegistryObject<Item> FLAME_WAND = ITEMS.register("flame_wand", () -> new FlameWandItem());


    public static final RegistryObject<Item> FLAME_SWORD = ITEMS.register("flame_sword", () -> new FlameSwordItem(ToolMaterials.FLAME, 3, -2.4F));
    public static final RegistryObject<Item> FLAME_SHOVEL = ITEMS.register("flame_shovel", () -> new ChrispyModShovelItem(ToolMaterials.FLAME, 1.5F, -3.0F));
    public static final RegistryObject<Item> FLAME_PICKAXE = ITEMS.register("flame_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.FLAME, 1, -2.8F));
    public static final RegistryObject<Item> FLAME_AXE = ITEMS.register("flame_axe", () -> new ChrispyModAxeItem(ToolMaterials.FLAME, 6.0F, -3.2F));
    public static final RegistryObject<Item> FLAME_HOE = ITEMS.register("flame_hoe", () -> new ChrispyModHoeItem(ToolMaterials.FLAME, 0, -3.0F));
    public static final RegistryObject<Item> FLAME_HELMET = ITEMS.register("flame_helmet", () -> new FlameArmorItem(ArmorMaterials.FLAME, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> FLAME_CHESTPLATE = ITEMS.register("flame_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.FLAME, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> FLAME_LEGGINGS = ITEMS.register("flame_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.FLAME, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> FLAME_BOOTS = ITEMS.register("flame_boots", () -> new ChrispyModArmorItem(ArmorMaterials.FLAME, EquipmentSlot.FEET));

    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new ChrispyModSwordItem(ToolMaterials.REDSTONE, 3, -2.4F));
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ChrispyModShovelItem(ToolMaterials.REDSTONE, 1.5F, -3.0F));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.REDSTONE, 1, -2.8F));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new ChrispyModAxeItem(ToolMaterials.REDSTONE, 6.0F, -3.2F));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new ChrispyModHoeItem(ToolMaterials.REDSTONE, 0, -3.0F));
    public static final RegistryObject<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.REDSTONE, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.REDSTONE, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.REDSTONE, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new ChrispyModArmorItem(ArmorMaterials.REDSTONE, EquipmentSlot.FEET));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new ChrispyModSwordItem(ToolMaterials.EMERALD, 3, -2.4F));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ChrispyModShovelItem(ToolMaterials.EMERALD, 1.5F, -3.0F));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.EMERALD, 1, -2.8F));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new ChrispyModAxeItem(ToolMaterials.EMERALD, 6.0F, -3.2F));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new ChrispyModHoeItem(ToolMaterials.EMERALD, 0, -3.0F));
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ChrispyModArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.FEET));

    public static final RegistryObject<Item> HONEY_SWORD = ITEMS.register("honey_sword", () -> new ChrispyModSwordItem(ToolMaterials.HONEY, 3, -2.4F));
    public static final RegistryObject<Item> HONEY_SHOVEL = ITEMS.register("honey_shovel", () -> new ChrispyModShovelItem(ToolMaterials.HONEY, 1.5F, -3.0F));
    public static final RegistryObject<Item> HONEY_PICKAXE = ITEMS.register("honey_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.HONEY, 1, -2.8F));
    public static final RegistryObject<Item> HONEY_AXE = ITEMS.register("honey_axe", () -> new ChrispyModAxeItem(ToolMaterials.HONEY, 6.0F, -3.2F));
    public static final RegistryObject<Item> HONEY_HOE = ITEMS.register("honey_hoe", () -> new ChrispyModHoeItem(ToolMaterials.HONEY, 0, -3.0F));
    public static final RegistryObject<Item> HONEY_HELMET = ITEMS.register("honey_helmet", () -> new HoneyArmorItem(ArmorMaterials.HONEY, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> HONEY_CHESTPLATE = ITEMS.register("honey_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.HONEY, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> HONEY_LEGGINGS = ITEMS.register("honey_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.HONEY, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> HONEY_BOOTS = ITEMS.register("honey_boots", () -> new ChrispyModArmorItem(ArmorMaterials.HONEY, EquipmentSlot.FEET));

    public static final RegistryObject<Item> WHITE_DWARF_STAR_HELMET = ITEMS.register("white_dwarf_star_helmet", () -> new WhiteDwarfStarArmorItem(ArmorMaterials.WHITE_DWARF_STAR, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> WHITE_DWARF_STAR_CHESTPLATE = ITEMS.register("white_dwarf_star_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.WHITE_DWARF_STAR, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> WHITE_DWARF_STAR_LEGGINGS = ITEMS.register("white_dwarf_star_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.WHITE_DWARF_STAR, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> WHITE_DWARF_STAR_BOOTS = ITEMS.register("white_dwarf_star_boots", () -> new ChrispyModArmorItem(ArmorMaterials.WHITE_DWARF_STAR, EquipmentSlot.FEET));
    
// FOOD
    public static final RegistryObject<Item> BLACK_CANDY_CANE = ITEMS.register("black_candy_cane", () -> new ChrispyModFoodItem(FoodList.BLACK_CANDY_CANE));
    public static final RegistryObject<Item> BLUE_CANDY_CANE = ITEMS.register("blue_candy_cane", () -> new ChrispyModFoodItem(FoodList.BLUE_CANDY_CANE));
    public static final RegistryObject<Item> BROWN_CANDY_CANE = ITEMS.register("brown_candy_cane", () -> new ChrispyModFoodItem(FoodList.BROWN_CANDY_CANE));
    public static final RegistryObject<Item> CYAN_CANDY_CANE = ITEMS.register("cyan_candy_cane", () -> new ChrispyModFoodItem(FoodList.CYAN_CANDY_CANE));
    public static final RegistryObject<Item> GRAY_CANDY_CANE = ITEMS.register("gray_candy_cane", () -> new ChrispyModFoodItem(FoodList.GRAY_CANDY_CANE));
    public static final RegistryObject<Item> GREEN_CANDY_CANE = ITEMS.register("green_candy_cane", () -> new ChrispyModFoodItem(FoodList.GREEN_CANDY_CANE));
    public static final RegistryObject<Item> LIGHT_BLUE_CANDY_CANE = ITEMS.register("light_blue_candy_cane", () -> new ChrispyModFoodItem(FoodList.LIGHT_BLUE_CANDY_CANE));
    public static final RegistryObject<Item> LIGHT_GRAY_CANDY_CANE = ITEMS.register("light_gray_candy_cane", () -> new ChrispyModFoodItem(FoodList.LIGHT_GRAY_CANDY_CANE));
    public static final RegistryObject<Item> LIME_CANDY_CANE = ITEMS.register("lime_candy_cane", () -> new ChrispyModFoodItem(FoodList.LIME_CANDY_CANE));
    public static final RegistryObject<Item> MAGENTA_CANDY_CANE = ITEMS.register("magenta_candy_cane", () -> new ChrispyModFoodItem(FoodList.MAGENTA_CANDY_CANE));
    public static final RegistryObject<Item> ORANGE_CANDY_CANE = ITEMS.register("orange_candy_cane", () -> new ChrispyModFoodItem(FoodList.ORANGE_CANDY_CANE));
    public static final RegistryObject<Item> PINK_CANDY_CANE = ITEMS.register("pink_candy_cane", () -> new ChrispyModFoodItem(FoodList.PINK_CANDY_CANE));
    public static final RegistryObject<Item> PURPLE_CANDY_CANE = ITEMS.register("purple_candy_cane", () -> new ChrispyModFoodItem(FoodList.PURPLE_CANDY_CANE));
    public static final RegistryObject<Item> RED_CANDY_CANE = ITEMS.register("red_candy_cane", () -> new ChrispyModFoodItem(FoodList.RED_CANDY_CANE));
    public static final RegistryObject<Item> WHITE_CANDY_CANE = ITEMS.register("white_candy_cane", () -> new ChrispyModFoodItem(FoodList.WHITE_CANDY_CANE));
    public static final RegistryObject<Item> YELLOW_CANDY_CANE = ITEMS.register("yellow_candy_cane", () -> new ChrispyModFoodItem(FoodList.YELLOW_CANDY_CANE));
    public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new ChrispyModFoodItem(FoodList.COOKED_CARROT));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new CMBerryItem(BlockInit.STRAWBERRY_BUSH.get(), FoodList.STRAWBERRY));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new CMBerryItem(BlockInit.BLUEBERRY_BUSH.get(), FoodList.BLUEBERRY));
    public static final RegistryObject<Item> LOGANBERRY = ITEMS.register("loganberry", () -> new CMBerryItem(BlockInit.LOGANBERRY_BUSH.get(), FoodList.LOGANBERRY));
    public static final RegistryObject<Item> RED_RASPBERRY = ITEMS.register("red_raspberry", () -> new CMBerryItem(BlockInit.RED_RASPBERRY_BUSH.get(), FoodList.RED_RASPBERRY));
    public static final RegistryObject<Item> BLACK_RASPBERRY = ITEMS.register("black_raspberry", () -> new CMBerryItem(BlockInit.BLACK_RASPBERRY_BUSH.get(), FoodList.BLACK_RASPBERRY));
    public static final RegistryObject<Item> GOLDEN_RASPBERRY = ITEMS.register("golden_raspberry", () -> new CMBerryItem(BlockInit.GOLDEN_RASPBERRY_BUSH.get(), FoodList.GOLDEN_RASPBERRY));
    public static final RegistryObject<Item> WHITE_RASPBERRY = ITEMS.register("white_raspberry", () -> new CMBerryItem(BlockInit.WHITE_RASPBERRY_BUSH.get(), FoodList.WHITE_RASPBERRY));
    public static final RegistryObject<Item> MARIONBERRY = ITEMS.register("marionberry", () -> new CMBerryItem(BlockInit.MARIONBERRY_BUSH.get(), FoodList.MARIONBERRY));
    public static final RegistryObject<Item> BLACKCURRANT = ITEMS.register("blackcurrant", () -> new CMBerryItem(BlockInit.BLACKCURRANT_BUSH.get(), FoodList.BLACKCURRANT));
    public static final RegistryObject<Item> REDCURRANT = ITEMS.register("redcurrant", () -> new CMBerryItem(BlockInit.REDCURRANT_BUSH.get(), FoodList.REDCURRANT));
    public static final RegistryObject<Item> HUCKLEBERRY = ITEMS.register("huckleberry", () -> new CMBerryItem(BlockInit.HUCKLEBERRY_BUSH.get(), FoodList.HUCKLEBERRY));
    public static final RegistryObject<Item> WINEBERRY = ITEMS.register("wineberry", () -> new CMBerryItem(BlockInit.WINEBERRY_BUSH.get(), FoodList.WINEBERRY));
    public static final RegistryObject<Item> ELDERBERRY = ITEMS.register("elderberry", () -> new CMBerryItem(BlockInit.ELDERBERRY_BUSH.get(), FoodList.ELDERBERRY));
    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry", () -> new CMBerryItem(BlockInit.BLACKBERRY_BUSH.get(), FoodList.BLACKBERRY));
    public static final RegistryObject<Item> BOYSENBERRY = ITEMS.register("boysenberry", () -> new CMBerryItem(BlockInit.BOYSENBERRY_BUSH.get(), FoodList.BOYSENBERRY));
    public static final RegistryObject<Item> GROUND_CHERRY = ITEMS.register("ground_cherry", () -> new CMBerryItem(BlockInit.GROUND_CHERRY_BUSH.get(), FoodList.GROUND_CHERRY));
    public static final RegistryObject<Item> ARONIA_BERRY = ITEMS.register("aronia_berry", () -> new CMBerryItem(BlockInit.ARONIA_BERRY_BUSH.get(), FoodList.ARONIA_BERRY));
    public static final RegistryObject<Item> SERVICEBERRY = ITEMS.register("serviceberry", () -> new CMBerryItem(BlockInit.SERVICEBERRY_BUSH.get(), FoodList.SERVICEBERRY));
    public static final RegistryObject<Item> WONDERBERRY = ITEMS.register("wonderberry", () -> new CMBerryItem(BlockInit.WONDERBERRY_BUSH.get(), FoodList.WONDERBERRY));
    public static final RegistryObject<Item> MULBERRY = ITEMS.register("mulberry", () -> new CMBerryItem(BlockInit.MULBERRY_BUSH.get(), FoodList.MULBERRY));
    public static final RegistryObject<Item> LINGONBERRY = ITEMS.register("lingonberry", () -> new CMBerryItem(BlockInit.LINGONBERRY_BUSH.get(), FoodList.LINGONBERRY));
    public static final RegistryObject<Item> CRANBERRY = ITEMS.register("cranberry", () -> new CMBerryItem(BlockInit.CRANBERRY_BUSH.get(), FoodList.CRANBERRY));
    public static final RegistryObject<Item> DEWBERRY = ITEMS.register("dewberry", () -> new CMBerryItem(BlockInit.DEWBERRY_BUSH.get(), FoodList.DEWBERRY));
    public static final RegistryObject<Item> THIMBLEBERRY = ITEMS.register("thimbleberry", () -> new CMBerryItem(BlockInit.THIMBLEBERRY_BUSH.get(), FoodList.THIMBLEBERRY));
    public static final RegistryObject<Item> GOOSEBERRY = ITEMS.register("gooseberry", () -> new CMBerryItem(BlockInit.GOOSEBERRY_BUSH.get(), FoodList.GOOSEBERRY));
    public static final RegistryObject<Item> CHOKEBERRY = ITEMS.register("chokeberry", () -> new CMBerryItem(BlockInit.CHOKEBERRY_BUSH.get(), FoodList.CHOKEBERRY));
    public static final RegistryObject<Item> OLALLIEBERRY = ITEMS.register("olallieberry", () -> new CMBerryItem(BlockInit.OLALLIEBERRY_BUSH.get(), FoodList.OLALLIEBERRY));
    public static final RegistryObject<Item> ACEROLA_CHERRY = ITEMS.register("acerola_cherry", () -> new CMBerryItem(BlockInit.ACEROLA_CHERRY_BUSH.get(), FoodList.ACEROLA_CHERRY));
    public static final RegistryObject<Item> BARBERRY = ITEMS.register("barberry", () -> new CMBerryItem(BlockInit.BARBERRY_BUSH.get(), FoodList.BARBERRY));
    public static final RegistryObject<Item> BAYBERRY = ITEMS.register("bayberry", () -> new CMBerryItem(BlockInit.BAYBERRY_BUSH.get(), FoodList.BAYBERRY));
    public static final RegistryObject<Item> GOGI_BERRY = ITEMS.register("gogi_berry", () -> new CMBerryItem(BlockInit.GOGI_BERRY_BUSH.get(), FoodList.GOGI_BERRY));
    
    public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam", () -> new BerryJamItem(FoodList.STRAWBERRY_JAM));
    public static final RegistryObject<Item> BLUEBERRY_JAM = ITEMS.register("blueberry_jam", () -> new BerryJamItem(FoodList.BLUEBERRY_JAM));
    public static final RegistryObject<Item> LOGANBERRY_JAM = ITEMS.register("loganberry_jam", () -> new BerryJamItem(FoodList.LOGANBERRY_JAM));
    public static final RegistryObject<Item> RED_RASPBERRY_JAM = ITEMS.register("red_raspberry_jam", () -> new BerryJamItem(FoodList.RED_RASPBERRY_JAM));
    public static final RegistryObject<Item> BLACK_RASPBERRY_JAM = ITEMS.register("black_raspberry_jam", () -> new BerryJamItem(FoodList.BLACK_RASPBERRY_JAM));
    public static final RegistryObject<Item> GOLDEN_RASPBERRY_JAM = ITEMS.register("golden_raspberry_jam", () -> new BerryJamItem(FoodList.GOLDEN_RASPBERRY_JAM));
    public static final RegistryObject<Item> WHITE_RASPBERRY_JAM = ITEMS.register("white_raspberry_jam", () -> new BerryJamItem(FoodList.WHITE_RASPBERRY_JAM));
    public static final RegistryObject<Item> MARIONBERRY_JAM = ITEMS.register("marionberry_jam", () -> new BerryJamItem(FoodList.MARIONBERRY_JAM));
    public static final RegistryObject<Item> BLACKCURRANT_JAM = ITEMS.register("blackcurrant_jam", () -> new BerryJamItem(FoodList.BLACKCURRANT_JAM));
    public static final RegistryObject<Item> REDCURRANT_JAM = ITEMS.register("redcurrant_jam", () -> new BerryJamItem(FoodList.REDCURRANT_JAM));
    public static final RegistryObject<Item> HUCKLEBERRY_JAM = ITEMS.register("huckleberry_jam", () -> new BerryJamItem(FoodList.HUCKLEBERRY_JAM));
    public static final RegistryObject<Item> WINEBERRY_JAM = ITEMS.register("wineberry_jam", () -> new BerryJamItem(FoodList.WINEBERRY_JAM));
    public static final RegistryObject<Item> ELDERBERRY_JAM = ITEMS.register("elderberry_jam", () -> new BerryJamItem(FoodList.ELDERBERRY_JAM));
    public static final RegistryObject<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam", () -> new BerryJamItem(FoodList.BLACKBERRY_JAM));
    public static final RegistryObject<Item> BOYSENBERRY_JAM = ITEMS.register("boysenberry_jam", () -> new BerryJamItem(FoodList.BOYSENBERRY_JAM));
    public static final RegistryObject<Item> GROUND_CHERRY_JAM = ITEMS.register("ground_cherry_jam", () -> new BerryJamItem(FoodList.GROUND_CHERRY_JAM));
    public static final RegistryObject<Item> ARONIA_BERRY_JAM = ITEMS.register("aronia_berry_jam", () -> new BerryJamItem(FoodList.ARONIA_BERRY_JAM));
    public static final RegistryObject<Item> SERVICEBERRY_JAM = ITEMS.register("serviceberry_jam", () -> new BerryJamItem(FoodList.SERVICEBERRY_JAM));
    public static final RegistryObject<Item> WONDERBERRY_JAM = ITEMS.register("wonderberry_jam", () -> new BerryJamItem(FoodList.WONDERBERRY_JAM));
    public static final RegistryObject<Item> MULBERRY_JAM = ITEMS.register("mulberry_jam", () -> new BerryJamItem(FoodList.MULBERRY_JAM));
    public static final RegistryObject<Item> LINGONBERRY_JAM = ITEMS.register("lingonberry_jam", () -> new BerryJamItem(FoodList.LINGONBERRY_JAM));
    public static final RegistryObject<Item> CRANBERRY_JAM = ITEMS.register("cranberry_jam", () -> new BerryJamItem(FoodList.CRANBERRY_JAM));
    public static final RegistryObject<Item> DEWBERRY_JAM = ITEMS.register("dewberry_jam", () -> new BerryJamItem(FoodList.DEWBERRY_JAM));
    public static final RegistryObject<Item> THIMBLEBERRY_JAM = ITEMS.register("thimbleberry_jam", () -> new BerryJamItem(FoodList.THIMBLEBERRY_JAM));
    public static final RegistryObject<Item> GOOSEBERRY_JAM = ITEMS.register("gooseberry_jam", () -> new BerryJamItem(FoodList.GOOSEBERRY_JAM));
    public static final RegistryObject<Item> CHOKEBERRY_JAM = ITEMS.register("chokeberry_jam", () -> new BerryJamItem(FoodList.CHOKEBERRY_JAM));
    public static final RegistryObject<Item> OLALLIEBERRY_JAM = ITEMS.register("olallieberry_jam", () -> new BerryJamItem(FoodList.OLALLIEBERRY_JAM));
    public static final RegistryObject<Item> ACEROLA_CHERRY_JAM = ITEMS.register("acerola_cherry_jam", () -> new BerryJamItem(FoodList.ACEROLA_CHERRY_JAM));
    public static final RegistryObject<Item> BARBERRY_JAM = ITEMS.register("barberry_jam", () -> new BerryJamItem(FoodList.BARBERRY_JAM));
    public static final RegistryObject<Item> BAYBERRY_JAM = ITEMS.register("bayberry_jam", () -> new BerryJamItem(FoodList.BAYBERRY_JAM));
    public static final RegistryObject<Item> GOGI_BERRY_JAM = ITEMS.register("gogi_berry_jam", () -> new BerryJamItem(FoodList.GOGI_BERRY_JAM));

    public static final RegistryObject<Item> MASON_JAR = ITEMS.register("mason_jar", () -> new ChrispyModItem());



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

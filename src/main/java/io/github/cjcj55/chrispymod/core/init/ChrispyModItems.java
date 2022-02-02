package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.item.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ChrispyModItems {
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
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.RUBY, 3, -2.4F));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.RUBY, 1.5F, -3.0F));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.RUBY, 1, -2.8F));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.RUBY, 6.0F, -3.2F));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.RUBY, 0, -3.0F));
    public static final RegistryObject<Item> OPAL_SWORD = ITEMS.register("opal_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.OPAL, 3, -2.4F));
    public static final RegistryObject<Item> OPAL_SHOVEL = ITEMS.register("opal_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.OPAL, 1.5F, -3.0F));
    public static final RegistryObject<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.OPAL, 1, -2.8F));
    public static final RegistryObject<Item> OPAL_AXE = ITEMS.register("opal_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.OPAL, 6.0F, -3.2F));
    public static final RegistryObject<Item> OPAL_HOE = ITEMS.register("opal_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.OPAL, 0, -3.0F));
    public static final RegistryObject<Item> TANGERINE_SWORD = ITEMS.register("tangerine_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.TANGERINE, 3, -2.4F));
    public static final RegistryObject<Item> TANGERINE_SHOVEL = ITEMS.register("tangerine_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.TANGERINE, 1.5F, -3.0F));
    public static final RegistryObject<Item> TANGERINE_PICKAXE = ITEMS.register("tangerine_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.TANGERINE, 1, -2.8F));
    public static final RegistryObject<Item> TANGERINE_AXE = ITEMS.register("tangerine_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.TANGERINE, 6.0F, -3.2F));
    public static final RegistryObject<Item> TANGERINE_HOE = ITEMS.register("tangerine_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.TANGERINE, 0, -3.0F));
    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.COBALT, 3, -2.4F));
    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.COBALT, 1.5F, -3.0F));
    public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.COBALT, 1, -2.8F));
    public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.COBALT, 6.0F, -3.2F));
    public static final RegistryObject<Item> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.COBALT, 0, -3.0F));
    public static final RegistryObject<Item> BLUE_EMERALD_SWORD = ITEMS.register("blue_emerald_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.BLUE_EMERALD, 3, -2.4F));
    public static final RegistryObject<Item> BLUE_EMERALD_SHOVEL = ITEMS.register("blue_emerald_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.BLUE_EMERALD, 1.5F, -3.0F));
    public static final RegistryObject<Item> BLUE_EMERALD_PICKAXE = ITEMS.register("blue_emerald_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.BLUE_EMERALD, 1, -2.8F));
    public static final RegistryObject<Item> BLUE_EMERALD_AXE = ITEMS.register("blue_emerald_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.BLUE_EMERALD, 6.0F, -3.2F));
    public static final RegistryObject<Item> BLUE_EMERALD_HOE = ITEMS.register("blue_emerald_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.BLUE_EMERALD, 0, -3.0F));
    public static final RegistryObject<Item> PARYTH_SWORD = ITEMS.register("paryth_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.PARYTH, 3, -2.4F));
    public static final RegistryObject<Item> PARYTH_SHOVEL = ITEMS.register("paryth_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.PARYTH, 1.5F, -3.0F));
    public static final RegistryObject<Item> PARYTH_PICKAXE = ITEMS.register("paryth_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.PARYTH, 1, -2.8F));
    public static final RegistryObject<Item> PARYTH_AXE = ITEMS.register("paryth_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.PARYTH, 6.0F, -3.2F));
    public static final RegistryObject<Item> PARYTH_HOE = ITEMS.register("paryth_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.PARYTH, 0, -3.0F));
    public static final RegistryObject<Item> LIGHTNING_SWORD = ITEMS.register("lightning_sword", () -> new LightningSwordItem(ChrispyModToolTiers.LIGHTNING, 3, -2.4F));
    public static final RegistryObject<Item> LIGHTNING_SHOVEL = ITEMS.register("lightning_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.LIGHTNING, 1.5F, -3.0F));
    public static final RegistryObject<Item> LIGHTNING_PICKAXE = ITEMS.register("lightning_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.LIGHTNING, 1, -2.8F));
    public static final RegistryObject<Item> LIGHTNING_AXE = ITEMS.register("lightning_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.LIGHTNING, 6.0F, -3.2F));
    public static final RegistryObject<Item> LIGHTNING_HOE = ITEMS.register("lightning_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.LIGHTNING, 0, -3.0F));
    public static final RegistryObject<Item> FLAME_SWORD = ITEMS.register("flame_sword", () -> new FlameSwordItem(ChrispyModToolTiers.FLAME, 3, -2.4F));
    public static final RegistryObject<Item> FLAME_SHOVEL = ITEMS.register("flame_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.FLAME, 1.5F, -3.0F));
    public static final RegistryObject<Item> FLAME_PICKAXE = ITEMS.register("flame_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.FLAME, 1, -2.8F));
    public static final RegistryObject<Item> FLAME_AXE = ITEMS.register("flame_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.FLAME, 6.0F, -3.2F));
    public static final RegistryObject<Item> FLAME_HOE = ITEMS.register("flame_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.FLAME, 0, -3.0F));
    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.REDSTONE, 3, -2.4F));
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.REDSTONE, 1.5F, -3.0F));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.REDSTONE, 1, -2.8F));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.REDSTONE, 6.0F, -3.2F));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.REDSTONE, 0, -3.0F));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.EMERALD, 3, -2.4F));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.EMERALD, 1.5F, -3.0F));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.EMERALD, 1, -2.8F));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.EMERALD, 6.0F, -3.2F));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.EMERALD, 0, -3.0F));
    public static final RegistryObject<Item> HONEY_SWORD = ITEMS.register("honey_sword", () -> new ChrispyModSwordItem(ChrispyModToolTiers.HONEY, 3, -2.4F));
    public static final RegistryObject<Item> HONEY_SHOVEL = ITEMS.register("honey_shovel", () -> new ChrispyModShovelItem(ChrispyModToolTiers.HONEY, 1.5F, -3.0F));
    public static final RegistryObject<Item> HONEY_PICKAXE = ITEMS.register("honey_pickaxe", () -> new ChrispyModPickaxeItem(ChrispyModToolTiers.HONEY, 1, -2.8F));
    public static final RegistryObject<Item> HONEY_AXE = ITEMS.register("honey_axe", () -> new ChrispyModAxeItem(ChrispyModToolTiers.HONEY, 6.0F, -3.2F));
    public static final RegistryObject<Item> HONEY_HOE = ITEMS.register("honey_hoe", () -> new ChrispyModHoeItem(ChrispyModToolTiers.HONEY, 0, -3.0F));

// FOOD
    public static final RegistryObject<Item> BLACK_CANDY_CANE = ITEMS.register("black_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.BLACK_CANDY_CANE));
    public static final RegistryObject<Item> BLUE_CANDY_CANE = ITEMS.register("blue_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.BLUE_CANDY_CANE));
    public static final RegistryObject<Item> BROWN_CANDY_CANE = ITEMS.register("brown_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.BROWN_CANDY_CANE));
    public static final RegistryObject<Item> CYAN_CANDY_CANE = ITEMS.register("cyan_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.CYAN_CANDY_CANE));
    public static final RegistryObject<Item> GRAY_CANDY_CANE = ITEMS.register("gray_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.GRAY_CANDY_CANE));
    public static final RegistryObject<Item> GREEN_CANDY_CANE = ITEMS.register("green_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.GREEN_CANDY_CANE));
    public static final RegistryObject<Item> LIGHT_BLUE_CANDY_CANE = ITEMS.register("light_blue_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.LIGHT_BLUE_CANDY_CANE));
    public static final RegistryObject<Item> LIGHT_GRAY_CANDY_CANE = ITEMS.register("light_gray_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.LIGHT_GRAY_CANDY_CANE));
    public static final RegistryObject<Item> LIME_CANDY_CANE = ITEMS.register("lime_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.LIME_CANDY_CANE));
    public static final RegistryObject<Item> MAGENTA_CANDY_CANE = ITEMS.register("magenta_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.MAGENTA_CANDY_CANE));
    public static final RegistryObject<Item> ORANGE_CANDY_CANE = ITEMS.register("orange_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.ORANGE_CANDY_CANE));
    public static final RegistryObject<Item> PINK_CANDY_CANE = ITEMS.register("pink_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.PINK_CANDY_CANE));
    public static final RegistryObject<Item> PURPLE_CANDY_CANE = ITEMS.register("purple_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.PURPLE_CANDY_CANE));
    public static final RegistryObject<Item> RED_CANDY_CANE = ITEMS.register("red_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.RED_CANDY_CANE));
    public static final RegistryObject<Item> WHITE_CANDY_CANE = ITEMS.register("white_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.WHITE_CANDY_CANE));
    public static final RegistryObject<Item> YELLOW_CANDY_CANE = ITEMS.register("yellow_candy_cane", () -> new ChrispyModFoodItem(ChrispyModFoods.YELLOW_CANDY_CANE));
    public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new ChrispyModFoodItem(ChrispyModFoods.COOKED_CARROT));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

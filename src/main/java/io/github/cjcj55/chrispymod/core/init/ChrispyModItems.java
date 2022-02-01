package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ChrispyModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChrispyMod.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> TANGERINE = ITEMS.register("tangerine", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> BLUE_EMERALD = ITEMS.register("blue_emerald", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> PARYTH = ITEMS.register("paryth", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> LIGHTNINNG = ITEMS.register("lightning", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> FLAME = ITEMS.register("flame", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> HELLFIRE = ITEMS.register("hellfire", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> WHITE_DWARF_STAR = ITEMS.register("white_dwarf_star", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> NATURAL_ESSENCE = ITEMS.register("natural_essence", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> HONEY_STICK = ITEMS.register("honey_stick", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));
    public static final RegistryObject<Item> EDIBLE_EXPERIENCE = ITEMS.register("edible_experience", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)));

    // FOOD	
    public static final RegistryObject<Item> BLACK_CANDY_CANE = ITEMS.register("black_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.BLACK_CANDY_CANE)));
    public static final RegistryObject<Item> BLUE_CANDY_CANE = ITEMS.register("blue_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.BLUE_CANDY_CANE)));
    public static final RegistryObject<Item> BROWN_CANDY_CANE = ITEMS.register("brown_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.BROWN_CANDY_CANE)));
    public static final RegistryObject<Item> CYAN_CANDY_CANE = ITEMS.register("cyan_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.CYAN_CANDY_CANE)));
    public static final RegistryObject<Item> GRAY_CANDY_CANE = ITEMS.register("gray_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.GRAY_CANDY_CANE)));
    public static final RegistryObject<Item> GREEN_CANDY_CANE = ITEMS.register("green_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.GREEN_CANDY_CANE)));
    public static final RegistryObject<Item> LIGHT_BLUE_CANDY_CANE = ITEMS.register("light_blue_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.LIGHT_BLUE_CANDY_CANE)));
    public static final RegistryObject<Item> LIGHT_GRAY_CANDY_CANE = ITEMS.register("light_gray_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.LIGHT_GRAY_CANDY_CANE)));
    public static final RegistryObject<Item> LIME_CANDY_CANE = ITEMS.register("lime_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.LIME_CANDY_CANE)));
    public static final RegistryObject<Item> MAGENTA_CANDY_CANE = ITEMS.register("magenta_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.MAGENTA_CANDY_CANE)));
    public static final RegistryObject<Item> ORANGE_CANDY_CANE = ITEMS.register("orange_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.ORANGE_CANDY_CANE)));
    public static final RegistryObject<Item> PINK_CANDY_CANE = ITEMS.register("pink_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.PINK_CANDY_CANE)));
    public static final RegistryObject<Item> PURPLE_CANDY_CANE = ITEMS.register("purple_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.PURPLE_CANDY_CANE)));
    public static final RegistryObject<Item> RED_CANDY_CANE = ITEMS.register("red_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.RED_CANDY_CANE)));
    public static final RegistryObject<Item> WHITE_CANDY_CANE = ITEMS.register("white_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.WHITE_CANDY_CANE)));
    public static final RegistryObject<Item> YELLOW_CANDY_CANE = ITEMS.register("yellow_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.YELLOW_CANDY_CANE)));
    public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(ChrispyModFoods.COOKED_CARROT)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

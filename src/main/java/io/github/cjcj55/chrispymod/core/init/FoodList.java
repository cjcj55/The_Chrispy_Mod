package io.github.cjcj55.chrispymod.core.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodList {
    // Candy Canes
    public static final FoodProperties BLACK_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties BLUE_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties BROWN_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties CYAN_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties GRAY_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 200, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties GREEN_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties LIGHT_BLUE_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties LIGHT_GRAY_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties LIME_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties MAGENTA_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HARM, 100, 4), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties ORANGE_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.GLOWING, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties PINK_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 2), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties PURPLE_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties RED_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HEAL, 100, 1), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties WHITE_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 5), 1.0f).alwaysEat().fast().build());
    public static final FoodProperties YELLOW_CANDY_CANE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 100, 1), 1.0f).alwaysEat().fast().build());

    // Carrot
    public static final FoodProperties COOKED_CARROT = (new FoodProperties.Builder().nutrition(4).saturationMod(4.0f).build());

    // Honey Stick
    public static final FoodProperties HONEY_STICK = (new FoodProperties.Builder().nutrition(3).saturationMod(0.6f).fast().build());
}

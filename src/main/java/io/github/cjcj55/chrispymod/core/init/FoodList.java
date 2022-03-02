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

    // Berries
    public static final FoodProperties STRAWBERRY = berry(2).build();
    public static final FoodProperties BLUEBERRY = berry(2).build();
    public static final FoodProperties LOGANBERRY = berry(2).build();
    public static final FoodProperties RED_RASPBERRY = berry(2).build();
    public static final FoodProperties BLACK_RASPBERRY = berry(2).build();
    public static final FoodProperties GOLDEN_RASPBERRY = berry(2).build();
    public static final FoodProperties WHITE_RASPBERRY = berry(2).build();
    public static final FoodProperties MARIONBERRY = berry(2).build();
    public static final FoodProperties BLACKCURRANT = berry(2).build();
    public static final FoodProperties REDCURRANT = berry(2).build();
    public static final FoodProperties HUCKLEBERRY = berry(2).build();
    public static final FoodProperties WINEBERRY = berry(2).build();
    public static final FoodProperties ELDERBERRY = berry(2).build();
    public static final FoodProperties BLACKBERRY = berry(2).build();
    public static final FoodProperties BOYSENBERRY = berry(2).build();
    public static final FoodProperties GROUND_CHERRY = berry(2).build();
    public static final FoodProperties ARONIA_BERRY = berry(2).build();
    public static final FoodProperties SERVICEBERRY = berry(2).build();
    public static final FoodProperties WONDERBERRY = berry(2).build();
    public static final FoodProperties MULBERRY = berry(2).build();
    public static final FoodProperties LINGONBERRY = berry(2).build();
    public static final FoodProperties CRANBERRY = berry(2).build();
    public static final FoodProperties DEWBERRY = berry(2).build();
    public static final FoodProperties THIMBLEBERRY = berry(2).build();
    public static final FoodProperties GOOSEBERRY = berry(2).build();
    public static final FoodProperties CHOKEBERRY = berry(2).build();
    public static final FoodProperties OLALLIEBERRY = berry(2).build();
    public static final FoodProperties ACEROLA_CHERRY = berry(2).build();
    public static final FoodProperties BARBERRY = berry(2).build();
    public static final FoodProperties BAYBERRY = berry(2).build();
    public static final FoodProperties GOGI_BERRY = berry(2).build();

    public static final FoodProperties STRAWBERRY_JAM = berry(5).build();
    public static final FoodProperties BLUEBERRY_JAM = berry(5).build();
    public static final FoodProperties LOGANBERRY_JAM = berry(5).build();
    public static final FoodProperties RED_RASPBERRY_JAM = berry(5).build();
    public static final FoodProperties BLACK_RASPBERRY_JAM = berry(5).build();
    public static final FoodProperties GOLDEN_RASPBERRY_JAM = berry(5).build();
    public static final FoodProperties WHITE_RASPBERRY_JAM = berry(5).build();
    public static final FoodProperties MARIONBERRY_JAM = berry(5).build();
    public static final FoodProperties BLACKCURRANT_JAM = berry(5).build();
    public static final FoodProperties REDCURRANT_JAM = berry(5).build();
    public static final FoodProperties HUCKLEBERRY_JAM = berry(5).build();
    public static final FoodProperties WINEBERRY_JAM = berry(5).build();
    public static final FoodProperties ELDERBERRY_JAM = berry(5).build();
    public static final FoodProperties BLACKBERRY_JAM = berry(5).build();
    public static final FoodProperties BOYSENBERRY_JAM = berry(5).build();
    public static final FoodProperties GROUND_CHERRY_JAM = berry(5).build();
    public static final FoodProperties ARONIA_BERRY_JAM = berry(5).build();
    public static final FoodProperties SERVICEBERRY_JAM = berry(5).build();
    public static final FoodProperties WONDERBERRY_JAM = berry(5).build();
    public static final FoodProperties MULBERRY_JAM = berry(5).build();
    public static final FoodProperties LINGONBERRY_JAM = berry(5).build();
    public static final FoodProperties CRANBERRY_JAM = berry(5).build();
    public static final FoodProperties DEWBERRY_JAM = berry(5).build();
    public static final FoodProperties THIMBLEBERRY_JAM = berry(5).build();
    public static final FoodProperties GOOSEBERRY_JAM = berry(5).build();
    public static final FoodProperties CHOKEBERRY_JAM = berry(5).build();
    public static final FoodProperties OLALLIEBERRY_JAM = berry(5).build();
    public static final FoodProperties ACEROLA_CHERRY_JAM = berry(5).build();
    public static final FoodProperties BARBERRY_JAM = berry(5).build();
    public static final FoodProperties BAYBERRY_JAM = berry(5).build();
    public static final FoodProperties GOGI_BERRY_JAM = berry(5).build();

    private static FoodProperties.Builder berry(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.1F).fast();
    }
}

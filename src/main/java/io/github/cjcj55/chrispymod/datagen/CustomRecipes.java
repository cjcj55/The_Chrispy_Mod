/*package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.core.init.ItemInit;
import io.github.cjcj55.chrispymod.datagen.builder.AlloyFurnaceRecipeBuilder;
import io.github.cjcj55.chrispymod.datagen.builder.JamAndJellyMakerRecipeBuilder;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class CustomRecipes {
    public static void register(Consumer<FinishedRecipe> consumer) {
        buildJamAndJellyMakerRecipes(consumer);
        buildAlloyFurnaceRecipes(consumer);
    }

    public static void buildJamAndJellyMakerRecipes(Consumer<FinishedRecipe> consumer) {
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.STRAWBERRY_JAM.get(), 1).addIngredient(ItemInit.STRAWBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.BLUEBERRY_JAM.get(), 1).addIngredient(ItemInit.BLUEBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.LOGANBERRY_JAM.get(), 1).addIngredient(ItemInit.LOGANBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.RED_RASPBERRY_JAM.get(), 1).addIngredient(ItemInit.RED_RASPBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.BLACK_RASPBERRY_JAM.get(), 1).addIngredient(ItemInit.BLACK_RASPBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.GOLDEN_RASPBERRY_JAM.get(), 1).addIngredient(ItemInit.GOLDEN_RASPBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.WHITE_RASPBERRY_JAM.get(), 1).addIngredient(ItemInit.WHITE_RASPBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.MARIONBERRY_JAM.get(), 1).addIngredient(ItemInit.MARIONBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.BLACKCURRANT_JAM.get(), 1).addIngredient(ItemInit.BLACKCURRANT.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.REDCURRANT_JAM.get(), 1).addIngredient(ItemInit.REDCURRANT.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.HUCKLEBERRY_JAM.get(), 1).addIngredient(ItemInit.HUCKLEBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.WINEBERRY_JAM.get(), 1).addIngredient(ItemInit.WINEBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.ELDERBERRY_JAM.get(), 1).addIngredient(ItemInit.ELDERBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.BLACKBERRY_JAM.get(), 1).addIngredient(ItemInit.BLACKBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.BOYSENBERRY_JAM.get(), 1).addIngredient(ItemInit.BOYSENBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.GROUND_CHERRY_JAM.get(), 1).addIngredient(ItemInit.GROUND_CHERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.ARONIA_BERRY_JAM.get(), 1).addIngredient(ItemInit.ARONIA_BERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.SERVICEBERRY_JAM.get(), 1).addIngredient(ItemInit.SERVICEBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.WONDERBERRY_JAM.get(), 1).addIngredient(ItemInit.WONDERBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.MULBERRY_JAM.get(), 1).addIngredient(ItemInit.MULBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.LINGONBERRY_JAM.get(), 1).addIngredient(ItemInit.LINGONBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.CRANBERRY_JAM.get(), 1).addIngredient(ItemInit.CRANBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.DEWBERRY_JAM.get(), 1).addIngredient(ItemInit.DEWBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.THIMBLEBERRY_JAM.get(), 1).addIngredient(ItemInit.THIMBLEBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.GOOSEBERRY_JAM.get(), 1).addIngredient(ItemInit.GOOSEBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.CHOKEBERRY_JAM.get(), 1).addIngredient(ItemInit.CHOKEBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.OLALLIEBERRY_JAM.get(), 1).addIngredient(ItemInit.OLALLIEBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.ACEROLA_CHERRY_JAM.get(), 1).addIngredient(ItemInit.ACEROLA_CHERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.BARBERRY_JAM.get(), 1).addIngredient(ItemInit.BARBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.BAYBERRY_JAM.get(), 1).addIngredient(ItemInit.BAYBERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
        JamAndJellyMakerRecipeBuilder.jamAndJellyMakerRecipe(ItemInit.GOGI_BERRY_JAM.get(), 1).addIngredient(ItemInit.GOGI_BERRY.get(), 6).addIngredient(Items.SUGAR).addIngredient(ItemInit.MASON_JAR.get()).build(consumer);
    }

    public static void buildAlloyFurnaceRecipes(Consumer<FinishedRecipe> consumer) {
        AlloyFurnaceRecipeBuilder.alloyFurnaceRecipe(ItemInit.BLUE_EMERALD.get(), 1, 500, 0.5f).addIngredient(Items.DIAMOND).addIngredient(Items.EMERALD).build(consumer);
    }
}*/

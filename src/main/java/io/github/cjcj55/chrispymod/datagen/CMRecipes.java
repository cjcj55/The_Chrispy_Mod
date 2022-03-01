package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class CMRecipes extends RecipeProvider {

    public CMRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(ItemInit.MASON_JAR.get())
                .pattern("x x")
                .pattern("xxx")
                .define('x', Tags.Items.GLASS_PANES)
                .group("chrispymod")
                .unlockedBy("glass_panes", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GLASS_PANE))
                .save(consumer);

        /*ShapedRecipeBuilder.shaped(Registration.GENERATOR.get())
                .pattern("mxm")
                .pattern("x#x")
                .pattern("#x#")
                .define('x', Tags.Items.GEMS_DIAMOND)
                .define('#', Tags.Items.INGOTS_IRON)
                .define('m', Registration.MYSTERIOUS_INGOT.get())
                .group("tutorialv3")
                .unlockedBy("mysterious", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.MYSTERIOUS_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Registration.POWERGEN.get())
                .pattern("mmm")
                .pattern("x#x")
                .pattern("#x#")
                .define('x', Tags.Items.DUSTS_REDSTONE)
                .define('#', Tags.Items.INGOTS_IRON)
                .define('m', Registration.MYSTERIOUS_INGOT.get())
                .group("tutorialv3")
                .unlockedBy("mysterious", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.MYSTERIOUS_INGOT.get()))
                .save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.MYSTERIOUS_ORE_ITEM),
                        Registration.MYSTERIOUS_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.MYSTERIOUS_ORE_ITEM))
                .save(consumer, "mysterious_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_MYSTERIOUS_CHUNK.get()),
                        Registration.MYSTERIOUS_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_MYSTERIOUS_CHUNK.get()))
                .save(consumer, "mysterious_ingot2");*/
    }
}

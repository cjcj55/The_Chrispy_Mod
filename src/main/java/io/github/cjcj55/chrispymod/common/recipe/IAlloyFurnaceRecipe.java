package io.github.cjcj55.chrispymod.common.recipe;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public interface IAlloyFurnaceRecipe extends Recipe<SimpleContainer> {
    ResourceLocation TYPE_ID = new ResourceLocation(ChrispyMod.MODID, "alloy_smelting");

    @Override
    default RecipeType<?> getType() {
        return Registry.RECIPE_TYPE.getOptional(TYPE_ID).get();
    }

    default boolean canFit(int width, int height) {
        return true;
    }

    default boolean isDynamic() {
        return true;
    }
}

package io.github.cjcj55.chrispymod.integration.jei;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.recipe.AlloyFurnaceRecipe;
import io.github.cjcj55.chrispymod.common.recipe.JamAndJellyMakerRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class ChrispyModJei implements IModPlugin {
    public static RecipeType<AlloyFurnaceRecipe> ALLOY_SMELTING_TYPE = new RecipeType<>(AlloyFurnaceRecipeCategory.UID, AlloyFurnaceRecipe.class);
    public static RecipeType<JamAndJellyMakerRecipe> JAM_AND_JELLY_MAKING_TYPE = new RecipeType<>(JamAndJellyMakerRecipeCategory.UID, JamAndJellyMakerRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ChrispyMod.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new AlloyFurnaceRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new JamAndJellyMakerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<AlloyFurnaceRecipe> alloyFurnaceRecipes = rm.getAllRecipesFor(AlloyFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(ALLOY_SMELTING_TYPE, alloyFurnaceRecipes);

        List<JamAndJellyMakerRecipe> jamAndJellyMakerRecipes = rm.getAllRecipesFor(JamAndJellyMakerRecipe.Type.INSTANCE);
        registration.addRecipes(JAM_AND_JELLY_MAKING_TYPE, jamAndJellyMakerRecipes);
    }
}

package github.cjcj55.chrispymod.integration.jei;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.client.screen.AlloyFurnaceScreen;
import github.cjcj55.chrispymod.client.screen.JamAndJellyMakerScreen;
import github.cjcj55.chrispymod.recipe.AlloyFurnaceRecipe;
import github.cjcj55.chrispymod.recipe.JamAndJellyMakerRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class ChrispyModJEIPlugin implements IModPlugin {
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
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<AlloyFurnaceRecipe> alloyFurnaceRecipes = recipeManager.getAllRecipesFor(AlloyFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE, alloyFurnaceRecipes);

        List<JamAndJellyMakerRecipe> jamAndJellyMakerRecipes = recipeManager.getAllRecipesFor(JamAndJellyMakerRecipe.Type.INSTANCE);
        registration.addRecipes(JamAndJellyMakerRecipeCategory.JAM_AND_JELLY_MAKER_TYPE, jamAndJellyMakerRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(AlloyFurnaceScreen.class, 83, 22, 27, 37, AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE);
        registration.addRecipeClickArea(JamAndJellyMakerScreen.class, 94, 31, 20, 10, JamAndJellyMakerRecipeCategory.JAM_AND_JELLY_MAKER_TYPE);
    }
}

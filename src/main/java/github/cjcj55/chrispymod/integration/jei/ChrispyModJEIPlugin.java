package github.cjcj55.chrispymod.integration.jei;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.client.screen.AlloyFurnaceScreen;
import github.cjcj55.chrispymod.recipe.AlloyFurnaceRecipe;
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
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<AlloyFurnaceRecipe> alloyFurnaceRecipes = recipeManager.getAllRecipesFor(AlloyFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE, alloyFurnaceRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(AlloyFurnaceScreen.class, 83, 22, 27, 37, AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE);
    }
}

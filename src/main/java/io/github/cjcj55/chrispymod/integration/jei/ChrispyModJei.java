package io.github.cjcj55.chrispymod.integration.jei;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.recipe.AlloyFurnaceRecipe;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IIngredientManager;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@JeiPlugin
public class ChrispyModJei implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ChrispyMod.MODID, "jei_plugin");
    }

    private static final Minecraft MC = Minecraft.getInstance();

    private static List<Recipe<?>> findRecipesByType(RecipeType<?> type) {
        return MC.level
                .getRecipeManager()
                .getRecipes()
                .stream()
                .filter(r -> r.getType() == type)
                .collect(Collectors.toList());
    }

    public IIngredientManager ingredientManager;

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new AlloyFurnaceRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(findRecipesByType(AlloyFurnaceRecipe.Type.INSTANCE), AlloyFurnaceRecipeCategory.UID);

        //ingredientManager = registration.getIngredientManager();
        //RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        //registration.addRecipes(rm.getAllRecipesFor(AlloyFurnaceRecipe.Type.INSTANCE).stream().filter(r -> r instanceof AlloyFurnaceRecipe).collect(Collectors.toList()), AlloyFurnaceRecipeCategory.UID);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(BlockInit.ALLOY_FURNACE.get().asItem()), AlloyFurnaceRecipeCategory.UID);
    }
}

package io.github.cjcj55.chrispymod.integration.jei;

import com.mojang.blaze3d.vertex.PoseStack;
import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.recipe.AlloyFurnaceRecipe;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@SuppressWarnings("all")
public class AlloyFurnaceRecipeCategory implements IRecipeCategory<AlloyFurnaceRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(ChrispyMod.MODID, "alloy_smelting");
    public static final ResourceLocation TEXTURE = new ResourceLocation(ChrispyMod.MODID, "textures/gui/alloy_furnace_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawableStatic flame;

    public AlloyFurnaceRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(new ItemStack(BlockInit.ALLOY_FURNACE.get()));
        this.flame = helper.createDrawable(TEXTURE, 176, 0, 14, 14);
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends AlloyFurnaceRecipe> getRecipeClass() {
        return AlloyFurnaceRecipe.class;
    }

    @Override
    public Component getTitle() {
        return BlockInit.ALLOY_FURNACE.get().getName();
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setIngredients(AlloyFurnaceRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getResultItem());
    }

    /*@Override
    public void setRecipe(IRecipeLayoutBuilder builder, AlloyFurnaceRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 18, 50).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 66, 16).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 66, 50).addIngredients(recipe.getIngredients().get(2));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 114, 33).addItemStack(recipe.getResultItem());
    }*/

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, AlloyFurnaceRecipe recipe, IIngredients ingredients) {
        recipeLayout.getItemStacks().init(0, true, 18, 50);
        recipeLayout.getItemStacks().init(1, true, 66, 16);
        recipeLayout.getItemStacks().init(2, true, 66, 50);
        recipeLayout.getItemStacks().init(3, false, 114, 33);
        recipeLayout.getItemStacks().set(ingredients);
    }

    @Override
    public void draw(AlloyFurnaceRecipe recipe, PoseStack stack, double mouseX, double mouseY) {
        this.flame.draw(stack, 20, 35);
    }
}

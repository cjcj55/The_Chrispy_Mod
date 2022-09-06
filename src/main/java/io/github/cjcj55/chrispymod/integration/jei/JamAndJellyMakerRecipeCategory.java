package io.github.cjcj55.chrispymod.integration.jei;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.recipe.JamAndJellyMakerRecipe;
import io.github.cjcj55.chrispymod.core.init.BlockInit;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class JamAndJellyMakerRecipeCategory implements IRecipeCategory<JamAndJellyMakerRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(ChrispyMod.MODID, "jam_and_jelly_making");
    public static final ResourceLocation TEXTURE = new ResourceLocation(ChrispyMod.MODID, "textures/gui/jam_and_jelly_maker_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public JamAndJellyMakerRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BlockInit.JAM_AND_JELLY_MAKER.get()));
    }

    @Override
    public RecipeType<JamAndJellyMakerRecipe> getRecipeType() {
        return ChrispyModJei.JAM_AND_JELLY_MAKING_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("container." + ChrispyMod.MODID + ".jam_and_jelly_maker");
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
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull JamAndJellyMakerRecipe recipe, @Nonnull IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 40, 19).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 58, 19).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 76, 19).addIngredients(recipe.getIngredients().get(2));
        builder.addSlot(RecipeIngredientRole.INPUT, 40, 37).addIngredients(recipe.getIngredients().get(3));
        builder.addSlot(RecipeIngredientRole.INPUT, 58, 37).addIngredients(recipe.getIngredients().get(4));
        builder.addSlot(RecipeIngredientRole.INPUT, 76, 37).addIngredients(recipe.getIngredients().get(5));
        builder.addSlot(RecipeIngredientRole.INPUT, 113, 63).addIngredients(recipe.getIngredients().get(6));
        builder.addSlot(RecipeIngredientRole.INPUT, 131, 63).addIngredients(recipe.getIngredients().get(7));
        //builder.addSlot(RecipeIngredientRole.INPUT, 66, 50).addIngredients(recipe.getIngredients().get(2));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 117, 29).addItemStack(recipe.getResultItem());
    }
}

package github.cjcj55.chrispymod.integration.jei;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.recipe.AlloyFurnaceRecipe;
import github.cjcj55.chrispymod.registry.CMBlocks;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class AlloyFurnaceRecipeCategory extends AlloyFurnaceVariantCategory implements IRecipeCategory<AlloyFurnaceRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(ChrispyMod.MODID, "alloy_furnace_smelting");
    public static final ResourceLocation TEXTURE = new ResourceLocation(ChrispyMod.MODID, "textures/gui/alloy_furnace_gui.png");

    public static final RecipeType<AlloyFurnaceRecipe> ALLOY_FURNACE_TYPE = new RecipeType<>(UID, AlloyFurnaceRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;
    private IDrawableStatic flame;

    public AlloyFurnaceRecipeCategory(IGuiHelper helper) {
        super(helper);

        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(CMBlocks.ALLOY_FURNACE.get()));
        this.flame = helper.createDrawable(TEXTURE, 176, 0, 14, 14);
    }

    @Override
    public RecipeType<AlloyFurnaceRecipe> getRecipeType() {
        return ALLOY_FURNACE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("container." + ChrispyMod.MODID + ".alloy_furnace");
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
    public void draw(AlloyFurnaceRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        animatedFlame.draw(guiGraphics, 19, 34);

        animatedArrow.draw(guiGraphics, 84, 22);
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AlloyFurnaceRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 66, 16).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 66, 50).addIngredients(recipe.getIngredients().get(1));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 114, 33).addItemStack(recipe.getResultItem(null));
    }
}

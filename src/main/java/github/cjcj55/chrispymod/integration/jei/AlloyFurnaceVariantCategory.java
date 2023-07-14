package github.cjcj55.chrispymod.integration.jei;

import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.category.IRecipeCategory;

public abstract class AlloyFurnaceVariantCategory {
    protected final IDrawableStatic staticFlame;
    protected final IDrawableAnimated animatedFlame;

    protected final IDrawableStatic staticArrow;
    protected final IDrawableAnimated animatedArrow;

    public AlloyFurnaceVariantCategory(IGuiHelper guiHelper) {
        staticFlame = guiHelper.createDrawable(AlloyFurnaceRecipeCategory.TEXTURE, 176, 0, 14, 14);
        animatedFlame = guiHelper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);

        staticArrow = guiHelper.createDrawable(AlloyFurnaceRecipeCategory.TEXTURE, 176, 14, 26, 36);
                animatedArrow = guiHelper.createAnimatedDrawable(staticArrow, 200, IDrawableAnimated.StartDirection.LEFT, false);

    }
}
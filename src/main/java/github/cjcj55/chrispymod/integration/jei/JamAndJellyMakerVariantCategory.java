package github.cjcj55.chrispymod.integration.jei;

import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;

public class JamAndJellyMakerVariantCategory {
    protected final IDrawableStatic staticFlame;
    protected final IDrawableAnimated animatedFlame;
    protected final IDrawableStatic staticArrow;
    protected final IDrawableAnimated animatedArrow;

    public JamAndJellyMakerVariantCategory(IGuiHelper guiHelper) {
        staticFlame = guiHelper.createDrawable(JamAndJellyMakerRecipeCategory.TEXTURE, 176, 0, 14, 14);
        animatedFlame = guiHelper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);

        staticArrow = guiHelper.createDrawable(JamAndJellyMakerRecipeCategory.TEXTURE, 176, 14, 20, 10);
        animatedArrow = guiHelper.createAnimatedDrawable(staticArrow, 200, IDrawableAnimated.StartDirection.LEFT, false);
    }
}

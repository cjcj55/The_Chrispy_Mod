package io.github.cjcj55.chrispymod.client.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class JamAndJellyMakerScreen extends AbstractContainerScreen<JamAndJellyMakerMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(ChrispyMod.MODID, "textures/gui/jam_and_jelly_maker_gui.png");

    public JamAndJellyMakerScreen(JamAndJellyMakerMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTicks, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);

        if(menu.isCrafting()) {
            blit(pPoseStack, x + 94, y + 31, 176, 14, menu.getScaledProgress(), 10);
        }

        if(menu.hasFuel()) {
            blit(pPoseStack, x + 9, y + 20 + 14 - menu.getScaledFuelProgress(), 176,
                    14 - menu.getScaledFuelProgress(), 14, menu.getScaledFuelProgress());
        }
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}

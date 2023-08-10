package github.cjcj55.chrispymod.entity.client;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.entity.SandyCowEntity;
import github.cjcj55.chrispymod.entity.layers.CMModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SandyCowRenderer extends MobRenderer<SandyCowEntity, SandyCowModel<SandyCowEntity>> {
    private static final ResourceLocation SANDY_COW_LOCATION = new ResourceLocation(ChrispyMod.MODID, "textures/entity/sandy_cow.png");

    public SandyCowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SandyCowModel<>(pContext.bakeLayer(CMModelLayers.SANDY_COW_LAYER)), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(SandyCowEntity pEntity) {
        return SANDY_COW_LOCATION;
    }
}
package github.cjcj55.chrispymod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import github.cjcj55.chrispymod.entity.SandyCowEntity;
import github.cjcj55.chrispymod.entity.animations.SandyCowAnimationDefinitions;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class SandyCowModel<T extends SandyCowEntity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sandycowmodel"), "main");
    private final ModelPart sandyCow;
    private final ModelPart head;

    public SandyCowModel(ModelPart root) {
        this.sandyCow = root.getChild("sandycow");
        this.head = sandyCow.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition sandycow = partdefinition.addOrReplaceChild("sandycow", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition head = sandycow.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(22, 0).addBox(5.0F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 0).addBox(4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 0).addBox(-5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 0).addBox(-6.0F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, -8.0F));

        PartDefinition body = sandycow.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 4).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(52, 0).addBox(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition leg1 = sandycow.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -12.0F, 7.0F));

        PartDefinition leg2 = sandycow.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -12.0F, 7.0F));

        PartDefinition leg3 = sandycow.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -12.0F, -6.0F));

        PartDefinition leg4 = sandycow.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -12.0F, -6.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(SandyCowEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

        this.animateWalk(SandyCowAnimationDefinitions.SANDY_COW_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);

        this.animate(entity.flyAnimationState, SandyCowAnimationDefinitions.SANDY_COW_FLY, ageInTicks, 1f);
    }

    private void applyHeadRotation(SandyCowEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        sandyCow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return sandyCow;
    }
}
package donut.rappincreepers.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import donut.rappincreepers.client.model.RappingCreeperModel;
import donut.rappincreepers.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.units.qual.C;

public class HeldClockLayer extends RenderLayer<Creeper, RappingCreeperModel<Creeper>> {
    private final ItemRenderer itemRenderer;

    public HeldClockLayer(RenderLayerParent<Creeper, RappingCreeperModel<Creeper>> parent, ItemRenderer itemRenderer) {
        super(parent);
        this.itemRenderer = itemRenderer;
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, Creeper entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float newHeadYaw, float headPitch) {
        poseStack.pushPose();

        this.getParentModel().getClockHolder().translateAndRotate(poseStack);

        poseStack.mulPose(Axis.XP.rotationDegrees(180.0F));
        poseStack.translate(-0.05D, -0.75D, 0.3D);

        ItemStack itemStack = new ItemStack(ModItems.CREEPER_CLOCK.get());
        itemRenderer.renderStatic(itemStack, ItemDisplayContext.FIXED, packedLight, OverlayTexture.NO_OVERLAY, poseStack, buffer, entity.level(), entity.getId());

        poseStack.popPose();
    }
}

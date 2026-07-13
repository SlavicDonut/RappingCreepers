package donut.rappincreepers.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import donut.rappincreepers.RappingCreepers;
import donut.rappincreepers.client.model.RappingCreeperModel;
import donut.rappincreepers.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class RappingCreeperRenderer extends MobRenderer<Creeper, RappingCreeperModel<Creeper>> {

    public static final ResourceLocation RAPPING_CREEPER_LOCATION =
            ResourceLocation.fromNamespaceAndPath(RappingCreepers.MODID, "textures/entity/creeper/rapping_creeper.png");

    public RappingCreeperRenderer(EntityRendererProvider.Context context) {
        super(context, new RappingCreeperModel<>(context.bakeLayer(RappingCreeperModel.LAYER_LOCATION)), 0.5f);
        this.addLayer(new HeldClockLayer(this, context.getItemRenderer()));
    }

    @Override
    public ResourceLocation getTextureLocation(Creeper entity) {
        return RAPPING_CREEPER_LOCATION;
    }

    @Override
    public void render(Creeper entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}

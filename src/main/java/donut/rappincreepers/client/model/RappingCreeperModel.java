package donut.rappincreepers.client.model;// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class RappingCreeperModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rappingcreepers", "rapping_creeper"), "main");
	private final ModelPart body;
	private final ModelPart clock;
	private final ModelPart clockHolder;
	private final ModelPart head;
	private final ModelPart rightHindLeg;
	private final ModelPart leftHindLeg;
	private final ModelPart rightFrontLeg;
	private final ModelPart leftFrontLeg;

	public ModelPart getClockHolder() {
		return this.clockHolder;
	}

	public RappingCreeperModel(ModelPart root) {
		this.body = root.getChild("body");
		this.clock = this.body.getChild("clock");
		this.clockHolder = this.clock.getChild("clock_holder");
		this.head = this.body.getChild("head");
		this.rightHindLeg = this.body.getChild("right_hind_leg");
		this.leftHindLeg = this.body.getChild("left_hind_leg");
		this.rightFrontLeg = this.body.getChild("right_front_leg");
		this.leftFrontLeg = this.body.getChild("left_front_leg");
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, int color) {
		super.renderToBuffer(poseStack, buffer, packedLight, packedOverlay, color);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -18.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition clock = body.addOrReplaceChild("clock", CubeListBuilder.create(), PartPose.offset(-1.0F, -12.5F, -5.0F));

		PartDefinition link_r1 = clock.addOrReplaceChild("link_r1", CubeListBuilder.create().texOffs(51, 5).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(51, 5).addBox(-10.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -2.5F, 2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition link_r2 = clock.addOrReplaceChild("link_r2", CubeListBuilder.create().texOffs(51, 6).addBox(0.0F, -1.0F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -2.5F, 1.0F, -1.5708F, -1.5708F, 0.0F));

		PartDefinition link_r3 = clock.addOrReplaceChild("link_r3", CubeListBuilder.create().texOffs(51, 6).addBox(0.0F, -1.0F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -2.5F, 1.0F, -1.5708F, -1.5708F, 0.0F));

		PartDefinition link_r4 = clock.addOrReplaceChild("link_r4", CubeListBuilder.create().texOffs(51, 5).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.5F, 9.0F, -1.5708F, 3.1416F, 0.0F));

		PartDefinition link_r5 = clock.addOrReplaceChild("link_r5", CubeListBuilder.create().texOffs(51, 5).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -4.5F, 10.0F, -1.5708F, 1.5708F, 0.0F));

		PartDefinition link_r6 = clock.addOrReplaceChild("link_r6", CubeListBuilder.create().texOffs(51, -3).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -4.5F, 9.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition link_r7 = clock.addOrReplaceChild("link_r7", CubeListBuilder.create().texOffs(51, -3).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -4.5F, 10.0F, -1.5708F, 1.5708F, 0.0F));

		PartDefinition link_r8 = clock.addOrReplaceChild("link_r8", CubeListBuilder.create().texOffs(58, -2).addBox(0.0F, -1.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(58, -2).addBox(-10.0F, -1.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -3.5F, 5.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition link_r9 = clock.addOrReplaceChild("link_r9", CubeListBuilder.create().texOffs(51, 0).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.5F, 10.0F, 1.5708F, -1.5708F, 0.0F));

		PartDefinition link_r10 = clock.addOrReplaceChild("link_r10", CubeListBuilder.create().texOffs(58, -2).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -3.0F, 3.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition link_r11 = clock.addOrReplaceChild("link_r11", CubeListBuilder.create().texOffs(58, -2).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -3.0F, 3.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition link_r12 = clock.addOrReplaceChild("link_r12", CubeListBuilder.create().texOffs(58, -2).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.0F, 7.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition link_r13 = clock.addOrReplaceChild("link_r13", CubeListBuilder.create().texOffs(58, -2).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -4.0F, 7.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition link_r14 = clock.addOrReplaceChild("link_r14", CubeListBuilder.create().texOffs(58, -2).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -4.5F, 10.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition link_r15 = clock.addOrReplaceChild("link_r15", CubeListBuilder.create().texOffs(58, -2).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -4.5F, 10.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition clock_holder = clock.addOrReplaceChild("clock_holder", CubeListBuilder.create(), PartPose.offset(1.0F, -1.0F, 1.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition right_hind_leg = body.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, 4.0F));

		PartDefinition left_hind_leg = body.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -6.0F, 4.0F));

		PartDefinition right_front_leg = body.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, -4.0F));

		PartDefinition left_front_leg = body.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -6.0F, -4.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw * (float) (Math.PI / 180.0);
		this.head.xRot = headPitch * (float) (Math.PI / 180.0);
		this.rightHindLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftHindLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.rightFrontLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.leftFrontLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}

	@Override
	public ModelPart root() {return this.body;}


}
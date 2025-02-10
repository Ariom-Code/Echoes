package net.ariom.echoes.item.armor.client.model;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class ExplorerArmorModel extends ArmorModel {

	public ExplorerArmorModel(ModelPart root) {
        super(root);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(34, 80).addBox(-2.0F, -2.7F, -6.0F, 4.0F, 4.0F, 2.0F, NULL_DEFORM)
		.texOffs(32, 120).addBox(-5.0F, -4.0F, -3.0F, 10.0F, 4.0F, 4.0F, NULL_DEFORM)
		.texOffs(32, 114).addBox(-5.0F, -5.0F, 1.0F, 10.0F, 2.0F, 4.0F, NULL_DEFORM), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-1.0F, -3.4F, -6.0F, 5.0F, 4.0F, 2.0F, NULL_DEFORM).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.1239F, -0.3736F, -0.3289F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 76).addBox(-4.0F, -3.4F, -6.0F, 5.0F, 4.0F, 2.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.1239F, 0.3736F, 0.3289F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-8.2F, -7.8F, -9.0F, 14.0F, 2.0F, 16.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.1013F, 0.0F, 1.6237F, 0.0873F, 0.0F, 0.2182F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 31).addBox(-3.0F, -1.5F, -4.0F, 6.0F, 3.0F, 11.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, -9.5F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 18).addBox(-5.0F, -1.5F, -5.0F, 10.0F, 3.0F, 10.0F,NULL_DEFORM), PartPose.offsetAndRotation(0.0F, -8.5F, 0.0F, 0.0435F, -0.0038F, 0.0872F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 42).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 12.0F, 5.0F, NULL_DEFORM)
		.texOffs(55, 62).addBox(-3.6F, 9.2F, -4.0F, 4.0F, 3.0F, 2.0F, NULL_DEFORM), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition fleches_r1 = Body.addOrReplaceChild("fleches_r1", CubeListBuilder.create().texOffs(62, 72).addBox(-1.7F, -7.9F, 0.7F, 6.0F, 8.0F, 0.0F, NULL_DEFORM)
		.texOffs(0, 0).addBox(-0.7F, -1.9F, -2.0F, 4.0F, 11.0F, 4.0F, NULL_DEFORM), PartPose.offsetAndRotation(-3.5F, 3.0F, 4.5F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 0).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, NULL_DEFORM), PartPose.offsetAndRotation(-4.7449F, 11.6F, -1.5017F, 0.0F, -1.7017F, 0.0F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(54, 36).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, NULL_DEFORM), PartPose.offsetAndRotation(-2.6F, 10.7F, 3.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 45).addBox(-2.7F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, NULL_DEFORM), PartPose.offsetAndRotation(2.8F, 10.7F, 3.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 24).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, NULL_DEFORM), PartPose.offsetAndRotation(2.8F, 10.7F, -3.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 18).addBox(-6.0F, -1.2F, -3.0F, 12.0F, 3.0F, 6.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.1389F, 0.2F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 27).addBox(-6.4F, 1.2F, -4.4F, 6.0F, 2.0F, 7.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.1389F, 0.2F, 0.5F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 31).addBox(-6.0F, 0.8F, -5.0F, 13.0F, 3.0F, 8.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.1389F, 0.2F, 1.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 59).addBox(-3.5F, -2.0F, -2.5F, 5.0F, 12.0F, 5.0F, NULL_DEFORM), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r13 = RightArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 56).addBox(-1.0F, -3.5F, -2.0F, 2.0F, 7.0F, 4.0F, NULL_DEFORM), PartPose.offsetAndRotation(-3.0F, 7.5F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r14 = RightArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 46).addBox(-4.1F, -0.8F, -2.0F, 2.0F, 4.0F, 6.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r15 = RightArm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(65, 36).addBox(-4.4F, -2.4F, -3.5F, 2.0F, 3.0F, 7.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(50, 45).addBox(-1.5F, -2.0F, -2.5F, 5.0F, 12.0F, 5.0F, NULL_DEFORM), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r16 = LeftArm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(50, 70).addBox(-1.0F, -3.5F, -2.0F, 2.0F, 7.0F, 4.0F, NULL_DEFORM), PartPose.offsetAndRotation(3.0F, 7.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r17 = LeftArm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 62).addBox(2.4F, -2.4F, -3.5F, 2.0F, 3.0F, 7.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(34, 70).addBox(2.1F, -0.8F, -2.0F, 2.0F, 4.0F, 6.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(61, 10).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, NULL_DEFORM), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r19 = RightLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(28, 45).addBox(-3.0F, 0.0F, -4.0F, 3.0F, 7.0F, 8.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bottesD = RightLeg.addOrReplaceChild("bottesD", CubeListBuilder.create().texOffs(40, 62).addBox(-4.4F, -2.5F, -2.5F, 5.0F, 3.0F, 5.0F, NULL_DEFORM), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(20, 60).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, NULL_DEFORM), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r20 = LeftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(44, 0).addBox(0.0F, 0.0F, -4.0F, 3.0F, 7.0F, 8.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bottesG = LeftLeg.addOrReplaceChild("bottesG", CubeListBuilder.create().texOffs(58, 0).addBox(-0.6F, -2.5F, -2.5F, 5.0F, 3.0F, 5.0F, NULL_DEFORM), PartPose.offset(-1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

}
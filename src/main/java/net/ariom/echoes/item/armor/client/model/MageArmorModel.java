package net.ariom.echoes.item.armor.client.model;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.ariom.echoes.item.armor.client.model.ArmorModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class MageArmorModel extends ArmorModel {

	public MageArmorModel(ModelPart root) {
		super(root);
	}


	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 20).addBox(4.6F, -7.6F, -5.2F, 2.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 30).addBox(4.3F, -7.6F, -5.2F, 2.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 2).addBox(-6.3F, -7.6F, -5.2F, 2.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(-5.0F, 0.0F, -2.5F, 10.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 0).addBox(0.8F, 0.05F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.3F, 1.05F, 0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 10.25F, -4.0F, -0.228F, -0.1298F, -0.2033F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 4).addBox(-0.5F, -0.95F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(-1.0F, 0.05F, 0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 10.25F, -4.0F, -0.2618F, 0.0F, 0.3054F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 57).addBox(-5.4F, -9.5F, 1.5F, 3.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, 3.5F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 59).addBox(2.4F, -9.5F, 1.5F, 3.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, 3.5F, 0.0915F, 0.3042F, 0.0275F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 39).addBox(-3.0F, -9.5F, 1.0F, 6.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, 3.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(48, 0).addBox(-3.5F, -2.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r9 = RightArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 61).addBox(-3.6F, -0.2F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.1345F));

		PartDefinition cube_r10 = RightArm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 11).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r11 = RightArm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 39).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(53, 52).addBox(-1.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r12 = LeftArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(58, 46).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r13 = LeftArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 32).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r14 = LeftArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(60, 17).addBox(1.6F, -0.2F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(38, 44).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 62).addBox(-3.2F, 0.0F, -1.7F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.2618F, 0.1745F));

		PartDefinition cube_r16 = RightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 59).addBox(-3.6F, 0.0F, -2.1F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, -0.2618F, 0.1745F));

		PartDefinition boots = RightLeg.addOrReplaceChild("boots", CubeListBuilder.create().texOffs(38, 33).addBox(-2.5F, 8.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 49).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r17 = LeftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 62).addBox(2.2F, 0.0F, -1.7F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, -0.2618F, -0.1745F));

		PartDefinition cube_r18 = LeftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 0).addBox(-1.3F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5847F, 2.8147F, 0.2611F, 0.0191F, 0.0042F, -0.3147F));

		PartDefinition cube_r19 = LeftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(62, 61).addBox(2.6F, 0.0F, -2.1F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.2618F, -0.1745F));

		PartDefinition bottes2 = LeftLeg.addOrReplaceChild("bottes2", CubeListBuilder.create().texOffs(44, 21).addBox(-0.6F, -4.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}
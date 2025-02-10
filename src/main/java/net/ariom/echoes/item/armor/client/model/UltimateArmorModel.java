package net.ariom.echoes.item.armor.client.model;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class UltimateArmorModel extends ArmorModel {

	public UltimateArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 47).addBox(-5.9F, -14.1435F, -7.176F, 2.0F, 3.0F, 8.0F, NULL_DEFORM)
				.texOffs(90, 34).addBox(3.9F, -14.1435F, -7.176F, 2.0F, 3.0F, 8.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 7.1F, -0.1439F, 2.9671F, 0.0F, 3.1416F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -16.7F, -7.3561F, 12.0F, 3.0F, 13.0F, NULL_DEFORM)
				.texOffs(28, 23).addBox(-2.0F, -17.6F, -7.8561F, 4.0F, 5.0F, 14.0F, NULL_DEFORM)
				.texOffs(0, 16).addBox(-5.0F, -16.6F, -6.3561F, 10.0F, 10.0F, 11.0F, NULL_DEFORM)
				.texOffs(50, 0).addBox(-4.0F, -15.1F, -4.8561F, 8.0F, 8.0F, 8.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 7.1F, -0.1439F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r1 = Body.addOrReplaceChild("BodyLayer_r1", CubeListBuilder.create().texOffs(16, 32).addBox(-4.0F, -7.1F, -2.8561F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
				.texOffs(50, 16).addBox(-5.5F, 3.2F, -4.3561F, 11.0F, 2.0F, 7.0F, NULL_DEFORM)
				.texOffs(0, 37).addBox(-5.0F, -7.1F, -3.8561F, 10.0F, 14.0F, 6.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 7.1F, -0.1439F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(34, 91).addBox(-3.9293F, -4.0707F, 2.1439F, 8.0F, 8.0F, 1.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 7.1F, -0.1439F, 3.1416F, 0.0F, -2.3562F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(22, 75).addBox(1.8657F, -6.2995F, -7.0107F, 5.0F, 22.0F, 1.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 7.1F, -0.1439F, 2.9391F, 0.274F, -3.1112F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(0, 80).addBox(-6.8657F, -6.2995F, -7.0107F, 5.0F, 22.0F, 1.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 7.1F, -0.1439F, 2.9391F, -0.274F, 3.1112F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(0, 57).addBox(-5.0F, -6.2022F, -6.2416F, 10.0F, 22.0F, 1.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, 7.1F, -0.1439F, 2.9234F, 0.0F, 3.1416F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-9.7F, -0.4F, -2.2561F, 2.0F, 8.0F, 2.0F, NULL_DEFORM)
				.texOffs(0, 0).addBox(-10.7F, -2.4F, -3.2561F, 2.0F, 7.0F, 4.0F, NULL_DEFORM)
				.texOffs(76, 75).addBox(-9.0F, -1.1F, -3.8561F, 5.0F, 7.0F, 6.0F, NULL_DEFORM)
				.texOffs(72, 25).addBox(-8.5F, -7.1F, -3.3561F, 5.0F, 12.0F, 5.0F, NULL_DEFORM), PartPose.offsetAndRotation(-5.0F, 5.1F, -0.1439F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(82, 68).addBox(-12.1662F, -1.5485F, -3.8561F, 6.0F, 1.0F, 6.0F, NULL_DEFORM)
				.texOffs(52, 90).addBox(-9.5662F, -2.5485F, -3.8561F, 5.0F, 1.0F, 6.0F, NULL_DEFORM)
				.texOffs(94, 88).addBox(-13.1662F, -7.5485F, -1.8561F, 6.0F, 6.0F, 2.0F, NULL_DEFORM)
				.texOffs(82, 0).addBox(-11.1662F, -6.5485F, -3.8561F, 6.0F, 4.0F, 6.0F, NULL_DEFORM), PartPose.offsetAndRotation(-5.0F, 5.1F, -0.1439F, 3.1416F, 0.0F, 2.9234F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(31, 16).addBox(6.1662F, -1.5485F, -3.8561F, 6.0F, 1.0F, 6.0F, NULL_DEFORM)
				.texOffs(50, 25).addBox(4.5662F, -2.5485F, -3.8561F, 5.0F, 1.0F, 6.0F, NULL_DEFORM)
				.texOffs(37, 0).addBox(7.1662F, -7.5485F, -1.8561F, 6.0F, 6.0F, 2.0F, NULL_DEFORM)
				.texOffs(34, 81).addBox(5.1662F, -6.5485F, -3.8561F, 6.0F, 4.0F, 6.0F, NULL_DEFORM), PartPose.offsetAndRotation(5.0F, 5.1F, -0.1439F, -3.1416F, 0.0F, -2.9234F));

		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(12, 94).addBox(8.7F, -2.4F, -3.2561F, 2.0F, 7.0F, 4.0F, NULL_DEFORM)
				.texOffs(12, 80).addBox(7.7F, -0.4F, -2.2561F, 2.0F, 8.0F, 2.0F, NULL_DEFORM)
				.texOffs(74, 42).addBox(4.0F, -1.1F, -3.8561F, 5.0F, 7.0F, 6.0F, NULL_DEFORM)
				.texOffs(62, 64).addBox(3.5F, -7.1F, -3.3561F, 5.0F, 12.0F, 5.0F, NULL_DEFORM), PartPose.offsetAndRotation(5.0F, 5.1F, -0.1439F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(56, 34).addBox(-5.4415F, 6.244F, -4.8561F, 4.0F, 6.0F, 8.0F, NULL_DEFORM), PartPose.offsetAndRotation(-2.0F, -4.9F, -0.1439F, 3.1416F, 0.0F, 2.9234F));

		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild("LeftLeg_r2", CubeListBuilder.create().texOffs(58, 82).addBox(-5.4F, 10.2F, -3.8561F, 6.0F, 2.0F, 6.0F, NULL_DEFORM)
				.texOffs(22, 58).addBox(-4.4F, 4.9F, -3.3561F, 5.0F, 8.0F, 5.0F, NULL_DEFORM)
				.texOffs(22, 58).addBox(-4.4F, 12.9F, -3.3561F, 5.0F, 4.0F, 5.0F, NULL_DEFORM), PartPose.offsetAndRotation(-2.0F, -4.9F, -0.1439F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition bottes = LeftLeg.addOrReplaceChild("bottes", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, -0.5F));

		PartDefinition LeftLeg_r3 = bottes.addOrReplaceChild("LeftLeg_r3", CubeListBuilder.create().texOffs(79, 10).addBox(-5.4F, 13.2F, -3.8561F, 6.0F, 4.0F, 6.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, -16.9F, 0.3561F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(56, 50).addBox(1.4415F, 6.244F, -4.8561F, 4.0F, 6.0F, 8.0F, NULL_DEFORM), PartPose.offsetAndRotation(2.0F, -4.9F, -0.1439F, -3.1416F, 0.0F, -2.9234F));

		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2", CubeListBuilder.create().texOffs(87, 20).addBox(-0.6F, 10.2F, -3.8561F, 6.0F, 2.0F, 6.0F, NULL_DEFORM)
				.texOffs(42, 64).addBox(-0.6F, 4.9F, -3.3561F, 5.0F, 8.0F, 5.0F, NULL_DEFORM)
				.texOffs(42, 64).addBox(-0.6F, 12.9F, -3.3561F, 5.0F, 4.0F, 5.0F, NULL_DEFORM), PartPose.offsetAndRotation(2.0F, -4.9F, -0.1439F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition bottes2 = RightLeg.addOrReplaceChild("bottes2", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, -0.5F));

		PartDefinition RightLeg_r3 = bottes2.addOrReplaceChild("RightLeg_r3", CubeListBuilder.create().texOffs(77, 58).addBox(-0.6F, 13.2F, -3.8561F, 6.0F, 4.0F, 6.0F, NULL_DEFORM), PartPose.offsetAndRotation(0.0F, -16.9F, 0.3561F, -3.1416F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}
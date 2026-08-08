package com.qiqikanna.test.entity.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class TestBlockEntityModel extends EntityModel<Entity>
{
	private final ModelPart bone;
	public TestBlockEntityModel(ModelPart root) {
		this.bone = root.getChild("bone");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 24).cuboid(-10.0F, -10.0F, 6.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, 24.0F, -8.0F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(0, 12).cuboid(-4.0F, -4.0F, -2.5F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, -8.0F, 7.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-3.5F, -4.0F, -2.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, -8.0F, 7.0F, 0.0F, 0.0F, -0.7854F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
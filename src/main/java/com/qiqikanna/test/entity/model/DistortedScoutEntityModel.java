package com.qiqikanna.test.entity.model;

import com.qiqikanna.test.entity.custom.DistortedScoutEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DistortedScoutEntityModel extends EntityModel<DistortedScoutEntity>
{
	private final ModelPart root;
	private final ModelPart leg;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart legtwo;
	private final ModelPart legtwo2;
	private final ModelPart legtwo3;
	private final ModelPart legthree;
	private final ModelPart legthree2;
	private final ModelPart legthree3;
	private final ModelPart body;
	private final ModelPart spike;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart head;
	private final ModelPart pupil;

//	public static final Animation step = Animation.Builder.create(1.0417F).looping()
//			.addBoneAnimation("legtwo2", new Transformation(Transformation.Targets.ROTATE,
//					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
//					new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
//			))
//			.addBoneAnimation("legtwo2", new Transformation(Transformation.Targets.TRANSLATE,
//					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
//					new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 2.0F), Transformation.Interpolations.LINEAR),
//					new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), Transformation.Interpolations.LINEAR)
//			))
//			.addBoneAnimation("legtwo3", new Transformation(Transformation.Targets.ROTATE,
//					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
//					new Keyframe(0.1667F, AnimationHelper.createRotationalVector(-14.66F, 3.2114F, 12.0868F), Transformation.Interpolations.LINEAR),
//					new Keyframe(0.5417F, AnimationHelper.createRotationalVector(10.34F, 3.2114F, 12.0868F), Transformation.Interpolations.LINEAR)
//			))
//			.addBoneAnimation("legtwo3", new Transformation(Transformation.Targets.TRANSLATE,
//					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
//					new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.0F, 2.0F, 0.0F), Transformation.Interpolations.LINEAR)
//			))
//			.build();

	public DistortedScoutEntityModel(ModelPart root) {
		this.root = root.getChild("root");
		this.leg = this.root.getChild("leg");
		this.leg2 = this.leg.getChild("leg2");
		this.leg3 = this.leg.getChild("leg3");
		this.legtwo = this.root.getChild("legtwo");
		this.legtwo2 = this.legtwo.getChild("legtwo2");
		this.legtwo3 = this.legtwo.getChild("legtwo3");
		this.legthree = this.root.getChild("legthree");
		this.legthree2 = this.legthree.getChild("legthree2");
		this.legthree3 = this.legthree.getChild("legthree3");
		this.body = this.root.getChild("body");
		this.spike = this.body.getChild("spike");
		this.bone2 = this.spike.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone3.getChild("bone5");
		this.bone6 = this.spike.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone7.getChild("bone9");
		this.bone10 = this.spike.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.bone12 = this.bone11.getChild("bone12");
		this.bone13 = this.bone11.getChild("bone13");
		this.bone14 = this.spike.getChild("bone14");
		this.bone15 = this.bone14.getChild("bone15");
		this.bone16 = this.bone15.getChild("bone16");
		this.bone17 = this.bone15.getChild("bone17");
		this.head = this.body.getChild("head");
		this.pupil = this.head.getChild("pupil");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(0.1635F, 19.9273F, 3.5F));

		ModelPartData leg = root.addChild("leg", ModelPartBuilder.create(), ModelTransform.of(2.673F, -0.5F, -6.5F, 0.6601F, -0.0974F, 0.3873F));

		ModelPartData leg2 = leg.addChild("leg2", ModelPartBuilder.create(), ModelTransform.pivot(1.2986F, -7.8578F, 0.0F));

		ModelPartData leg_r1 = leg2.addChild("leg_r1", ModelPartBuilder.create().uv(0, 47).cuboid(-1.15F, -1.0F, -5.75F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(28, 34).cuboid(-1.65F, -1.5F, -1.75F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(45, 69).cuboid(-0.65F, -0.5F, -9.75F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.9001F, 0.445F, -0.8555F));

		ModelPartData leg3 = leg.addChild("leg3", ModelPartBuilder.create(), ModelTransform.pivot(0.1635F, -0.4273F, 4.0F));

		ModelPartData leg_r2 = leg3.addChild("leg_r2", ModelPartBuilder.create().uv(20, 30).cuboid(-1.5F, -1.5F, -5.0F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.3526F));

		ModelPartData legtwo = root.addChild("legtwo", ModelPartBuilder.create(), ModelTransform.of(-3.0F, -0.5F, -6.5F, 0.6601F, 0.0974F, -0.3873F));

		ModelPartData legtwo2 = legtwo.addChild("legtwo2", ModelPartBuilder.create(), ModelTransform.pivot(-1.2986F, -7.8578F, 0.0F));

		ModelPartData legtwo_r1 = legtwo2.addChild("legtwo_r1", ModelPartBuilder.create().uv(69, 11).cuboid(-0.35F, -0.5F, -9.75F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 45).cuboid(-0.85F, -1.0F, -5.75F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(14, 34).cuboid(-1.35F, -1.5F, -1.75F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.9001F, -0.445F, 0.8555F));

		ModelPartData legtwo3 = legtwo.addChild("legtwo3", ModelPartBuilder.create(), ModelTransform.pivot(-0.1635F, -0.4273F, 4.0F));

		ModelPartData legtwo_r2 = legtwo3.addChild("legtwo_r2", ModelPartBuilder.create().uv(0, 29).cuboid(-6.5F, -1.5F, -5.0F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));

		ModelPartData legthree = root.addChild("legthree", ModelPartBuilder.create(), ModelTransform.of(-0.0674F, -0.7136F, -0.5F, -2.1841F, 0.5901F, -2.6394F));

		ModelPartData legthree2 = legthree.addChild("legthree2", ModelPartBuilder.create(), ModelTransform.pivot(-1.8654F, -8.3996F, -0.0573F));

		ModelPartData legthree_r1 = legthree2.addChild("legthree_r1", ModelPartBuilder.create().uv(79, 53).cuboid(-0.35F, -0.5F, -10.75F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(32, 45).cuboid(-0.85F, -1.0F, -5.75F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-1.35F, -1.5F, -1.75F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.9001F, -0.445F, 0.8555F));

		ModelPartData legthree3 = legthree.addChild("legthree3", ModelPartBuilder.create(), ModelTransform.pivot(-0.7303F, -0.9691F, 3.9427F));

		ModelPartData legthree_r2 = legthree3.addChild("legthree_r2", ModelPartBuilder.create().uv(22, 26).cuboid(-6.5F, -1.5F, -5.0F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));

		ModelPartData body = root.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, 0.5739F, -4.0216F, 8.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.1635F, -0.5013F, -3.4784F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(24, 0).cuboid(-12.0F, -0.5F, -2.0F, 8.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, -0.3905F, 4.303F, 1.3526F, 0.0F, 0.0F));

		ModelPartData body_r2 = body.addChild("body_r2", ModelPartBuilder.create().uv(0, 25).cuboid(-12.0F, -0.5F, -1.0F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, -0.3905F, -4.3463F, -1.3526F, 0.0F, 0.0F));

		ModelPartData body_r3 = body.addChild("body_r3", ModelPartBuilder.create().uv(24, 8).cuboid(-3.5F, -0.5F, -4.0F, 4.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 1.0739F, -0.0216F, 0.0F, 0.0F, 1.3526F));

		ModelPartData body_r4 = body.addChild("body_r4", ModelPartBuilder.create().uv(24, 17).cuboid(-0.5F, -0.5F, -4.0F, 4.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 1.0739F, -0.0216F, 0.0F, 0.0F, -1.3526F));

		ModelPartData spike = body.addChild("spike", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.5739F, -6.0216F));

		ModelPartData bone2 = spike.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bone3 = bone2.addChild("bone3", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, -2.7343F, 0.4684F, 0.0F, 0.0F));

		ModelPartData bone4 = bone3.addChild("bone4", ModelPartBuilder.create().uv(45, 24).cuboid(1.1144F, 2.4686F, 5.3539F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(33, 69).cuboid(1.9114F, 5.6716F, 4.5568F, 3.0F, 3.0F, 3.0F, new Dilation(-0.7971F))
		.uv(21, 69).cuboid(2.285F, 6.7039F, 4.1833F, 3.0F, 3.0F, 3.0F, new Dilation(-1.1706F))
		.uv(54, 66).cuboid(2.46F, 7.1877F, 4.0083F, 3.0F, 3.0F, 3.0F, new Dilation(-1.3456F))
		.uv(0, 65).cuboid(2.542F, 7.4144F, 3.9262F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4277F))
		.uv(63, 57).cuboid(2.5805F, 7.5207F, 3.8878F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4661F)), ModelTransform.of(0.0F, -1.2343F, 0.0F, 0.0F, 0.0F, 0.424F));

		ModelPartData bone5 = bone3.addChild("bone5", ModelPartBuilder.create().uv(24, 41).cuboid(-4.1144F, 2.4686F, 5.3539F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(69, 30).cuboid(-4.9114F, 5.6716F, 4.5568F, 3.0F, 3.0F, 3.0F, new Dilation(-0.7971F))
		.uv(67, 0).cuboid(-5.285F, 6.7039F, 4.1833F, 3.0F, 3.0F, 3.0F, new Dilation(-1.1706F))
		.uv(12, 66).cuboid(-5.46F, 7.1877F, 4.0083F, 3.0F, 3.0F, 3.0F, new Dilation(-1.3456F))
		.uv(63, 63).cuboid(-5.542F, 7.4144F, 3.9262F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4277F))
		.uv(63, 51).cuboid(-5.5805F, 7.5207F, 3.8878F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4661F)), ModelTransform.of(0.0F, -1.2343F, 0.0F, 0.0F, 0.0F, -0.424F));

		ModelPartData bone6 = spike.addChild("bone6", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bone7 = bone6.addChild("bone7", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, -2.7343F, 0.4684F, 0.0F, 0.0F));

		ModelPartData bone8 = bone7.addChild("bone8", ModelPartBuilder.create().uv(12, 41).cuboid(5.4686F, -2.4686F, 0.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(45, 63).cuboid(6.2657F, 0.7343F, -0.7971F, 3.0F, 3.0F, 3.0F, new Dilation(-0.7971F))
		.uv(33, 63).cuboid(6.6392F, 1.7667F, -1.1706F, 3.0F, 3.0F, 3.0F, new Dilation(-1.1706F))
		.uv(21, 63).cuboid(6.8143F, 2.2505F, -1.3456F, 3.0F, 3.0F, 3.0F, new Dilation(-1.3456F))
		.uv(61, 9).cuboid(6.8963F, 2.4772F, -1.4277F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4277F))
		.uv(60, 34).cuboid(6.9347F, 2.5834F, -1.4661F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4661F)), ModelTransform.of(0.0F, -1.2343F, 0.0F, 0.0F, 0.0F, 0.424F));

		ModelPartData bone9 = bone7.addChild("bone9", ModelPartBuilder.create().uv(40, 17).cuboid(2.4686F, 2.4686F, 0.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(63, 44).cuboid(1.6716F, 5.6716F, -0.7971F, 3.0F, 3.0F, 3.0F, new Dilation(-0.7971F))
		.uv(63, 24).cuboid(1.298F, 6.7039F, -1.1706F, 3.0F, 3.0F, 3.0F, new Dilation(-1.1706F))
		.uv(63, 18).cuboid(1.123F, 7.1877F, -1.3456F, 3.0F, 3.0F, 3.0F, new Dilation(-1.3456F))
		.uv(54, 60).cuboid(1.041F, 7.4144F, -1.4277F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4277F))
		.uv(12, 60).cuboid(1.0025F, 7.5207F, -1.4661F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4661F)), ModelTransform.of(0.0F, -1.2343F, 0.0F, 0.0F, 0.0F, -0.424F));

		ModelPartData bone10 = spike.addChild("bone10", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -3.1416F, 0.0F));

		ModelPartData bone11 = bone10.addChild("bone11", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, -2.7343F, 0.4684F, 0.0F, 0.0F));

		ModelPartData bone12 = bone11.addChild("bone12", ModelPartBuilder.create().uv(40, 5).cuboid(-1.1144F, -2.4686F, -5.3539F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 59).cuboid(-0.3173F, 0.7343F, -6.1509F, 3.0F, 3.0F, 3.0F, new Dilation(-0.7971F))
		.uv(45, 57).cuboid(0.0562F, 1.7667F, -6.5245F, 3.0F, 3.0F, 3.0F, new Dilation(-1.1706F))
		.uv(21, 57).cuboid(0.2313F, 2.2505F, -6.6995F, 3.0F, 3.0F, 3.0F, new Dilation(-1.3456F))
		.uv(54, 48).cuboid(0.3133F, 2.4772F, -6.7815F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4277F))
		.uv(54, 21).cuboid(0.3517F, 2.5834F, -6.82F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4661F)), ModelTransform.of(0.0F, -1.2343F, 0.0F, 0.0F, 0.0F, 0.424F));

		ModelPartData bone13 = bone11.addChild("bone13", ModelPartBuilder.create().uv(0, 40).cuboid(-1.8856F, -2.4686F, -5.3539F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(58, 3).cuboid(-2.6827F, 0.7343F, -6.1509F, 3.0F, 3.0F, 3.0F, new Dilation(-0.7971F))
		.uv(33, 57).cuboid(-3.0562F, 1.7667F, -6.5245F, 3.0F, 3.0F, 3.0F, new Dilation(-1.1706F))
		.uv(54, 54).cuboid(-3.2313F, 2.2505F, -6.6995F, 3.0F, 3.0F, 3.0F, new Dilation(-1.3456F))
		.uv(54, 28).cuboid(-3.3133F, 2.4772F, -6.7815F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4277F))
		.uv(12, 54).cuboid(-3.3517F, 2.5834F, -6.82F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4661F)), ModelTransform.of(0.0F, -1.2343F, 0.0F, 0.0F, 0.0F, -0.424F));

		ModelPartData bone14 = spike.addChild("bone14", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -4.7124F, 0.0F));

		ModelPartData bone15 = bone14.addChild("bone15", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, -2.7343F, 0.4684F, 0.0F, 0.0F));

		ModelPartData bone16 = bone15.addChild("bone16", ModelPartBuilder.create().uv(39, 38).cuboid(-5.4686F, 2.4686F, 0.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 53).cuboid(-4.6716F, 5.6716F, -0.7971F, 3.0F, 3.0F, 3.0F, new Dilation(-0.7971F))
		.uv(52, 15).cuboid(-4.298F, 6.7039F, -1.1706F, 3.0F, 3.0F, 3.0F, new Dilation(-1.1706F))
		.uv(33, 51).cuboid(-4.123F, 7.1877F, -1.3456F, 3.0F, 3.0F, 3.0F, new Dilation(-1.3456F))
		.uv(49, 9).cuboid(-4.041F, 7.4144F, -1.4277F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4277F))
		.uv(48, 35).cuboid(-4.0025F, 7.5207F, -1.4661F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4661F)), ModelTransform.of(0.0F, -1.2343F, 0.0F, 0.0F, 0.0F, 0.424F));

		ModelPartData bone17 = bone15.addChild("bone17", ModelPartBuilder.create().uv(38, 31).cuboid(-8.4686F, -2.4686F, 0.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(52, 41).cuboid(-9.2657F, 0.7343F, -0.7971F, 3.0F, 3.0F, 3.0F, new Dilation(-0.7971F))
		.uv(45, 51).cuboid(-9.6392F, 1.7667F, -1.1706F, 3.0F, 3.0F, 3.0F, new Dilation(-1.1706F))
		.uv(21, 51).cuboid(-9.8142F, 2.2505F, -1.3456F, 3.0F, 3.0F, 3.0F, new Dilation(-1.3456F))
		.uv(49, 0).cuboid(-9.8963F, 2.4772F, -1.4277F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4277F))
		.uv(12, 48).cuboid(-9.9347F, 2.5834F, -1.4661F, 3.0F, 3.0F, 3.0F, new Dilation(-1.4661F)), ModelTransform.of(0.0F, -1.2343F, 0.0F, 0.0F, 0.0F, -0.424F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.4261F, -0.0216F));

		ModelPartData pupil = head.addChild("pupil", ModelPartBuilder.create().uv(118, 14).cuboid(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -4.025F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(DistortedScoutEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
//		// 重置所有部件的内部动画变换 — 否则 AnimationHelper.animate 会累加，腿越跑越远
//		this.getPart().traverse().forEach(ModelPart::resetTransform);
//
//		// === 关键帧动画：走路 ===
//		AnimationHelper.animate(this, step, entity.getStepAnimationTime(), 1.0F,
//				new org.joml.Vector3f());
//
//		// === 头部跟踪 ===
//		this.head.yaw = netHeadYaw * 0.017453292F;
//		this.head.pitch = headPitch * 0.017453292F;
//
//		// === 身体浮动 ===
//		this.body.pivotY = (float) Math.sin(ageInTicks * 0.1F) * 0.5F;
//		this.body.pivotY = (float) Math.sin(ageInTicks * 0.1F) * 0.5F;
	}
//	@Override
//	public ModelPart getPart() {
//		// SinglePartEntityModel 要求返回根部件，动画系统从这里遍历查找 bone
//		return this.root;
//	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}

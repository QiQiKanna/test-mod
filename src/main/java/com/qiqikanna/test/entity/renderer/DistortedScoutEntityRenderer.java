package com.qiqikanna.test.entity.renderer;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.ModEntityModelLayers;
import com.qiqikanna.test.entity.custom.DistortedScoutEntity;
import com.qiqikanna.test.entity.model.DistortedScoutEntityModel;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;

public class DistortedScoutEntityRenderer extends MobEntityRenderer<DistortedScoutEntity, DistortedScoutEntityModel>
{

    public DistortedScoutEntityRenderer(EntityRendererFactory.Context context)
    {
        super(context, new DistortedScoutEntityModel(context.getPart(ModEntityModelLayers.DISTORTED_SCOUT)), 0.5F);
    }

    @Override
    public Identifier getTexture(DistortedScoutEntity entity)
    {
        return new Identifier(TestMod.MOD_ID, "textures/entity/distorted_scout/distorted_scout.png");
    }

    @Override
    public void render(DistortedScoutEntity mobEntity, float yaw, float tickDelta, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int light)
    {
        matrixStack.push();

        // 1. 生物朝向旋转 — 180 - yaw，Blockbench 模型默认朝南
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F - yaw));

        // 2. 坐标系翻转 — Blockbench 的 Y 轴和 Minecraft 渲染管线方向相反
        //    不翻转的话模型上下颠倒
        matrixStack.scale(-1.0F, -1.0F, 1.0F);

        // 3. 向下平移到地面 — 翻转后模型位置偏移，需要补偿
        matrixStack.translate(0.0F, -1.501F, 0.0F);

        // 4. 调用 setAngles — 动画时间由 Entity 自己管理（位置变化检测）//有bug
//        this.model.setAngles(mobEntity,
//                mobEntity.age + tickDelta,          // limbSwing
//                1.0F,                                // limbSwingAmount（动画用 Entity 自己的时间）
//                mobEntity.age + tickDelta,          // ageInTicks
//                mobEntity.getHeadYaw() - mobEntity.bodyYaw,  // netHeadYaw
//                mobEntity.getPitch());              // headPitch

        // 5. 用 getEntityTranslucent 代替 getEntityCutoutNoCull — 支持半透明
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(
                RenderLayer.getEntityTranslucent(getTexture(mobEntity)));

        // 6. 渲染模型 — alpha = 1.0F 则完全不透明，< 1.0F 则半透明
        this.model.render(matrixStack, vertexConsumer, light, OverlayTexture.DEFAULT_UV,
                1.0F, 1.0F, 1.0F, 1.0F);

        matrixStack.pop();

        // 4. 最后调 super.render() — 负责画标签名字、拴绳等附加内容
        //    但它也会用不透明 RenderLayer 渲染一遍模型，如果你看到双重渲染就把下面注释掉：
        //super.render(mobEntity, yaw, tickDelta, matrixStack, vertexConsumerProvider, light);
    }

}

package com.qiqikanna.test.entity.renderer;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.ModEntityModelLayers;
import com.qiqikanna.test.entity.custom.projectile.thrown.TestBlockEntity;
import com.qiqikanna.test.entity.model.TestBlockEntityModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT) // 只在客户端加载，服务端不需要渲染
public class TestBLockEntityRenderer extends EntityRenderer<TestBlockEntity>
{
    // Blockbench 导出的模型对象，负责管理模型的各个 bone/part
    private final TestBlockEntityModel model;

    public TestBLockEntityRenderer(EntityRendererFactory.Context ctx)
    {
        super(ctx); // EntityRenderer 的构造，设置阴影大小等
        // 通过 EntityModelLayer 获取模型数据并创建模型实例
        // ctx.getPart() 会去拿 ModEntityModelLayers 里注册好的 TexturedModelData
        this.model = new TestBlockEntityModel(ctx.getPart(ModEntityModelLayers.TEST_BLOCK_ENTITY));
    }

    /**
     * 每帧渲染的核心方法。
     * @param entity         被渲染的 TestBlockEntity 实例
     * @param yaw            实体当前的偏航角（水平旋转）
     * @param tickDelta      距离上一 tick 的进度（0~1），用于平滑插值
     * @param matrices       矩阵栈，用来做平移/旋转/缩放变换
     * @param vertexConsumers 顶点消费者提供器，从这里获取渲染缓冲
     * @param light          光照信息（包含方块光和天空光）
     */
    @Override
    public void render(TestBlockEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light)
    {
        // 调用父类渲染（处理标签、附身等）
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);

        // push/pop 矩阵栈 — 保证变换不影响后续渲染
        matrices.push();

        // ---- 可选：让模型方向跟随实体飞行方向 ----
        // 如果需要模型像箭一样顺着飞行方向，取消下面两行注释：
//         matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(
//                 MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw()) - 90.0F));
//         matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(
//                 MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch())));

        // ---- 获取顶点消费者 ----
        // RenderLayer.getEntityCutoutNoCull 意味着：
        //   - Cutout：支持透明/不透明（没有半透明），像素要么全透明要么完全不透明
        //   - NoCull：背面不剔除，模型两面都可见（小模型/投掷物常用）
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(
                RenderLayer.getEntityCutoutNoCull(getTexture(entity)));

        // ---- 渲染模型 ----
        // 参数：矩阵、顶点消费者、光照、覆盖层UV、RGBA颜色
        // OverlayTexture.DEFAULT_UV 表示没有特殊覆盖（无伤害闪烁等）
        this.model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV,
                1.0F, 1.0F, 1.0F, 1.0F); // 白色 = 不改变纹理颜色

        matrices.pop();
    }

    /**
     * 返回实体的纹理路径。
     * 纹理文件位置：src/main/resources/assets/test-mod/textures/entity/test_block_entity.png
     */
    @Override
    public Identifier getTexture(TestBlockEntity entity)
    {
        return new Identifier(TestMod.MOD_ID, "textures/entity/test_block_entity.png");
    }
}

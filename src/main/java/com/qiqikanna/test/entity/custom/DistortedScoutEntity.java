package com.qiqikanna.test.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class DistortedScoutEntity extends PathAwareEntity
{
    // 关键帧动画时间 — 存在 Entity 里（每个实体独立），不存 Model 里（Model 是所有实体共享的！）
//    private long stepAnimationTime = 0L;
//    private double prevX, prevZ;
//    private boolean positionsInitialized = false;

    public DistortedScoutEntity(EntityType<? extends PathAwareEntity> entityType, World world)
    {
        super(entityType, world);
    }

    @Override
    protected void initGoals()
    {
        this.goalSelector.add(0, new EscapeDangerGoal(this, 0.8F));
        this.goalSelector.add(1, new WanderAroundGoal(this, 0.4F, 20));
    }

//    @Override
//    public void tick()
//    {
//        super.tick();
//
//        // 动画时间更新（仅客户端，动画只在客户端播放）
//        if (this.getWorld().isClient)
//        {
//            if (!positionsInitialized)
//            {
//                prevX = this.getX();
//                prevZ = this.getZ();
//                positionsInitialized = true;
//            }
//
//            double dx = this.getX() - prevX;
//            double dz = this.getZ() - prevZ;
//
//            if (dx * dx + dz * dz > 0.0001)   // 位置有变化 = 在移动
//            {
//                this.stepAnimationTime++;
//            }
//            else
//            {
//                this.stepAnimationTime = 0L;   // 不动时复位
//            }
//
//            prevX = this.getX();
//            prevZ = this.getZ();
//        }
//    }
//
//    /** 供模型 setAngles 读取的动画时间 */
//    public long getStepAnimationTime()
//    {
//        return this.stepAnimationTime;
//    }
}

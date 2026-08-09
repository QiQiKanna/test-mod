package com.qiqikanna.test.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class AvnFoxEntity extends PathAwareEntity implements GeoEntity
{
    public static final RawAnimation EXTRA1 = RawAnimation.begin().thenPlay("extra1");
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public Boolean gogglesOpen = true;

    public AvnFoxEntity(EntityType<? extends PathAwareEntity> entityType, World world)
    {
        super(entityType, world);
    }

    @Override
    protected void initGoals()
    {
        this.goalSelector.add(1,new LookAtEntityGoal(this, PlayerEntity.class,8.0F));
        this.goalSelector.add(2,new WanderAroundGoal(this,0.4));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers)
    {
        controllers.add(new AnimationController<>(this,"walk",state ->
                state.isMoving() ? state.setAndContinue(DefaultAnimations.WALK) : PlayState.STOP));
        controllers.add(new AnimationController<>(this,"extra1",state -> PlayState.STOP)
                .triggerableAnim("extra1",EXTRA1));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache()
    {
        return geoCache;
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand)
    {
        triggerAnim("extra1","extra1");
        if (!this.getWorld().isClient)
        {
            setGogglesOpen(!isGogglesOpen());
        }
        return super.interactMob(player, hand);
    }

    public Boolean isGogglesOpen(){return this.gogglesOpen;}
    public void setGogglesOpen(Boolean bool){this.gogglesOpen = bool;}
}

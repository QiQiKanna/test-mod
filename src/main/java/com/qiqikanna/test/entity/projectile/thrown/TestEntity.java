package com.qiqikanna.test.entity.projectile.thrown;

import com.qiqikanna.test.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import net.minecraft.world.explosion.ExplosionBehavior;

public class TestEntity extends ThrownItemEntity
{
    public TestEntity(World world, LivingEntity owner) {
        super(EntityType.EGG, owner, world);
    }

    @Override
    protected Item getDefaultItem()
    {
        return ModItems.TEST_BLOCK;
    }


    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        entityHitResult.getEntity().damage(this.getDamageSources().thrown(this, this.getOwner()), 1.0F);
    }

    @Override
    protected void onCollision(HitResult hitResult)
    {
        super.onCollision(hitResult);
        World world = this.getWorld();

        ExplosionBehavior explosionBehavior = new ExplosionBehavior() {
            @Override
            public boolean canDestroyBlock(Explosion explosion, BlockView world, BlockPos pos, BlockState state, float power)
            {
                return false;
            }
        };

        if (!world.isClient && !this.isRemoved())
        {
            if (this.getOwner() != null)
            {
                world.createExplosion(this, null, new ExplosionBehavior(), this.getPos(), 2.0f, false, World.ExplosionSourceType.BLOCK);
            }
            this.discard();
        }
    }
}

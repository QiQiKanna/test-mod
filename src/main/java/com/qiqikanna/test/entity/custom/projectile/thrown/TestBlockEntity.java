package com.qiqikanna.test.entity.custom.projectile.thrown;

import com.qiqikanna.test.entity.ModEntityTypes;
import com.qiqikanna.test.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.ExplosionBehavior;

public class TestBlockEntity extends ThrownItemEntity
{
    public TestBlockEntity(World world, LivingEntity owner) {
        super(ModEntityTypes.TEST_BLOCK_ENTITY, owner, world);
    }

    public TestBlockEntity(EntityType<? extends TestBlockEntity> entityType, World world)
    {
        super(entityType,world);
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
/*
        ExplosionBehavior explosionBehavior = new ExplosionBehavior() {
            @Override
            public boolean canDestroyBlock(Explosion explosion, BlockView world, BlockPos pos, BlockState state, float power)
            {
                return false;
            }
        };
*/
        if (!world.isClient && !this.isRemoved())
        {
            if (this.getOwner() != null)
            {
                world.createExplosion(this, null, new ExplosionBehavior(), this.getPos(), 2.0f, false, World.ExplosionSourceType.BLOCK);
            }
            this.discard();
        }
    }

    @Override
    protected Item getDefaultItem()
    {
        return ModItems.TEST_BLOCK;
    }
}

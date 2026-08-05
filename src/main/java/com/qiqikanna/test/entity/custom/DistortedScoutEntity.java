package com.qiqikanna.test.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class DistortedScoutEntity extends PathAwareEntity
{
    public DistortedScoutEntity(EntityType<? extends PathAwareEntity> entityType, World world)
    {
        super(entityType, world);
    }
}

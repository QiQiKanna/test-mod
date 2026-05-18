package com.qiqikanna.test.block;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;


public class TestBlock extends Block
{


    public TestBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
//        world.removeBlock(pos, false);
//        ExplosionBehavior explosionBehavior = new ExplosionBehavior() {
//            @Override
//            public boolean canDestroyBlock(Explosion explosion, BlockView world, BlockPos pos, BlockState state, float power)
//            {
//                return false;
//            }
//        };
        world.removeBlock(pos, false);
        if(!world.isClient)
        {
            world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 3.0f, false, World.ExplosionSourceType.BLOCK);
            return ActionResult.SUCCESS;
        }
        return  ActionResult.PASS;
    }

    @Override
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion)
    {
        if(!world.isClient)
        {
            world.createExplosion(null,null,null,
                    pos.getX(),pos.getY(),pos.getZ(),
                    3.0f,false,World.ExplosionSourceType.BLOCK,true);
        }
    }

    @Override
    public boolean shouldDropItemsOnExplosion(Explosion explosion)
    {
        return false;
    }



//这仨方法有啥用
//    @Override
//    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
//        return stateFrom.isOf(this) ? true : super.isSideInvisible(state, stateFrom, direction);
//    }
//
//    @Override
//    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
//        return true;
//    }
//
//    @Override
//    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
//        return VoxelShapes.empty();
//    }

    @Override
    //我不明白为什么这方法能让方块内部亮起来
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0F;
    }
}

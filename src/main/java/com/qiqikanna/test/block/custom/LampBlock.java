package com.qiqikanna.test.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class LampBlock extends Block
{
    public static final BooleanProperty LIT = Properties.LIT;
    public static final DirectionProperty FACING = Properties.FACING;

    private static final VoxelShape SHAPE_NORTH = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(1, 6, 13.1, 15, 10, 16),
            Block.createCuboidShape(1.9, 6, 12, 14.1, 10, 13.1),
            BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_EAST = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 6, 1, 2.9, 10, 15),
            Block.createCuboidShape(2.9, 6, 1.9, 4, 10, 14.1),
            BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_SOUTH = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(1, 6, 0, 15, 10, 2.9),
            Block.createCuboidShape(1.9, 6, 2.9, 14.1, 10, 4),
            BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_WEST = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(13.1, 6, 1, 16, 10, 15),
            Block.createCuboidShape(12, 6, 1.9, 13.1, 10, 14.1),
            BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_DOWN = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(1, 13.1, 6, 15, 16, 10),
            Block.createCuboidShape(1.9, 12, 6, 14.1, 13.1, 10),
            BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_UP = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(1, 0, 6, 15, 2.9, 10),
            Block.createCuboidShape(1.9, 2.9, 6, 14.1, 4, 10),
            BooleanBiFunction.OR);

    public LampBlock(Settings settings)
    {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
        this.setDefaultState(this.getStateManager().getDefaultState()
                .with(LIT,true)
                .with(FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(LIT,FACING);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        if (!world.isClient)
        {
            world.setBlockState(pos,state.with(LIT,!state.get(LIT)));
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return switch (state.get(FACING))
        {
            case NORTH -> SHAPE_NORTH;
            case EAST  -> SHAPE_EAST;
            case SOUTH -> SHAPE_SOUTH;
            case WEST  -> SHAPE_WEST;
            case UP    -> SHAPE_UP;
            case DOWN  -> SHAPE_DOWN;
        };
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation)
    {
        return state.with(FACING,rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror)
    {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING,ctx.getPlayerLookDirection().getOpposite());
    }
}

package com.qiqikanna.test.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class ModFenceBlock extends Block
{
    public static final BooleanProperty NORTH = Properties.NORTH;
    public static final BooleanProperty EAST = Properties.EAST;
    public static final BooleanProperty SOUTH = Properties.SOUTH;
    public static final BooleanProperty WEST = Properties.WEST;


    public ModFenceBlock(Settings settings)
    {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState()
                .with(NORTH,false)
                .with(EAST,false)
                .with(SOUTH,false)
                .with(WEST,false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(NORTH,EAST,SOUTH,WEST);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        BlockState northState = world.getBlockState(pos.north());
        BlockState eastState = world.getBlockState(pos.east());
        BlockState southState = world.getBlockState(pos.south());
        BlockState westState = world.getBlockState(pos.west());

        return this.getDefaultState()
                .with(NORTH,northState.isOf(this))
                .with(EAST,eastState.isOf(this))
                .with(SOUTH,southState.isOf(this))
                .with(WEST,westState.isOf(this));
    }
}

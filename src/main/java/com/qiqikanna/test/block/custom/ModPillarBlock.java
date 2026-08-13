package com.qiqikanna.test.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class ModPillarBlock extends Block
{
    public static final EnumProperty<Type> MY_PILLAR_BLOCK_TYPE = EnumProperty.of("my_pillar_block_type",Type.class);

    public ModPillarBlock(Settings settings)
    {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(MY_PILLAR_BLOCK_TYPE,Type.SINGLE));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(MY_PILLAR_BLOCK_TYPE);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        boolean top = world.getBlockState(pos.up()).isOf(this);
        boolean botton =world.getBlockState(pos.down()).isOf(this);
        if (top && botton)
        {
            return state.with(MY_PILLAR_BLOCK_TYPE,Type.MIDDLE);
        }
        else if (top)
        {
            return state.with(MY_PILLAR_BLOCK_TYPE,Type.BOTTOM);
        }
        else if (botton)
        {
            return state.with(MY_PILLAR_BLOCK_TYPE,Type.TOP);
        }
        return state.with(MY_PILLAR_BLOCK_TYPE,Type.SINGLE);
    }

    ;public enum Type implements StringIdentifiable
    {
        SINGLE("single"),
        TOP("top"),
        MIDDLE("middle"),
        BOTTOM("bottom");

        private final String id;
         Type(String id)
        {
            this.id = id;
        }

        @Override
        public String asString()
        {
            return this.id;
        }
    }
}

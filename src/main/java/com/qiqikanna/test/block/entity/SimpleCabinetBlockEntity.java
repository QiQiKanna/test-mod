package com.qiqikanna.test.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class SimpleCabinetBlockEntity extends LootableContainerBlockEntity
{
    private DefaultedList<ItemStack> inventory = createInventory();

    protected SimpleCabinetBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState)
    {
        super(blockEntityType, blockPos, blockState);
    }

    public SimpleCabinetBlockEntity(BlockPos blockPos,BlockState blockState)
    {
        this(ModBlockEntityTypes.SIMPLE_CABINET,blockPos,blockState);
    }

    @Override
    protected DefaultedList<ItemStack> getInvStackList()
    {
        return this.inventory;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list)
    {
        this.inventory = list;
    }

    @Override
    protected Text getContainerName()
    {
        return Text.translatable("container.test-mod.simple_cabinet");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory)
    {
        return GenericContainerScreenHandler.createGeneric9x3(syncId,playerInventory,this);
    }

    @Override
    public int size()
    {
        return 27;
    }

    private DefaultedList<ItemStack> createInventory()
    {
        return DefaultedList.ofSize(size(),ItemStack.EMPTY);
    }

    @Override
    public void readNbt(NbtCompound nbt)
    {
        super.readNbt(nbt);
        this.inventory = DefaultedList.ofSize(size(),ItemStack.EMPTY);
        if (!this.deserializeLootTable(nbt))
        {
            Inventories.readNbt(nbt,this.inventory);
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt)
    {
        super.writeNbt(nbt);
        if (!deserializeLootTable(nbt))
        {
            Inventories.writeNbt(nbt,this.inventory);
        }
    }
}

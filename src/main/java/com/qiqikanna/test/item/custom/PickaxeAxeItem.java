package com.qiqikanna.test.item.custom;

import com.qiqikanna.test.sound.ModSoundEvents;
import com.qiqikanna.test.tag.ModBlockTags;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PickaxeAxeItem extends AxeItem
{
    public PickaxeAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings)
    {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state)
    {
        return state.isIn(ModBlockTags.PICKAXE_AXE) ? this.miningSpeed : 1.0F;
    }

    @Override
    public boolean isSuitableFor(BlockState state)
    {
        return state.isIn(ModBlockTags.PICKAXE_AXE);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context)
    {
        super.appendTooltip(stack, world, tooltip, context);
       //tooltip.add(Text.translatable("tooltip.test-mod.pickaxe_axe"));  //最普通的tooltip直接这一行就行
        //下面这个是 按下Shift显示更多信息 的写法
        if(Screen.hasShiftDown())
        {
            tooltip.add(Text.translatable("tooltip.test-mod.pickaxe_axe.shift"));
        }
        else
        {
            tooltip.add(Text.translatable("tooltip.test-mod.press_shift"));
        }
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context)
    {
        super.useOnBlock(context);
        World world = context.getWorld();
        if (!world.isClient())
        {
            BlockState state = world.getBlockState(context.getBlockPos());
            if (state.isIn(ModBlockTags.PICKAXE_AXE))
            {
                world.playSound(null,
                        context.getBlockPos(),
                        ModSoundEvents.ITEM_PICKAXE_AXE_USE,
                        SoundCategory.BLOCKS,
                        1.0F,1.0F);
            }
        }
        return ActionResult.SUCCESS;
    }
}

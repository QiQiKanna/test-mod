package com.qiqikanna.test.event;

import com.qiqikanna.test.item.ModArmorMaterials;
import com.qiqikanna.test.util.ArmorSetUtil;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.util.ActionResult;

public class ModEvents
{
    public static void register()
    {
        AttackBlockCallback.EVENT.register(
                (player,world,hand,pos,direction) ->
                {
                    BlockState state = world.getBlockState(pos);
                    if (state.isToolRequired() && !player.isSpectator() && player.getMainHandStack().isEmpty())
                    {
                        player.damage(world.getDamageSources().generic(), 1.0F);
                        //state.onUse(world,player,hand,new BlockHitResult(player.getPos(),direction,pos,false));
                    }
                    return ActionResult.PASS;
                });
        AttackEntityCallback.EVENT.register(
                (player,world,hand,entity,entityHitResult) ->
                {
                    if (ArmorSetUtil.hasFullSetArmor(player) && ArmorSetUtil.isSameMaterial(ModArmorMaterials.ICE_ETHER,player))
                    {
                        if (entity instanceof HostileEntity && world.random.nextInt(3) == 0)
                        {
                            StatusEffectInstance effect = new StatusEffectInstance(
                                    StatusEffects.REGENERATION, 5*20,0, false,true);
                            if (!player.hasStatusEffect(effect.getEffectType()))
                            {
                                player.addStatusEffect(effect);
                            }
                        }
                    }
                    return ActionResult.PASS;
                });

    }
}

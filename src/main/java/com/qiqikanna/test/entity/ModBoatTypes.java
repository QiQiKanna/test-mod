package com.qiqikanna.test.entity;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.item.ModItems;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoatTypes
{
    public static final Identifier ICE_ETHER_BOAT = new Identifier(TestMod.MOD_ID,"ice_ether_boat");
    public static final Identifier ICE_ETHER_CHEST_BOAT = new Identifier(TestMod.MOD_ID,"ice_ether_chest_boat");
    public static final RegistryKey<TerraformBoatType> ICE_ETHER_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ICE_ETHER_BOAT);

    public static void register()
    {
        //nnd，装上Java经典坑：静态字段初始化跨类引用 了，如果这个字段写成静态字段会导致里面的item的值为null
        TerraformBoatType ICE_ETHER_BOAT_TYPE = new TerraformBoatType.Builder()
                .item(ModItems.ICE_ETHER_BOAT)
                .chestItem(ModItems.ICE_ETHER_CHEST_BOAT)
                .planks(ModItems.ICE_ETHER_PLANKS)
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE,ICE_ETHER_BOAT_KEY, ICE_ETHER_BOAT_TYPE);
    }

    @Environment(EnvType.CLIENT)
    public static void registerModelLayers()
    {
        TerraformBoatClientHelper.registerModelLayers(ICE_ETHER_BOAT,false);
    }
}

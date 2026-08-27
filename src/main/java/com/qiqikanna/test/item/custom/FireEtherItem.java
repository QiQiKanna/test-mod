package com.qiqikanna.test.item.custom;

import net.minecraft.item.Item;

public class FireEtherItem extends Item implements ModDurabilityItem
{

    public FireEtherItem(Settings settings)
    {
        super(settings.maxDamage(127));
    }
}

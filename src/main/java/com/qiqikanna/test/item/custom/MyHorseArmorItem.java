package com.qiqikanna.test.item.custom;

import com.qiqikanna.test.TestMod;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.Identifier;

public class MyHorseArmorItem extends HorseArmorItem
{
    public MyHorseArmorItem(int bonus, String name, Settings settings)
    {
        super(bonus, name, settings);
    }

    @Override
    public Identifier getEntityTexture()
    {
        return new Identifier(TestMod.MOD_ID,super.getEntityTexture().getPath());
    }
}

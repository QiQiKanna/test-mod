package com.qiqikanna.test.client.option;

import com.qiqikanna.test.TestMod;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class ModKeyBindings
{
    public static final String TEST_CATEGORIES = "key.categories.%s.test".formatted(TestMod.MOD_ID);

    public static final KeyBinding TEST_MESSAGE = register("test_massage", GLFW.GLFW_KEY_M,TEST_CATEGORIES);


    public static KeyBinding register(String name,int code,String category)
    {
        return KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.%s.%s".formatted(TestMod.MOD_ID,name) ,
                code,
                category
        ));
    }

    public static void register()
    {}
}

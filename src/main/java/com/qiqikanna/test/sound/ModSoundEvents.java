package com.qiqikanna.test.sound;

import com.qiqikanna.test.TestMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents
{
    public static final SoundEvent MUSIC_DISC_HEMOPHILIA = register("music_disc.hemophilia");
    public static final SoundEvent MUSIC_DISC_SEEPING_VOID = register("music_disc.seeping_void");
    public static final SoundEvent MUSIC_DISC_BLIZZARD = register("music_disc.blizzard");

    private static SoundEvent register(String id) {
        return register(new Identifier(TestMod.MOD_ID,id));
    }

    private static SoundEvent register(Identifier id) {
        return register(id, id);
    }
    private static SoundEvent register(Identifier id, Identifier soundId) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }
}

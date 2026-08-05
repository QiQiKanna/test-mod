package com.qiqikanna.test.village;

import com.google.common.collect.ImmutableSet;
import com.qiqikanna.test.TestMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import org.jetbrains.annotations.Nullable;


public class ModVillagers
{
    public static final VillagerProfession ICE_ETHER_MASTER = register("ice_ether_master",ModPointOfInterestTypes.ICE_ETHER_KEY, SoundEvents.ENTITY_VILLAGER_WORK_ARMORER);

    public static VillagerProfession register(String id, RegistryKey<PointOfInterestType> heldWorkstation, @Nullable SoundEvent workSound)
    {
        return Registry.register(Registries.VILLAGER_PROFESSION,new Identifier(TestMod.MOD_ID,id),
                new VillagerProfession(id,
                        entry -> entry.matchesKey(heldWorkstation),
                        entry -> entry.matchesKey(heldWorkstation),
                        ImmutableSet.of(),
                        ImmutableSet.of(),
                        workSound));
    }

    public static void registerVillagers(){}
}

package com.polo233473.learn.register;

import com.polo233473.learn.utils.Utils;
import com.polo233473.learn.world.overWorld.AuraStoneOre;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import static com.polo233473.learn.utils.Utils.*;

public class WorldRegister{
    AuraStoneOre auraStoneOre = new AuraStoneOre();

    public void OreRegister(){
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                id("learn","overworld_aura_stone_ore"),
                auraStoneOre.OVERWORLD_AURA_STONE_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                id("learn","overworld_aura_stone_ore"),
                auraStoneOre.OVERWORLD_AURA_STONE_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        id("learn","overworld_aura_stone_ore")));
    }

    public void WorldInitialize(){
        OreRegister();
    }
}

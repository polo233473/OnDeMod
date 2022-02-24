package com.polo233473.learn.world.overWorld;

import com.polo233473.learn.register.BlockRegister;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

public class AuraStoneOre {


    public AuraStoneOre(){

    }

    public ConfiguredFeature<?,?> OVERWORLD_AURA_STONE_ORE_CONFIGURED_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    BlockRegister.AURA_STONE_BLOCK.getDefaultState(),
                    9));
    public PlacedFeature OVERWORLD_AURA_STONE_ORE_PLACED_FEATURE = OVERWORLD_AURA_STONE_ORE_CONFIGURED_FEATURE
            .withPlacement(CountPlacementModifier.of(20),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(),YOffset.fixed(64)));
}

package com.cjendantix.firstmod.world.feature;


import com.cjendantix.firstmod.FirstMod;
import com.cjendantix.firstmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_RAINBOW_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DAMAGE_RAINBOW_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.HEALTH_RAINBOW_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.SPEED_RAINBOW_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> HEALTH_RAINBOW_ORE =
            ConfiguredFeatures.register("health_rainbow_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RAINBOW_ORES, 4));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DAMAGE_RAINBOW_ORE =
            ConfiguredFeatures.register("damage_rainbow_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RAINBOW_ORES, 4));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SPEED_RAINBOW_ORE =
            ConfiguredFeatures.register("speed_rainbow_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RAINBOW_ORES, 4));



    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + FirstMod.MOD_ID);
    }
}

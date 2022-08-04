package com.cjendantix.firstmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> HEALTH_RAINBOW_ORE_PLACED = PlacedFeatures.register("health_rainbow_ore_placed",
            ModConfiguredFeatures.HEALTH_RAINBOW_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> DAMAGE_RAINBOW_ORE_PLACED = PlacedFeatures.register("damage_rainbow_ore_placed",
            ModConfiguredFeatures.DAMAGE_RAINBOW_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> SPEED_RAINBOW_ORE_PLACED = PlacedFeatures.register("speed_rainbow_ore_placed",
            ModConfiguredFeatures.SPEED_RAINBOW_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));


}
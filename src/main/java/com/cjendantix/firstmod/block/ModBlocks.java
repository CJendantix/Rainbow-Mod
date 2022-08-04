package com.cjendantix.firstmod.block;

import com.cjendantix.firstmod.FirstMod;
import com.cjendantix.firstmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static Block HEALTH_RAINBOW_ORE = registerBlock("health_rainbow_ore",
            new HealthRainbowOre(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), ModItemGroup.RAINBOWMISC);

    public static Block DAMAGE_RAINBOW_ORE = registerBlock("damage_rainbow_ore",
            new DamageRainbowOre(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), ModItemGroup.RAINBOWMISC);

    public static Block SPEED_RAINBOW_ORE = registerBlock("speed_rainbow_ore",
            new SpeedRainbowOre(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), ModItemGroup.RAINBOWMISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        FirstMod.LOGGER.info("Registering ModBlocks for " + FirstMod.MOD_ID);
    }
}

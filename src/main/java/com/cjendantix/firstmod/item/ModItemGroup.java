package com.cjendantix.firstmod.item;

import com.cjendantix.firstmod.FirstMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final net.minecraft.item.ItemGroup RAINBOWMISC = FabricItemGroupBuilder.build(new Identifier(FirstMod.MOD_ID, "rainbow_misc"),
            () -> new ItemStack(RegisterItems.RAINBOW_INGOT));

    public static final net.minecraft.item.ItemGroup RAINBOWTOOLS = FabricItemGroupBuilder.build(new Identifier(FirstMod.MOD_ID, "rainbow_tools"),
            () -> new ItemStack(RegisterItems.RAINBOW_SWORD));
}

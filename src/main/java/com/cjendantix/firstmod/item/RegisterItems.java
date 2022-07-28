package com.cjendantix.firstmod.item;

import com.cjendantix.firstmod.FirstMod;
import com.cjendantix.firstmod.item.materials.RainbowSword;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    /*
    How to register an item:

    public static final Item [registry name] = registerItem("[name]", new Item(new FabricItemSettings().group(ItemGroup.[group]).[optional more settings])));
     */
    public static final Item RAINBOW_AXE = registerItem("rainbow_axe",
            new RainbowAxe(new com.cjendantix.firstmod.item.materials.RainbowAxe(), new FabricItemSettings().group(ModItemGroup.RAINBOWTOOLS)));
    public static final Item RAINBOW_SWORD = registerItem("rainbow_sword",
            new com.cjendantix.firstmod.item.RainbowSword(new RainbowSword(), new FabricItemSettings().group(ModItemGroup.RAINBOWTOOLS)));

    public static final Item RAINBOW_INGOT = registerItem("rainbow_ingot",
            new RainbowIngot(new FabricItemSettings().group(ModItemGroup.RAINBOWMISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items For " + FirstMod.MOD_ID);
    }

    public static Item getRainbowIngot() {
        return RAINBOW_INGOT;
    }

}

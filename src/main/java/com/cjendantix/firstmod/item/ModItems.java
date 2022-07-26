package com.cjendantix.firstmod.item;

import com.cjendantix.firstmod.FirstMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class ModItems {
    /*
    How to register an item:

    public static final Item [registry name] = registerItem("[name]", new Item(new FabricItemSettings().group(ItemGroup.[group]).[optional more settings])));
     */
    public static final Item FIRST_ITEM = registerItem("first_item", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items For " + FirstMod.MOD_ID);
    }

}

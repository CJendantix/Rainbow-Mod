package com.cjendantix.firstmod.item;


import com.cjendantix.firstmod.item.materials.FirstMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class FirstItem extends SwordItem {
    public FirstItem(ToolMaterial material, Settings settings) {
        super(material, 1, 1000, settings);
    }
}

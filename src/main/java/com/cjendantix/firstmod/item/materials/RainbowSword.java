package com.cjendantix.firstmod.item.materials;

import com.cjendantix.firstmod.item.RegisterItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

public class RainbowSword implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 50;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.getRainbowIngot());
    }
}

package com.cjendantix.firstmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

public class RainbowIngot extends Item {
    public RainbowIngot(Settings settings) {
        super(settings);
    }


    @Override
    public String getTranslationKey(ItemStack stack) {
        String translationKey = super.getTranslationKey() + ".type.";
        NbtCompound nbt = stack.getNbt();
        int damage = 0;
        int health = 0;
        int speed = 0;

        if (nbt==null) return super.getTranslationKey();

        if (!(nbt.getInt("damage") == 0)) {
            damage = 1;
            translationKey = translationKey + "damage";
        }
        if (!(nbt.getInt("health") == 0)) {
            health = 1;
            translationKey = translationKey + "health";
        }
        if (!(nbt.getInt("speed") == 0)) {
            speed = 1;
            translationKey = translationKey + "speed";
        }


        if (damage+health+speed == 0) {
            return super.getTranslationKey();
        }
        return translationKey;
    }

}

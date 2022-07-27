package com.cjendantix.firstmod.mixin;

import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(Items.class)
public class FirstItem {
	@ModifyConstant(
			// All inline initialisations of static fields are compiled into a single method called <clinit>
			method="<clinit>",
			// Restrict the part of the method Mixin will search for constants in
			slice=@Slice(
					// Start searching from the literal "wooden_sword"
					from=@At(value="CONSTANT", args="stringValue=wooden_sword")
			),
			// Search for the literal 3 and wrap it in a call to the annotated method
			constant=@Constant(intValue = 3, ordinal = 0)
	)
	private static int ChangeFirstItemDamage(int original) {
		return 100000;
	}
}
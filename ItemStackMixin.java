package com.example.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class ItemStackMixin {
    @Inject(method = "getHoverName", at = @At("RETURN"), cancellable = true)
    private void elytraname$rename(CallbackInfoReturnable<Component> cir) {
        Component original = cir.getReturnValue();
        if (original != null && original.getString().trim().equalsIgnoreCase("Copper Chestplate")) {
            cir.setReturnValue(Component.literal("Elytra").setStyle(original.getStyle()));
        }
    }
}

package tk.nelson2tm.shiftscrollfix.mixin;

import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Mouse.class)
public class MouseMixin {
	//Doubles and longs are counted twice, index 5 is vertical in onMouseScroll.
	@ModifyVariable(method = "onMouseScroll", at = @At("HEAD"), index = 5)
	private double scrollFix(double vertical1, long window, double horizontal, double vertical2) {
		if (vertical1 == 0) {
			return horizontal;
		}
		return vertical1;
	}
}

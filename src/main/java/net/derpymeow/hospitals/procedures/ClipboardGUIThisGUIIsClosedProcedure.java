package net.derpymeow.hospitals.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class ClipboardGUIThisGUIIsClosedProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("clipboard_text",
				(guistate.containsKey("text:clipboardText") ? ((EditBox) guistate.get("text:clipboardText")).getValue() : ""));
	}
}

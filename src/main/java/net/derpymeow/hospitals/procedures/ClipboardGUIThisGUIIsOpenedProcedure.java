package net.derpymeow.hospitals.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class ClipboardGUIThisGUIIsOpenedProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.get("text:clipboardText") instanceof EditBox _tf)
			_tf.setValue(((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("clipboard_text")));
	}
}

package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class BloodCommandHelpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Help With /Blood & Other Hospital Mod Related Questions Can Be Found Here:" + "\n" + "https://github.com/DerpyMeow/Hospitals/wiki/Blood#blood-1")), false);
	}
}

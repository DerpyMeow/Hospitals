package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class ListbloodtypesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Blood Type ID List:"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(" O+\u00A0 = 0\u00A0\u00A0\u00A0\u00A0\u00A0O-\u00A0 = 1"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(" A+\u00A0 = 2\u00A0\u00A0\u00A0\u00A0\u00A0A-\u00A0 = 3"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(" B+\u00A0 = 4\u00A0\u00A0\u00A0\u00A0\u00A0B-\u00A0 = 5"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(" AB+ = 6\u00A0\u00A0\u00A0\u00A0\u00A0AB- = 7"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Find More Info On The Wiki Page"), false);
	}
}

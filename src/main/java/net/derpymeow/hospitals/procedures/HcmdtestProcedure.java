package net.derpymeow.hospitals.procedures;

import net.minecraftforge.eventbus.api.Event;

public class HcmdtestProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (BoolArgumentType.getBool(arguments, "dmtf") == true) {
			HospitalsMod.LOGGER.warn("Hospitals: Developer Mode Active! Try Disabling If You Get Other Errors! This Setting Should Only Be Used By The Dev!");
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Hospitals: Developer Mode Active! Please Do Not Use!"), false);
		} else if (BoolArgumentType.getBool(arguments, "dmtf") == false) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Hospitals: Disabled Developer Mode"), false);
		}
	}
}
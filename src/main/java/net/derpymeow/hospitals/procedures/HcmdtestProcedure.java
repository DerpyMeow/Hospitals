package net.derpymeow.hospitals.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.derpymeow.hospitals.network.HospitalsModVariables;
import net.derpymeow.hospitals.HospitalsMod;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class HcmdtestProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (BoolArgumentType.getBool(arguments, "dmtf") == true) {
			HospitalsMod.LOGGER.warn("Hospitals: Developer Mode Active! Try Disabling If You Get Other Errors! This Setting Should Only Be Used By The Dev!");
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Hospitals: Developer Mode Active! Please Do Not Use!"), false);
			HospitalsModVariables.MapVariables.get(world).dev_mode = true;
			HospitalsModVariables.MapVariables.get(world).syncData(world);
		} else if (BoolArgumentType.getBool(arguments, "dmtf") == false) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Hospitals: Disabled Developer Mode"), false);
			HospitalsModVariables.MapVariables.get(world).dev_mode = false;
			HospitalsModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
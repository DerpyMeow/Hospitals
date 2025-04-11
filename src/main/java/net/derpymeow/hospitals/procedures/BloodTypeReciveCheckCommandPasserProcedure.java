package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class BloodTypeReciveCheckCommandPasserProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (BloodTypeReciveCheckProcedure.execute(DoubleArgumentType.getDouble(arguments, "bt1"), DoubleArgumentType.getDouble(arguments, "bt2")) == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Yes, Blood Type " + DoubleArgumentType.getDouble(arguments, "bt1") + " Can Recive Blood From Blood Type " + DoubleArgumentType.getDouble(arguments, "bt2") + ".")), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("No, Blood Type " + DoubleArgumentType.getDouble(arguments, "bt1") + " Can't Recive Blood From Blood Type " + DoubleArgumentType.getDouble(arguments, "bt2") + ".")), false);
		}
	}
}

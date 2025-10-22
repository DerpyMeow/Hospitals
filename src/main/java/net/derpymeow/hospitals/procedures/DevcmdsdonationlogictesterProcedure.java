package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class DevcmdsdonationlogictesterProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DonationLogicProcedure.execute((StringArgumentType.getString(arguments, "dl_give")).replace("]", ""), (StringArgumentType.getString(arguments, "dl_take")).replace("]", "")) == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(((StringArgumentType.getString(arguments, "dl_take") + " can recive " + StringArgumentType.getString(arguments, "dl_give")).replace("]", ""))), true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(((StringArgumentType.getString(arguments, "dl_take") + " cannot recive " + StringArgumentType.getString(arguments, "dl_give")).replace("]", ""))), true);
		}
	}
}
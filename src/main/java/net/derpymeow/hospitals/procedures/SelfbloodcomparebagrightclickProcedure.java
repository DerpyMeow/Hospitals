package net.derpymeow.hospitals.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.derpymeow.hospitals.network.HospitalsModVariables;

public class SelfbloodcomparebagrightclickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (("0").equals((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type)) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Player Has No Type!"), true);
		} else if (true == DonationLogicProcedure.execute((((itemstack.getDisplayName().getString()).substring(10)).replace("]", "")).replace(" ", ""),
				(entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type)) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(((((itemstack.getDisplayName().getString()).substring(10)).replace("]", "")).replace(" ", "") + " is compatible with "
						+ (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type)), true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(((((itemstack.getDisplayName().getString()).substring(10)).replace("]", "")).replace(" ", "") + " is not compatible with "
						+ (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type)), true);
		}
	}
}
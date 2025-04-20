package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.derpymeow.hospitals.network.HospitalsModVariables;

public class BloodPressureCuffRightClickedEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		String catagory_passer = "";
		if (GetPressureStatusProcedure.execute(entity) == 0) {
			catagory_passer = " (Normal).";
		} else if (GetPressureStatusProcedure.execute(entity) == 1) {
			catagory_passer = " (Elevated).";
		} else if (GetPressureStatusProcedure.execute(entity) == 2) {
			catagory_passer = " (Hypertension Stage 1).";
		} else if (GetPressureStatusProcedure.execute(entity) == 3) {
			catagory_passer = " (Hypertension Stage 2).";
		} else if (GetPressureStatusProcedure.execute(entity) == 4) {
			catagory_passer = " (Hypertensive Crisis).";
		}
		if (entity instanceof Player == true) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Blood Pressure Of Player: " + entity.getDisplayName().getString() + " Is "
						+ new java.text.DecimalFormat("##").format((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic) + " / "
						+ new java.text.DecimalFormat("##").format((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) + catagory_passer)),
						false);
		} else {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Cannot Find Blood Pressure: Entity Is NOT Player."), false);
		}
		catagory_passer = "";
	}
}

package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.Entity;

import net.derpymeow.hospitals.network.HospitalsModVariables;

public class BPOveralyDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).display_blood_pressure == true) {
			return true;
		} else {
			return false;
		}
	}
}

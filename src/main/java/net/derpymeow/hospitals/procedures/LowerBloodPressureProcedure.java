package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.Entity;

import net.derpymeow.hospitals.network.HospitalsModVariables;

public class LowerBloodPressureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 110;
			entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.blood_pressure_systolic = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 78;
			entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.blood_pressure_diastolic = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

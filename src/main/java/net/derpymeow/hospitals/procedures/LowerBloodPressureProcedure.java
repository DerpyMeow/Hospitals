package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.derpymeow.hospitals.network.HospitalsModVariables;

public class LowerBloodPressureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic > 110) {
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic - Mth.nextInt(RandomSource.create(), 1, 5);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_systolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic > 78) {
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic - Mth.nextInt(RandomSource.create(), 0, 2);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_diastolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

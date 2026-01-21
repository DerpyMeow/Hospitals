package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.derpymeow.hospitals.network.HospitalsModVariables;

public class RandomBloodTypeOnFirstJoinProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random_number_local = 0;
		random_number_local = Mth.nextInt(RandomSource.create(), 1, 8);
		if (random_number_local == 1) {
			{
				String _setval = "O-";
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (random_number_local == 2) {
			{
				String _setval = "O+";
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (random_number_local == 3) {
			{
				String _setval = "B-";
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (random_number_local == 4) {
			{
				String _setval = "B+";
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (random_number_local == 5) {
			{
				String _setval = "A-";
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (random_number_local == 6) {
			{
				String _setval = "A+";
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (random_number_local == 7) {
			{
				String _setval = "AB-";
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (random_number_local == 8) {
			{
				String _setval = "AB+";
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		random_number_local = 0;
	}
}
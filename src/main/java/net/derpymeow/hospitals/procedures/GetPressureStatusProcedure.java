package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.Entity;

import net.derpymeow.hospitals.network.HospitalsModVariables;

public class GetPressureStatusProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (119 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic) {
			if (129 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic) {
				if (139 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic) {
					if (179 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic) {
						return 4;
					} else {
						return 3;
					}
				} else {
					if (79 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
						if (89 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
							if (120 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
								return 4;
							} else {
								return 3;
							}
						} else {
							return 2;
						}
					} else {
						return 1;
					}
				}
			} else {
				if (79 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
					if (89 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
						if (120 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
							return 4;
						} else {
							return 3;
						}
					} else {
						return 2;
					}
				} else {
					return 1;
				}
			}
		} else {
			if (79 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
				if (89 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
					if (120 < (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic) {
						return 4;
					} else {
						return 3;
					}
				} else {
					return 2;
				}
			} else {
				return 0;
			}
		}
	}
}

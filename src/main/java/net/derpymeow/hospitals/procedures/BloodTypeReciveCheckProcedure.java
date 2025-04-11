package net.derpymeow.hospitals.procedures;

import net.derpymeow.hospitals.HospitalsMod;

public class BloodTypeReciveCheckProcedure {
	public static boolean execute(double bt1, double bt2) {
		if (bt1 == 0) {
			if (bt2 == 0) {
				return true;
			} else if (bt2 == 1) {
				return true;
			} else if (bt2 == 2) {
				return false;
			} else if (bt2 == 3) {
				return false;
			} else if (bt2 == 4) {
				return false;
			} else if (bt2 == 5) {
				return false;
			} else if (bt2 == 6) {
				return false;
			} else if (bt2 == 7) {
				return false;
			} else {
				HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
				return false;
			}
		} else if (bt1 == 1) {
			if (bt2 == 0) {
				return false;
			} else if (bt2 == 1) {
				return true;
			} else if (bt2 == 2) {
				return false;
			} else if (bt2 == 3) {
				return false;
			} else if (bt2 == 4) {
				return false;
			} else if (bt2 == 5) {
				return false;
			} else if (bt2 == 6) {
				return false;
			} else if (bt2 == 7) {
				return false;
			} else {
				HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
				return false;
			}
		} else if (bt1 == 2) {
			if (bt2 == 0) {
				return true;
			} else if (bt2 == 1) {
				return true;
			} else if (bt2 == 2) {
				return true;
			} else if (bt2 == 3) {
				return true;
			} else if (bt2 == 4) {
				return false;
			} else if (bt2 == 5) {
				return false;
			} else if (bt2 == 6) {
				return false;
			} else if (bt2 == 7) {
				return false;
			} else {
				HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
				return false;
			}
		} else if (bt1 == 3) {
			if (bt2 == 0) {
				return false;
			} else if (bt2 == 1) {
				return true;
			} else if (bt2 == 2) {
				return false;
			} else if (bt2 == 3) {
				return true;
			} else if (bt2 == 4) {
				return false;
			} else if (bt2 == 5) {
				return false;
			} else if (bt2 == 6) {
				return false;
			} else if (bt2 == 7) {
				return false;
			} else {
				HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
				return false;
			}
		} else if (bt1 == 4) {
			if (bt2 == 0) {
				return true;
			} else if (bt2 == 1) {
				return true;
			} else if (bt2 == 2) {
				return false;
			} else if (bt2 == 3) {
				return true;
			} else if (bt2 == 4) {
				return true;
			} else if (bt2 == 5) {
				return true;
			} else if (bt2 == 6) {
				return false;
			} else if (bt2 == 7) {
				return false;
			} else {
				HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
				return false;
			}
		} else if (bt1 == 5) {
			if (bt2 == 0) {
				return false;
			} else if (bt2 == 1) {
				return true;
			} else if (bt2 == 2) {
				return false;
			} else if (bt2 == 3) {
				return false;
			} else if (bt2 == 4) {
				return false;
			} else if (bt2 == 5) {
				return true;
			} else if (bt2 == 6) {
				return false;
			} else if (bt2 == 7) {
				return false;
			} else {
				HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
				return false;
			}
		} else if (bt1 == 6) {
			if (bt2 == 0) {
				return true;
			} else if (bt2 == 1) {
				return true;
			} else if (bt2 == 2) {
				return true;
			} else if (bt2 == 3) {
				return true;
			} else if (bt2 == 4) {
				return true;
			} else if (bt2 == 5) {
				return true;
			} else if (bt2 == 6) {
				return true;
			} else if (bt2 == 7) {
				return true;
			} else {
				HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
				return false;
			}
		} else if (bt1 == 7) {
			if (bt2 == 0) {
				return false;
			} else if (bt2 == 1) {
				return true;
			} else if (bt2 == 2) {
				return false;
			} else if (bt2 == 3) {
				return true;
			} else if (bt2 == 4) {
				return false;
			} else if (bt2 == 5) {
				return true;
			} else if (bt2 == 6) {
				return false;
			} else if (bt2 == 7) {
				return true;
			} else {
				HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
				return false;
			}
		} else {
			HospitalsMod.LOGGER.error("Error Durring \"BloodTypeReciveCheck\" Procedure.");
			return false;
		}
	}
}

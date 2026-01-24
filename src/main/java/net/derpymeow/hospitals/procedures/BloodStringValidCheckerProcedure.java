package net.derpymeow.hospitals.procedures;

public class BloodStringValidCheckerProcedure {
	public static boolean execute(String input) {
		if (input == null)
			return false;
		if ((input).equals("O-")) {
			return true;
		} else if ((input).equals("O+")) {
			return true;
		} else if ((input).equals("B-")) {
			return true;
		} else if ((input).equals("B+")) {
			return true;
		} else if ((input).equals("A-")) {
			return true;
		} else if ((input).equals("A+")) {
			return true;
		} else if ((input).equals("AB-")) {
			return true;
		} else if ((input).equals("AB+")) {
			return true;
		} else {
			return false;
		}
	}
}
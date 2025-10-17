package net.derpymeow.hospitals.procedures;

public class DonationLogicProcedure {
	public static boolean execute(String dl_give, String dl_take) {
		if (dl_give == null || dl_take == null)
			return false;
		if (dl_take.contains("B-") && dl_give.contains("AB-")) {
			return false;
		} else if (dl_take.contains("AB")) {
			if (dl_take.contains("-")) {
				return !dl_give.contains("+");
			} else {
				return true;
			}
		} else if (dl_take.contains("A")) {
			if (dl_take.contains("-")) {
				return (dl_give.contains("A") || dl_give.contains("O")) && !dl_give.contains("+");
			} else {
				return dl_give.contains("A") || dl_give.contains("O");
			}
		} else if (dl_take.contains("B")) {
			if (dl_take.contains("-")) {
				return (dl_give.contains("B") || dl_give.contains("O")) && !dl_give.contains("+");
			} else {
				return dl_give.contains("B") || dl_give.contains("O");
			}
		} else if (dl_take.contains("O")) {
			if (dl_take.contains("-")) {
				return dl_give.contains("O") && !dl_give.contains("+");
			} else {
				return dl_give.contains("O");
			}
		} else {
			return false;
		}
	}
}
package net.derpymeow.hospitals.procedures;

public class DonationLogicProcedure {
	public static boolean execute(String dl_give, String dl_take) {
		if (dl_give == null || dl_take == null)
			return false;
		boolean rhOK = false;
		boolean aboOK = false;
		String gABO = "";
		String tABO = "";
		String gRh = "";
		String tRh = "";
		String gRaw = "";
		String tRaw = "";
		gRaw = (dl_give).toUpperCase();
		tRaw = (dl_take).toUpperCase();
		if (BloodStringValidCheckerProcedure.execute(gRaw) && BloodStringValidCheckerProcedure.execute(tRaw)) {
			if (gRaw.contains("AB")) {
				gABO = "AB";
			} else if (gRaw.contains("A")) {
				gABO = "A";
			} else if (gRaw.contains("B")) {
				gABO = "B";
			} else {
				gABO = "O";
			}
			if (tRaw.contains("AB")) {
				tABO = "AB";
			} else if (tRaw.contains("A")) {
				tABO = "A";
			} else if (tRaw.contains("B")) {
				tABO = "B";
			} else {
				tABO = "O";
			}
			if (gRaw.contains("+")) {
				gRh = "+";
			} else {
				gRh = "-";
			}
			if (tRaw.contains("+")) {
				tRh = "+";
			} else {
				tRh = "-";
			}
			aboOK = false;
			if ((tABO).equals("O")) {
				aboOK = (gABO).equals("O");
			} else if ((tABO).equals("A")) {
				aboOK = (gABO).equals("A") || (gABO).equals("O");
			} else if ((tABO).equals("B")) {
				aboOK = (gABO).equals("B") || (gABO).equals("O");
			} else if ((tABO).equals("AB")) {
				aboOK = true;
			}
			rhOK = false;
			if ((tRh).equals("-")) {
				rhOK = (gRh).equals("-");
			} else {
				rhOK = true;
			}
			return aboOK && rhOK;
		} else {
			return false;
		}
	}
}
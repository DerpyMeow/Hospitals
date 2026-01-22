package net.derpymeow.hospitals.procedures;

import net.minecraft.world.item.ItemStack;

import net.derpymeow.hospitals.init.HospitalsModItems;
import net.derpymeow.hospitals.HospitalsMod;

public class StringtoitembloodProcedure {
	public static ItemStack execute(String inputstring) {
		if (inputstring == null)
			return ItemStack.EMPTY;
		ItemStack local_itemstack = ItemStack.EMPTY;
		if (((inputstring).toUpperCase()).equals("O-")) {
			local_itemstack = new ItemStack(HospitalsModItems.SYRINGE_BLOOD_O_NEGATIVE.get()).copy();
		} else if (((inputstring).toUpperCase()).equals("O+")) {
			local_itemstack = new ItemStack(HospitalsModItems.SYRINGE_BLOOD_O_POSITIVE.get()).copy();
		} else if (((inputstring).toUpperCase()).equals("B-")) {
			local_itemstack = new ItemStack(HospitalsModItems.SYRINGE_BLOOD_B_NEGATIVE.get()).copy();
		} else if (((inputstring).toUpperCase()).equals("B+")) {
			local_itemstack = new ItemStack(HospitalsModItems.SYRINGE_BLOOD_B_POSITIVE.get()).copy();
		} else if (((inputstring).toUpperCase()).equals("A-")) {
			local_itemstack = new ItemStack(HospitalsModItems.SYRINGE_BLOOD_A_NEGATIVE.get()).copy();
		} else if (((inputstring).toUpperCase()).equals("A+")) {
			local_itemstack = new ItemStack(HospitalsModItems.SYRINGE_BLOOD_A_POSITIVE.get()).copy();
		} else if (((inputstring).toUpperCase()).equals("AB-")) {
			local_itemstack = new ItemStack(HospitalsModItems.SYRINGE_BLOOD_AB_NEGATIVE.get()).copy();
		} else if (((inputstring).toUpperCase()).equals("AB+")) {
			local_itemstack = new ItemStack(HospitalsModItems.SYRINGE_BLOOD_AB_POSITIVE.get()).copy();
		} else {
			HospitalsMod.LOGGER.error("Hospitals: StringToItemBloodProcedure - Failed To Detect Item In String");
		}
		return local_itemstack;
	}
}
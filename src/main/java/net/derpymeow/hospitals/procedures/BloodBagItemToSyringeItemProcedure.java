package net.derpymeow.hospitals.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

import net.derpymeow.hospitals.init.HospitalsModItems;

public class BloodBagItemToSyringeItemProcedure {
	public static ItemStack execute(ItemStack input) {
		if (input.getItem() == HospitalsModItems.BLOODBAGONEGATIVE.get()) {
			return new ItemStack(HospitalsModItems.SYRINGE_BLOOD_O_NEGATIVE.get());
		} else if (input.getItem() == HospitalsModItems.BLOODBAGOPOSITIVE.get()) {
			return new ItemStack(HospitalsModItems.SYRINGE_BLOOD_O_POSITIVE.get());
		} else if (input.getItem() == HospitalsModItems.BLOODBAGBNEGATIVE.get()) {
			return new ItemStack(HospitalsModItems.SYRINGE_BLOOD_B_NEGATIVE.get());
		} else if (input.getItem() == HospitalsModItems.BLOODBAGBPOSITIVE.get()) {
			return new ItemStack(HospitalsModItems.SYRINGE_BLOOD_B_POSITIVE.get());
		} else if (input.getItem() == HospitalsModItems.BLOODBAGANEGATIVE.get()) {
			return new ItemStack(HospitalsModItems.SYRINGE_BLOOD_A_NEGATIVE.get());
		} else if (input.getItem() == HospitalsModItems.BLOODBAGAPOSITIVE.get()) {
			return new ItemStack(HospitalsModItems.SYRINGE_BLOOD_A_POSITIVE.get());
		} else if (input.getItem() == HospitalsModItems.BLOODBAGABNEGATIVE.get()) {
			return new ItemStack(HospitalsModItems.SYRINGE_BLOOD_AB_NEGATIVE.get());
		} else if (input.getItem() == HospitalsModItems.BLOODBAGABPOSITIVE.get()) {
			return new ItemStack(HospitalsModItems.SYRINGE_BLOOD_AB_POSITIVE.get());
		}
		return new ItemStack(Blocks.AIR);
	}
}
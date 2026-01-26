package net.derpymeow.hospitals.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

import net.derpymeow.hospitals.init.HospitalsModItems;

public class SyringeItemToBloodBagItemProcedure {
	public static ItemStack execute(ItemStack input) {
		if (input.getItem() == HospitalsModItems.SYRINGE_BLOOD_O_NEGATIVE.get()) {
			return new ItemStack(HospitalsModItems.BLOODBAGONEGATIVE.get());
		} else if (input.getItem() == HospitalsModItems.SYRINGE_BLOOD_O_POSITIVE.get()) {
			return new ItemStack(HospitalsModItems.BLOODBAGOPOSITIVE.get());
		} else if (input.getItem() == HospitalsModItems.SYRINGE_BLOOD_B_NEGATIVE.get()) {
			return new ItemStack(HospitalsModItems.BLOODBAGBNEGATIVE.get());
		} else if (input.getItem() == HospitalsModItems.SYRINGE_BLOOD_B_POSITIVE.get()) {
			return new ItemStack(HospitalsModItems.BLOODBAGBPOSITIVE.get());
		} else if (input.getItem() == HospitalsModItems.SYRINGE_BLOOD_A_NEGATIVE.get()) {
			return new ItemStack(HospitalsModItems.BLOODBAGANEGATIVE.get());
		} else if (input.getItem() == HospitalsModItems.SYRINGE_BLOOD_A_POSITIVE.get()) {
			return new ItemStack(HospitalsModItems.BLOODBAGAPOSITIVE.get());
		} else if (input.getItem() == HospitalsModItems.SYRINGE_BLOOD_AB_NEGATIVE.get()) {
			return new ItemStack(HospitalsModItems.BLOODBAGABNEGATIVE.get());
		} else if (input.getItem() == HospitalsModItems.SYRINGE_BLOOD_AB_POSITIVE.get()) {
			return new ItemStack(HospitalsModItems.BLOODBAGABPOSITIVE.get());
		}
		return new ItemStack(Blocks.AIR);
	}
}
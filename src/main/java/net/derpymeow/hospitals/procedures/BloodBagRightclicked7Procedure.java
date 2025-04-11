package net.derpymeow.hospitals.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.derpymeow.hospitals.network.HospitalsModVariables;
import net.derpymeow.hospitals.HospitalsMod;

public class BloodBagRightclicked7Procedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("---" + (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type + "---" + 7 + "---")), true);
		if (true == BloodTypeReciveCheckProcedure.execute((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type, 7)) {
			HospitalsMod.LOGGER.info("Hospitals/Debug: Blood Is Good For Player To Take");
			GoodBloodProcedure.execute(entity);
		} else {
			HospitalsMod.LOGGER.info("Hospitals/Debug: Blood Is Bad For Player To Take");
			BadBloodProcedure.execute(entity);
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = itemstack;
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}

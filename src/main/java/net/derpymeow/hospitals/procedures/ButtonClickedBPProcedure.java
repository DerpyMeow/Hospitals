package net.derpymeow.hospitals.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.Checkbox;

import net.derpymeow.hospitals.init.HospitalsModItems;

import java.util.HashMap;

public class ButtonClickedBPProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (true == (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOOD_BAG_EMPTY.get())) : false)) {
			if (guistate.containsKey("checkbox:sbox") && ((Checkbox) guistate.get("checkbox:sbox")).selected()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(HospitalsModItems.BLOOD_BAG_EMPTY.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 64, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(HospitalsModItems.BLOOD_BAG_4.get()).copy();
					_setstack.setCount(64);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(HospitalsModItems.BLOOD_BAG_EMPTY.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(HospitalsModItems.BLOOD_BAG_4.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}

package net.derpymeow.hospitals.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.derpymeow.hospitals.init.HospitalsModItems;

public class BottleRightClickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_0.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_1.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_1.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_2.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_2.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_3.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_3.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_4.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_4.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_5.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_5.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_6.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_6.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_7.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_7.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_8.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_8.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_9.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_9.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_10.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_10.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_11.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_11.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_12.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_12.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_13.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_13.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_14.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_14.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_15.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_15.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_16.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_16.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_17.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_17.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_18.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_18.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_19.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_19.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_20.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_20.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}

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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
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
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILLBOTTLE_21.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_21.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_22.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_22.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_23.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_23.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_24.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_24.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_25.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_25.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_26.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_26.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_27.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_27.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_28.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_28.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_29.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_29.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_30.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_30.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_31.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_31.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_32.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_32.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_33.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_33.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_34.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_34.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_35.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_35.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_36.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_36.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_37.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_37.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_38.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_38.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_39.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_39.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_40.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_40.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_41.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_41.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_42.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_42.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == HospitalsModItems.PILL_BOTTLE_43.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILL_43.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
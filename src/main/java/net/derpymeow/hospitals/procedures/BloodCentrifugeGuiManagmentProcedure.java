package net.derpymeow.hospitals.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.derpymeow.hospitals.init.HospitalsModMenus;
import net.derpymeow.hospitals.init.HospitalsModItems;

public class BloodCentrifugeGuiManagmentProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack s0 = ItemStack.EMPTY;
		ItemStack s1 = ItemStack.EMPTY;
		if (0 < new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) && 0 < new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0)) {
			s0 = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).copy();
			s1 = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu3 ? _menu3.getSlots().get(1).getItem() : ItemStack.EMPTY).copy();
			if (s0.getItem() == s1.getItem()) {
				if (HospitalsModItems.SYRINGEBLOOD_ONEGATIVE.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGONEGATIVE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (HospitalsModItems.SYRINGE_BLOOD_O_POSITIVE.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGOPOSITIVE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (HospitalsModItems.SYRINGE_BLOOD_B_NEGATIVE.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGBNEGATIVE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (HospitalsModItems.SYRINGE_BLOOD_B_POSITIVE.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGBPOSITIVE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (HospitalsModItems.SYRINGE_BLOOD_A_NEGATIVE.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGANEGATIVE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (HospitalsModItems.SYRINGE_BLOOD_A_POSITIVE.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGAPOSITIVE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (HospitalsModItems.SYRINGE_BLOOD_AB_NEGATIVE.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGABNEGATIVE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (HospitalsModItems.SYRINGE_BLOOD_AB_POSITIVE.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGABPOSITIVE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (HospitalsModItems.SYRINGE_BLOOD_MIXED.get() == s0.getItem()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.MIXED_BLOOD_BUCKET.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
						_setstack.setCount(2);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
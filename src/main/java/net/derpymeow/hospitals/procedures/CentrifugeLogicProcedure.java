package net.derpymeow.hospitals.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.derpymeow.hospitals.init.HospitalsModMenus;
import net.derpymeow.hospitals.init.HospitalsModItems;

public class CentrifugeLogicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) == 0 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(3) == 0) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(ResourceLocation.parse("hospitals:blood_bags")))
					&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HospitalsModItems.EMPTY_SYRINGE.get()
					&& new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player player && player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
								ItemStack stack = _menu.getSlots().get(sltid).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) >= 4) {
				if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGEMPTY.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = BloodBagItemToSyringeItemProcedure
							.execute(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(0).getItem() : ItemStack.EMPTY).copy();
					_setstack.setCount(4);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).remove(4);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(0).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(ResourceLocation.parse("hospitals:syringes_excluding_mixed")))
					&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HospitalsModItems.BLOODBAGEMPTY.get()
					&& new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player player && player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
								ItemStack stack = _menu.getSlots().get(sltid).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0) >= 4) {
				if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(HospitalsModItems.EMPTY_SYRINGE.get()).copy();
					_setstack.setCount(4);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = SyringeItemToBloodBagItemProcedure
							.execute(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(0).getItem() : ItemStack.EMPTY).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(4);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
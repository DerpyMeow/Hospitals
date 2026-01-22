package net.derpymeow.hospitals.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.derpymeow.hospitals.init.HospitalsModMenus;
import net.derpymeow.hospitals.init.HospitalsModItems;

public class PurifierLogicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack local_random_syringe = ItemStack.EMPTY;
		ItemStack local_random_bloodbag = ItemStack.EMPTY;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HospitalsModItems.SYRINGE_BLOOD_MIXED.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == HospitalsModItems.SYRINGE_BLOOD_MIXED
						.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			local_random_syringe = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(ResourceLocation.parse("hospitals:syringes"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				ItemStack _setstack = local_random_syringe.copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				ItemStack _setstack = local_random_syringe.copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HospitalsModItems.BLOODBAGEMPTY.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu11 ? _menu11.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == HospitalsModItems.MIXED_BLOOD_BUCKET
						.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			local_random_bloodbag = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(ResourceLocation.parse("hospitals:blood_bags"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				ItemStack _setstack = local_random_bloodbag.copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof HospitalsModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
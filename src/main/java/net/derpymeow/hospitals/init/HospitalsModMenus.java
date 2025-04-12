
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.derpymeow.hospitals.world.inventory.BloodBankGUIMenu;
import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HospitalsMod.MODID);
	public static final RegistryObject<MenuType<BloodBankGUIMenu>> BLOOD_BANK_GUI = REGISTRY.register("blood_bank_gui", () -> IForgeMenuType.create(BloodBankGUIMenu::new));
}

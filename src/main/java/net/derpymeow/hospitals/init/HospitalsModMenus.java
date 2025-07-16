
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.derpymeow.hospitals.world.inventory.Page3Menu;
import net.derpymeow.hospitals.world.inventory.Page2Menu;
import net.derpymeow.hospitals.world.inventory.Page1Menu;
import net.derpymeow.hospitals.world.inventory.HospitalsWIPInfoMenu;
import net.derpymeow.hospitals.world.inventory.BookTemplateMenu;
import net.derpymeow.hospitals.world.inventory.BloodBankGUIMenu;
import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HospitalsMod.MODID);
	public static final RegistryObject<MenuType<BloodBankGUIMenu>> BLOOD_BANK_GUI = REGISTRY.register("blood_bank_gui", () -> IForgeMenuType.create(BloodBankGUIMenu::new));
	public static final RegistryObject<MenuType<BookTemplateMenu>> BOOK_TEMPLATE = REGISTRY.register("book_template", () -> IForgeMenuType.create(BookTemplateMenu::new));
	public static final RegistryObject<MenuType<Page1Menu>> PAGE_1 = REGISTRY.register("page_1", () -> IForgeMenuType.create(Page1Menu::new));
	public static final RegistryObject<MenuType<Page2Menu>> PAGE_2 = REGISTRY.register("page_2", () -> IForgeMenuType.create(Page2Menu::new));
	public static final RegistryObject<MenuType<Page3Menu>> PAGE_3 = REGISTRY.register("page_3", () -> IForgeMenuType.create(Page3Menu::new));
	public static final RegistryObject<MenuType<HospitalsWIPInfoMenu>> HOSPITALS_WIP_INFO = REGISTRY.register("hospitals_wip_info", () -> IForgeMenuType.create(HospitalsWIPInfoMenu::new));
}

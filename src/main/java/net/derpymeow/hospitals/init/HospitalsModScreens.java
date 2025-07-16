
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.derpymeow.hospitals.client.gui.Page3Screen;
import net.derpymeow.hospitals.client.gui.Page2Screen;
import net.derpymeow.hospitals.client.gui.Page1Screen;
import net.derpymeow.hospitals.client.gui.HospitalsWIPInfoScreen;
import net.derpymeow.hospitals.client.gui.BookTemplateScreen;
import net.derpymeow.hospitals.client.gui.BloodBankGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HospitalsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HospitalsModMenus.BLOOD_BANK_GUI.get(), BloodBankGUIScreen::new);
			MenuScreens.register(HospitalsModMenus.BOOK_TEMPLATE.get(), BookTemplateScreen::new);
			MenuScreens.register(HospitalsModMenus.PAGE_1.get(), Page1Screen::new);
			MenuScreens.register(HospitalsModMenus.PAGE_2.get(), Page2Screen::new);
			MenuScreens.register(HospitalsModMenus.PAGE_3.get(), Page3Screen::new);
			MenuScreens.register(HospitalsModMenus.HOSPITALS_WIP_INFO.get(), HospitalsWIPInfoScreen::new);
		});
	}
}

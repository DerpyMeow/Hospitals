/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.derpymeow.hospitals.client.gui.Textbooksteel101GUIScreen;
import net.derpymeow.hospitals.client.gui.Textbookpill101GUIScreen;
import net.derpymeow.hospitals.client.gui.Textbookchem101GUIScreen;
import net.derpymeow.hospitals.client.gui.Textbookblood101GUIScreen;
import net.derpymeow.hospitals.client.gui.Textbookbasic101GUIScreen;
import net.derpymeow.hospitals.client.gui.PurifierGuiScreen;
import net.derpymeow.hospitals.client.gui.CentrifugeGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HospitalsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HospitalsModMenus.PURIFIER_GUI.get(), PurifierGuiScreen::new);
			MenuScreens.register(HospitalsModMenus.CENTRIFUGE_GUI.get(), CentrifugeGUIScreen::new);
			MenuScreens.register(HospitalsModMenus.TEXTBOOKCHEM_101_GUI.get(), Textbookchem101GUIScreen::new);
			MenuScreens.register(HospitalsModMenus.TEXTBOOKBLOOD_101_GUI.get(), Textbookblood101GUIScreen::new);
			MenuScreens.register(HospitalsModMenus.TEXTBOOKSTEEL_101_GUI.get(), Textbooksteel101GUIScreen::new);
			MenuScreens.register(HospitalsModMenus.TEXTBOOKPILL_101_GUI.get(), Textbookpill101GUIScreen::new);
			MenuScreens.register(HospitalsModMenus.TEXTBOOKBASIC_101_GUI.get(), Textbookbasic101GUIScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}
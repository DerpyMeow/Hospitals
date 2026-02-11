/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.derpymeow.hospitals.world.inventory.Textbooksteel101GUIMenu;
import net.derpymeow.hospitals.world.inventory.Textbookpill101GUIMenu;
import net.derpymeow.hospitals.world.inventory.Textbookchem101GUIMenu;
import net.derpymeow.hospitals.world.inventory.Textbookblood101GUIMenu;
import net.derpymeow.hospitals.world.inventory.Textbookbasic101GUIMenu;
import net.derpymeow.hospitals.world.inventory.PurifierGuiMenu;
import net.derpymeow.hospitals.world.inventory.CentrifugeGUIMenu;
import net.derpymeow.hospitals.network.MenuStateUpdateMessage;
import net.derpymeow.hospitals.HospitalsMod;

import java.util.Map;

public class HospitalsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HospitalsMod.MODID);
	public static final RegistryObject<MenuType<PurifierGuiMenu>> PURIFIER_GUI = REGISTRY.register("purifier_gui", () -> IForgeMenuType.create(PurifierGuiMenu::new));
	public static final RegistryObject<MenuType<CentrifugeGUIMenu>> CENTRIFUGE_GUI = REGISTRY.register("centrifuge_gui", () -> IForgeMenuType.create(CentrifugeGUIMenu::new));
	public static final RegistryObject<MenuType<Textbookchem101GUIMenu>> TEXTBOOKCHEM_101_GUI = REGISTRY.register("textbookchem_101_gui", () -> IForgeMenuType.create(Textbookchem101GUIMenu::new));
	public static final RegistryObject<MenuType<Textbookblood101GUIMenu>> TEXTBOOKBLOOD_101_GUI = REGISTRY.register("textbookblood_101_gui", () -> IForgeMenuType.create(Textbookblood101GUIMenu::new));
	public static final RegistryObject<MenuType<Textbooksteel101GUIMenu>> TEXTBOOKSTEEL_101_GUI = REGISTRY.register("textbooksteel_101_gui", () -> IForgeMenuType.create(Textbooksteel101GUIMenu::new));
	public static final RegistryObject<MenuType<Textbookpill101GUIMenu>> TEXTBOOKPILL_101_GUI = REGISTRY.register("textbookpill_101_gui", () -> IForgeMenuType.create(Textbookpill101GUIMenu::new));
	public static final RegistryObject<MenuType<Textbookbasic101GUIMenu>> TEXTBOOKBASIC_101_GUI = REGISTRY.register("textbookbasic_101_gui", () -> IForgeMenuType.create(Textbookbasic101GUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				HospitalsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof HospitalsModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				HospitalsMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}
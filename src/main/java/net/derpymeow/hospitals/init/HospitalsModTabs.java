
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HospitalsMod.MODID);
	public static final RegistryObject<CreativeModeTab> OPERATING_ROOMS_THM = REGISTRY.register("operating_rooms_thm",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hospitals.operating_rooms_thm")).icon(() -> new ItemStack(HospitalsModBlocks.TH_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HospitalsModBlocks.ANAESTHETIC_MACHINE.get().asItem());
				tabData.accept(HospitalsModBlocks.SURGICAL_REFRIDGERATED_CABINET.get().asItem());
				tabData.accept(HospitalsModBlocks.SURGICAL_WORKTOP_TABLE.get().asItem());
				tabData.accept(HospitalsModBlocks.SURGICAL_INSTRUMENT_TROLLEY.get().asItem());
				tabData.accept(HospitalsModBlocks.OPERATING_TABLE.get().asItem());
				tabData.accept(HospitalsModBlocks.SCRUB_SINK.get().asItem());
				tabData.accept(HospitalsModBlocks.WALL_STORAGE_TUBS_RED.get().asItem());
				tabData.accept(HospitalsModBlocks.WALL_STORAGE_TUBS_YELLOW.get().asItem());
				tabData.accept(HospitalsModBlocks.SURGICAL_LAMP.get().asItem());
				tabData.accept(HospitalsModBlocks.SURGICAL_TROLLEY.get().asItem());
				tabData.accept(HospitalsModBlocks.STERILE_WORKTOP.get().asItem());
				tabData.accept(HospitalsModBlocks.STERILE_WORK_COUNTER_WITH_SHELF.get().asItem());
				tabData.accept(HospitalsModBlocks.SURGICAL_WORKSTATION.get().asItem());
				tabData.accept(HospitalsModBlocks.OPERATING_ROOM_CONTROL_PANEL.get().asItem());
				tabData.accept(HospitalsModBlocks.SURGICAL_INSTRUMENTS.get().asItem());
				tabData.accept(HospitalsModBlocks.MEDICAL_GAS_CEILING_MOUNTED.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> PHARMACY_THM = REGISTRY.register("pharmacy_thm",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hospitals.pharmacy_thm")).icon(() -> new ItemStack(HospitalsModBlocks.PH_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HospitalsModBlocks.ILLUMINATED_PHARMACY_SIGN.get().asItem());
				tabData.accept(HospitalsModBlocks.STORE_SHELF_EMPTY.get().asItem());
				tabData.accept(HospitalsModBlocks.STORE_SHELF_STOCKED.get().asItem());
				tabData.accept(HospitalsModBlocks.COMPOUNDING_ISOLATOR.get().asItem());
				tabData.accept(HospitalsModBlocks.ANALYTICAL_BALANCE.get().asItem());
				tabData.accept(HospitalsModBlocks.REFRIDGERATED_CENTRIFUGE.get().asItem());
				tabData.accept(HospitalsModBlocks.WORKTOP_WITH_SHELF.get().asItem());
				tabData.accept(HospitalsModBlocks.WORKTOP.get().asItem());
				tabData.accept(HospitalsModBlocks.LABORATORY_FRIDGE.get().asItem());
				tabData.accept(HospitalsModBlocks.CAPSULE_FILLING_MACHINE.get().asItem());
				tabData.accept(HospitalsModBlocks.BOTTLE_FILLING_MACHINE.get().asItem());
				tabData.accept(HospitalsModBlocks.MEDICATION_DRAWERS.get().asItem());
				tabData.accept(HospitalsModBlocks.PRESCRIPTION_SHELF.get().asItem());
				tabData.accept(HospitalsModBlocks.EPOS_CASHIER_SYSTEM.get().asItem());
				tabData.accept(HospitalsModBlocks.PRESCRIPTION_BASKET_EMPTY.get().asItem());
				tabData.accept(HospitalsModBlocks.PRESCRIPTION_BASKET.get().asItem());
				tabData.accept(HospitalsModBlocks.PHARMACY_COUNTER_STOCKED.get().asItem());
				tabData.accept(HospitalsModBlocks.PHARMACY_COUNTERWITH_LOGO.get().asItem());
				tabData.accept(HospitalsModBlocks.PHARMACY_COUNTER.get().asItem());
				tabData.accept(HospitalsModBlocks.DECORATIVE_DIVIDE.get().asItem());
			}).withSearchBar().withTabsBefore(OPERATING_ROOMS_THM.getId()).build());
	public static final RegistryObject<CreativeModeTab> RADIOLOGY_THM = REGISTRY.register("radiology_thm",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hospitals.radiology_thm")).icon(() -> new ItemStack(HospitalsModBlocks.RA_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HospitalsModBlocks.ULTRASOUND.get().asItem());
				tabData.accept(HospitalsModBlocks.X_RAY_LIGHT.get().asItem());
				tabData.accept(HospitalsModBlocks.XRAY_LIGHT_BOX_BLANK.get().asItem());
				tabData.accept(HospitalsModBlocks.XRAY_LIGHT_BOX_CHEST.get().asItem());
				tabData.accept(HospitalsModBlocks.XRAY_LIGHT_BOX_FEET.get().asItem());
				tabData.accept(HospitalsModBlocks.XRAY_LIGHT_BOX_HANDS.get().asItem());
				tabData.accept(HospitalsModBlocks.XRAY_LIGHT_BOX_ARMS.get().asItem());
				tabData.accept(HospitalsModBlocks.XRAY_LIGHT_BOX_NECK.get().asItem());
				tabData.accept(HospitalsModBlocks.X_RAY_MACHINE.get().asItem());
				tabData.accept(HospitalsModBlocks.XRAY_BUCKY_STAND.get().asItem());
				tabData.accept(HospitalsModBlocks.COMPUTER_CT_SCAN_VIEWER.get().asItem());
				tabData.accept(HospitalsModBlocks.COMPUTER_X_RAY_VIEWER.get().asItem());
				tabData.accept(HospitalsModBlocks.COMPUTER_SCREEN_2_CT_SCAN_VIEWER.get().asItem());
				tabData.accept(HospitalsModBlocks.COMPUTER_SCREEN_2_XRAY_VIEWER.get().asItem());
			}).withSearchBar().withTabsBefore(PHARMACY_THM.getId()).build());
	public static final RegistryObject<CreativeModeTab> WARD_THM = REGISTRY.register("ward_thm",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hospitals.ward_thm")).icon(() -> new ItemStack(HospitalsModBlocks.WA_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HospitalsModBlocks.BEDSIDE_HEAD_UNIT.get().asItem());
				tabData.accept(HospitalsModBlocks.WARD_STORAGE_DRAWERS.get().asItem());
				tabData.accept(HospitalsModBlocks.FETAL_MONITORING_WORKSTATION.get().asItem());
				tabData.accept(HospitalsModBlocks.HOSPITAL_BED.get().asItem());
				tabData.accept(HospitalsModBlocks.IV_STAND.get().asItem());
				tabData.accept(HospitalsModBlocks.MEDICAL_WORKSTATION_CART.get().asItem());
				tabData.accept(HospitalsModBlocks.LIFE_SUPPORT_SYRINGE_PUMPS.get().asItem());
				tabData.accept(HospitalsModBlocks.HEART_RATE_MONITOR.get().asItem());
				tabData.accept(HospitalsModBlocks.WARD_RESUS_TROLLEY.get().asItem());
				tabData.accept(HospitalsModBlocks.MEDICAL_GAS_ALARM_PANEL.get().asItem());
				tabData.accept(HospitalsModBlocks.HAND_SANITISER_DISPENSER.get().asItem());
				tabData.accept(HospitalsModBlocks.RACK_SHELVING_EMPTY.get().asItem());
				tabData.accept(HospitalsModBlocks.RACK_SHELVES_LINEN.get().asItem());
			}).withSearchBar().withTabsBefore(RADIOLOGY_THM.getId()).build());
	public static final RegistryObject<CreativeModeTab> FACILITIES_THM = REGISTRY.register("facilities_thm",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hospitals.facilities_thm")).icon(() -> new ItemStack(HospitalsModBlocks.FA_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HospitalsModBlocks.FIRE_EXIT_SIGN_CEILING_MOUNTED.get().asItem());
				tabData.accept(HospitalsModBlocks.FIRE_EXIT_SIGN_WALL_MOUNTED.get().asItem());
				tabData.accept(HospitalsModBlocks.FIRE_EXTINGUISHER.get().asItem());
				tabData.accept(HospitalsModBlocks.PATIENT_INFORMAITON_POINT.get().asItem());
				tabData.accept(HospitalsModBlocks.ROLL_CAGE_STORAGE.get().asItem());
				tabData.accept(HospitalsModBlocks.SUSPENDED_CEILING.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_BLUE_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_GREY_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_WHITE_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_LIGHT_BLUE_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_GREEN_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_AQUA_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_RED_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_BLUE_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_GREY_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_WHITE_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_LIGHT_BLUE_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_GREEN_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_AQUA_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_RED_TYPE_1.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_BLUE_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_BEIGE_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_GREY_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_AQUA_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_SALMON_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_BLUE_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_BEIGE_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_GREY_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_AQUA_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_WALL_SALMON_TYPE_2.get().asItem());
				tabData.accept(HospitalsModBlocks.BRICK_BEIGE.get().asItem());
				tabData.accept(HospitalsModBlocks.BRICK_GREY.get().asItem());
				tabData.accept(HospitalsModBlocks.BRICK_DARK.get().asItem());
				tabData.accept(HospitalsModBlocks.BRICK_RED.get().asItem());
				tabData.accept(HospitalsModBlocks.SMOOTH_CONCRETE.get().asItem());
				tabData.accept(HospitalsModBlocks.PLASTERED_WALL_BEIGE.get().asItem());
				tabData.accept(HospitalsModBlocks.PLASTERED_WALL_BLUE.get().asItem());
				tabData.accept(HospitalsModBlocks.PLASTERED_WALL_GREEN.get().asItem());
				tabData.accept(HospitalsModBlocks.PLASTERED_WALL_GREY.get().asItem());
				tabData.accept(HospitalsModBlocks.PLASTERED_WALL_LIME.get().asItem());
				tabData.accept(HospitalsModBlocks.PLASTERED_WALL_SKY_BLUE.get().asItem());
				tabData.accept(HospitalsModBlocks.PLASTERED_WALL_WHITE.get().asItem());
				tabData.accept(HospitalsModBlocks.VENTILATION.get().asItem());
				tabData.accept(HospitalsModBlocks.CARDBOARD_BOX.get().asItem());
				tabData.accept(HospitalsModBlocks.VINYL_FLOOR_GREY.get().asItem());
				tabData.accept(HospitalsModBlocks.BLUE_DESK_TRAY.get().asItem());
				tabData.accept(HospitalsModBlocks.RED_DESK_TRAY.get().asItem());
				tabData.accept(HospitalsModBlocks.DRINKS_FRIDGE.get().asItem());
				tabData.accept(HospitalsModBlocks.CLEANING_TROLLEY.get().asItem());
				tabData.accept(HospitalsModBlocks.WET_FLOOR_SIGN.get().asItem());
				tabData.accept(HospitalsModBlocks.OFFICE_WALL_PHONE.get().asItem());
				tabData.accept(HospitalsModBlocks.OFFICE_DESK_PHONE.get().asItem());
				tabData.accept(HospitalsModBlocks.OFFICE_PRINTER.get().asItem());
				tabData.accept(HospitalsModBlocks.OFFICE_DESK.get().asItem());
				tabData.accept(HospitalsModBlocks.OFFICE_DESK_WITH_BACK.get().asItem());
				tabData.accept(HospitalsModBlocks.CLADDING_STONE_EFFECT.get().asItem());
				tabData.accept(HospitalsModBlocks.WASTE_BIN_DOMESTIC_WASTE.get().asItem());
				tabData.accept(HospitalsModBlocks.WASTE_BIN_CLINICAL_WASTE.get().asItem());
			}).withSearchBar().withTabsBefore(WARD_THM.getId()).build());
	public static final RegistryObject<CreativeModeTab> HOSPITALS = REGISTRY.register("hospitals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hospitals.hospitals")).icon(() -> new ItemStack(HospitalsModBlocks.MEDICAL_CROSS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HospitalsModBlocks.TH_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.PH_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.RA_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.WA_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.FA_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.MEDICAL_CROSS.get().asItem());
				tabData.accept(HospitalsModItems.SCRUBS_HELMET.get());
				tabData.accept(HospitalsModItems.SCRUBS_CHESTPLATE.get());
				tabData.accept(HospitalsModItems.SCRUBS_LEGGINGS.get());
				tabData.accept(HospitalsModItems.SCRUBS_BOOTS.get());
				tabData.accept(HospitalsModItems.NURSE_SPAWN_EGG.get());
				tabData.accept(HospitalsModItems.DOCTOR_SPAWN_EGG.get());
			}).withSearchBar().withTabsBefore(FACILITIES_THM.getId()).build());
	public static final RegistryObject<CreativeModeTab> HOSPITALSPILLS = REGISTRY.register("hospitalspills",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hospitals.hospitalspills")).icon(() -> new ItemStack(HospitalsModItems.PILL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HospitalsModItems.PILLBOTTLEEMPTY.get());
				tabData.accept(HospitalsModItems.PILL.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_0.get());
				tabData.accept(HospitalsModItems.PILL_1.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_1.get());
				tabData.accept(HospitalsModItems.PILL_2.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_2.get());
				tabData.accept(HospitalsModItems.PILL_3.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_3.get());
				tabData.accept(HospitalsModItems.PILL_4.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_4.get());
				tabData.accept(HospitalsModItems.PILL_5.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_5.get());
				tabData.accept(HospitalsModItems.PILL_6.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_6.get());
				tabData.accept(HospitalsModItems.PILL_7.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_7.get());
				tabData.accept(HospitalsModItems.PILL_8.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_8.get());
				tabData.accept(HospitalsModItems.PILL_9.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_9.get());
				tabData.accept(HospitalsModItems.PILL_10.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_10.get());
				tabData.accept(HospitalsModItems.PILL_11.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_11.get());
				tabData.accept(HospitalsModItems.PILL_12.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_12.get());
				tabData.accept(HospitalsModItems.PILL_13.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_13.get());
				tabData.accept(HospitalsModItems.PILL_14.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_14.get());
				tabData.accept(HospitalsModItems.PILL_15.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_15.get());
				tabData.accept(HospitalsModItems.PILL_16.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_16.get());
				tabData.accept(HospitalsModItems.PILL_17.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_17.get());
				tabData.accept(HospitalsModItems.PILL_18.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_18.get());
				tabData.accept(HospitalsModItems.PILL_19.get());
				tabData.accept(HospitalsModItems.PILL_BOTTLE_19.get());
				tabData.accept(HospitalsModItems.PILL_20.get());
				tabData.accept(HospitalsModItems.PILLBOTTLE_20.get());
			}).withSearchBar().withTabsBefore(HOSPITALS.getId()).build());
}


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
	public static final RegistryObject<CreativeModeTab> HOSPITALS = REGISTRY.register("hospitals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hospitals.hospitals")).icon(() -> new ItemStack(HospitalsModBlocks.MEDICAL_CROSS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HospitalsModBlocks.TH_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.PH_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.RA_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.WA_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.FA_BLOCK.get().asItem());
				tabData.accept(HospitalsModBlocks.MEDICAL_CROSS.get().asItem());
			}).withSearchBar().build());
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
			}).withSearchBar().withTabsBefore(HOSPITALS.getId()).build());
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
}

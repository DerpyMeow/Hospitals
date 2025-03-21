
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HospitalsMod.MODID);
	public static final RegistryObject<Item> TH_BLOCK = block(HospitalsModBlocks.TH_BLOCK);
	public static final RegistryObject<Item> PH_BLOCK = block(HospitalsModBlocks.PH_BLOCK);
	public static final RegistryObject<Item> RA_BLOCK = block(HospitalsModBlocks.RA_BLOCK);
	public static final RegistryObject<Item> WA_BLOCK = block(HospitalsModBlocks.WA_BLOCK);
	public static final RegistryObject<Item> FA_BLOCK = block(HospitalsModBlocks.FA_BLOCK);
	public static final RegistryObject<Item> MEDICAL_CROSS = block(HospitalsModBlocks.MEDICAL_CROSS);
	public static final RegistryObject<Item> ANAESTHETIC_MACHINE = block(HospitalsModBlocks.ANAESTHETIC_MACHINE);
	public static final RegistryObject<Item> SURGICAL_REFRIDGERATED_CABINET = block(HospitalsModBlocks.SURGICAL_REFRIDGERATED_CABINET);
	public static final RegistryObject<Item> SURGICAL_WORKTOP_TABLE = block(HospitalsModBlocks.SURGICAL_WORKTOP_TABLE);
	public static final RegistryObject<Item> SURGICAL_INSTRUMENT_TROLLEY = block(HospitalsModBlocks.SURGICAL_INSTRUMENT_TROLLEY);
	public static final RegistryObject<Item> OPERATING_TABLE = block(HospitalsModBlocks.OPERATING_TABLE);
	public static final RegistryObject<Item> SCRUB_SINK = block(HospitalsModBlocks.SCRUB_SINK);
	public static final RegistryObject<Item> WALL_STORAGE_TUBS_RED = block(HospitalsModBlocks.WALL_STORAGE_TUBS_RED);
	public static final RegistryObject<Item> WALL_STORAGE_TUBS_YELLOW = block(HospitalsModBlocks.WALL_STORAGE_TUBS_YELLOW);
	public static final RegistryObject<Item> SURGICAL_LAMP = block(HospitalsModBlocks.SURGICAL_LAMP);
	public static final RegistryObject<Item> SURGICAL_TROLLEY = block(HospitalsModBlocks.SURGICAL_TROLLEY);
	public static final RegistryObject<Item> STERILE_WORKTOP = block(HospitalsModBlocks.STERILE_WORKTOP);
	public static final RegistryObject<Item> STERILE_WORK_COUNTER_WITH_SHELF = block(HospitalsModBlocks.STERILE_WORK_COUNTER_WITH_SHELF);
	public static final RegistryObject<Item> SURGICAL_WORKSTATION = block(HospitalsModBlocks.SURGICAL_WORKSTATION);
	public static final RegistryObject<Item> OPERATING_ROOM_CONTROL_PANEL = block(HospitalsModBlocks.OPERATING_ROOM_CONTROL_PANEL);
	public static final RegistryObject<Item> SURGICAL_INSTRUMENTS = block(HospitalsModBlocks.SURGICAL_INSTRUMENTS);
	public static final RegistryObject<Item> MEDICAL_GAS_CEILING_MOUNTED = block(HospitalsModBlocks.MEDICAL_GAS_CEILING_MOUNTED);
	public static final RegistryObject<Item> ILLUMINATED_PHARMACY_SIGN = block(HospitalsModBlocks.ILLUMINATED_PHARMACY_SIGN);
	public static final RegistryObject<Item> STORE_SHELF_EMPTY = block(HospitalsModBlocks.STORE_SHELF_EMPTY);
	public static final RegistryObject<Item> STORE_SHELF_STOCKED = block(HospitalsModBlocks.STORE_SHELF_STOCKED);
	public static final RegistryObject<Item> COMPOUNDING_ISOLATOR = block(HospitalsModBlocks.COMPOUNDING_ISOLATOR);
	public static final RegistryObject<Item> ANALYTICAL_BALANCE = block(HospitalsModBlocks.ANALYTICAL_BALANCE);
	public static final RegistryObject<Item> REFRIDGERATED_CENTRIFUGE = block(HospitalsModBlocks.REFRIDGERATED_CENTRIFUGE);
	public static final RegistryObject<Item> WORKTOP_WITH_SHELF = block(HospitalsModBlocks.WORKTOP_WITH_SHELF);
	public static final RegistryObject<Item> WORKTOP = block(HospitalsModBlocks.WORKTOP);
	public static final RegistryObject<Item> LABORATORY_FRIDGE = block(HospitalsModBlocks.LABORATORY_FRIDGE);
	public static final RegistryObject<Item> CAPSULE_FILLING_MACHINE = block(HospitalsModBlocks.CAPSULE_FILLING_MACHINE);
	public static final RegistryObject<Item> BOTTLE_FILLING_MACHINE = block(HospitalsModBlocks.BOTTLE_FILLING_MACHINE);
	public static final RegistryObject<Item> MEDICATION_DRAWERS = block(HospitalsModBlocks.MEDICATION_DRAWERS);
	public static final RegistryObject<Item> PRESCRIPTION_SHELF = block(HospitalsModBlocks.PRESCRIPTION_SHELF);
	public static final RegistryObject<Item> EPOS_CASHIER_SYSTEM = block(HospitalsModBlocks.EPOS_CASHIER_SYSTEM);
	public static final RegistryObject<Item> PRESCRIPTION_BASKET_EMPTY = block(HospitalsModBlocks.PRESCRIPTION_BASKET_EMPTY);
	public static final RegistryObject<Item> PRESCRIPTION_BASKET = block(HospitalsModBlocks.PRESCRIPTION_BASKET);
	public static final RegistryObject<Item> PHARMACY_COUNTER_STOCKED = block(HospitalsModBlocks.PHARMACY_COUNTER_STOCKED);
	public static final RegistryObject<Item> PHARMACY_COUNTERWITH_LOGO = block(HospitalsModBlocks.PHARMACY_COUNTERWITH_LOGO);
	public static final RegistryObject<Item> PHARMACY_COUNTER = block(HospitalsModBlocks.PHARMACY_COUNTER);
	public static final RegistryObject<Item> DECORATIVE_DIVIDE = block(HospitalsModBlocks.DECORATIVE_DIVIDE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

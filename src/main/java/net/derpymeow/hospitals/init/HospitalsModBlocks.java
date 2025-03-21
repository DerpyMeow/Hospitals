
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.derpymeow.hospitals.block.WorktopWithShelfBlock;
import net.derpymeow.hospitals.block.WorktopBlock;
import net.derpymeow.hospitals.block.WallStorageTubsYellowBlock;
import net.derpymeow.hospitals.block.WallStorageTubsRedBlock;
import net.derpymeow.hospitals.block.WABlockBlock;
import net.derpymeow.hospitals.block.THBlockBlock;
import net.derpymeow.hospitals.block.SurgicalWorktopTableBlock;
import net.derpymeow.hospitals.block.SurgicalWorkstationBlock;
import net.derpymeow.hospitals.block.SurgicalTrolleyBlock;
import net.derpymeow.hospitals.block.SurgicalRefridgeratedCabinetBlock;
import net.derpymeow.hospitals.block.SurgicalLampBlock;
import net.derpymeow.hospitals.block.SurgicalInstrumentsBlock;
import net.derpymeow.hospitals.block.SurgicalInstrumentTrolleyBlock;
import net.derpymeow.hospitals.block.StoreShelfStockedBlock;
import net.derpymeow.hospitals.block.StoreShelfEmptyBlock;
import net.derpymeow.hospitals.block.SterileWorktopBlock;
import net.derpymeow.hospitals.block.SterileWorkCounterWithShelfBlock;
import net.derpymeow.hospitals.block.ScrubSinkBlock;
import net.derpymeow.hospitals.block.RefridgeratedCentrifugeBlock;
import net.derpymeow.hospitals.block.RABlockBlock;
import net.derpymeow.hospitals.block.PrescriptionShelfBlock;
import net.derpymeow.hospitals.block.PrescriptionBasketEmptyBlock;
import net.derpymeow.hospitals.block.PrescriptionBasketBlock;
import net.derpymeow.hospitals.block.PharmacyCounterwithLogoBlock;
import net.derpymeow.hospitals.block.PharmacyCounterStockedBlock;
import net.derpymeow.hospitals.block.PharmacyCounterBlock;
import net.derpymeow.hospitals.block.PHBlockBlock;
import net.derpymeow.hospitals.block.OperatingTableBlock;
import net.derpymeow.hospitals.block.OperatingRoomControlPanelBlock;
import net.derpymeow.hospitals.block.MedicationDrawersBlock;
import net.derpymeow.hospitals.block.MedicalGasCeilingMountedBlock;
import net.derpymeow.hospitals.block.MedicalCrossBlock;
import net.derpymeow.hospitals.block.LaboratoryFridgeBlock;
import net.derpymeow.hospitals.block.IlluminatedPharmacySignBlock;
import net.derpymeow.hospitals.block.FABlockBlock;
import net.derpymeow.hospitals.block.EPOSCashierSystemBlock;
import net.derpymeow.hospitals.block.DecorativeDivideBlock;
import net.derpymeow.hospitals.block.CompoundingIsolatorBlock;
import net.derpymeow.hospitals.block.CapsuleFillingMachineBlock;
import net.derpymeow.hospitals.block.BottleFillingMachineBlock;
import net.derpymeow.hospitals.block.AnalyticalBalanceBlock;
import net.derpymeow.hospitals.block.AnaestheticMachineBlock;
import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HospitalsMod.MODID);
	public static final RegistryObject<Block> TH_BLOCK = REGISTRY.register("th_block", () -> new THBlockBlock());
	public static final RegistryObject<Block> PH_BLOCK = REGISTRY.register("ph_block", () -> new PHBlockBlock());
	public static final RegistryObject<Block> RA_BLOCK = REGISTRY.register("ra_block", () -> new RABlockBlock());
	public static final RegistryObject<Block> WA_BLOCK = REGISTRY.register("wa_block", () -> new WABlockBlock());
	public static final RegistryObject<Block> FA_BLOCK = REGISTRY.register("fa_block", () -> new FABlockBlock());
	public static final RegistryObject<Block> MEDICAL_CROSS = REGISTRY.register("medical_cross", () -> new MedicalCrossBlock());
	public static final RegistryObject<Block> ANAESTHETIC_MACHINE = REGISTRY.register("anaesthetic_machine", () -> new AnaestheticMachineBlock());
	public static final RegistryObject<Block> SURGICAL_REFRIDGERATED_CABINET = REGISTRY.register("surgical_refridgerated_cabinet", () -> new SurgicalRefridgeratedCabinetBlock());
	public static final RegistryObject<Block> SURGICAL_WORKTOP_TABLE = REGISTRY.register("surgical_worktop_table", () -> new SurgicalWorktopTableBlock());
	public static final RegistryObject<Block> SURGICAL_INSTRUMENT_TROLLEY = REGISTRY.register("surgical_instrument_trolley", () -> new SurgicalInstrumentTrolleyBlock());
	public static final RegistryObject<Block> OPERATING_TABLE = REGISTRY.register("operating_table", () -> new OperatingTableBlock());
	public static final RegistryObject<Block> SCRUB_SINK = REGISTRY.register("scrub_sink", () -> new ScrubSinkBlock());
	public static final RegistryObject<Block> WALL_STORAGE_TUBS_RED = REGISTRY.register("wall_storage_tubs_red", () -> new WallStorageTubsRedBlock());
	public static final RegistryObject<Block> WALL_STORAGE_TUBS_YELLOW = REGISTRY.register("wall_storage_tubs_yellow", () -> new WallStorageTubsYellowBlock());
	public static final RegistryObject<Block> SURGICAL_LAMP = REGISTRY.register("surgical_lamp", () -> new SurgicalLampBlock());
	public static final RegistryObject<Block> SURGICAL_TROLLEY = REGISTRY.register("surgical_trolley", () -> new SurgicalTrolleyBlock());
	public static final RegistryObject<Block> STERILE_WORKTOP = REGISTRY.register("sterile_worktop", () -> new SterileWorktopBlock());
	public static final RegistryObject<Block> STERILE_WORK_COUNTER_WITH_SHELF = REGISTRY.register("sterile_work_counter_with_shelf", () -> new SterileWorkCounterWithShelfBlock());
	public static final RegistryObject<Block> SURGICAL_WORKSTATION = REGISTRY.register("surgical_workstation", () -> new SurgicalWorkstationBlock());
	public static final RegistryObject<Block> OPERATING_ROOM_CONTROL_PANEL = REGISTRY.register("operating_room_control_panel", () -> new OperatingRoomControlPanelBlock());
	public static final RegistryObject<Block> SURGICAL_INSTRUMENTS = REGISTRY.register("surgical_instruments", () -> new SurgicalInstrumentsBlock());
	public static final RegistryObject<Block> MEDICAL_GAS_CEILING_MOUNTED = REGISTRY.register("medical_gas_ceiling_mounted", () -> new MedicalGasCeilingMountedBlock());
	public static final RegistryObject<Block> ILLUMINATED_PHARMACY_SIGN = REGISTRY.register("illuminated_pharmacy_sign", () -> new IlluminatedPharmacySignBlock());
	public static final RegistryObject<Block> STORE_SHELF_EMPTY = REGISTRY.register("store_shelf_empty", () -> new StoreShelfEmptyBlock());
	public static final RegistryObject<Block> STORE_SHELF_STOCKED = REGISTRY.register("store_shelf_stocked", () -> new StoreShelfStockedBlock());
	public static final RegistryObject<Block> COMPOUNDING_ISOLATOR = REGISTRY.register("compounding_isolator", () -> new CompoundingIsolatorBlock());
	public static final RegistryObject<Block> ANALYTICAL_BALANCE = REGISTRY.register("analytical_balance", () -> new AnalyticalBalanceBlock());
	public static final RegistryObject<Block> REFRIDGERATED_CENTRIFUGE = REGISTRY.register("refridgerated_centrifuge", () -> new RefridgeratedCentrifugeBlock());
	public static final RegistryObject<Block> WORKTOP_WITH_SHELF = REGISTRY.register("worktop_with_shelf", () -> new WorktopWithShelfBlock());
	public static final RegistryObject<Block> WORKTOP = REGISTRY.register("worktop", () -> new WorktopBlock());
	public static final RegistryObject<Block> LABORATORY_FRIDGE = REGISTRY.register("laboratory_fridge", () -> new LaboratoryFridgeBlock());
	public static final RegistryObject<Block> CAPSULE_FILLING_MACHINE = REGISTRY.register("capsule_filling_machine", () -> new CapsuleFillingMachineBlock());
	public static final RegistryObject<Block> BOTTLE_FILLING_MACHINE = REGISTRY.register("bottle_filling_machine", () -> new BottleFillingMachineBlock());
	public static final RegistryObject<Block> MEDICATION_DRAWERS = REGISTRY.register("medication_drawers", () -> new MedicationDrawersBlock());
	public static final RegistryObject<Block> PRESCRIPTION_SHELF = REGISTRY.register("prescription_shelf", () -> new PrescriptionShelfBlock());
	public static final RegistryObject<Block> EPOS_CASHIER_SYSTEM = REGISTRY.register("epos_cashier_system", () -> new EPOSCashierSystemBlock());
	public static final RegistryObject<Block> PRESCRIPTION_BASKET_EMPTY = REGISTRY.register("prescription_basket_empty", () -> new PrescriptionBasketEmptyBlock());
	public static final RegistryObject<Block> PRESCRIPTION_BASKET = REGISTRY.register("prescription_basket", () -> new PrescriptionBasketBlock());
	public static final RegistryObject<Block> PHARMACY_COUNTER_STOCKED = REGISTRY.register("pharmacy_counter_stocked", () -> new PharmacyCounterStockedBlock());
	public static final RegistryObject<Block> PHARMACY_COUNTERWITH_LOGO = REGISTRY.register("pharmacy_counterwith_logo", () -> new PharmacyCounterwithLogoBlock());
	public static final RegistryObject<Block> PHARMACY_COUNTER = REGISTRY.register("pharmacy_counter", () -> new PharmacyCounterBlock());
	public static final RegistryObject<Block> DECORATIVE_DIVIDE = REGISTRY.register("decorative_divide", () -> new DecorativeDivideBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

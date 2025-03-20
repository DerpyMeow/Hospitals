
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.derpymeow.hospitals.block.WABlockBlock;
import net.derpymeow.hospitals.block.THBlockBlock;
import net.derpymeow.hospitals.block.RABlockBlock;
import net.derpymeow.hospitals.block.PHBlockBlock;
import net.derpymeow.hospitals.block.MedicalCrossBlock;
import net.derpymeow.hospitals.block.FABlockBlock;
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
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

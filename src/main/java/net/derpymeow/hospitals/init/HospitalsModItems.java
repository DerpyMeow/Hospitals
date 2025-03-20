
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

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

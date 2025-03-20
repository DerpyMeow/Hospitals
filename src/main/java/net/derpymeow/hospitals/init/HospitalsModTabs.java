
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
			}).withSearchBar().withTabsBefore(HOSPITALS.getId()).build());
}

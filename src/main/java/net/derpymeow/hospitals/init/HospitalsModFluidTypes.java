/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.derpymeow.hospitals.fluid.types.MixedBloodFluidType;
import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, HospitalsMod.MODID);
	public static final RegistryObject<FluidType> MIXED_BLOOD_TYPE = REGISTRY.register("mixed_blood", () -> new MixedBloodFluidType());
}
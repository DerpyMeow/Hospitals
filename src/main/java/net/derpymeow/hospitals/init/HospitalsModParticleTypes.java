
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HospitalsMod.MODID);
	public static final RegistryObject<SimpleParticleType> BLOOD_PARTICLE = REGISTRY.register("blood_particle", () -> new SimpleParticleType(true));
}

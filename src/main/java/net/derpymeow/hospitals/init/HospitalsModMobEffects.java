
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.derpymeow.hospitals.potion.TransfusionReactionMobEffect;
import net.derpymeow.hospitals.potion.BloodLossMobEffect;
import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HospitalsMod.MODID);
	public static final RegistryObject<MobEffect> TRANSFUSION_REACTION = REGISTRY.register("transfusion_reaction", () -> new TransfusionReactionMobEffect());
	public static final RegistryObject<MobEffect> BLOOD_LOSS = REGISTRY.register("blood_loss", () -> new BloodLossMobEffect());
}

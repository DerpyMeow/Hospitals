/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.derpymeow.hospitals.fluid.MixedBloodFluid;
import net.derpymeow.hospitals.HospitalsMod;

public class HospitalsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, HospitalsMod.MODID);
	public static final RegistryObject<FlowingFluid> MIXED_BLOOD = REGISTRY.register("mixed_blood", () -> new MixedBloodFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MIXED_BLOOD = REGISTRY.register("flowing_mixed_blood", () -> new MixedBloodFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MIXED_BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MIXED_BLOOD.get(), RenderType.translucent());
		}
	}
}
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.derpymeow.hospitals.client.renderer.NurseRenderer;
import net.derpymeow.hospitals.client.renderer.DoctorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HospitalsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HospitalsModEntities.NURSE.get(), NurseRenderer::new);
		event.registerEntityRenderer(HospitalsModEntities.DOCTOR.get(), DoctorRenderer::new);
	}
}
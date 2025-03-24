
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.derpymeow.hospitals.client.renderer.NurseRenderer;
import net.derpymeow.hospitals.client.renderer.DoctorRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HospitalsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HospitalsModEntities.NURSE.get(), NurseRenderer::new);
		event.registerEntityRenderer(HospitalsModEntities.DOCTOR.get(), DoctorRenderer::new);
	}
}

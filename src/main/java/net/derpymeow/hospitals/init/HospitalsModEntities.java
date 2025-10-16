/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.derpymeow.hospitals.entity.NurseEntity;
import net.derpymeow.hospitals.entity.DoctorEntity;
import net.derpymeow.hospitals.HospitalsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HospitalsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HospitalsMod.MODID);
	public static final RegistryObject<EntityType<NurseEntity>> NURSE = register("nurse",
			EntityType.Builder.<NurseEntity>of(NurseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NurseEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DoctorEntity>> DOCTOR = register("doctor",
			EntityType.Builder.<DoctorEntity>of(DoctorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DoctorEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NurseEntity.init();
			DoctorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NURSE.get(), NurseEntity.createAttributes().build());
		event.put(DOCTOR.get(), DoctorEntity.createAttributes().build());
	}
}
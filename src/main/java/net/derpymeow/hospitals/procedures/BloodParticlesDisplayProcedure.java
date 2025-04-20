package net.derpymeow.hospitals.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.derpymeow.hospitals.network.HospitalsModVariables;
import net.derpymeow.hospitals.init.HospitalsModParticleTypes;
import net.derpymeow.hospitals.init.HospitalsModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BloodParticlesDisplayProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(HospitalsModGameRules.SHOWBLOODPARTICLES) == true) {
			if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).show_blood_particles == true) {
				if (sourceentity instanceof Player == true) {
					if ((sourceentity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).show_blood_particles == true) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (HospitalsModParticleTypes.BLOOD_PARTICLE.get()), x, y, z, Mth.nextInt(RandomSource.create(), 1, 20), 3, 3, 3, 1);
					}
				} else {
					if (entity instanceof Player == true) {
						if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).show_blood_particles == true) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (HospitalsModParticleTypes.BLOOD_PARTICLE.get()), x, y, z, Mth.nextInt(RandomSource.create(), 1, 20), 3, 3, 3, 1);
						}
					}
				}
			}
		}
	}
}

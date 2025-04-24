package net.derpymeow.hospitals.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.derpymeow.hospitals.network.HospitalsModVariables;
import net.derpymeow.hospitals.init.HospitalsModMobEffects;
import net.derpymeow.hospitals.init.HospitalsModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckBPTickerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(HospitalsModGameRules.BLOODPRESSUREMECHANICS) == true) {
			if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_mechanics == true) {
				if (GetPressureStatusProcedure.execute(entity) > 2) {
					if (Mth.nextInt(RandomSource.create(), 0, 1) == 1) {
						if ((entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(HospitalsModMobEffects.SEVERE_HYPERTENSION.get())) == false) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(HospitalsModMobEffects.SEVERE_HYPERTENSION.get(), 2400, 1));
						}
					}
				}
			}
		}
	}
}

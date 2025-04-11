package net.derpymeow.hospitals.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.derpymeow.hospitals.network.HospitalsModVariables;
import net.derpymeow.hospitals.init.HospitalsModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BloodAmountTickerProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_amount < 100) {
			if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_amount < 65) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(0);
			} else {
				if (false == (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(HospitalsModMobEffects.BLOOD_LOSS.get()))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(HospitalsModMobEffects.BLOOD_LOSS.get(), 4800, 1));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Your Bloodcounts are too low! You will need to take blood!"), false);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("If your Bloodcounts drop below 65 you will die!"), false);
				}
			}
		}
		if ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_amount > 100) {
			if (true == (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(HospitalsModMobEffects.BLOOD_LOSS.get()))) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(HospitalsModMobEffects.BLOOD_LOSS.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.CONFUSION);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.BLINDNESS);
			}
		}
	}
}

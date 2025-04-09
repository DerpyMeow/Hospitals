package net.derpymeow.hospitals.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.derpymeow.hospitals.network.HospitalsModVariables;
import net.derpymeow.hospitals.HospitalsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnfirstjoinsetbloodtypeProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (9 == (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type) {
			HospitalsMod.LOGGER.info(("No Blood Type Found For Player: " + entity));
			HospitalsMod.LOGGER.info(("Assigning Blood Type For Player: " + entity));
			{
				double _setval = Mth.nextInt(RandomSource.create(), 0, 7);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			HospitalsMod.LOGGER.info(("Blood Type Of Player: " + entity + " Is " + (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type));
		}
	}
}

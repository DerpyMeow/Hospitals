package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class HighBPKillProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 2000000) == 2452) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(0);
		}
	}
}

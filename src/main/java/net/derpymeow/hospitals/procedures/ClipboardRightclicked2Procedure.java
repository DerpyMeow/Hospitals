package net.derpymeow.hospitals.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ClipboardRightclicked2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ClipboardRightclickedProcedure.execute(world, x, y, z, entity);
	}
}

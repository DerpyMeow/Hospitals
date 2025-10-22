package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.Entity;

public class WikiBookRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		HwikiprocedureProcedure.execute(entity);
	}
}

/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derpymeow.hospitals.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HospitalsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> BLOODLOSSTOGGLE = GameRules.register("bloodlosstoggle", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}

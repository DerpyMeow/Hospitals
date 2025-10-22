package net.derpymeow.hospitals.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.ChatFormatting;

public class HwikiprocedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Wiki Page: "), false);
		if (entity instanceof Player _player && !_player.level().isClientSide()) {
			_player.displayClientMessage(new Object() {
				MutableComponent clickEvent(MutableComponent comp, ClickEvent.Action type, String value) {
					return comp.withStyle(_style -> _style.withClickEvent(new ClickEvent(type, value)));
				}
			}.clickEvent(Component.literal("https://derpymeow.github.io/Hospitals/").withStyle(ChatFormatting.UNDERLINE).withStyle(ChatFormatting.AQUA), ClickEvent.Action.OPEN_URL, "https://derpymeow.github.io/Hospitals/"), false);
		}
	}
}
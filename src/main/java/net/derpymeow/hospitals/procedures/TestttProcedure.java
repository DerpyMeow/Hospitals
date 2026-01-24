package net.derpymeow.hospitals.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

public class TestttProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(
					Component.literal(
							(new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(ResourceLocation.parse("hopsitals:blood_bags"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).getDisplayName().getString())),
					false);
	}
}
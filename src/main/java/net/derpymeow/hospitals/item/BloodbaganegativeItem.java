package net.derpymeow.hospitals.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.derpymeow.hospitals.procedures.SelfbloodcomparebagrightclickProcedure;

public class BloodbaganegativeItem extends Item {
	public BloodbaganegativeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SelfbloodcomparebagrightclickProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
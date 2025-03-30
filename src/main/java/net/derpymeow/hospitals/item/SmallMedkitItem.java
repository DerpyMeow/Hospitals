
package net.derpymeow.hospitals.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.derpymeow.hospitals.procedures.SmallMedkitRightclickedProcedure;

import java.util.List;

public class SmallMedkitItem extends Item {
	public SmallMedkitItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.small_medkit.description_0"));
		list.add(Component.translatable("item.hospitals.small_medkit.description_1"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SmallMedkitRightclickedProcedure.execute(entity);
		return ar;
	}
}

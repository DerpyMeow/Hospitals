
package net.derpymeow.hospitals.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.derpymeow.hospitals.procedures.BloodPressureCuffRightclickedProcedure;
import net.derpymeow.hospitals.procedures.BloodPressureCuffRightClickedEntityProcedure;

import java.util.List;

public class BloodPressureCuffItem extends Item {
	public BloodPressureCuffItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.blood_pressure_cuff.description_0"));
		list.add(Component.translatable("item.hospitals.blood_pressure_cuff.description_1"));
		list.add(Component.translatable("item.hospitals.blood_pressure_cuff.description_2"));
		list.add(Component.translatable("item.hospitals.blood_pressure_cuff.description_3"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BloodPressureCuffRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		BloodPressureCuffRightClickedEntityProcedure.execute(entity, sourceentity);
		return retval;
	}
}

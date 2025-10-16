package net.derpymeow.hospitals.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.derpymeow.hospitals.procedures.Pill23ateProcedure;

import java.util.List;

public class Pill23Item extends Item {
	public Pill23Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(1f).alwaysEat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.pill_23.description_0"));
		list.add(Component.translatable("item.hospitals.pill_23.description_1"));
		list.add(Component.translatable("item.hospitals.pill_23.description_2"));
		list.add(Component.translatable("item.hospitals.pill_23.description_3"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Pill23ateProcedure.execute(entity);
		return retval;
	}
}

package net.derpymeow.hospitals.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.derpymeow.hospitals.procedures.HighBPKillProcedure;

import java.util.List;
import java.util.ArrayList;

public class SevereHypertensionMobEffect extends MobEffect {
	public SevereHypertensionMobEffect() {
		super(MobEffectCategory.HARMFUL, -6750208);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "e3894fc7-d381-3b29-98f6-31886700b7d3", -0.15, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(ForgeMod.SWIM_SPEED.get(), "b88836d2-c8f8-3272-b3c1-d2b471b8133f", -0.2, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, "e9a011bc-b610-3701-ad7b-c00f8a4a0d7e", -0.15, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(ForgeMod.ENTITY_GRAVITY.get(), "a82f0b05-6a6e-3215-a12e-f34223195547", 0.15, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "cafe781f-6751-3adc-9aeb-fc3115232d02", -0.15, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HighBPKillProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

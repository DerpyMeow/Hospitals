
package net.derpymeow.hospitals.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.derpymeow.hospitals.procedures.BloodLossEffectStartedappliedProcedure;

import java.util.List;
import java.util.ArrayList;

public class BloodLossMobEffect extends MobEffect {
	public BloodLossMobEffect() {
		super(MobEffectCategory.HARMFUL, -8894906);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "4d16852f-9d81-384d-8d03-dfaa5a7d4532", -0.75, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "3857928f-02d5-375a-b7c9-d5c6b43a6fcd", -0.15, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "ba9e1ee6-a1bb-3554-8a7f-0e47f7541f5e", -0.5, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		BloodLossEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

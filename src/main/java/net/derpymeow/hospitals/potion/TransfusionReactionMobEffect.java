
package net.derpymeow.hospitals.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.derpymeow.hospitals.procedures.TransfusionReactionEffectStartedappliedProcedure;

import java.util.List;
import java.util.ArrayList;

public class TransfusionReactionMobEffect extends MobEffect {
	public TransfusionReactionMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "9d5d71be-43fe-37d4-bf51-a354c6ac8069", -0.5, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "53b3d1c4-bd46-37ff-88d7-ed188b9b6f7f", -0.5, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "ef94288e-adcf-34a8-a270-4e053884ec6e", -10, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.LUCK, "b90bb617-afb0-31ce-a016-9b3dbfa8fa66", -0.75, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "d50a16e7-a788-3920-8369-0b4dd97dd655", -0.5, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		TransfusionReactionEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

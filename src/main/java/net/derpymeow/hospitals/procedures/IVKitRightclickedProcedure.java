package net.derpymeow.hospitals.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.derpymeow.hospitals.network.HospitalsModVariables;
import net.derpymeow.hospitals.init.HospitalsModItems;

public class IVKitRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean foundbag = false;
		boolean matched = false;
		ItemStack chosenBag = ItemStack.EMPTY;
		double matchTier = 0;
		String tRaw = "";
		String tABO = "";
		String tRh = "";
		String tRh_written = "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
			tRaw = ((entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_type).toUpperCase();
			if (tRaw.contains("AB")) {
				tABO = "AB";
			} else if (tRaw.contains("A")) {
				tABO = "A";
			} else if (tRaw.contains("B")) {
				tABO = "B";
			} else {
				tABO = "O";
			}
			if (tRaw.contains("+")) {
				tRh = "+";
				tRh_written = "positive";
			} else {
				tRh = "-";
				tRh_written = "negative";
			}
			foundbag = false;
			matched = false;
			matchTier = 0;
			chosenBag = new ItemStack(Blocks.AIR).copy();
			if (!foundbag && (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(ForgeRegistries.ITEMS.getValue(ResourceLocation.parse((("hospitals:bloodbag" + (tABO).toLowerCase() + (tRh_written).toLowerCase())).toLowerCase(java.util.Locale.ENGLISH)))))
					: false)) {
				foundbag = true;
				matchTier = 2;
				chosenBag = new ItemStack(ForgeRegistries.ITEMS.getValue(ResourceLocation.parse((("hospitals:bloodbag" + (tABO).toLowerCase() + (tRh_written).toLowerCase())).toLowerCase(java.util.Locale.ENGLISH)))).copy();
			} else if (!foundbag && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGONEGATIVE.get())) : false) && DonationLogicProcedure.execute("O-", tRaw)) {
				foundbag = true;
				matchTier = 1;
				chosenBag = new ItemStack(HospitalsModItems.BLOODBAGONEGATIVE.get()).copy();
			} else if (!foundbag && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGOPOSITIVE.get())) : false) && DonationLogicProcedure.execute("O+", tRaw)) {
				foundbag = true;
				matchTier = 1;
				chosenBag = new ItemStack(HospitalsModItems.BLOODBAGOPOSITIVE.get()).copy();
			} else if (!foundbag && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGANEGATIVE.get())) : false) && DonationLogicProcedure.execute("A-", tRaw)) {
				foundbag = true;
				matchTier = 1;
				chosenBag = new ItemStack(HospitalsModItems.BLOODBAGANEGATIVE.get()).copy();
			} else if (!foundbag && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGAPOSITIVE.get())) : false) && DonationLogicProcedure.execute("A+", tRaw)) {
				foundbag = true;
				matchTier = 1;
				chosenBag = new ItemStack(HospitalsModItems.BLOODBAGAPOSITIVE.get()).copy();
			} else if (!foundbag && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGBNEGATIVE.get())) : false) && DonationLogicProcedure.execute("B-", tRaw)) {
				foundbag = true;
				matchTier = 1;
				chosenBag = new ItemStack(HospitalsModItems.BLOODBAGBNEGATIVE.get()).copy();
			} else if (!foundbag && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGBPOSITIVE.get())) : false) && DonationLogicProcedure.execute("B+", tRaw)) {
				foundbag = true;
				matchTier = 1;
				chosenBag = new ItemStack(HospitalsModItems.BLOODBAGBPOSITIVE.get()).copy();
			} else if (!foundbag && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGABNEGATIVE.get())) : false) && DonationLogicProcedure.execute("AB-", tRaw)) {
				foundbag = true;
				matchTier = 1;
				chosenBag = new ItemStack(HospitalsModItems.BLOODBAGABNEGATIVE.get()).copy();
			} else if (!foundbag && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGABPOSITIVE.get())) : false) && DonationLogicProcedure.execute("AB+", tRaw)) {
				foundbag = true;
				matchTier = 1;
				chosenBag = new ItemStack(HospitalsModItems.BLOODBAGABPOSITIVE.get()).copy();
			} else if (!foundbag && ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGONEGATIVE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGOPOSITIVE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGBNEGATIVE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGBPOSITIVE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGANEGATIVE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGAPOSITIVE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGABNEGATIVE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGABPOSITIVE.get())) : false))) {
				foundbag = true;
				matchTier = -1;
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGONEGATIVE.get())) : false) {
					chosenBag = new ItemStack(HospitalsModItems.BLOODBAGONEGATIVE.get()).copy();
				} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGOPOSITIVE.get())) : false) {
					chosenBag = new ItemStack(HospitalsModItems.BLOODBAGOPOSITIVE.get()).copy();
				} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGANEGATIVE.get())) : false) {
					chosenBag = new ItemStack(HospitalsModItems.BLOODBAGANEGATIVE.get()).copy();
				} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGAPOSITIVE.get())) : false) {
					chosenBag = new ItemStack(HospitalsModItems.BLOODBAGAPOSITIVE.get()).copy();
				} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGBNEGATIVE.get())) : false) {
					chosenBag = new ItemStack(HospitalsModItems.BLOODBAGBNEGATIVE.get()).copy();
				} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGBPOSITIVE.get())) : false) {
					chosenBag = new ItemStack(HospitalsModItems.BLOODBAGBPOSITIVE.get()).copy();
				} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGABNEGATIVE.get())) : false) {
					chosenBag = new ItemStack(HospitalsModItems.BLOODBAGABNEGATIVE.get()).copy();
				} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HospitalsModItems.BLOODBAGABPOSITIVE.get())) : false) {
					chosenBag = new ItemStack(HospitalsModItems.BLOODBAGABPOSITIVE.get()).copy();
				}
			}
			if (foundbag) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = chosenBag;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(HospitalsModItems.BLOODBAGUSED.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (matchTier == 2) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 10 < (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 10);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 1, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 1, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 80, 1, false, false));
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 1, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 1, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 80, 1, false, false));
					}
				} else if (matchTier == 1) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 4 < (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 4);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 1, false, false));
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 1, false, false));
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 2 >= 1) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 2);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, 1, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 1, false, false));
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth(1);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 1, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, 1, false, false));
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You have No Blood Bags"), true);
			}
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You're Already Full Health"), true);
		}
	}
}
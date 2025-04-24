package net.derpymeow.hospitals.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.derpymeow.hospitals.network.HospitalsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FoodBPProcedureProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Items.APPLE) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.GOLDEN_APPLE) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.MELON_SLICE) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.SWEET_BERRIES) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.GLOW_BERRIES) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.CARROT) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.GOLDEN_CARROT) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.BEETROOT) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.COOKED_CHICKEN) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.COOKED_RABBIT) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.COOKED_COD) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.COOKED_SALMON) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.TROPICAL_FISH) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.MILK_BUCKET) {
			LowerBloodPressureProcedure.execute(entity);
		}
		if (itemstack.getItem() == Items.BREAD) {
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic + Mth.nextInt(RandomSource.create(), 0, 5);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_systolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic + Mth.nextInt(RandomSource.create(), 0, 2);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_diastolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (itemstack.getItem() == Items.COOKIE) {
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic + Mth.nextInt(RandomSource.create(), 0, 5);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_systolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic + Mth.nextInt(RandomSource.create(), 0, 2);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_diastolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (itemstack.getItem() == Items.CAKE) {
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic + Mth.nextInt(RandomSource.create(), 0, 5);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_systolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic + Mth.nextInt(RandomSource.create(), 0, 2);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_diastolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (itemstack.getItem() == Items.PUMPKIN_PIE) {
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic + Mth.nextInt(RandomSource.create(), 0, 5);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_systolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic + Mth.nextInt(RandomSource.create(), 0, 2);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_diastolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (itemstack.getItem() == Items.HONEY_BOTTLE) {
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_systolic + Mth.nextInt(RandomSource.create(), 0, 5);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_systolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HospitalsModVariables.PlayerVariables())).blood_pressure_diastolic + Mth.nextInt(RandomSource.create(), 0, 2);
				entity.getCapability(HospitalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood_pressure_diastolic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

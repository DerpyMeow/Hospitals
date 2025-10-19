package net.derpymeow.hospitals.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.derpymeow.hospitals.init.HospitalsModItems;
import net.derpymeow.hospitals.init.HospitalsModFluids;
import net.derpymeow.hospitals.init.HospitalsModFluidTypes;
import net.derpymeow.hospitals.init.HospitalsModBlocks;

public abstract class MixedBloodFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> HospitalsModFluidTypes.MIXED_BLOOD_TYPE.get(), () -> HospitalsModFluids.MIXED_BLOOD.get(), () -> HospitalsModFluids.FLOWING_MIXED_BLOOD.get())
			.explosionResistance(100f).bucket(() -> HospitalsModItems.MIXED_BLOOD_BUCKET.get()).block(() -> (LiquidBlock) HospitalsModBlocks.MIXED_BLOOD.get());

	private MixedBloodFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MixedBloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MixedBloodFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
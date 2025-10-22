package net.derpymeow.hospitals.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.derpymeow.hospitals.init.HospitalsModFluids;

public class MixedBloodBlock extends LiquidBlock {
	public MixedBloodBlock() {
		super(() -> HospitalsModFluids.MIXED_BLOOD.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
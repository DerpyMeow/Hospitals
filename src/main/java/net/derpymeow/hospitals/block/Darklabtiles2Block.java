package net.derpymeow.hospitals.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class Darklabtiles2Block extends Block {
	public Darklabtiles2Block() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
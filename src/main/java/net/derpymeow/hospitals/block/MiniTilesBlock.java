package net.derpymeow.hospitals.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MiniTilesBlock extends Block {
	public MiniTilesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
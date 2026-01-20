package net.derpymeow.hospitals.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class Labtiles3Block extends Block {
	public Labtiles3Block() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("block.hospitals.labtiles_3.description_0"));
		list.add(Component.translatable("block.hospitals.labtiles_3.description_1"));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
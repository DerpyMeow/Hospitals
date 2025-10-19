package net.derpymeow.hospitals.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import java.util.List;

public class Labtiles4Block extends Block {
	public Labtiles4Block() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("block.hospitals.labtiles_4.description_0"));
		list.add(Component.translatable("block.hospitals.labtiles_4.description_1"));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
package net.derpymeow.hospitals.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.derpymeow.hospitals.init.HospitalsModBlocks;

public class TDownToGoneCurtainConverterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENT.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSEGMENTEMPTY.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x + 1, y, z))))))), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 2, z + 0), Blocks.AIR.defaultBlockState(), 3);
			TDownToGoneCurtainConverterProcedure.execute(world, x + 1, y, z);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENT.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSEGMENTEMPTY.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x - 1, y, z))))))), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 2, z + 0), Blocks.AIR.defaultBlockState(), 3);
			TDownToGoneCurtainConverterProcedure.execute(world, x - 1, y, z);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENT.get()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSEGMENTEMPTY.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z + 1))))))), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
			TDownToGoneCurtainConverterProcedure.execute(world, x, y, z + 1);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENT.get()) {
			world.setBlock(BlockPos.containing(x, y, z - 1), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSEGMENTEMPTY.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z - 1))))))), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
			TDownToGoneCurtainConverterProcedure.execute(world, x, y, z - 1);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENT.get()) {
			world.setBlock(BlockPos.containing(x, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSEGMENTEMPTY.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 2, z + 0), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENTCORNER.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSSEGMENTEMPTY_CORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x + 1, y, z))))))), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 2, z + 0), Blocks.AIR.defaultBlockState(), 3);
			TDownToGoneCurtainConverterProcedure.execute(world, x + 1, y, z);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENTCORNER.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSSEGMENTEMPTY_CORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x - 1, y, z))))))), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 2, z + 0), Blocks.AIR.defaultBlockState(), 3);
			TDownToGoneCurtainConverterProcedure.execute(world, x - 1, y, z);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENTCORNER.get()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSSEGMENTEMPTY_CORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z + 1))))))), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
			TDownToGoneCurtainConverterProcedure.execute(world, x, y, z + 1);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENTCORNER.get()) {
			world.setBlock(BlockPos.containing(x, y, z - 1), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSSEGMENTEMPTY_CORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z - 1))))))), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
			TDownToGoneCurtainConverterProcedure.execute(world, x, y, z - 1);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HospitalsModBlocks.T_CURTAINRAILSEGMENTCORNER.get()) {
			world.setBlock(BlockPos.containing(x, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.T_CURTAINRAILSSEGMENTEMPTY_CORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 0, y - 2, z + 0), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
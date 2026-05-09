package net.derpymeow.hospitals.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.derpymeow.hospitals.init.HospitalsModBlocks;

public class GoneToDownCurtainConverterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == HospitalsModBlocks.CURTAIN_RAILS_SEGMENT_EMPTY.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z + 0), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x + 1, y, z + 0))))))), 3);
			if (!(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get() == (world.getBlockState(BlockPos.containing(x + 1, y - 2, z + 0))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 1, y - 2, z + 0))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 0))).getBlock()) {
					world.setBlock(BlockPos.containing(x + 1, y - 2, z + 0), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x + 1, y, z + 0))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x + 1, y, z + 0), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 1), y, (z + 0), new ItemStack(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			GoneToDownCurtainConverterProcedure.execute(world, x + 1, y, z, blockstate);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == HospitalsModBlocks.CURTAIN_RAILS_SEGMENT_EMPTY.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x - 1, y, z))))))), 3);
			if (!(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get() == (world.getBlockState(BlockPos.containing(x - 1, y - 2, z + 0))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x - 1, y - 2, z + 0))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 0))).getBlock()) {
					world.setBlock(BlockPos.containing(x - 1, y - 2, z + 0), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x - 1, y, z + 0))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x - 1, y, z + 0), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x - 1), y, (z + 0), new ItemStack(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			GoneToDownCurtainConverterProcedure.execute(world, x - 1, y, z, blockstate);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == HospitalsModBlocks.CURTAIN_RAILS_SEGMENT_EMPTY.get()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z + 1))))))), 3);
			if (!(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get() == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 1))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 1))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 1))).getBlock()) {
					world.setBlock(BlockPos.containing(x + 0, y - 2, z + 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x + 0, y, z + 1))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x + 0, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0), y, (z + 1), new ItemStack(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			GoneToDownCurtainConverterProcedure.execute(world, x, y, z + 1, blockstate);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == HospitalsModBlocks.CURTAIN_RAILS_SEGMENT_EMPTY.get()) {
			world.setBlock(BlockPos.containing(x, y, z - 1), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z - 1))))))), 3);
			if (!(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get() == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z - 1))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z - 1))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 1, z - 1))).getBlock()) {
					world.setBlock(BlockPos.containing(x + 0, y - 2, z - 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x + 0, y, z - 1))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x + 0, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0), y, (z - 1), new ItemStack(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			GoneToDownCurtainConverterProcedure.execute(world, x, y, z - 1, blockstate);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HospitalsModBlocks.CURTAIN_RAILS_SEGMENT_EMPTY.get()) {
			world.setBlock(BlockPos.containing(x, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
			if (!(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get() == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock()) {
					world.setBlock(BlockPos.containing(x + 0, y - 2, z + 0), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAIN_MAIN_SEGMENT.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x + 0, y, z + 0))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HospitalsModBlocks.CURTAIN_RAIL_SEGMENT.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == HospitalsModBlocks.CURTAINRAILSSEGMENTEMPTY_CORNER.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z + 0), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x + 1, y, z + 0))))))), 3);
			if (!(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get() == (world.getBlockState(BlockPos.containing(x + 1, y - 2, z + 0))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 1, y - 2, z + 0))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 0))).getBlock()) {
					world.setBlock(BlockPos.containing(x + 1, y - 2, z + 0), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x + 1, y, z + 0))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x + 1, y, z + 0), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 1), y, (z + 0), new ItemStack(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			GoneToDownCurtainConverterProcedure.execute(world, x + 1, y, z, blockstate);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == HospitalsModBlocks.CURTAINRAILSSEGMENTEMPTY_CORNER.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x - 1, y, z))))))), 3);
			if (!(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get() == (world.getBlockState(BlockPos.containing(x - 1, y - 2, z + 0))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x - 1, y - 2, z + 0))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 0))).getBlock()) {
					world.setBlock(BlockPos.containing(x - 1, y - 2, z + 0), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x - 1, y, z + 0))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x - 1, y, z + 0), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x - 1), y, (z + 0), new ItemStack(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			GoneToDownCurtainConverterProcedure.execute(world, x - 1, y, z, blockstate);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == HospitalsModBlocks.CURTAINRAILSSEGMENTEMPTY_CORNER.get()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z + 1))))))), 3);
			if (!(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get() == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 1))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 1))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 1))).getBlock()) {
					world.setBlock(BlockPos.containing(x + 0, y - 2, z + 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x + 0, y, z + 1))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x + 0, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0), y, (z + 1), new ItemStack(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			GoneToDownCurtainConverterProcedure.execute(world, x, y, z + 1, blockstate);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == HospitalsModBlocks.CURTAINRAILSSEGMENTEMPTY_CORNER.get()) {
			world.setBlock(BlockPos.containing(x, y, z - 1), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z - 1))))))), 3);
			if (!(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get() == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z - 1))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z - 1))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 1, z - 1))).getBlock()) {
					world.setBlock(BlockPos.containing(x + 0, y - 2, z - 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x + 0, y, z - 1))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x + 0, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0), y, (z - 1), new ItemStack(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			GoneToDownCurtainConverterProcedure.execute(world, x, y, z - 1, blockstate);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HospitalsModBlocks.CURTAINRAILSSEGMENTEMPTY_CORNER.get()) {
			world.setBlock(BlockPos.containing(x, y, z), (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get().defaultBlockState(), (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
			if (!(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get() == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock())) {
				if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock() && Blocks.AIR == (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock()) {
					world.setBlock(BlockPos.containing(x + 0, y - 2, z + 0), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(HospitalsModBlocks.CURTAINMAINSEGMENTCORNER.get().defaultBlockState(), (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x + 0, y, z + 0))))))), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HospitalsModBlocks.CURTAINRAILSEGMENTCORNER.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
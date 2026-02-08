package net.derpymeow.hospitals.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.derpymeow.hospitals.HospitalsMod;

public class IDCardScannerOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		ItemStack id_item = ItemStack.EMPTY;
		id_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
		if (id_item.is(ItemTags.create(ResourceLocation.parse("hospitals:valid_id_for_scanner")))) {
			if (!(blockstate.getBlock().getStateDefinition().getProperty("is_unlocked") instanceof BooleanProperty _getbp3 && blockstate.getValue(_getbp3))) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("is_unlocked") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("powered") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x - 1, y, z - 1);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x - 0, y, z - 1);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x + 1, y, z - 1);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x - 1, y, z - 0);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x + 1, y, z - 0);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x - 1, y, z + 1);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x - 0, y, z + 1);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockPos _pos = BlockPos.containing(x + 1, y, z + 1);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z - 1), _level.getBlockState(BlockPos.containing(x - 1, y, z - 1)).getBlock());
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x - 0, y, z - 1), _level.getBlockState(BlockPos.containing(x - 0, y, z - 1)).getBlock());
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z - 1), _level.getBlockState(BlockPos.containing(x + 1, y, z - 1)).getBlock());
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z - 0), _level.getBlockState(BlockPos.containing(x - 1, y, z - 0)).getBlock());
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z - 0), _level.getBlockState(BlockPos.containing(x + 1, y, z - 0)).getBlock());
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z + 1), _level.getBlockState(BlockPos.containing(x - 1, y, z + 1)).getBlock());
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x - 0, y, z + 1), _level.getBlockState(BlockPos.containing(x - 0, y, z + 1)).getBlock());
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z + 1), _level.getBlockState(BlockPos.containing(x + 1, y, z + 1)).getBlock());
				{
					int _value = 15;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("power") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
				CallsoundIDvalidProcedure.execute(world, x, y, z);
				HospitalsMod.queueServerWork(100, () -> {
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("powered") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("power") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("is_unlocked") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z - 1);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 0, y, z - 1);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z - 1);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z - 0);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z - 0);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z + 1);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 0, y, z + 1);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z + 1);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("opem") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
					}
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z - 1), _level.getBlockState(BlockPos.containing(x - 1, y, z - 1)).getBlock());
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x - 0, y, z - 1), _level.getBlockState(BlockPos.containing(x - 0, y, z - 1)).getBlock());
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z - 1), _level.getBlockState(BlockPos.containing(x + 1, y, z - 1)).getBlock());
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z - 0), _level.getBlockState(BlockPos.containing(x - 1, y, z - 0)).getBlock());
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z - 0), _level.getBlockState(BlockPos.containing(x + 1, y, z - 0)).getBlock());
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z + 1), _level.getBlockState(BlockPos.containing(x - 1, y, z + 1)).getBlock());
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x - 0, y, z + 1), _level.getBlockState(BlockPos.containing(x - 0, y, z + 1)).getBlock());
					if (world instanceof Level _level)
						_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z + 1), _level.getBlockState(BlockPos.containing(x + 1, y, z + 1)).getBlock());
				});
			}
		} else {
			CallsoundIDInvalidProcedure.execute(world, x, y, z);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Invalid ID"), true);
		}
	}
}
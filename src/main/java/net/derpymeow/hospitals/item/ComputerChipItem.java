package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ComputerChipItem extends Item {
	public ComputerChipItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
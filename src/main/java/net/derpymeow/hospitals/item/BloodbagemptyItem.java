package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BloodbagemptyItem extends Item {
	public BloodbagemptyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
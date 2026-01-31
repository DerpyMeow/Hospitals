package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CalenderItem extends Item {
	public CalenderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
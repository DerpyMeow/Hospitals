package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RetractorItem extends Item {
	public RetractorItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
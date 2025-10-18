package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SyringeBloodABNegativeItem extends Item {
	public SyringeBloodABNegativeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
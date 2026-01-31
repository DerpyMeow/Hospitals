package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MugItem extends Item {
	public MugItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
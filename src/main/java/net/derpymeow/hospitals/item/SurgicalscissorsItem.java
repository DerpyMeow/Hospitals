package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SurgicalscissorsItem extends Item {
	public SurgicalscissorsItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
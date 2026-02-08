package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PercussionhammerItem extends Item {
	public PercussionhammerItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
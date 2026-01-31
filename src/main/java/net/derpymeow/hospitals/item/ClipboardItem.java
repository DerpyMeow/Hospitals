package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ClipboardItem extends Item {
	public ClipboardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
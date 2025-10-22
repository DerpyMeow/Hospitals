package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SyringeBloodAPositiveItem extends Item {
	public SyringeBloodAPositiveItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
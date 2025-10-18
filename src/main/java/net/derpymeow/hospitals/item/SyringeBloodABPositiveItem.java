package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SyringeBloodABPositiveItem extends Item {
	public SyringeBloodABPositiveItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
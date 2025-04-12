
package net.derpymeow.hospitals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BloodBagEmptyItem extends Item {
	public BloodBagEmptyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}

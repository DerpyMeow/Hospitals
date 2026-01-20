package net.derpymeow.hospitals.item;

public class EmptySyringeItem extends Item {
	public EmptySyringeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
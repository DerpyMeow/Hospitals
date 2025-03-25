
package net.derpymeow.hospitals.item;

public class Pill6Item extends Item {
	public Pill6Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(1f).alwaysEat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.pill_6.description_0"));
		list.add(Component.translatable("item.hospitals.pill_6.description_1"));
		list.add(Component.translatable("item.hospitals.pill_6.description_2"));
		list.add(Component.translatable("item.hospitals.pill_6.description_3"));
	}
}
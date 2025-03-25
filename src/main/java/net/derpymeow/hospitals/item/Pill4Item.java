
package net.derpymeow.hospitals.item;

public class Pill4Item extends Item {
	public Pill4Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(1f).alwaysEat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.pill_4.description_0"));
		list.add(Component.translatable("item.hospitals.pill_4.description_1"));
		list.add(Component.translatable("item.hospitals.pill_4.description_2"));
		list.add(Component.translatable("item.hospitals.pill_4.description_3"));
	}
}
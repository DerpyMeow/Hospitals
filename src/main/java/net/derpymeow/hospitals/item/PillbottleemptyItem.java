
package net.derpymeow.hospitals.item;

public class PillbottleemptyItem extends Item {
	public PillbottleemptyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.pillbottleempty.description_0"));
		list.add(Component.translatable("item.hospitals.pillbottleempty.description_1"));
	}
}

package net.derpymeow.hospitals.item;

public class Pillbottle0Item extends Item {
	public Pillbottle0Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.pillbottle_0.description_0"));
		list.add(Component.translatable("item.hospitals.pillbottle_0.description_1"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BottleRightClickProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
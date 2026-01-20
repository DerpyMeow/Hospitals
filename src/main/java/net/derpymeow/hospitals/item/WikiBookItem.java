package net.derpymeow.hospitals.item;

public class WikiBookItem extends Item {
	public WikiBookItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.wiki_book.description_0"));
		list.add(Component.translatable("item.hospitals.wiki_book.description_1"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		WikiBookRightclickedProcedure.execute();
		return ar;
	}
}
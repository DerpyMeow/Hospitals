package net.derpymeow.hospitals.item;

public class BloodbagabpositiveItem extends Item {
	public BloodbagabpositiveItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SelfbloodcomparebagrightclickProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
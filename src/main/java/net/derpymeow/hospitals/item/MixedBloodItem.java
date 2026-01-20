package net.derpymeow.hospitals.item;

import net.minecraft.network.chat.Component;

public class MixedBloodItem extends BucketItem {

	public MixedBloodItem() {
		super(HospitalsModFluids.MIXED_BLOOD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.hospitals.mixed_blood_bucket.description_0"));
	}
}
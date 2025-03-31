
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.derpymeow.hospitals.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HospitalsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == HospitalsModVillagerProfessions.PHARMACIST.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(HospitalsModItems.PILLBOTTLE_0.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 45),

					new ItemStack(HospitalsModItems.PILLBOTTLE_1.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 40),

					new ItemStack(HospitalsModItems.PILLBOTTLE_2.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.EMERALD, 36), new ItemStack(HospitalsModItems.PILLBOTTLE_3.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(HospitalsModItems.PILLBOTTLE_4.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_5.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25),

					new ItemStack(HospitalsModItems.PILLBOTTLE_6.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

					new ItemStack(HospitalsModItems.PILLBOTTLE_7.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_8.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

					new ItemStack(HospitalsModItems.PILLBOTTLE_9.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_10.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 35),

					new ItemStack(HospitalsModItems.PILLBOTTLE_11.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 40),

					new ItemStack(HospitalsModItems.PILLBOTTLE_12.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 30),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_13.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 50),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_14.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.EMERALD, 20), new ItemStack(HospitalsModItems.PILL_BOTTLE_15.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 55),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_16.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.EMERALD, 64), new ItemStack(HospitalsModItems.PILL_BOTTLE_17.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_18.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_19.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.EMERALD, 64), new ItemStack(HospitalsModItems.PILLBOTTLE_20.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 55),

					new ItemStack(HospitalsModItems.PILLBOTTLE_21.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.EMERALD, 64), new ItemStack(HospitalsModItems.PILL_BOTTLE_22.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 45),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_23.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 40),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_24.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_25.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 50),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_26.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.EMERALD, 64), new ItemStack(HospitalsModItems.PILL_BOTTLE_27.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 35),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_28.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 45),

					new ItemStack(HospitalsModItems.PILL_BOTTLE_29.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_30.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_31.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_32.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_33.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_34.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_35.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_36.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_37.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_38.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_39.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_40.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_41.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_42.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 32), new ItemStack(HospitalsModItems.PILL_BOTTLE_43.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.GLASS), new ItemStack(Items.ORANGE_DYE, 8), new ItemStack(HospitalsModItems.PILLBOTTLEEMPTY.get(), 8), 10, 5, 0.05f));
		}
	}
}

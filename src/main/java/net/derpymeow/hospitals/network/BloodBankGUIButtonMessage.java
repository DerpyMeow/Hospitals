
package net.derpymeow.hospitals.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.derpymeow.hospitals.world.inventory.BloodBankGUIMenu;
import net.derpymeow.hospitals.procedures.ButtonClickedOPProcedure;
import net.derpymeow.hospitals.procedures.ButtonClickedOMProcedure;
import net.derpymeow.hospitals.procedures.ButtonClickedBPProcedure;
import net.derpymeow.hospitals.procedures.ButtonClickedBMProcedure;
import net.derpymeow.hospitals.procedures.ButtonClickedAPProcedure;
import net.derpymeow.hospitals.procedures.ButtonClickedAMProcedure;
import net.derpymeow.hospitals.procedures.ButtonClickedABPProcedure;
import net.derpymeow.hospitals.procedures.ButtonClickedABMProcedure;
import net.derpymeow.hospitals.HospitalsMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BloodBankGUIButtonMessage {
	private final int buttonID, x, y, z;

	public BloodBankGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BloodBankGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BloodBankGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BloodBankGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BloodBankGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ButtonClickedAPProcedure.execute(entity, guistate);
		}
		if (buttonID == 1) {

			ButtonClickedAMProcedure.execute(entity, guistate);
		}
		if (buttonID == 2) {

			ButtonClickedBPProcedure.execute(entity, guistate);
		}
		if (buttonID == 3) {

			ButtonClickedBMProcedure.execute(entity, guistate);
		}
		if (buttonID == 4) {

			ButtonClickedOPProcedure.execute(entity, guistate);
		}
		if (buttonID == 5) {

			ButtonClickedOMProcedure.execute(entity, guistate);
		}
		if (buttonID == 6) {

			ButtonClickedABPProcedure.execute(entity, guistate);
		}
		if (buttonID == 7) {

			ButtonClickedABMProcedure.execute(entity, guistate);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HospitalsMod.addNetworkMessage(BloodBankGUIButtonMessage.class, BloodBankGUIButtonMessage::buffer, BloodBankGUIButtonMessage::new, BloodBankGUIButtonMessage::handler);
	}
}

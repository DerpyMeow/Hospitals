package net.derpymeow.hospitals.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.derpymeow.hospitals.HospitalsMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HospitalsModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		HospitalsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.blood_type = original.blood_type;
			clone.display_blood_counter = original.display_blood_counter;
			clone.hurt_blood_loss = original.hurt_blood_loss;
			clone.show_blood_particles = original.show_blood_particles;
			clone.display_blood_pressure = original.display_blood_pressure;
			clone.blood_pressure_mechanics = original.blood_pressure_mechanics;
			if (!event.isWasDeath()) {
				clone.blood_amount = original.blood_amount;
				clone.blood_pressure_systolic = original.blood_pressure_systolic;
				clone.blood_pressure_diastolic = original.blood_pressure_diastolic;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("hospitals", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double blood_type = 9.0;
		public double blood_amount = 160.0;
		public boolean display_blood_counter = false;
		public boolean hurt_blood_loss = true;
		public boolean show_blood_particles = true;
		public double blood_pressure_systolic = 110.0;
		public double blood_pressure_diastolic = 68.0;
		public boolean display_blood_pressure = false;
		public boolean blood_pressure_mechanics = true;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				HospitalsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("blood_type", blood_type);
			nbt.putDouble("blood_amount", blood_amount);
			nbt.putBoolean("display_blood_counter", display_blood_counter);
			nbt.putBoolean("hurt_blood_loss", hurt_blood_loss);
			nbt.putBoolean("show_blood_particles", show_blood_particles);
			nbt.putDouble("blood_pressure_systolic", blood_pressure_systolic);
			nbt.putDouble("blood_pressure_diastolic", blood_pressure_diastolic);
			nbt.putBoolean("display_blood_pressure", display_blood_pressure);
			nbt.putBoolean("blood_pressure_mechanics", blood_pressure_mechanics);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			blood_type = nbt.getDouble("blood_type");
			blood_amount = nbt.getDouble("blood_amount");
			display_blood_counter = nbt.getBoolean("display_blood_counter");
			hurt_blood_loss = nbt.getBoolean("hurt_blood_loss");
			show_blood_particles = nbt.getBoolean("show_blood_particles");
			blood_pressure_systolic = nbt.getDouble("blood_pressure_systolic");
			blood_pressure_diastolic = nbt.getDouble("blood_pressure_diastolic");
			display_blood_pressure = nbt.getBoolean("display_blood_pressure");
			blood_pressure_mechanics = nbt.getBoolean("blood_pressure_mechanics");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.blood_type = message.data.blood_type;
					variables.blood_amount = message.data.blood_amount;
					variables.display_blood_counter = message.data.display_blood_counter;
					variables.hurt_blood_loss = message.data.hurt_blood_loss;
					variables.show_blood_particles = message.data.show_blood_particles;
					variables.blood_pressure_systolic = message.data.blood_pressure_systolic;
					variables.blood_pressure_diastolic = message.data.blood_pressure_diastolic;
					variables.display_blood_pressure = message.data.display_blood_pressure;
					variables.blood_pressure_mechanics = message.data.blood_pressure_mechanics;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

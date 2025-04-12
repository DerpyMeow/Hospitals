package net.derpymeow.hospitals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.derpymeow.hospitals.world.inventory.BloodBankGUIMenu;
import net.derpymeow.hospitals.network.BloodBankGUIButtonMessage;
import net.derpymeow.hospitals.HospitalsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BloodBankGUIScreen extends AbstractContainerScreen<BloodBankGUIMenu> {
	private final static HashMap<String, Object> guistate = BloodBankGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_a;
	Button button_a1;
	Button button_b;
	Button button_b1;
	Button button_o;
	Button button_o1;
	Button button_ab;
	Button button_ab1;

	public BloodBankGUIScreen(BloodBankGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 235;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("hospitals:textures/screens/blood_bank_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_blood_bank"), 91, 3, -52429, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_select_type"), 88, 14, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_empty"), 6, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_blood"), 4, 18, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_bag"), 8, 28, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_empty1"), 5, 41, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_a = Button.builder(Component.translatable("gui.hospitals.blood_bank_gui.button_a"), e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BloodBankGUIButtonMessage(0, x, y, z));
				BloodBankGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 38, this.topPos + 25, 35, 20).build();
		guistate.put("button:button_a", button_a);
		this.addRenderableWidget(button_a);
		button_a1 = Button.builder(Component.translatable("gui.hospitals.blood_bank_gui.button_a1"), e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BloodBankGUIButtonMessage(1, x, y, z));
				BloodBankGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 38, this.topPos + 49, 35, 20).build();
		guistate.put("button:button_a1", button_a1);
		this.addRenderableWidget(button_a1);
		button_b = Button.builder(Component.translatable("gui.hospitals.blood_bank_gui.button_b"), e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BloodBankGUIButtonMessage(2, x, y, z));
				BloodBankGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 77, this.topPos + 25, 35, 20).build();
		guistate.put("button:button_b", button_b);
		this.addRenderableWidget(button_b);
		button_b1 = Button.builder(Component.translatable("gui.hospitals.blood_bank_gui.button_b1"), e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BloodBankGUIButtonMessage(3, x, y, z));
				BloodBankGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 77, this.topPos + 49, 35, 20).build();
		guistate.put("button:button_b1", button_b1);
		this.addRenderableWidget(button_b1);
		button_o = Button.builder(Component.translatable("gui.hospitals.blood_bank_gui.button_o"), e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BloodBankGUIButtonMessage(4, x, y, z));
				BloodBankGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 116, this.topPos + 25, 35, 20).build();
		guistate.put("button:button_o", button_o);
		this.addRenderableWidget(button_o);
		button_o1 = Button.builder(Component.translatable("gui.hospitals.blood_bank_gui.button_o1"), e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BloodBankGUIButtonMessage(5, x, y, z));
				BloodBankGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 116, this.topPos + 49, 35, 20).build();
		guistate.put("button:button_o1", button_o1);
		this.addRenderableWidget(button_o1);
		button_ab = Button.builder(Component.translatable("gui.hospitals.blood_bank_gui.button_ab"), e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BloodBankGUIButtonMessage(6, x, y, z));
				BloodBankGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 154, this.topPos + 25, 40, 20).build();
		guistate.put("button:button_ab", button_ab);
		this.addRenderableWidget(button_ab);
		button_ab1 = Button.builder(Component.translatable("gui.hospitals.blood_bank_gui.button_ab1"), e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BloodBankGUIButtonMessage(7, x, y, z));
				BloodBankGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 154, this.topPos + 49, 40, 20).build();
		guistate.put("button:button_ab1", button_ab1);
		this.addRenderableWidget(button_ab1);
	}
}

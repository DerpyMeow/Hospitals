package net.derpymeow.hospitals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.GuiGraphics;

import net.derpymeow.hospitals.world.inventory.BloodBankGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BloodBankGUIScreen extends AbstractContainerScreen<BloodBankGUIMenu> {
	private final static HashMap<String, Object> guistate = BloodBankGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox obox;
	Checkbox abox;
	Checkbox bbox;
	Checkbox abbox;
	Checkbox pos;
	Checkbox neg;

	public BloodBankGUIScreen(BloodBankGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 310;
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
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_blood_bank"), 126, 72, -52429, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_select_type"), 71, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_select"), 175, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_output"), 274, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_empty"), 5, 28, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_blood"), 4, 40, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_bag"), 7, 51, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_placeholder"), 169, 45, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_empty1"), 34, 32, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_empty2"), 138, 33, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.blood_bank_gui.label_empty3"), 243, 35, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		obox = new Checkbox(this.leftPos + 106, this.topPos + 39, 20, 20, Component.translatable("gui.hospitals.blood_bank_gui.obox"), false);
		guistate.put("checkbox:obox", obox);
		this.addRenderableWidget(obox);
		abox = new Checkbox(this.leftPos + 62, this.topPos + 15, 20, 20, Component.translatable("gui.hospitals.blood_bank_gui.abox"), false);
		guistate.put("checkbox:abox", abox);
		this.addRenderableWidget(abox);
		bbox = new Checkbox(this.leftPos + 106, this.topPos + 15, 20, 20, Component.translatable("gui.hospitals.blood_bank_gui.bbox"), false);
		guistate.put("checkbox:bbox", bbox);
		this.addRenderableWidget(bbox);
		abbox = new Checkbox(this.leftPos + 62, this.topPos + 40, 20, 20, Component.translatable("gui.hospitals.blood_bank_gui.abbox"), false);
		guistate.put("checkbox:abbox", abbox);
		this.addRenderableWidget(abbox);
		pos = new Checkbox(this.leftPos + 172, this.topPos + 15, 20, 20, Component.translatable("gui.hospitals.blood_bank_gui.pos"), false);
		guistate.put("checkbox:pos", pos);
		this.addRenderableWidget(pos);
		neg = new Checkbox(this.leftPos + 206, this.topPos + 15, 20, 20, Component.translatable("gui.hospitals.blood_bank_gui.neg"), false);
		guistate.put("checkbox:neg", neg);
		this.addRenderableWidget(neg);
	}
}

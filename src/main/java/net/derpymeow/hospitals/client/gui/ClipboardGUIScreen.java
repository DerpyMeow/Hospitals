package net.derpymeow.hospitals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.derpymeow.hospitals.world.inventory.ClipboardGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ClipboardGUIScreen extends AbstractContainerScreen<ClipboardGUIMenu> {
	private final static HashMap<String, Object> guistate = ClipboardGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox clipboardText;

	public ClipboardGUIScreen(ClipboardGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		clipboardText.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("hospitals:textures/screens/clipart2066356.png"), this.leftPos + 13, this.topPos + -35, 0, 0, 157, 230, 157, 230);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (clipboardText.isFocused())
			return clipboardText.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		clipboardText.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String clipboardTextValue = clipboardText.getValue();
		super.resize(minecraft, width, height);
		clipboardText.setValue(clipboardTextValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		clipboardText = new EditBox(this.font, this.leftPos + 32, this.topPos + 8, 118, 18, Component.translatable("gui.hospitals.clipboard_gui.clipboardText")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.hospitals.clipboard_gui.clipboardText").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.hospitals.clipboard_gui.clipboardText").getString());
				else
					setSuggestion(null);
			}
		};
		clipboardText.setSuggestion(Component.translatable("gui.hospitals.clipboard_gui.clipboardText").getString());
		clipboardText.setMaxLength(32767);
		guistate.put("text:clipboardText", clipboardText);
		this.addWidget(this.clipboardText);
	}
}

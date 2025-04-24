package net.derpymeow.hospitals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.derpymeow.hospitals.world.inventory.BookTemplateMenu;
import net.derpymeow.hospitals.network.BookTemplateButtonMessage;
import net.derpymeow.hospitals.HospitalsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BookTemplateScreen extends AbstractContainerScreen<BookTemplateMenu> {
	private final static HashMap<String, Object> guistate = BookTemplateMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_1;
	ImageButton imagebutton_3;
	ImageButton imagebutton_arrows;
	ImageButton imagebutton_arrows_2;

	public BookTemplateScreen(BookTemplateMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 267;
		this.imageHeight = 167;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

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

		guiGraphics.blit(new ResourceLocation("hospitals:textures/screens/d5qld50-4b77b07b-aae6-4a0b-883c-5fa3a60be7a4.png"), this.leftPos + -2, this.topPos + -7, 0, 0, 271, 180, 271, 180);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.book_template.label_text"), 17, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_1 = new ImageButton(this.leftPos + 213, this.topPos + 130, 40, 40, 0, 0, 40, new ResourceLocation("hospitals:textures/screens/atlas/imagebutton_1.png"), 40, 80, e -> {
		});
		guistate.put("button:imagebutton_1", imagebutton_1);
		this.addRenderableWidget(imagebutton_1);
		imagebutton_3 = new ImageButton(this.leftPos + 11, this.topPos + 131, 40, 40, 0, 0, 40, new ResourceLocation("hospitals:textures/screens/atlas/imagebutton_3.png"), 40, 80, e -> {
		});
		guistate.put("button:imagebutton_3", imagebutton_3);
		this.addRenderableWidget(imagebutton_3);
		imagebutton_arrows = new ImageButton(this.leftPos + 219, this.topPos + 31, 40, 40, 0, 0, 40, new ResourceLocation("hospitals:textures/screens/atlas/imagebutton_arrows.png"), 40, 80, e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BookTemplateButtonMessage(2, x, y, z));
				BookTemplateButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrows", imagebutton_arrows);
		this.addRenderableWidget(imagebutton_arrows);
		imagebutton_arrows_2 = new ImageButton(this.leftPos + 219, this.topPos + -4, 40, 40, 0, 0, 40, new ResourceLocation("hospitals:textures/screens/atlas/imagebutton_arrows_2.png"), 40, 80, e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new BookTemplateButtonMessage(3, x, y, z));
				BookTemplateButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrows_2", imagebutton_arrows_2);
		this.addRenderableWidget(imagebutton_arrows_2);
	}
}

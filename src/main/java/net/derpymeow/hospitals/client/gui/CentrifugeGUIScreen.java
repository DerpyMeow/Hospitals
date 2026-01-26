package net.derpymeow.hospitals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.derpymeow.hospitals.world.inventory.CentrifugeGUIMenu;
import net.derpymeow.hospitals.network.CentrifugeGUIButtonMessage;
import net.derpymeow.hospitals.init.HospitalsModScreens;
import net.derpymeow.hospitals.HospitalsMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class CentrifugeGUIScreen extends AbstractContainerScreen<CentrifugeGUIMenu> implements HospitalsModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	ImageButton imagebutton_1;

	public CentrifugeGUIScreen(CentrifugeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 188;
		this.imageHeight = 167;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("hospitals:textures/screens/centrifuge_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
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
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.centrifuge_gui.label_centrifuge"), 66, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_1 = new ImageButton(this.leftPos + 74, this.topPos + 22, 40, 40, 0, 0, 40, ResourceLocation.parse("hospitals:textures/screens/atlas/imagebutton_1.png"), 40, 80, e -> {
			int x = CentrifugeGUIScreen.this.x;
			int y = CentrifugeGUIScreen.this.y;
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new CentrifugeGUIButtonMessage(0, x, y, z));
				CentrifugeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(imagebutton_1);
	}
}
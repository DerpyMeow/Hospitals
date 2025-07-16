package net.derpymeow.hospitals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.derpymeow.hospitals.world.inventory.HospitalsWIPInfoMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HospitalsWIPInfoScreen extends AbstractContainerScreen<HospitalsWIPInfoMenu> {
	private final static HashMap<String, Object> guistate = HospitalsWIPInfoMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public HospitalsWIPInfoScreen(HospitalsWIPInfoMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = new ResourceLocation("hospitals:textures/screens/hospitals_wip_info.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.hospitals_wip_info.label_to_use_the_wip_features"), 28, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.hospitals_wip_info.label_like_blood_countpressure_etc"), 10, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.hospitals_wip_info.label_go_to_bitlybloodcommand"), 17, 47, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.hospitals_wip_info.label_you_can_change_all_the_toggles_u"), 8, 78, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.hospitals_wip_info.label_by_using_the_toggle_mechanics"), 9, 94, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.hospitals_wip_info.label_in_the_future_when_these_are_fin"), 8, 118, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.hospitals_wip_info.label_finished_they_will_be_in_the"), 9, 129, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.hospitals_wip_info.label_main_mod_features"), 39, 146, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}

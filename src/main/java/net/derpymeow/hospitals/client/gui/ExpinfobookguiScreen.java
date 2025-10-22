package net.derpymeow.hospitals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.derpymeow.hospitals.world.inventory.ExpinfobookguiMenu;
import net.derpymeow.hospitals.init.HospitalsModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class ExpinfobookguiScreen extends AbstractContainerScreen<ExpinfobookguiMenu> implements HospitalsModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public ExpinfobookguiScreen(ExpinfobookguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 242;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("hospitals:textures/screens/expinfobookgui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_hospitals_experimental_info"), 46, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_everything_in_this_creative_tab3"), 8, 35, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_crafted_this_is_because_it_is_n1"), 9, 48, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_fully_supported_blockitem_yet"), 8, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_these_items_will_not_have_any_ef"), 8, 73, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_player_because_they_are_not_fini"), 8, 85, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_these_blocksitems_will_not_be_a"), 8, 96, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_wiki_page_yet_if_you_have_any_i"), 8, 106, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_these_features_please_contact_t"), 7, 119, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_creator_thanks_for_using_the_ex"), 7, 131, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.expinfobookgui.label_version_press_esc_to_close_this"), 8, 145, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
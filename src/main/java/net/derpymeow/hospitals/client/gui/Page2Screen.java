package net.derpymeow.hospitals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.derpymeow.hospitals.world.inventory.Page2Menu;
import net.derpymeow.hospitals.network.Page2ButtonMessage;
import net.derpymeow.hospitals.HospitalsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Page2Screen extends AbstractContainerScreen<Page2Menu> {
	private final static HashMap<String, Object> guistate = Page2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_original_mod;
	Button button_scrubs;
	Button button_steel;
	Button button_computer_stuff;
	Button button_pills;
	Button button_pharmacies;
	Button button_pharmacists;
	Button button_blood_types;
	Button button_blood_counts;
	Button button_blood_pressure;
	Button button_visual_blood;
	Button button_blood;
	Button button_crafting_recipies;
	Button button_other;
	Button button_update_mod;
	ImageButton imagebutton_1;
	ImageButton imagebutton_3;
	ImageButton imagebutton_arrows;
	ImageButton imagebutton_arrows_2;

	public Page2Screen(Page2Menu container, Inventory inventory, Component text) {
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
		guiGraphics.drawString(this.font, Component.translatable("gui.hospitals.page_2.label_text"), 17, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_original_mod = Button.builder(Component.translatable("gui.hospitals.page_2.button_original_mod"), e -> {
		}).bounds(this.leftPos + 16, this.topPos + 24, 87, 20).build();
		guistate.put("button:button_original_mod", button_original_mod);
		this.addRenderableWidget(button_original_mod);
		button_scrubs = Button.builder(Component.translatable("gui.hospitals.page_2.button_scrubs"), e -> {
		}).bounds(this.leftPos + 17, this.topPos + 46, 56, 20).build();
		guistate.put("button:button_scrubs", button_scrubs);
		this.addRenderableWidget(button_scrubs);
		button_steel = Button.builder(Component.translatable("gui.hospitals.page_2.button_steel"), e -> {
		}).bounds(this.leftPos + 75, this.topPos + 46, 51, 20).build();
		guistate.put("button:button_steel", button_steel);
		this.addRenderableWidget(button_steel);
		button_computer_stuff = Button.builder(Component.translatable("gui.hospitals.page_2.button_computer_stuff"), e -> {
		}).bounds(this.leftPos + 17, this.topPos + 68, 98, 20).build();
		guistate.put("button:button_computer_stuff", button_computer_stuff);
		this.addRenderableWidget(button_computer_stuff);
		button_pills = Button.builder(Component.translatable("gui.hospitals.page_2.button_pills"), e -> {
		}).bounds(this.leftPos + 17, this.topPos + 89, 51, 20).build();
		guistate.put("button:button_pills", button_pills);
		this.addRenderableWidget(button_pills);
		button_pharmacies = Button.builder(Component.translatable("gui.hospitals.page_2.button_pharmacies"), e -> {
		}).bounds(this.leftPos + 140, this.topPos + 6, 77, 20).build();
		guistate.put("button:button_pharmacies", button_pharmacies);
		this.addRenderableWidget(button_pharmacies);
		button_pharmacists = Button.builder(Component.translatable("gui.hospitals.page_2.button_pharmacists"), e -> {
		}).bounds(this.leftPos + 139, this.topPos + 27, 82, 20).build();
		guistate.put("button:button_pharmacists", button_pharmacists);
		this.addRenderableWidget(button_pharmacists);
		button_blood_types = Button.builder(Component.translatable("gui.hospitals.page_2.button_blood_types"), e -> {
		}).bounds(this.leftPos + 139, this.topPos + 49, 82, 20).build();
		guistate.put("button:button_blood_types", button_blood_types);
		this.addRenderableWidget(button_blood_types);
		button_blood_counts = Button.builder(Component.translatable("gui.hospitals.page_2.button_blood_counts"), e -> {
		}).bounds(this.leftPos + 138, this.topPos + 71, 87, 20).build();
		guistate.put("button:button_blood_counts", button_blood_counts);
		this.addRenderableWidget(button_blood_counts);
		button_blood_pressure = Button.builder(Component.translatable("gui.hospitals.page_2.button_blood_pressure"), e -> {
		}).bounds(this.leftPos + 138, this.topPos + 93, 98, 20).build();
		guistate.put("button:button_blood_pressure", button_blood_pressure);
		this.addRenderableWidget(button_blood_pressure);
		button_visual_blood = Button.builder(Component.translatable("gui.hospitals.page_2.button_visual_blood"), e -> {
		}).bounds(this.leftPos + 138, this.topPos + 115, 87, 20).build();
		guistate.put("button:button_visual_blood", button_visual_blood);
		this.addRenderableWidget(button_visual_blood);
		button_blood = Button.builder(Component.translatable("gui.hospitals.page_2.button_blood"), e -> {
		}).bounds(this.leftPos + 70, this.topPos + 89, 56, 20).build();
		guistate.put("button:button_blood", button_blood);
		this.addRenderableWidget(button_blood);
		button_crafting_recipies = Button.builder(Component.translatable("gui.hospitals.page_2.button_crafting_recipies"), e -> {
		}).bounds(this.leftPos + 14, this.topPos + 112, 114, 20).build();
		guistate.put("button:button_crafting_recipies", button_crafting_recipies);
		this.addRenderableWidget(button_crafting_recipies);
		button_other = Button.builder(Component.translatable("gui.hospitals.page_2.button_other"), e -> {
		}).bounds(this.leftPos + 140, this.topPos + 139, 51, 20).build();
		guistate.put("button:button_other", button_other);
		this.addRenderableWidget(button_other);
		button_update_mod = Button.builder(Component.translatable("gui.hospitals.page_2.button_update_mod"), e -> {
		}).bounds(this.leftPos + 53, this.topPos + 140, 77, 20).build();
		guistate.put("button:button_update_mod", button_update_mod);
		this.addRenderableWidget(button_update_mod);
		imagebutton_1 = new ImageButton(this.leftPos + 213, this.topPos + 130, 40, 40, 0, 0, 40, new ResourceLocation("hospitals:textures/screens/atlas/imagebutton_1.png"), 40, 80, e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new Page2ButtonMessage(15, x, y, z));
				Page2ButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_1", imagebutton_1);
		this.addRenderableWidget(imagebutton_1);
		imagebutton_3 = new ImageButton(this.leftPos + 11, this.topPos + 131, 40, 40, 0, 0, 40, new ResourceLocation("hospitals:textures/screens/atlas/imagebutton_3.png"), 40, 80, e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new Page2ButtonMessage(16, x, y, z));
				Page2ButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_3", imagebutton_3);
		this.addRenderableWidget(imagebutton_3);
		imagebutton_arrows = new ImageButton(this.leftPos + 219, this.topPos + 31, 40, 40, 0, 0, 40, new ResourceLocation("hospitals:textures/screens/atlas/imagebutton_arrows.png"), 40, 80, e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new Page2ButtonMessage(17, x, y, z));
				Page2ButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrows", imagebutton_arrows);
		this.addRenderableWidget(imagebutton_arrows);
		imagebutton_arrows_2 = new ImageButton(this.leftPos + 219, this.topPos + -4, 40, 40, 0, 0, 40, new ResourceLocation("hospitals:textures/screens/atlas/imagebutton_arrows_2.png"), 40, 80, e -> {
			if (true) {
				HospitalsMod.PACKET_HANDLER.sendToServer(new Page2ButtonMessage(18, x, y, z));
				Page2ButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrows_2", imagebutton_arrows_2);
		this.addRenderableWidget(imagebutton_arrows_2);
	}
}

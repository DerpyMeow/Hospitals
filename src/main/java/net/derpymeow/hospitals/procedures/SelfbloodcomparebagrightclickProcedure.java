package net.derpymeow.hospitals.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SelfbloodcomparebagrightclickProcedure {
public static void execute(
Entity entity,
ItemStack itemstack ) {
if (
entity == null ) return ;
if (("0").equals()) {if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("Player Has No Type!"), true);}else if (true==) {if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(((((itemstack.getDisplayName().getString()).substring(10)).replace("]","")).replace(" ","")+" is compatible with "+)), true);}else{if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(((((itemstack.getDisplayName().getString()).substring(10)).replace("]","")).replace(" ","")+" is not compatible with "+)), true);}
}
}
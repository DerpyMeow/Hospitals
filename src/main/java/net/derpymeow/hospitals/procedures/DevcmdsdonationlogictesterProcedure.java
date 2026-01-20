package net.derpymeow.hospitals.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DevcmdsdonationlogictesterProcedure {
public static void execute(
CommandContext<CommandSourceStack> arguments,
Entity entity ) {
if (
entity == null ) return ;
if (==true) {if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(((StringArgumentType.getString(arguments, "dl_take")+" can recive "+StringArgumentType.getString(arguments, "dl_give")).replace("]",""))), true);}else{if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(((StringArgumentType.getString(arguments, "dl_take")+" cannot recive "+StringArgumentType.getString(arguments, "dl_give")).replace("]",""))), true);}
}
}
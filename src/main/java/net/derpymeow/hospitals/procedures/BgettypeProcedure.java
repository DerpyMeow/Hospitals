package net.derpymeow.hospitals.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BgettypeProcedure {
public static void execute(
CommandContext<CommandSourceStack> arguments,
Entity entity ) {
if (
entity == null ) return ;
if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(("Blood type of "+(new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "pname");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString()+" is "+)), false);
}
}
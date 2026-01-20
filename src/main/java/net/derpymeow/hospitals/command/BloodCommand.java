package net.derpymeow.hospitals.command;

@Mod.EventBusSubscriber
public class BloodCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("blood")

				.then(Commands.literal("type").then(Commands.literal("get").then(Commands.argument("pname", EntityArgument.player())))
						.then(Commands.literal("set").then(Commands.argument("pname", EntityArgument.player()).then(Commands.argument("set_type", StringArgumentType.word()))))));
	}

}
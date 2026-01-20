package net.derpymeow.hospitals.command;

@Mod.EventBusSubscriber
public class HcommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("hospitals").requires(s -> s.hasPermission(4)).then(Commands.literal("wiki").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);

			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			HwikiprocedureProcedure.execute(entity);
			return 0;
		})).then(Commands.literal("dev_mode_dont_use").then(Commands.literal("give").then(Commands.literal("blood_bags"))).then(Commands.literal("toggle").then(Commands.argument("dmtf", BoolArgumentType.bool()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);

			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			HcmdtestProcedure.execute(arguments, entity);
			return 0;
		}))).then(Commands.literal("donationlogictester").then(Commands.argument("dl_take", StringArgumentType.word()).then(Commands.argument("dl_give", StringArgumentType.word()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);

			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			DevcmdsdonationlogictesterProcedure.execute(arguments, entity);
			return 0;
		}))))));
	}

}
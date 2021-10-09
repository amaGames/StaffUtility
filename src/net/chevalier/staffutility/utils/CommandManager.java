package net.chevalier.staffutility.utils;

import net.chevalier.staffutility.commands.StaffUtilityCommand;
import net.chevalier.staffutility.utils.commands.AbstractCommand;
import net.chevalier.staffutility.utils.commands.DefaultCommand;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import net.chevalier.staffutility.utils.logs.LogLevel;

import java.util.concurrent.ConcurrentHashMap;

public class CommandManager {

	private static final ConcurrentHashMap<String, AbstractCommand> COMMAND_MAP = new ConcurrentHashMap<>();
	private static final AbstractCommand DEFAULT_COMMAND = new DefaultCommand();

	public static void initialize() {
		addCommand("staffutility", new StaffUtilityCommand());
	}

	public static void addCommand(String name, AbstractCommand command) {
		COMMAND_MAP.put(name, command);
	}

	public static AbstractCommand getCommand(String name) {
		return COMMAND_MAP.getOrDefault(name, DEFAULT_COMMAND);
	}

	public static void executeCommand(String name, Sender sender, String[] args) {
		AbstractCommand command = getCommand(name);;
		if (Permission.comparePermission(command.getPermission(), sender.getPermission())) {
			command.execute(sender, args);
			return;
		}
		sender.sendMessage("command.all.permission", LogLevel.INFO);
	}

}

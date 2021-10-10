package net.chevalier.staffutility.utils.commands;

import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import net.chevalier.staffutility.utils.logs.LogLevel;

public abstract class AbstractCommand {

	private String name;
	private String usage;
	private String description;
	private Permission permission;

	public AbstractCommand(String name, String usage, String description, Permission permission) {
		this.name = name;
		this.usage = usage;
		this.description = description;
		this.permission = permission;
	}

	public String getName() {
		return this.name;
	}

	public String getUsage() {
		return this.usage;
	}

	public String getDescription() {
		return this.description;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void sendUsage(Sender sender) {
		sender.sendMessage(this.usage, LogLevel.INFO);
	}

	public abstract void execute(Sender sender, String[] args);

}

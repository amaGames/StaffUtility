package net.chevalier.staffutility.utils.commands.objects;

import net.chevalier.staffutility.StaffUtility;
import net.chevalier.staffutility.utils.LocalizedMessage;
import net.chevalier.staffutility.utils.logs.LogLevel;
import org.bukkit.command.CommandSender;

public class Sender {

	private CommandSender sender;
	private Permission permission;
	private String name;

	public Sender(CommandSender sender, Permission permission) {
		this.sender = sender;
		this.permission = permission;
		this.name = this.sender.getName();
	}

	public void sendMessage(String key, LogLevel level, String... args) {
		this.sender.sendMessage(LocalizedMessage.getLocalizedMessage(key, level, args));
	}

	public void sendLegacyMessage(String message, LogLevel level) {
		this.sender.sendMessage(level.getPrefix() + message);
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void updateInstance(CommandSender sender) {
		this.sender = sender;
		this.name = this.sender.getName();
	}

	public CommandSender getSender() {
		return this.sender;
	}

	public String getName() {
		return this.name;
	}

}

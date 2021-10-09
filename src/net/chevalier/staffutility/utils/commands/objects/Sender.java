package net.chevalier.staffutility.utils.commands.objects;

import net.chevalier.staffutility.utils.LocalizedMessage;
import net.chevalier.staffutility.utils.logs.LogLevel;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

public class Sender {

	private CommandSender sender;
	private Permission permission;

	public Sender(CommandSender sender, Permission permission) {
		this.sender = sender;
		this.permission = permission;
	}

	public void sendMessage(String key, LogLevel level, String... args) {
		this.sender.sendMessage(LocalizedMessage.getLocalizedMessage(key, level, args));
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void updatedInstance(CommandSender sender) {
		this.sender = sender;
	}

}

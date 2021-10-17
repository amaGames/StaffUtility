package net.chevalier.staffutility.utils.logs;

import net.md_5.bungee.api.ChatColor;

public enum LogLevel {

	CUSTOM(""),
	KICK(ChatColor.BLUE.toString() + ChatColor.BOLD.toString() + "[StaffUtility]\n" + ChatColor.RESET.toString() + ChatColor.RED.toString()),
	SUCCESS(ChatColor.BLUE.toString() + "[StaffUtility] " + ChatColor.GREEN.toString()),
	WARN(ChatColor.BLUE.toString() + "[StaffUtility] " + ChatColor.RED.toString()),
	INFO(ChatColor.BLUE.toString() + "[StaffUtility] " + ChatColor.YELLOW.toString());

	private String prefix;

	LogLevel(String prefix) {
		this.prefix = prefix;
	}

	public String getPrefix() {
		return this.prefix;
	}

}

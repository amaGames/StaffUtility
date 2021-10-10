package net.chevalier.staffutility.utils.logs;

import net.md_5.bungee.api.ChatColor;

public enum LogLevel {

	CUSTOM(""),
	INTERNAL(ChatColor.YELLOW.toString() + "[LOG] " + ChatColor.AQUA.toString()),
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

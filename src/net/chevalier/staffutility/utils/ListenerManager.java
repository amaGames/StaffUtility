package net.chevalier.staffutility.utils;

import net.chevalier.staffutility.StaffUtility;
import net.chevalier.staffutility.listeners.AsyncPlayerPreLoginListener;
import net.chevalier.staffutility.listeners.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class ListenerManager {

	public static void initialize() {
		addListener(new AsyncPlayerPreLoginListener());
		addListener(new PlayerJoinListener());
	}

	public static void addListener(Listener listener) {
		Bukkit.getPluginManager().registerEvents(listener, StaffUtility.getInstance());
	}

}

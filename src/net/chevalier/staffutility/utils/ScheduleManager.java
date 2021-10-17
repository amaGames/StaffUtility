package net.chevalier.staffutility.utils;

import net.chevalier.staffutility.StaffUtility;
import net.minecraft.server.v1_12_R1.ThreadWatchdog;
import org.apache.commons.lang3.Validate;
import org.bukkit.Bukkit;
import org.bukkit.command.TabCompleter;
import org.spigotmc.WatchdogThread;

public class ScheduleManager {

	public static void addTask(Runnable runnable, boolean isAsync) {
		if (isAsync) {
			Bukkit.getScheduler().runTaskAsynchronously(StaffUtility.getInstance(), runnable);
			return;
		}
		Bukkit.getScheduler().runTask(StaffUtility.getInstance(), runnable);
	}

}

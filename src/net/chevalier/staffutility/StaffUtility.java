package net.chevalier.staffutility;

import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

public class StaffUtility {

	private static final String VERSION = "1.0";
	private static final String AUTHOR = "Chevalier-Network";
	private static JavaPlugin staffUtility;
	private static Sender console;
	private static Locale locale;
	private static Locale defaultLocale = Locale.ENGLISH;

	protected static void initialize(JavaPlugin instance) {
		staffUtility = instance;
		console = new Sender(Bukkit.getConsoleSender(), Permission.STAFF);
		locale = Locale.getDefault();
	}

	public static Locale getLocale() {
		return locale;
	}

	public static Locale getDefaultLocale() {
		return defaultLocale;
	}

	public static JavaPlugin getInstance() {
		return staffUtility;
	}

	public static String getVersion() {
		return VERSION;
	}

	public static String getAuthor() {
		return AUTHOR;
	}

	public static Sender getConsole() {
		return console;
	}

}

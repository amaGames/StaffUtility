package net.chevalier.staffutility.utils;

import net.chevalier.staffutility.StaffUtility;
import net.chevalier.staffutility.utils.logs.LogLevel;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class LocalizedMessage {

	private static ResourceBundle resourceBundle;

	public static void initialize() {
		try {
			resourceBundle = ResourceBundle.getBundle("message", StaffUtility.getLocale());
		}
		catch (Exception exception) {
			resourceBundle = ResourceBundle.getBundle("message", StaffUtility.getDefaultLocale());
		}
	}

	public static String getLocalizedMessage(String key, LogLevel level, String... args) {
		String message = resourceBundle.getString(key);
		return (level.getPrefix() + (args.length == 0 ? message : MessageFormat.format(message, args)));
	}

}

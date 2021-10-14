package net.chevalier.staffutility.utils;

import java.util.Set;

public class ArgumentConverter {

	public static String getArgumentsByArray(String[] args, int startIndex, String suffix) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int index = startIndex; index <= (args.length - 1); index = index + 1) {
			stringBuilder.append(args[index] + suffix);
		}
		stringBuilder.setLength(stringBuilder.length() - suffix.length());
		return stringBuilder.toString();
	}

	public static String getArgumentsBySet(Set<String> args, String suffix) {
		return getArgumentsByArray(args.toArray(new String[args.size() - 1]), 0, suffix);
	}

}

package net.chevalier.staffutility.tests;

import net.chevalier.staffutility.StaffUtility;
import net.chevalier.staffutility.utils.CommandManager;
import net.chevalier.staffutility.utils.commands.AbstractCommand;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import net.chevalier.staffutility.utils.logs.LogLevel;

public class ForceCommand extends AbstractCommand {

	public ForceCommand() {
		super("force", "a", "a", Permission.DEFAULT);
	}

	@Override
	public void execute(Sender sender, String[] args) {
		if (args.length >= 3) {
			if (args[1].equalsIgnoreCase("true")) {
				int check = 2;
				String[] forced_args = new String[args.length - 2];
				for (String arg : args) {
					forced_args[check - 2] = args[check];
				}
				Sender a = new Sender(sender.getSender(), Permission.STAFF);
				String cmd = args[0];
				long time_a = System.nanoTime();
				CommandManager.executeCommand(cmd, a, forced_args);
				long time_b = System.nanoTime();
				sender.sendLegacyMessage("<<Debug>> コマンドの実行に " + (time_b - time_a) + "ns かかりました。", LogLevel.INTERNAL);
			}
			else {
				int check = 2;
				String[] forced_args = new String[args.length - 2];
				for (String arg : args) {
					forced_args[check - 2] = args[check];
				}
				String cmd = args[0];
				long time_a = System.nanoTime();
				CommandManager.executeCommand(cmd, sender, forced_args);
				long time_b = System.nanoTime();
				sender.sendLegacyMessage("<<Debug>> コマンドの実行に " + (time_b - time_a) + "ns かかりました。", LogLevel.INTERNAL);
			}
		}
		else if (args.length >= 2) {
			if (args[1].equalsIgnoreCase("true")) {
				Sender a = new Sender(sender.getSender(), Permission.STAFF);
				String[] arg = new String[] {};
				String cmd = args[0];
				long time_a = System.nanoTime();
				CommandManager.executeCommand(cmd, a, arg);
				long time_b = System.nanoTime();
				sender.sendLegacyMessage("<<Debug>> コマンドの実行に " + (time_b - time_a) + "ns かかりました。", LogLevel.INTERNAL);
			}
			else {
				String[] arg = new String[] {};
				String cmd = args[0];
				long time_a = System.nanoTime();
				CommandManager.executeCommand(cmd, sender, arg);
				long time_b = System.nanoTime();
				sender.sendLegacyMessage("<<Debug>> コマンドの実行に " + (time_b - time_a) + "ns かかりました。", LogLevel.INTERNAL);
			}
		}
		else {
			sender.getSender().sendMessage("§cUsage: /force <command> <true/false> <args>");
		}
	}

}

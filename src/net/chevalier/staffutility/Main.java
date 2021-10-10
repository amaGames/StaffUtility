package net.chevalier.staffutility;

import net.chevalier.staffutility.utils.CommandManager;
import net.chevalier.staffutility.utils.ListenerManager;
import net.chevalier.staffutility.utils.LocalizedMessage;
import net.chevalier.staffutility.utils.PlayerManager;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import net.chevalier.staffutility.utils.logs.LogLevel;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		StaffUtility.initialize(this);
		LocalizedMessage.initialize();
		ListenerManager.initialize();
		CommandManager.initialize();
		StaffUtility.getConsole().sendMessage("console.log.enable", LogLevel.INFO, StaffUtility.getVersion(), StaffUtility.getAuthor());
	}

	@Override
	public void onDisable() {
		StaffUtility.getConsole().sendMessage("console.log.disable", LogLevel.INFO);
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
		if (commandSender instanceof Player) {
			Player player = (Player) commandSender;
			CommandManager.executeCommand(command.getName(), PlayerManager.getOnlinePlayer(player.getUniqueId(), player), args);
			return true;
		}
		CommandManager.executeCommand(command.getName(), StaffUtility.getConsole(), args);
		return true;
	}

}

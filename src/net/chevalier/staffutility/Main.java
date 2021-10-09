package net.chevalier.staffutility;

import net.chevalier.staffutility.utils.CommandManager;
import net.chevalier.staffutility.utils.ListenerManager;
import net.chevalier.staffutility.utils.LocalizedMessage;
import net.chevalier.staffutility.utils.PlayerManager;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import net.chevalier.staffutility.utils.logs.LogLevel;
import net.chevalier.staffutility.utils.players.PlayerAccount;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		StaffUtility.initialize(this);
		LocalizedMessage.initialize();
		ListenerManager.initialize();
		CommandManager.initialize();
		StaffUtility.getConsole().sendMessage("console.log.enable", LogLevel.INFO, StaffUtility.getVersion());
	}

	@Override
	public void onDisable() {
		StaffUtility.getConsole().sendMessage("console.log.disable", LogLevel.INFO);
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
		Sender sender;
		if (commandSender instanceof Player) {
			Player player = (Player) commandSender;
			sender = PlayerManager.getOnlinePlayer(player.getUniqueId(), player);
		}
		else {
			sender = StaffUtility.getConsole();
		}
		CommandManager.executeCommand(command.getName(), sender, args);
		return true;
	}

}

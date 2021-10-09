package net.chevalier.staffutility.utils.players;

import net.chevalier.staffutility.StaffUtility;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerAccount extends Sender {

	private UUID uniqueId;

	public PlayerAccount(UUID uniqueId, Permission permission) {
		super(Bukkit.getConsoleSender(), permission);
		this.uniqueId = uniqueId;
	}

	public PlayerAccount(UUID uniqueId, Player player, Permission permission) {
		super(player, permission);
		this.uniqueId = uniqueId;
	}

	public UUID getUniqueId() {
		return this.uniqueId;
	}

}

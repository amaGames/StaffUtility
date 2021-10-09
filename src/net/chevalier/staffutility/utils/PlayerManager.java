package net.chevalier.staffutility.utils;

import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.players.PlayerAccount;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PlayerManager {

	private static final ConcurrentHashMap<UUID, PlayerAccount> PLAYER_MAP = new ConcurrentHashMap<>();

	public void initialize() {
	}

	public static PlayerAccount addPlayer(PlayerAccount player) {
		return PLAYER_MAP.put(player.getUniqueId(), player);
	}

	public static PlayerAccount getOnlinePlayer(UUID uniqueId, Player onlinePlayer) {
		return PLAYER_MAP.getOrDefault(uniqueId, addPlayer(new PlayerAccount(uniqueId, onlinePlayer, Permission.DEFAULT)));
	}

	public static PlayerAccount getPlayer(UUID uniqueId) {
		return PLAYER_MAP.getOrDefault(uniqueId, addPlayer(new PlayerAccount(uniqueId, Permission.DEFAULT)));
	}

}

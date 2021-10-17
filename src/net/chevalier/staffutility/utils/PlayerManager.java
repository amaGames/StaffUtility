package net.chevalier.staffutility.utils;

import net.chevalier.staffutility.StaffUtility;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.logs.LogLevel;
import net.chevalier.staffutility.utils.players.PlayerAccount;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PlayerManager {

	private static final ConcurrentHashMap<UUID, PlayerAccount> PLAYER_MAP = new ConcurrentHashMap<>();

	public void initialize() {
	}

	public static PlayerAccount addPlayer(PlayerAccount player) {
		PLAYER_MAP.put(player.getUniqueId(), player);
		return player;
	}

	public static PlayerAccount getOnlinePlayer(UUID uniqueId, Player onlinePlayer) {
		PlayerAccount player = PLAYER_MAP.get(uniqueId);
		return player == null ? addPlayer(new PlayerAccount(uniqueId, onlinePlayer, Permission.STAFF)) : player;
	}

	/*
	Null検証
	 */
	public static PlayerAccount getOnlinePlayerByName(String name) {
		Player onlinePlayer = Bukkit.getPlayer(name);
		return onlinePlayer == null ? null : getOnlinePlayer(onlinePlayer.getUniqueId(), onlinePlayer);
	}

}

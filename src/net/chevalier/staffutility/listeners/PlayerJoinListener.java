package net.chevalier.staffutility.listeners;

import net.chevalier.staffutility.utils.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		PlayerManager.getOnlinePlayer(player.getUniqueId(), player).updatePlayerInstance(player);
	}

}

package net.chevalier.staffutility.utils.players;

import net.chevalier.staffutility.utils.LocalizedMessage;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import net.chevalier.staffutility.utils.logs.LogLevel;
import net.chevalier.staffutility.utils.players.punishments.Ban;
import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerAccount extends Sender {

	private UUID uniqueId;
	private Player onlinePlayer;
	private Ban ban;

	public PlayerAccount(UUID uniqueId, Player onlinePlayer, Permission permission) {
		super(onlinePlayer, permission);
		this.uniqueId = uniqueId;
		this.onlinePlayer = onlinePlayer;
		this.ban = Ban.newInstance();
	}

	public UUID getUniqueId() {
		return this.uniqueId;
	}

	public void kickPlayer(String reason, String executor) {
		this.onlinePlayer.kickPlayer(LocalizedMessage.getLocalizedMessage("player.message.kick", LogLevel.KICK, reason, executor));
	}

	public void banPlayer(Ban ban) {
		this.ban = ban;
		this.kickPlayer(ban.getReason(), ban.getExecutor());
	}

	public void updatePlayerInstance(Player onlinePlayer) {
		this.onlinePlayer = onlinePlayer;
		this.updateInstance(onlinePlayer);
	}

}

package net.chevalier.staffutility.commands;

import net.chevalier.staffutility.utils.ArgumentConverter;
import net.chevalier.staffutility.utils.PlayerManager;
import net.chevalier.staffutility.utils.commands.AbstractCommand;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import net.chevalier.staffutility.utils.logs.LogLevel;
import net.chevalier.staffutility.utils.players.PlayerAccount;

public class BanCommand extends AbstractCommand {

	public BanCommand() {
		super("sban", "command.sban.result.defusage", "command.sban.result.defdescription", Permission.STAFF);
	}

	@Override
	public void execute(Sender sender, String[] args) {
		if (args.length >= 2) {
			PlayerAccount player = PlayerManager.getOnlinePlayerByName(args[0]);
			if (!(player == null)) {
				String reason = ArgumentConverter.getArgumentsByArray(args, 1, " ");

				sender.sendMessage("command.sban.result.success", LogLevel.SUCCESS, player.getName(), sender.getName(), reason);
				/*
				ScheduleManager.addTask(new Runnable() {

					@Override
					public void run() {
						Message message = new Message(null, null, null);
						Embed embed = new Embed();
						embed.setTitle("Punish-Kick");
						embed.setDescription(player.getName() + " was kicked by " + sender.getName());
						message.setEmbed(embed);
						WebHookManager.sendMessage(message.getJson(), "https://discord.com/api/webhooks/826694815985958944/bF9pQw-Rc9i1aMoEdWJjWFdH5z1u7ERT36G20LLtTuTJlXmJMvUjRXpvQ1A26d_H-Ra5");

					}

				}, true);
				*/
				return;
			}
			sender.sendMessage("command.sban.result.failed", LogLevel.WARN, args[0]);
		}
		else {
			this.sendUsage(sender);
		}
	}

}

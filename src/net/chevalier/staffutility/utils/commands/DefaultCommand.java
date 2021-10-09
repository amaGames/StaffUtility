package net.chevalier.staffutility.utils.commands;

import net.chevalier.staffutility.StaffUtility;
import net.chevalier.staffutility.utils.LocalizedMessage;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;
import net.chevalier.staffutility.utils.logs.LogLevel;
import org.bukkit.command.CommandSender;

public class DefaultCommand extends AbstractCommand {

	public DefaultCommand() {
		super(null, null, null, Permission.DEFAULT);
	}

	@Override
	public void execute(Sender sender, String[] args) {
		sender.sendMessage("command.default.result.all", LogLevel.WARN);
	}

}

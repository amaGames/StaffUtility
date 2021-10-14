package net.chevalier.staffutility.commands;

import net.chevalier.staffutility.utils.ArgumentConverter;
import net.chevalier.staffutility.utils.commands.AbstractCommand;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;

public class KickCommand extends AbstractCommand {

	public KickCommand() {
		super("skick", "", "", Permission.STAFF);
	}

	@Override
	public void execute(Sender sender, String[] args) {
		if (args.length >= 2) {
			String reason = ArgumentConverter.getArgumentsByArray(args, 1, " ");

		}
		else {

		}
	}

}

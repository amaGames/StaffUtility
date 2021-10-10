package net.chevalier.staffutility.commands;

import net.chevalier.staffutility.utils.commands.AbstractCommand;
import net.chevalier.staffutility.utils.commands.objects.Permission;
import net.chevalier.staffutility.utils.commands.objects.Sender;

public class StaffUtilityCommand extends AbstractCommand {

	public StaffUtilityCommand() {
		super("staffutility", "command.staffutility.result.defusage", "command.staffutility.result.defdescription", Permission.STAFF);
	}

	@Override
	public void execute(Sender sender, String[] args) {
		this.sendUsage(sender);
	}

}

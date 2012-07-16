package net.ess3.commands;

import static net.ess3.I18n._;


public class Commandbroadcast extends EssentialsCommand
{
	@Override
	protected void run(final CommandSender sender, final String commandLabel, final String[] args) throws Exception
	{
		if (args.length < 1)
		{
			throw new NotEnoughArgumentsException();
		}

		ess.broadcastMessage(null, _("broadcast", getFinalArg(args, 0)));
	}
}
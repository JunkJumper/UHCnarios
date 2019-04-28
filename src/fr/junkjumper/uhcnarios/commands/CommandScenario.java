package fr.junkjumper.uhcnarios.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandScenario implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		
		
		if(cmd.getName().equalsIgnoreCase("cutclean") && args[0].equalsIgnoreCase("on")) {
			sender.sendMessage("The cutclean scenario is now enable !");
			return true;
		} else if(cmd.getName().equalsIgnoreCase("cutclean") && args[0].equalsIgnoreCase("off")) {
			sender.sendMessage("The cutclean scenario is now disable !");
			return true;
		} else if(cmd.getName().equalsIgnoreCase("cutclean")){
			sender.sendMessage("Please specify if you want to enable the scenario with \"on\" or \"off\" !");
			return true;
		}
		return false;
	}

}

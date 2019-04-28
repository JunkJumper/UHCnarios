package fr.junkjumper.uhcnarios;

import org.bukkit.plugin.java.JavaPlugin;

import fr.junkjumper.uhcnarios.commands.CommandScenario;
import fr.junkjumper.uhcnarios.commands.CutcleanListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("The UHC scenarios plugin is now enable !");
		getCommand("cutclean").setExecutor(new CommandScenario());
		getServer().getPluginManager().registerEvents(new CutcleanListener(), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("The UHC scenarios plugin is now disable !");
	}
	
}

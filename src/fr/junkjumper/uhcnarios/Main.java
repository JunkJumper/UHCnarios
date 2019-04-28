package fr.junkjumper.uhcnarios;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("The UHC scenarios plugin is now enable !");
	}
	
	@Override
	public void onDisable() {
		System.out.println("The UHC scenarios plugin is now disable !");
	}
	
}

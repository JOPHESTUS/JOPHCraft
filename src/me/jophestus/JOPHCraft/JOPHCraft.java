package me.jophestus.JOPHCraft;

import java.util.logging.Logger;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class JOPHCraft extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
	PluginDescriptionFile pdfFile;
	public static JOPHCraft plugin;
	

	public void onEnable() {
		pdfFile = this.getDescription();
		this.log.info(pdfFile.getName() + " is now enabled!.");
		setupConfig();
		if (getConfig().getBoolean("enable.ice", true)){
		ShapedRecipe ice = new ShapedRecipe(new ItemStack(Material.ICE, 2));
		ice.shape(new String[] { "ABA" });
		ice.setIngredient('A', Material.SNOW_BLOCK);
		ice.setIngredient('B', Material.WATER_BUCKET);
		getServer().addRecipe(ice);
	}
		if (getConfig().getBoolean("enable.grass", true)){
		ShapedRecipe grass = new ShapedRecipe(new ItemStack(Material.GRASS, 1));
		grass.shape(new String[] { "A", "B" });
		grass.setIngredient('A', Material.LEAVES);
		grass.setIngredient('B', Material.DIRT);
		getServer().addRecipe(grass);
		}
		if (getConfig().getBoolean("enable.web", true)){
		ShapedRecipe cobweb = new ShapedRecipe(new ItemStack(Material.WEB, 2));
        cobweb.shape(new String[] { "A A", " B ", "A A" });
        cobweb.setIngredient('A', Material.STRING);
        cobweb.setIngredient('B', Material.SPIDER_EYE);
        getServer().addRecipe(cobweb);
		}
		if (getConfig().getBoolean("enable.blazerod", true)){
        ShapedRecipe blaze = new ShapedRecipe(new ItemStack(Material.BLAZE_ROD, 1));
        blaze.shape(new String[] { "A", "B", "B" });
        blaze.setIngredient('A', Material.LAVA_BUCKET);
        blaze.setIngredient('B', Material.GOLD_INGOT);
        getServer().addRecipe(blaze);
		}
		if (getConfig().getBoolean("enable.sponge", true)){        
        ShapedRecipe sponge = new ShapedRecipe(new ItemStack(Material.SPONGE, 2));
        sponge.shape(new String[] { "ABA", "BAB", "ABA" });
        sponge.setIngredient('A', Material.STRING);
        sponge.setIngredient('B', Material.WOOL, 4);
        getServer().addRecipe(sponge);
		}
		if (getConfig().getBoolean("enable.slimeball", true)){
        ShapedRecipe slimeball = new ShapedRecipe(new ItemStack(Material.SLIME_BALL, 1));
        slimeball.shape(new String[] { "ABC", " D " });
        slimeball.setIngredient('A', Material.WATER_BUCKET);
        slimeball.setIngredient('B', Material.SAPLING);
        slimeball.setIngredient('C', Material.INK_SACK, 15);
        slimeball.setIngredient('D', Material.INK_SACK, 2);
        getServer().addRecipe(slimeball);
		}
		if (getConfig().getBoolean("enable.ghasttear", true )){
        ShapedRecipe ghasttear = new ShapedRecipe(new ItemStack(Material.GHAST_TEAR, 1));
        ghasttear.shape(new String[] { "ABA" });
        ghasttear.setIngredient('A', Material.SOUL_SAND);
        ghasttear.setIngredient('B', Material.WATER_BUCKET);
        getServer().addRecipe(ghasttear);
		}
		if (getConfig().getBoolean("enable.mobspawner", true)){
        ShapedRecipe spawner = new ShapedRecipe(new ItemStack(Material.MOB_SPAWNER, 1));
        spawner.shape(new String[] { "ABA", "ACA", "ABA" });
        spawner.setIngredient('A', Material.IRON_INGOT);
        spawner.setIngredient('B', Material.LAVA_BUCKET);
        spawner.setIngredient('C', Material.DIAMOND);
        getServer().addRecipe(spawner);
		}
		if (getConfig().getBoolean("enable.mossycobble", true)){
        ShapedRecipe mossy = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE, 1));
        mossy.shape(new String[] { "A", "B" });
        mossy.setIngredient('A', Material.VINE);
        mossy.setIngredient('B', Material.COBBLESTONE);
        getServer().addRecipe(mossy);
		}
		if (getConfig().getBoolean("enable.netherwart", true)){
        ShapedRecipe wart = new ShapedRecipe(new ItemStack(Material.NETHER_WARTS, 2));
        wart.shape(new String[] { "AAA", "ABA", "CCC"});
        wart.setIngredient('A', Material.NETHERRACK);
        wart.setIngredient('B', Material.IRON_INGOT);
        wart.setIngredient('C', Material.SOUL_SAND);
        getServer().addRecipe(wart);
		}
		if (getConfig().getBoolean("enable.helmetcrafting", true)){
        ShapedRecipe JOPHhelmet = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 5));
        JOPHhelmet.shape(new String[] { "B"});
        JOPHhelmet.setIngredient('B', Material.IRON_HELMET);
        getServer().addRecipe(JOPHhelmet);
		}
		if (getConfig().getBoolean("enable.swordcrafting", true)){
        ShapedRecipe JOPHSword = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 2));
        JOPHSword.shape(new String[] { "B"});
        JOPHSword.setIngredient('B', Material.IRON_SWORD);
        getServer().addRecipe(JOPHSword);
		}
		if (getConfig().getBoolean("enable.mossybrick", true)){
        ShapedRecipe mossystone = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 1, (byte)1));
        mossystone.shape(new String[] { "A", "B"});
        mossystone.setIngredient('B', Material.SMOOTH_BRICK);
        mossystone.setIngredient('A', Material.VINE);
        getServer().addRecipe(mossystone);
		}
        
	}

	private void setupConfig() {
		// TODO Auto-generated method stub
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {	
		// TODO Auto-generated method stub

		if (command.getName().equalsIgnoreCase("JOPHCraft")) {
			sender.sendMessage(ChatColor.DARK_GREEN
					+ "+------------------------------+");
			sender.sendMessage(ChatColor.DARK_AQUA + "JOPHCraft: Custom recipes plugin.");
			sender.sendMessage(ChatColor.GREEN + "By JOPHESTUS");
			sender.sendMessage(ChatColor.YELLOW + "Version:" + " 2.0" );
			sender.sendMessage(ChatColor.DARK_GREEN
					+ "+------------------------------+");
		}
		
		
		
		
		
		if (command.getName().equalsIgnoreCase("jchelp")) {
			sender.sendMessage(ChatColor.DARK_GREEN + "+------------------------------+");
			sender.sendMessage(ChatColor.DARK_AQUA + "JOPHCraft: To view recipies, please read bukkitdev page.");
			sender.sendMessage(ChatColor.DARK_GREEN + "+------------------------------+"); } 
		return super.onCommand(sender, command, label, args);

	}

	public void onDisable() {

		pdfFile = this.getDescription();
		this.log.info(pdfFile.getName() + " is now disabled!");
	}
}
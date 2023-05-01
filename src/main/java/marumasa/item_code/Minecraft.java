package marumasa.item_code;

import org.bukkit.plugin.java.JavaPlugin;

public final class Minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
        new TickEvent(this).runTaskTimer(this, 1, 1);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

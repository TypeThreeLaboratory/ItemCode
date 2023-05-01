package marumasa.item_code;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class TickEvent extends BukkitRunnable {

    private final Server server;

    public TickEvent(Minecraft minecraft) {
        server = minecraft.getServer();
    }

    @Override
    public void run() {
        for (Player player : server.getOnlinePlayers()) {
            ItemBase.TickEvent(player.getInventory().getItemInMainHand(), player);
        }
    }
}

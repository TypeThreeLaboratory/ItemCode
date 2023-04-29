package marumasa.item_code;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.logging.Logger;

public class Events implements Listener {

    private final Logger logger = Bukkit.getLogger();

    public Events() {
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        //エンティティによってエンティティがダメージを受けたら
        if (event.getDamager() instanceof Player player) {
            final ItemStack itemStack = player.getInventory().getItemInMainHand();
            ItemBase.AttackEvent(itemStack, player);
        }
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        //インベントリをクリックしたら
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {

        final ItemStack itemStack = event.getItem();
        if (itemStack == null) return;

        //プレイヤーがオブジェクトまたは空気に向かって使用ボタンを押したら
        final Action action = event.getAction();
        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            ItemBase.UseEvent(itemStack, event.getPlayer());
        }
    }

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        //プレイヤーがエンティティに向かって使用ボタンを押した場合
        final ItemStack itemStack = event.getPlayer().getItemOnCursor();
        ItemBase.UseEvent(itemStack, event.getPlayer());
    }
}

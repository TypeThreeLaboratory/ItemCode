package marumasa.item_code;

import marumasa.item_code.code.CodeBase;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBase {

    public static void UseEvent(ItemStack itemStack, Player player) {
        final List<String> lore = getLore(itemStack);
        if (lore == null) return;

        for (List<String> key : database.ItemCodeEvent.keySet()) {
            if (lore.equals(key)) {
                final CodeBase codeBase = database.ItemCodeEvent.get(key);
                codeBase.use(player);
            }
        }
    }

    public static void AttackEvent(ItemStack itemStack, Player player) {
        final List<String> lore = getLore(itemStack);
        if (lore == null) return;

        for (List<String> key : database.ItemCodeEvent.keySet()) {
            if (lore.equals(key)) {
                final CodeBase codeBase = database.ItemCodeEvent.get(key);
                codeBase.attack(player);
            }
        }
    }

    private static List<String> getLore(ItemStack itemStack) {
        ItemMeta meta = itemStack.getItemMeta();
        if (meta == null) return null;
        final List<String> lore = meta.getLore();
        if (lore == null) return null;
        lore.replaceAll(text -> text.replaceAll("§.", ""));
        return lore;
    }
}

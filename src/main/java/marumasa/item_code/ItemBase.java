package marumasa.item_code;

import marumasa.item_code.code.CodeBase;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBase {

    //Use
    public static void UseEvent(ItemStack itemStack, Player player) {
        final CodeBase codeBase = getCodeBase(itemStack);
        if (codeBase == null) return;
        codeBase.use(player);
    }

    //Attack
    public static void AttackEvent(ItemStack itemStack, Player player) {
        final CodeBase codeBase = getCodeBase(itemStack);
        if (codeBase == null) return;
        codeBase.attack(player);
    }

    //Tick
    public static void TickEvent(ItemStack itemStack, Player player) {
        final CodeBase codeBase = getCodeBase(itemStack);
        if (codeBase == null) return;
        codeBase.tick(player);
    }

    private static CodeBase getCodeBase(ItemStack itemStack) {
        final List<String> lore = getLore(itemStack);
        if (lore == null) return null;

        for (List<String> key : database.ItemCodeEvent.keySet()) {
            if (lore.equals(key)) {
                return database.ItemCodeEvent.get(key);
            }
        }
        return null;
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

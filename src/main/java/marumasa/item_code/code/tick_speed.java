package marumasa.item_code.code;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tick_speed extends CodeBase {
    public static List<String> lore = new ArrayList<>(Arrays.asList(
            "解説: 毎tick 移動速度上昇レベル１が1秒間付与される"
    ));

    public void tick(Player player) {
        player.addPotionEffect(new PotionEffect(
                PotionEffectType.SPEED,
                20,
                0
        ));
    }
}
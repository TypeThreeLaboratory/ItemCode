package marumasa.item_code.code;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class speed_2 extends CodeBase {
    public static List<String> lore = new ArrayList<>(Arrays.asList(
            "public void attack(Player player) {",
            "    player.addPotionEffect(new PotionEffect(",
            "            PotionEffectType.SPEED,",
            "            60,",
            "            1",
            "    ));",
            "}",
            "解説: 攻撃すると３秒間、移動速度上昇レベル２が付与される"
    ));

    public void attack(Player player) {
        player.addPotionEffect(new PotionEffect(
                PotionEffectType.SPEED,
                60,
                1
        ));
    }
}

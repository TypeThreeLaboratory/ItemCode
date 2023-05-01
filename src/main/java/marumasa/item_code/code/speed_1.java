package marumasa.item_code.code;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class speed_1 extends CodeBase {
    public static List<String> lore = new ArrayList<>(Arrays.asList(
            "public void use(Player player) {",
            "    player.addPotionEffect(new PotionEffect(",
            "            PotionEffectType.SPEED,",
            "            20,",
            "            0",
            "    ));",
            "}",
            "解説: 右クリックすると移動速度上昇レベル１が１秒間付与される"
    ));

    public void use(Player player) {
        player.addPotionEffect(new PotionEffect(
                PotionEffectType.SPEED,
                20,
                0
        ));
    }
}

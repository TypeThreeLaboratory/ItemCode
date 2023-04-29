package marumasa.item_code.code;


import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class attack_1 extends CodeBase {
    public static List<String> lore = new ArrayList<>(Arrays.asList(
            "public void use(Player player) {",
            "    player.addPotionEffect(new PotionEffect(",
            "            PotionEffectType.INCREASE_DAMAGE,",
            "            20,",
            "            0",
            "    ));",
            "}",
            "解説: 右クリックすると１秒間、攻撃力上昇レベル１が付与される"
    ));

    public void use(Player player) {
        player.addPotionEffect(new PotionEffect(
                PotionEffectType.INCREASE_DAMAGE,
                20,
                0
        ));
    }
}
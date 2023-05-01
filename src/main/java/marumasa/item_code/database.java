package marumasa.item_code;

import marumasa.item_code.code.*;

import java.util.*;

public class database {
    public static final Map<List<String>, CodeBase> ItemCodeEvent = new HashMap<>();

    static {
        ItemCodeEvent.put(speed_1.lore, new speed_1());

        ItemCodeEvent.put(attack_1.lore, new attack_1());

        ItemCodeEvent.put(speed_2.lore, new speed_2());

        ItemCodeEvent.put(tick_speed.lore, new tick_speed());
    }
}

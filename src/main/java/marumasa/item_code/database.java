package marumasa.item_code;

import marumasa.item_code.code.CodeBase;
import marumasa.item_code.code.attack_1;
import marumasa.item_code.code.speed_1;
import marumasa.item_code.code.speed_2;

import java.util.*;

public class database {
    public static final Map<List<String>, CodeBase> ItemCodeEvent = new HashMap<>();

    static {
        ItemCodeEvent.put(speed_1.lore, new speed_1());

        ItemCodeEvent.put(attack_1.lore, new attack_1());

        ItemCodeEvent.put(speed_2.lore, new speed_2());
    }
}

import helpers.Constants;
import helpers.Logger;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class WarriorTest {
    public static Map<Integer, BooleanSupplier> WarriorMap = new LinkedHashMap<>();

    static {
        WarriorMap.put(1, WarriorTest::test01);
        WarriorMap.put(2, WarriorTest::test02);
        WarriorMap.put(3, WarriorTest::test03);
        WarriorMap.put(4, WarriorTest::test04);
        WarriorMap.put(5, WarriorTest::test05);
        WarriorMap.put(6, WarriorTest::test06);
        WarriorMap.put(7, WarriorTest::test07);
        WarriorMap.put(8, WarriorTest::test08);
        WarriorMap.put(9, WarriorTest::test09);
    }

    // test prime (not exceed)
    public static boolean test01() {
        Battle.GROUND = 2;
        int baseHp = 123;
        Warrior w = new Warrior(baseHp, 1);
        return w.getCombatScore() == 2.0 * baseHp;
    }
    // test prime (exceed limit)
    public static boolean test02() {
        Battle.GROUND = 17;
        int baseHp = 501;
        Warrior w = new Warrior(baseHp, 0);
        return w.getCombatScore() == 999.0;
    }

    // test square (WP = 1) -> normal case: return baseHP
    public static boolean test03() {
        Battle.GROUND = 4;
        int baseHp = 69;
        Warrior w = new Warrior(baseHp, 1);
        return w.getCombatScore() == baseHp;
    }

    // test square (WP != 1)
    public static boolean test04() {
        Battle.GROUND = 4;
        int baseHp = 102;
        Warrior w = new Warrior(baseHp, 0);
        return w.getCombatScore() == baseHp / 10.0;
    }

    // test normal number (WP = 1)
    public static boolean test05() {
        Battle.GROUND = 10;
        int baseHp = 102;
        Warrior w = new Warrior(baseHp, 1);
        return w.getCombatScore() == baseHp;
    }
    // test normal number (WP != 1)
    public static boolean test06() {
        Battle.GROUND = 12;
        int baseHp = 998;
        Warrior w = new Warrior(baseHp, 0);
        return w.getCombatScore() == baseHp / 10.0;
    }

    // test exceed 999
    public static boolean test07() {
        Battle.GROUND = 12;
        int baseHp = 1000;
        Warrior w = new Warrior(baseHp, 0);
        return w.getCombatScore() == 100;
    }

    public static boolean test08() {
        Battle.GROUND = 12;
        int baseHp = 1000;
        Warrior w = new Warrior(baseHp, 1);
        return w.getCombatScore() == 999;
    }

    public static boolean test09() {
        Battle.GROUND = 12;
        int baseHp = 10000;
        Warrior w = new Warrior(baseHp, 0);
        return w.getCombatScore() == 999;
    }
}
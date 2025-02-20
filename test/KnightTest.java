import helpers.Constants;
import helpers.Logger;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class KnightTest {

    public static Map<Integer, BooleanSupplier> KnightMap = new LinkedHashMap<>();

    static {
        KnightMap.put(1, KnightTest::test01);
        KnightMap.put(2, KnightTest::test02);
        KnightMap.put(3, KnightTest::test03);
        KnightMap.put(4, KnightTest::test04);
        KnightMap.put(5, KnightTest::test05);
        KnightMap.put(6, KnightTest::test06);
        KnightMap.put(7, KnightTest::test07);
        KnightMap.put(8, KnightTest::test08);
        KnightMap.put(9, KnightTest::test09);
    }

    // test prime (not exceed)
    public static boolean test01() {
        Battle.GROUND = 2;
        int baseHp = 123;
        Knight w = new Knight(baseHp, 1);
        return w.getCombatScore() == baseHp;
    }
    // test prime (exceed limit)
    public static boolean test02() {
        Battle.GROUND = 17;
        int baseHp = 501;
        Knight w = new Knight(baseHp, 0);
        return w.getCombatScore() == baseHp / 10.0;
    }

    // test square (WP = 1)
    public static boolean test03() {
        Battle.GROUND = 4;
        int baseHp = 69;
        Knight w = new Knight(baseHp, 1);
        return w.getCombatScore() == 2 * baseHp;
    }

    // test square (WP != 1)
    public static boolean test04() {
        Battle.GROUND = 4;
        int baseHp = 502;
        Knight w = new Knight(baseHp, 0);
        return w.getCombatScore() == 999;
    }

    // test normal number (WP = 1)
    public static boolean test05() {
        Battle.GROUND = 10;
        int baseHp = 102;
        Knight w = new Knight(baseHp, 1);
        return w.getCombatScore() == baseHp;
    }
    // test normal number (WP != 1)
    public static boolean test06() {
        Battle.GROUND = 12;
        int baseHp = 998;
        Knight w = new Knight(baseHp, 0);
        return w.getCombatScore() == baseHp / 10.0;
    }

    // test exceed 999
    public static boolean test07() {
        Battle.GROUND = 12;
        int baseHp = 1000;
        Knight w = new Knight(baseHp, 0);
        return w.getCombatScore() == 100;
    }

    public static boolean test08() {
        Battle.GROUND = 12;
        int baseHp = 1000;
        Knight w = new Knight(baseHp, 1);
        return w.getCombatScore() == 999;
    }

    public static boolean test09() {
        Battle.GROUND = 12;
        int baseHp = 10000;
        Knight w = new Knight(baseHp, 0);
        return w.getCombatScore() == 999;
    }
}

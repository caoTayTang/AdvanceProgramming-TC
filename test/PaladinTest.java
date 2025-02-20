import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class PaladinTest {
    public static Map<Integer, BooleanSupplier> PaladinMap = new LinkedHashMap<>();

    static {
        PaladinMap.put(1, PaladinTest::test01);
        PaladinMap.put(2, PaladinTest::test02);
        PaladinMap.put(3, PaladinTest::test03);
        PaladinMap.put(4, PaladinTest::test04);
        PaladinMap.put(5, PaladinTest::test05);
        PaladinMap.put(6, PaladinTest::test06);
        PaladinMap.put(7, PaladinTest::test07);
    }

    // test HP not fibonacci (not exceed)
    public static boolean test01() {
        int baseHp = 9;
        Paladin w = new Paladin(baseHp, 1);
        return w.getCombatScore() == 3 * baseHp;
    }

    // test HP not fibonacci (exceed)
    public static boolean test02() {
        int baseHp = 334;
        Paladin w = new Paladin(baseHp, 0);
        return w.getCombatScore() == 3 * baseHp;
    }

    // test HP fibonacci
    public static boolean test03() {
        int baseHp = 610; // F_15
        Paladin w = new Paladin(baseHp, 1);
        return w.getCombatScore() == 1015;
    }

    // test HP fibonacci
    public static boolean test04() {
        int baseHp = 1;
        Paladin w = new Paladin(baseHp, 0);
        return w.getCombatScore() == 3 * baseHp;
    }

    public static boolean test05() {
        int baseHp = 0;
        Paladin w = new Paladin(baseHp, 0);
        return w.getCombatScore() == 3 * baseHp;
    }

    public static boolean test06() {
        int baseHp = 2;
        Paladin w = new Paladin(baseHp, 0);
        return w.getCombatScore() == 1003;
    }

    public static boolean test07() {
        int baseHp = 121393;
        Paladin w = new Paladin(baseHp, 0);
        return w.getCombatScore() == 1026;
    }
}
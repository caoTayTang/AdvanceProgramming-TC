import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class DeathEaterTest {

    public static Map<Integer, BooleanSupplier> DeathEaterMap = new LinkedHashMap<>();
    static {
        DeathEaterMap.put(1, DeathEaterTest::test01);
        DeathEaterMap.put(2, DeathEaterTest::test02);
        DeathEaterMap.put(3, DeathEaterTest::test03);
        DeathEaterMap.put(4, DeathEaterTest::test04);
        DeathEaterMap.put(5, DeathEaterTest::test05);
        DeathEaterMap.put(6, DeathEaterTest::test06);
        DeathEaterMap.put(7, DeathEaterTest::test07);
        DeathEaterMap.put(8, DeathEaterTest::test08);
    }

    public static boolean test01() {
        DeathEater de = new DeathEater(new Complex(3, 4));
        return de.getCombatScore() == 5;
    }

    public static boolean test02() {
        double re = 10;
        double im = 11;
        DeathEater de = new DeathEater(new Complex(re, im));
        return de.getCombatScore() == Math.min(Math.sqrt(re * re + im * im), 999);
    }

    public static boolean test03() {
        DeathEater de = new DeathEater(new Complex(0, 1));
        return de.getCombatScore() == Math.min(Math.sqrt(1), 999);
    }

    public static boolean test04() {
        DeathEater de = new DeathEater(new Complex(1, 0));
        return de.getCombatScore() == Math.sqrt(1);
    }

    public static boolean test05() {
        double re = 1000;
        double im = 4000;
        DeathEater de = new DeathEater(new Complex(re, im));
        return de.getCombatScore() == Math.min(Math.sqrt(re * re + im * im), 999);
    }

    public static boolean test06() {
        double re = 0.0;
        double im = 0.0;
        DeathEater de = new DeathEater(new Complex(re, im));
        return de.getCombatScore() == Math.min(Math.sqrt(re * re + im * im), 999);
    }

    public static boolean test07() {
        double re = -1;
        double im = 2;
        DeathEater de = new DeathEater(new Complex(re, im));
        return de.getCombatScore() == Math.min(Math.sqrt(re * re + im * im), 999);
    }

    public static boolean test08() {
        double re = 100;
        double im = 200;
        DeathEater de = new DeathEater(new Complex(re, im));
        return de.getCombatScore() == Math.sqrt(re * re + im * im);
    }
}
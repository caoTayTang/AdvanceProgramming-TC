import helpers.Constants;
import helpers.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class MainTest {
    private static void RunTest(Map<Integer, BooleanSupplier> mpp) {
        ArrayList<Integer> pass = new ArrayList<>(), fail = new ArrayList<>();
        mpp.forEach((testId, fn) -> {
            if (fn.getAsBoolean()) {
                pass.add(testId);
            } else {
                fail.add(testId);
            }
        });
        Logger.log(Constants.LogType.PASS,"Passed: " + pass.toString());
        if (!fail.isEmpty())
            Logger.log(Constants.LogType.FAIL, "Failed: " + fail.toString());
        Logger.log(Constants.LogType.LOG,"Pass rate: " + pass.size() * 100.0 / (pass.size() + fail.size()) + "%");
    }


    /*
            - Nếu ground là số nguyên tố, điểm chiến đấu (CombatScore) của Warriors sẽ gấp đôi baseHP.
            - Nếu ground là số chính phương, điểm chiến đấu của Knights sẽ gấp đôi baseHP.
            - Nếu ground là số bình thường (không phải số nguyên tố hay số chính phương):
                + Nếu WP = 1, điểm chiến đấu sẽ bằng baseHP.
                + Nếu WP ≠ 1, điểm chiến đấu sẽ là baseHP / 10.

     */
    private static void KnightTest() {
        Logger.log(Constants.LogType.INFO, "TEST Knight");
        RunTest(KnightTest.KnightMap);
    }

    private static void DeathEaterTest() {
        Logger.log(Constants.LogType.INFO, "TEST DeathEater");
        RunTest(DeathEaterTest.DeathEaterMap);
    }

    private static void PaladinTest() {
        Logger.log(Constants.LogType.INFO, "TEST Paladin");
        RunTest(PaladinTest.PaladinMap);
    }

    private static void WarriorTest() {
        Logger.log(Constants.LogType.INFO, "TEST Warrior");
        RunTest(WarriorTest.WarriorMap);
    }

    private static void UtilityTest() {
        Logger.log(Constants.LogType.INFO, "TEST Utility");
        RunTest(UtilityTest.UtilityMap);
    }


    public static void BattleTest() {
        System.out.println("Battle Begin.");
        ModifiedBattle.moveRandomGround();
        Combatable[] var1 = TeamMaker.makeTeam1();
        Combatable[] var2 = TeamMaker.makeTeam2();
        System.out.println("Team 1 is " + Arrays.toString(var1));
        System.out.println("Team 2 is " + Arrays.toString(var2));
        ModifiedBattle var3 = new ModifiedBattle(var1, var2);
        var3.combat();
        System.out.println("Battle End.");
    }

    public static void main(String[] var0) {
        UtilityTest();
        DeathEaterTest();
        WarriorTest();
        KnightTest();
        PaladinTest();
//        BattleTest();
    }
}

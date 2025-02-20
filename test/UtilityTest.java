import helpers.Constants;
import helpers.Logger;
import org.junit.jupiter.params.shadow.com.univocity.parsers.fixed.FieldAlignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class UtilityTest {
    public static Map<Integer, BooleanSupplier> UtilityMap = new LinkedHashMap<>();

    static {
        UtilityMap.put(1, UtilityTest::test01);
        UtilityMap.put(2, UtilityTest::test02);
        UtilityMap.put(3, UtilityTest::test03);
        UtilityMap.put(4, UtilityTest::test04);
        UtilityMap.put(5, UtilityTest::test05);
    }

    // Test Utility.getNthFibonacci
    public static boolean test01() {
        long[] fib = new long[50];
        long a = 0, b = 1;

        for (int i = 0; i < fib.length; i++) {
            fib[i] = a;
            a = b;
            b = fib[i] + b;
        }

        for (int i = 3; i < fib.length; i++) {
            if (Utility.getNthFibonacci(fib[i]) != i) {
                Logger.log(Constants.LogType.FAIL, "getNthFibonacci(" + fib[i] + ") != " + i);
                return false;
            }
        }
        return true;
    }

    // Test Utility.isPrime(int num)
    public static boolean test02() {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};  // Known prime numbers
        int[] nonPrimes = {1, 4, 6, 8, 9, 10, 12, 14, 15, 16}; // Known non-prime numbers

        for (int prime : primes) {
            if (!Utility.isPrime(prime)) {
                Logger.log(Constants.LogType.FAIL, "isPrime(" + prime + ") should be true");
                return false;
            }
        }

        for (int nonPrime : nonPrimes) {
            if (Utility.isPrime(nonPrime)) {
                Logger.log(Constants.LogType.FAIL, "isPrime(" + nonPrime + ") should be false");
                return false;
            }
        }

        return true;
    }


    // Test Utility.isSquare(int num)
    public static boolean test03() {
        int[] squareNumbers = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};  // Perfect squares
        int[] nonSquareNumbers = {2, 3, 5, 6, 7, 8, 10, 11, 12, 13, 14};   // Non-square numbers

        for (int square : squareNumbers) {
            if (!Utility.isSquare(square)) {
                Logger.log(Constants.LogType.FAIL, "isSquare(" + square + ") should be true");
                return false;
            }
        }

        for (int nonSquare : nonSquareNumbers) {
            if (Utility.isSquare(nonSquare)) {
                Logger.log(Constants.LogType.FAIL, "isSquare(" + nonSquare + ") should be false");
                return false;
            }
        }

        return true;
    }

    public static boolean test04() {
        return !Utility.isSquare(2);
    }

    public static boolean test05() {
        return Utility.isSquare(1);
    }
}
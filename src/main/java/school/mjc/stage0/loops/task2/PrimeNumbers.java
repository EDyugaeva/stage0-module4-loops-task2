package school.mjc.stage0.loops.task2;

import java.math.BigInteger;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int i =2;
        while (i <= printToInclusive) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if (probablePrime && i != 15) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(33);

    }
}

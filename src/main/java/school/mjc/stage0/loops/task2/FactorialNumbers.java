package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int res = 1;
        while (i <= printToInclusive) {
            if (i == 0) {
                res = 1;
            } else {
                res = res * i;
            }
            System.out.println(res);
            i++;
        }

    }
}

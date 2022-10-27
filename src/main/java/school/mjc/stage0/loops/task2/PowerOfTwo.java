package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            int j = 0;
            while (j <= power) {
                System.out.println((int) Math.pow(2, j));
                j++;
            }

        }
        else {
            System.out.println("too much power");
        }

    }
}

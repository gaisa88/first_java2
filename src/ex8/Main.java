package ex8;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[100];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = ThreadLocalRandom.current().nextInt(100);
        }
        int t = 0;
        int f = 0;
        for (int i = 0; i < ints.length; i++) {
            if (t > ints[i]) {
                t = ints[i];
            } else if (f < ints[i]) {
                f = ints[i];
            }
        }
        System.out.println("Минимальное значение " + t);
        System.out.println("Максимальное значение " + f);
        for (int x : ints) {
            System.out.println(x);
        }
    }
}


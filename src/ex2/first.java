package ex2;

import java.util.stream.IntStream;

public class first {

    public static void main(String[] args) {
        int[] ints = IntStream.range(1, 100).toArray();

        for (int i = 1; i <= ints.length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

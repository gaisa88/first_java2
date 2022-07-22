package ex2;

import java.util.Arrays;

public class second {
    public static void main(String[] args) {
        int[][] mass = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}

        };
        for (int[] i : mass) {
            System.out.println(Arrays.toString(i));
        }
    }
}

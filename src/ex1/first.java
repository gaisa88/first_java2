package ex1;

public class first {
    public static void main(String[] args) {

        int[][] mass = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}

        };
        int x = mass.length;
        int counter = 0;
        while (x > 0) {
            int y = mass[0].length;
            x--;
            counter++;
            while (y > 0) {
                y--;
                counter++;
            }
            if (mass[x][y] == 7) {
                break;
            }
        }
        System.out.print(counter);
    }
}

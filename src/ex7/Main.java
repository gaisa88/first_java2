package ex7;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 10};
        int x = 4;
        for (int j : a) {

            System.out.println(x + "*" + j + "=" + x * j);

        }
    }
}

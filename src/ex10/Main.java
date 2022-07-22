package ex10;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10};
        int len = a.length;
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < len / 2; i++) {
            int x = a[len - i - 1];
            a[len - i - 1] = a[i];
            a[i] = x;
        }
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}

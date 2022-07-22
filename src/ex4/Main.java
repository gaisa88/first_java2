package ex4;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
            Printer.print(i);
        }
    }
}

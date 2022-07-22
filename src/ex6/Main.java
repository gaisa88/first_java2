package ex6;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int z = calculator.umnozhenie(10, 20);
        System.out.println(z);

        long z1 = calculator.umnozhenie(5000, 81500);
        System.out.println(z1);

        double z2 = calculator.umnozhenie(10.25, 20.25);
        System.out.println(z2);
    }
}

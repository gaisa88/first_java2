package ex9;
//Написать класс Конвертер, который будет конвертировать градусы Цельсия в градус Фаренгейта и наоборот
public class Main {
    public static void main(String[] args) {
        int x = 3000000;
        System.out.println("Градусы в Фаренгейтах " + Converter.Farengate(x) + " F");
        System.out.println("Градусы в Цельсиях " + Converter.Celsia(x) + " С");
    }
}

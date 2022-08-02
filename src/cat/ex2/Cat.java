package cat.ex2;

public class Cat extends Animal {
    String color;
    public Cat(String poroda, String color) {
        super(poroda);
        this.color = color;
    }

    String getColor() {
        return color;
    }
}

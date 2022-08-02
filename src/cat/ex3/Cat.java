package cat.ex3;

public class Cat extends Animal {
    String color;
    public Cat(String poroda, String color) {
        super(poroda);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

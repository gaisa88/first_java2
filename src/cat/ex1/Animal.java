package cat.ex1;

public abstract class Animal {
    String poroda;

    public Animal(String poroda) {
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }
}

package cat.ex2;

public abstract class Animal {
    String poroda;

    Animal(String poroda) {this.poroda = poroda;}

    String getPoroda() {
        return poroda;
    }
}

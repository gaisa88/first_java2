package cat.ex3;

public class LysayaKoshka extends Cat{
    final boolean Lysaya = true;

    public LysayaKoshka(String poroda, String color) {
        super(poroda, color);
    }

    public boolean isLysaya() {
        return Lysaya;
    }
}

package ex9;

public class Converter {
    public static int Farengate(int x){
        int v = (int) (x * 1.8 + 32);
        return v;
    }
    public static int Celsia(int x){
        int v = (int) ((x - 32) / 1.8);
        return v;
    }
}

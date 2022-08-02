package ex14;

public class Main {
    public static void main(String[] args) {
        Play baraban = new Baraban();
        Play gitar = new Gitar();
        Play piano = new Piano();

        gitar.play();
        baraban.play();
        piano.play();
    }
}

package interfaces.ex16;

public class Main {
    public static void main(String[] args) {
        MusicInstrument baraban = new Baraban();
        MusicInstrument gitar = new Gitar();
        MusicInstrument piano = new Piano();

        gitar.setting();
        gitar.play();
        baraban.setting();
        baraban.play();
        piano.setting();
        piano.play();
    }
}

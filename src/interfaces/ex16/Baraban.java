package interfaces.ex16;

public class Baraban implements MusicInstrument {
    @Override
    public void setting() {
        System.out.println("Отличная весч барабан, его не нужно настраивать главное не порвать");
    }

    @Override
    public void play() {
        System.out.println("Бить громко в барабан");
    }
}

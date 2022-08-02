package ex16;

public class Piano implements MusicInstrument {
    @Override
    public void setting() {
        System.out.println("Вызвать мастера для настройки фортепиано");
    }

    @Override
    public void play() {
        System.out.println("Бегать по клавишам как Моцарт");
    }
}

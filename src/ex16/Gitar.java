package ex16;

public class Gitar implements MusicInstrument {
    @Override
    public void setting() {
        System.out.println("Как хорошо что есть онлаин тюнер для настройки гитары");
    }

    @Override
    public void play() {
        System.out.println("Играть на 7-ми струнной гитаре");
    }
}

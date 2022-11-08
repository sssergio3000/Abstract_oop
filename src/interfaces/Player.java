package interfaces;

public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("---i play---");

    }

    @Override
    public void record() {
        System.out.println("---i record---");

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}

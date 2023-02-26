package lesson3.task1;

public class Player1 implements Runnable {
    PingPong pingPong;

    public Player1(PingPong pingPong) {
        this.pingPong = pingPong;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            pingPong.printPing();
        }

    }
}

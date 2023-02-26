package lesson3.task1;

public class Main {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        new Player1(pingPong);
        new Player2(pingPong);
    }
}

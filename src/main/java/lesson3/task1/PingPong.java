package lesson3.task1;

public class PingPong {

    boolean flag = false;

    synchronized void printPing() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println("Ping");
            flag = true;
            notify();
    }


    synchronized void printPong() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println("Pong");
            flag = false;
            notify();

    }
}




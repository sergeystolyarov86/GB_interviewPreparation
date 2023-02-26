package lesson3.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task2 {
    int count;
    void increaseCount() {
        count++;
    }
    public static void main(String[] args) {
        Task2 obj = new Task2();
        Lock lock = new ReentrantLock();

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                lock.lock();
                obj.increaseCount();
                System.out.println(Thread.currentThread().getName()+" increase count,count="+obj.count);
                lock.unlock();
        }).start();
        }
    }
}






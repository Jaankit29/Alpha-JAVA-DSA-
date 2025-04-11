/*
1) Intrinsic:-
These are built into every object in Java.
You don't see them, but they're there.
When you use a synchronized keyword, you're using these automatic locks.
2) Explicit:-
These are more advanced locks you can control yourself using the Lock class from java.util.concurrent.locks.
You explicitly say when to lock and unlock, giving you more ontrol over how and when people can write in the notebook.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Java_Locks {

    // Counter class definition
    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    // Thread subclass
    class MyThread extends Thread {
        private Counter counter;

        public MyThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }

    // BankAccount class
    public static class BankAccount {
        private int balance = 100;

        private final Lock lock =new ReentrantLock();

        public void withdraw(int amount) {
            System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                try {
                    Thread.sleep(3000); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}


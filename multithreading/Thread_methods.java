// Java provides a rich set of methods in the Thread class to manage the behavior of threads.

// 1. start() Method:-
// Description: The start() method is used to start a thread. It internally calls the run() method of the thread. Once a thread is started, it enters the "Runnable" state.
// Key Point: You should never call run() directly. It will execute the code in the same thread instead of creating a new one.

import java.security.Key;

@SuppressWarnings("unused")
class MyThread extends Thread {
    public void run() {
        try {
            //sleep()
            MyThread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()); 
    }
    }
}
class NewThread implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("******" + Thread.currentThread().getName()); 
    }

}
}
// 2. run() Method:-
// Description: The run() method contains the code to be executed by the thread. It acts as the entry point for the thread's execution logic.
// Key Point: run() is automatically called when the start() method is invoked.
// Note: If you call run() directly, it executes in the current thread instead of creating a new thread.

// 3. sleep(milliseconds) Method:-
// Description: Pauses the execution of the current thread for the specified time in milliseconds. During this time, the thread is in the "Timed Waiting" state.
// Key Point: Throws "InterruptedException" if the thread is interrupted while sleeping.

// 4. join() Method:-
// Description: Waits for the thread on which join() is called to finish its execution before the calling thread proceeds.
// Key Point: It ensures that a particular thread completes before other threads execute further.


// 5. isAlive():-
// Description: Checks if the thread is still running.
// Key Point: Returns true if the thread has not finished execution, otherwise false.

public class Thread_methods {
    public static void main(String[] args) {
        MyThread t0 = new MyThread();
        t0.start(); // Starts a new thread
        

        NewThread mt=new NewThread();
        Thread t1= new Thread(mt);
        System.out.println("Is thread t1 alive? " + t1.isAlive());
        t1.start();
        System.out.println("Is thread t1 alive? " + t1.isAlive());

        MyThread t2= new MyThread();

        try {
            t1.join(); // Wait for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();// Start t2 after t1 finishes

// 6. setPriority(int priority) and getPriority() Method:-
// Description: Sets or gets the priority of a thread. The priority ranges from 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY), with 5 (NORM_PRIORITY) as the default.
// Key Point: Thread priority is only a hint to the scheduler and may not always affect execution order.        

       MyThread t3=new MyThread();
       MyThread t4=new MyThread();
       t3.setPriority(10);// or //t3.setPriority(Thread.MAX_PRIORITY); // set maximum priority
       t4.setPriority(0);// or //t3.setPriority(Thread.MIN_PRIORITY); // set minimum priority
       t3.start();
       t4.start();

// 7. interrupt()
// Description: Interrupts a thread that is in the "Waiting" or "Sleeping" state, causing it to throw InterruptedException.
//**Key Point: It does not terminate the thread but changes its state.

    Thread t5 = new Thread(() -> {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    });

    t5.start();
    t5.interrupt(); // Interrupt the thread

// 8. yield() Method:-
// Description: Temporarily pauses the execution of the current thread to allow other threads of equal priority to execute.
// Key Point: It is a hint to the thread scheduler and may not guarantee any behavior.
// public static void main(String[] args) {
//     Thread t1 = new Thread(() -> {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Thread 1 is running");
//             Thread.yield(); // Yield to other threads
//         }
//     });

//     Thread t2 = new Thread(() -> {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Thread 2 is running");
//         }
//     });

//     t1.start();
//     t2.start();
// }

// 9. Daemon Threads:-
// Description: A daemon thread is a low-priority thread that runs in the background and provides services to user threads. Daemon threads terminate automatically when all user threads finish execution.
// Key Point: Use the setDaemon(true) method to make a thread a daemon thread.
// Example:
// Copy code
// public class DaemonExample {
//     public static void main(String[] args) {
//         Thread daemonThread = new Thread(() -> {
//             while (true) {
//                 System.out.println("Daemon thread running...");
//                 try {
//                     Thread.sleep(1000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         });

//         daemonThread.setDaemon(true); // Set thread as daemon
//         daemonThread.start();

//         System.out.println("Main thread finished...");
//     }
// }

// 10. Other Useful Thread Methods
// currentThread(): Returns a reference to the currently executing thread.
// setName() and getName(): Set or get the name of a thread.
// Example:
// java
// Copy code
// public class ThreadNameExample {
//     public static void main(String[] args) {
//         Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
//         t1.setName("MyThread");
//         t1.start();
//     }
// }
    }
}


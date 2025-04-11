/* 
ChatGPT-  https://chatgpt.com/share/67768165-257c-8002-bb9c-22078f80b35a


In multithreaded programming, synchronization is a mechanism that ensures that multiple 
threads access shared resources in a controlled and consistent manner.
Without synchronization, two or more threads might access a shared resource simultaneously, 
leading to race conditions, data inconsistency, or unpredictable behavior.

1. Why Synchronization?
When multiple threads access shared resources like variables, arrays, or objects, 
and at least one thread modifies the resource, we need to synchronize the access to:

Prevent data corruption.
Ensure thread safety.
Avoid race conditions where the output depends on the sequence or timing of threads.

2. The synchronized Keyword
The synchronized keyword in Java is used to lock a block of code or a method so that 
only one thread can execute it at a time.

3. Types of Synchronization
i)Synchronized Methods:
Lock applies to the entire method.
The thread holds the lock on the object (or class if the method is static) while executing 
the method.
ii)Synchronized Blocks:
Lock applies to a specific block of code within a method.
More fine-grained control, better performance as only the critical section is locked.
*/

// 4. Synchronized Methods
// When a method is declared synchronized, it ensures that only one thread can
// execute it at a time for a given object.
//Example:
class Counter {
    private int count = 0;
    // Explanation:
    // increment() is synchronized, ensuring only one thread can execute it at a time.
    // Without synchronization, the final count might not be 2000 due to race conditions.
    public synchronized void increment() { // Synchronized method
        count++;
    }

    public int getCount() {
        return count;
    }
}

// 5. Synchronized Blocks
//A synchronized block is used to synchronize only a specific portion of the code instead of the entire 
//method. This provides better performance as the lock is applied only to the critical section.

// Syntax:
// synchronized(object) {
//     // Critical section
// }
//Example:
class Counter1 {
    private int count = 0;
    // Explanation:
    // Synchronization is applied only to the block of code that modifies the shared variable.
    // This reduces the time a thread holds the lock, improving performance.
    public void increment() {
        synchronized (this) { // Lock only this block
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

// 6. Static Synchronization
// If a synchronized method is declared as static, the lock applies to the 
//class object (ClassName.class) instead of an instance.
// Example:

class Shared {
    public static synchronized void staticMethod() {
        System.out.println(Thread.currentThread().getName() + " is executing");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
 //********************************************************************************* */  
        //Synchronized Methods
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
     //   System.out.println("t1.start(); - "+counter.getCount());
        t2.start();
     //   System.out.println("t2.start(); - "+counter.getCount());

        t1.join(); // Wait for t1 to finish
     //   System.out.println(" t1.join(); - "+counter.getCount());
        t2.join(); // Wait for t2 to finish
        //System.out.println(" t2.join(); - "+counter.getCount());

         System.out.println("Final count: " + counter.getCount());
        
//*********************************************************************************** */
        //Synchronized Blocks
        Counter counter1 = new Counter();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("Final count: " + counter1.getCount());
//******************************************************************************************* */
        //Static Synchronization
        Thread t5 = new Thread(() -> Shared.staticMethod(), "Thread 5");
        Thread t6 = new Thread(() -> Shared.staticMethod(), "Thread 6");

        t5.start();
        t6.start();
    }
    
}

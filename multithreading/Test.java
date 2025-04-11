//package multithreading;

/* 
To create a new thread in Java, you can either :-
(1) extend the Thread class or (2) implement the Runnable interface.
**In both cases, the run method contains the code that will be executed in the new thread.
*/
// 1)extends "Thread"
// • A new class World is created that extends "Thread".
// • The "run" method is overridden to define the code that
// constitutes the new thread.
// • "start" method is called to initiate the new thread
class World extends Thread{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            //System.out.println("World");
            System.out.println(Thread.currentThread().getName()); // Thread-0
        }
    }

}


//2) implements "Runnable"
// • A new class Universe is created that implements "Runnable".
// • The "run" method is overridden to define the code that constitutes the new thread.
// • A Thread object is created by passing an instance of MyRunnable.
// • "start" method is called on the Thread object to initiate new thread.
class Universe implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
           // System.out.println("Universe");
            System.out.println(Thread.currentThread().getName()); //Thread-1
    }

}
}
public class Test {
    public static void main(String[] args) {

    // 1)extends "Thread"
        World w1=new World();
        w1.start();

     //2)implements "Runnable"   
        Universe u1=new Universe();
        Thread t1=new Thread(u1);
        t1.start();

        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());// main
        }
        
    }
}

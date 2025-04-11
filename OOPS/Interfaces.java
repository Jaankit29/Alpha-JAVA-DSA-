package OOPS;



 interface Animal {

    public static final int Max_Age=150;
    int Min_Age=20;  // it is by default "public static final"

    public abstract void eat();

    void sleep(); // by default "public abstract"

    // public void information(){  //Error: Abstract methods do not specify a body

    // } 
    
    //Static Methods (Java 8) // Cannot be overridden by implementing classes.
    static void info(){  // but static methods can specify a body
     System.out.println("This is Static method in Interface Animal");
    }
    
    //Default Methods (Java 8)
    public default void run(){  // No need to implement default method in child class 
        System.out.println("Animal is running");
    }
  
    
}
// interface Birds implements Animal{ //Error:Interface Cannot Implement Another Interface
//                                     //An interface extends another interface.
// }                                   //Only classes can implement an interface.

interface Birds extends Animal { // Correct: Interface extends another interface

    // Additional abstract method for Birds
    void fly();
}

class Dog implements Animal{ //A class must provide implementations for all 
                            //the methods in the interface unless the class is declared abstract.

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    static void info(){ 
        System.out.println("bb");
       }
    

}

abstract class Cat implements Animal{ // abstract class, no need to implementations for all the methods in the interface
//     If a class implementing an interface is declared as abstract, it can leave the interface methods unimplemented.
//   **The subclass that extends the abstract class must then provide implementations for the remaining methods of the interface.
        @Override
        public void eat() {
            System.out.println("Cat is eating");
        }
        // `sleep` method is not implemented, so this class must be declared abstract
 }    

 class PersianCat extends Cat {
    @Override
    public void sleep() { //The subclass that extends the abstract class must then provide implementations for the remaining methods of the interface.
        System.out.println("Persian Cat is sleeping");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        System.out.println(Dog.Max_Age);
        System.out.println(Dog.Min_Age);
        System.out.println(Animal.Max_Age);
        Dog D1= new Dog();
        D1.eat();
        Animal.info();
       // Animal.run(); //Error : Cannot make a static reference to the non-static method run() from the type Animal
       // Dog.run(); //Error: Cannot make a static reference to the non-static method run() from the type Animal
        Dog.info();
    //  Dog.info(); //Error: The method info() is undefined for the type Dog
        D1.run();      

        PersianCat persianCat = new PersianCat();
        persianCat.eat();   // Output: Cat is eating
        persianCat.sleep(); // Output: Persian Cat is sleeping
        persianCat.run();   // Output: Animal is running
        
    }
}

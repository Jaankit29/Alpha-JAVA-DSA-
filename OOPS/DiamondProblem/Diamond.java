/* 
The Diamond Problem
The diamond problem occurs in programming languages that support multiple inheritance. 
It arises when a class inherits from two or more classes that have a common ancestor, 
leading to ambiguity about which implementation to inherit from.

Java resolves this problem by disallowing multiple inheritance with classes but allows 
multiple inheritance through interfaces.
    A
   / \
  B   C
   \ /
    D

Java and the Diamond Problem
Java avoids the diamond problem with classes because it does not support multiple inheritance 
with classes. Instead, Java allows multiple inheritance only through interfaces, which are designed to avoid ambiguity.
*/
package OOPS.DiamondProblem;

interface A {
    default void display() {
        System.out.println("Interface A");
    }
}

interface B {
    default void display() {
        System.out.println("Interface B");
    }
}

class D implements A, B {
    @Override
    public void display() {
        A.super.display(); // Explicitly calling A's display()
        System.out.println("Class D resolves conflict");
    }  
}

public class Diamond {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
        // Output:
        // Interface A
        // Class D resolves conflict
    }
}
/* 
Diamond Problem in Interfaces:-
Java allows multiple inheritance through interfaces, but provides clear rules to resolve conflicts:
Default methods must be explicitly resolved if they conflict.
Java uses a single inherited implementation when there's no conflict.

Explanation
Java’s Rule for Default Methods: If a class implements multiple interfaces with 
conflicting default methods, the class must:
 1. Override the conflicting method.
 2. Explicitly resolve which interface's method to invoke (if needed).
Why Explicit Resolution? Java doesn’t automatically choose between conflicting default 
methods from interfaces to prevent ambiguity and ensure that the programmer has full control.
*/
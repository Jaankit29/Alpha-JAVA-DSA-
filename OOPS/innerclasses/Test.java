package OOPS.innerclasses;

public class Test {

    public static void main(String[] args) {
        // Creating a Car instance
        Car c1 = new Car("Tata Safari");

       

        // Using the Engine inner class
        Car.Engine E1= c1.new Engine();
        E1.start();
        Car.Engine engine = c1.new Engine(); // Proper syntax to instantiate an inner class
        engine.start(); // Output: Tata Safari engine started
        engine.start(); // Output: Tata Safari engine is already started
        engine.stop();  // Output: Tata Safari engine stopped
        engine.stop();  // Output: Tata Safari engine is already stopped
    }
}

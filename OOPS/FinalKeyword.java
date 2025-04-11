// https://chatgpt.com/c/676546c5-b928-8002-8f40-80e56f15b89b

package OOPS;

class Vehicle{

    public static final double Pi;

    static{
        Pi=3.14;
    }

   final void speed(){
         System.out.println("Dist/time");
   }

   void acceleration(){
     
   }
}

class Car extends Vehicle{
    
    public static final int speedLimit= 200; // final variable

    //getter
    int getSpeedLimit(){
        return speedLimit;
    }
    //setter
    void setSpeedLimit(int s){ // error, because variable speedLimit is Final
        this.speedLimit= s;     // cannot assign a value to a final variable
    }

   @Override
   void speed(){ //Cannot override the final method from Vehicle

   }
}

final class Bike{ //final class
    //code
}

class tire extends Bike {  //The type tire cannot subclass the final class Bike

}

public class FinalKeyword {
    public static void main(String[] args) {

     //   Car.speedLimit=300; // error, fianl
        
    }
}

package OOPS.innerclasses;

public class Car {

    private String model;

    private boolean isEngineOn;

    public Car(String model){
        this.model=model;
    }

   

    class Engine{
        
        void start(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println(model+ " engine started");
            }
            else{
                System.out.println(model+ " engine is already is started");
            }
        }

        void stop(){
            if(isEngineOn){
                isEngineOn=false;
                System.out.println(model+ " engine stopped");
            }
            else{
                System.out.println(model+ " engine is already is stopped");
            }
        }

    }
    
}

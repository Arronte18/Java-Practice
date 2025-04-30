package PolymorphismChallenge;

public class Car {
    
    private String description;

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car - > startEngine");
    }

    public void drive(){
        System.out.println("Car -> driving, types is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");

    }
    
}

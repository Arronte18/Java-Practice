package PolymorphismChallenge;

public class ElectricCar extends Car {
    
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description){
        super(description);
    }
    public ElectricCar(String description, double avgKmPerLitre, int batterySize){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;

    }
   
}

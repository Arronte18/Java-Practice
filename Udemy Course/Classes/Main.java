package Classes;

public class Main {
    
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("black");
        car.setConvertible(true);;
        car.describeCar();
    }
}

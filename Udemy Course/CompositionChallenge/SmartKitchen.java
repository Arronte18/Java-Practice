package CompositionChallenge;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;


    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }
    

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }


    public DishWasher getDishWasher() {
        return dishWasher;
    }


    public Refrigerator getIceBox() {
        return iceBox;
    }


    public void setKitchenState(boolean fridge, boolean cMaker, boolean dWasher){
        brewMaster.setHasWorkToDo(cMaker);
        iceBox.setHasWorkToDo(fridge);
        dishWasher.setHasWorkToDo(dWasher);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
    
}

class Refrigerator{
    private boolean hasWorkToDo;

    
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}

class CoffeeMaker{
    private boolean hasWorkToDo;


    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
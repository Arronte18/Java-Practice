package ConstructorChallenge;

public class Customer {
    
    private String name;
    private double creditLimit;
    private String email;


    public Customer(){
        this("Default", "Default");
    }


    public Customer(String name, String email) {
        this(name, 1000.00, email);
    }


    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    

    public static void testing(){
        System.out.println("reached testing");
    }


    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }

    
}

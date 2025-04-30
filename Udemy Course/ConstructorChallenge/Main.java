package ConstructorChallenge;

public class Main {
    
    public static void main(String[] args){
        Customer customer1 = new Customer("Tim", 100, "Tim@email.com");
        Customer customer2 = new Customer("Anthony", 100, "Anthony@email.com");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer1.getName());
        
        Customer.testing();

    }
}

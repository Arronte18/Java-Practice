package ClassesChallenge;

public class Main {
    
    public static void main(String[] args) {
        //Account customer1 = new Account("1234", 10000.00, "Bob Brown",
                 //            "bobb@email.com", "(823) 721-1243");
        
       
        Account newCustomer = new Account("tim", "tim@email.com", "1238");
        System.out.println("Money: " + newCustomer.getAccountBalance());
    }
}

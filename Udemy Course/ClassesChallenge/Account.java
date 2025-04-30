package ClassesChallenge;

public class Account {

   
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;


    public Account(){
        this("56789", 2.39, "Default name", "default address", "default phone");

        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance, String name, String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.accountBalance = balance;
        this.customerName = name;
        this.customerEmail = email;
        this.phoneNumber = phone;
    }

    

    public Account(String customerName, String customerEmail, String phoneNumber) {
        this("99999", 9183.28, customerName, customerEmail, phoneNumber);
        // this.customerName = customerName;
        // this.customerEmail = customerEmail;
        // this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit){
        this.accountBalance += deposit;
        System.out.println("Deposit of $" + deposit + " made. New balance is $" + this.accountBalance);

    }

    public void withdraw(double withdraw){
        if(this.accountBalance < withdraw){
            System.out.println("Withdraw exceeds funds");
            return;
        }
        this.accountBalance -= withdraw;
        System.out.println("Withdraw of $" + withdraw + " made. Remaining balance is $" + this.accountBalance);

    }
}

package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe", "11/11/1985", "01/01/2020", 35000);
        System.out.println(joe);
        System.out.println("Hire date = " + joe.getHireDate());
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
        System.out.println(joe);

        HourlyEmployee mary = new HourlyEmployee("Mary", "02/06/1999", "09/08/2024", 40);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}

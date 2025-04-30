import java.util.Scanner;
public class userInput {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int counter = 1;
        int input;
        int sum = 0;
        do {

            try{
                System.out.print("Enter number #" + counter + ": ");
                input = isValid(scan.nextLine());
                sum += input;
                counter++;
            }catch(Exception e){
                System.out.println("Invalid number, try again");
            }

        } while(counter <= 5);

        System.out.println("The sum of all values is: " + sum);
        scan.close();
    }

    public static int isValid(String input){
        return (Integer.parseInt(input));
    }
}

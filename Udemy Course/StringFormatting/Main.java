package StringFormatting;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        

        //FORMATTING
        String bulletIt = "Print a Bulleted List:\n" + 
                            "\t \u2022 First Point\n" +
                            "\t\t \u2022 Sub Point";

        System.out.println(bulletIt);

        String texBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(texBlock);




        int age = 45;
        System.out.printf("your ages is %d%n", age);


        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("your ages is %.2f%n", (float)age);

        for(int i = 1; i < 1000000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }


        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);


        String testing = "Hello Worlds";

        System.out.println(testing.length());
        System.out.println(testing.charAt(6));
        System.out.println(testing.indexOf('W'));
        System.out.println(testing.lastIndexOf('o'));
        System.out.println(testing.isEmpty());
        System.out.println(testing.indexOf("rlds"));
        System.out.println(testing.indexOf('l', 4)); //output 9, searches from inded 4 forwards
        System.out.println(testing.lastIndexOf('l', 7)); // output 3, searches from index 7 backwards
    
        System.out.println("____________________________________________________");

    
        String string1 = "HELLO WORLDS";
        String string2 = string1.toLowerCase();
        System.out.println(string1);
        System.out.println(string2);
        
        if(string1.equals(string2)){
            System.out.println("Values matched exactly");
        }

        if(string1.equalsIgnoreCase(string2)){
            System.out.println("Values matched ignoring case");
        }

        if(string1.startsWith("HELLO")){
            System.out.println("String starts with HELLO");
        }

        if(string1.endsWith("WORLDS")){
            System.out.println("String ends with WORLDS");
        }

        if(string1.contains("WORL")){
            System.out.println("String contains WORL");
        }

        if(string1.contentEquals("HELLO WORLDS")){
            System.out.println("content matches exatly");
        }
    
        System.out.println("____________________________________________________");

        String birthDate = "11/08/2001";
        int startingIndex = birthDate.indexOf("2001");
        System.out.println("Starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(0,2));

        String newDate = String.join("-", "12","31","2000");
        System.out.println(newDate);

        newDate = "12";
        newDate= newDate.concat("-31-2000");
        System.out.println(newDate);
        System.out.println(newDate.replace('-', '/'));
        System.out.println(newDate.replace("1", "99"));
        System.out.println(newDate.replaceFirst("-", "/"));
        System.out.println(newDate.replaceAll("-", "///"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));
    
    }
}
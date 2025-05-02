package Enums;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
    
    
        for(int i = 0; i < 10; i++){
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

        }
    
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInt = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInt];
    }
}

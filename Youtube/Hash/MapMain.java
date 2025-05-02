package Youtube.Hash;

import java.util.*;
public class MapMain {
    public static void main(String[] args) {
        
        //unordered like hashsets
        Map<String, Integer> empIds = new HashMap<>();
        empIds.put("Jim", 8392);
        empIds.put("Tim", 2311);
        empIds.put("Kim", 8112);
        empIds.put("Dim", 6583);
        empIds.put("Mim", 5473);
        System.out.println(empIds);

        System.out.println(empIds.get("Kim"));
        System.out.println(empIds.containsKey("Dim"));
        System.out.println(empIds.containsKey("Batman"));

        System.out.println(empIds.containsValue(8392));
        System.out.println(empIds.containsValue(15));

        //overrides the value of key jim
        //if jim does not exist, creates jim with value
        empIds.put("Jim", 7777);
        System.out.println(empIds);

        //same as put but does not create new key-value pair if it does not exist
        empIds.replace("Jim", 5555);
        empIds.replace("Batman", 5555);
        System.out.println(empIds);


        //does nothing becuase Jim already exists
        empIds.putIfAbsent("Jim", 4444);
        //creates new keyvalue pair Swim
        empIds.putIfAbsent("Swim", 2222);
        System.out.println(empIds);

        empIds.remove("Swim");
        System.out.println(empIds);
    }

}

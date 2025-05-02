package Youtube.Hash;

import java.util.*;
public class SetMain {
    //UseCase:
    // when you want a collection of items with no duplicates, order does not matter
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("James");
        names.add("Jesse");
        names.add("Hal");
        names.add("Jordan");
        names.add("Batman");
        //second add of batman does nothing, sets cannot contain duplicates
        names.add("Batman");
        
        //remove only works by object name
        //cannot remove based on index because of unrealiable item order
        names.remove("Hal");
        // will not print in order because sets do not maintain insertion order
        System.out.println(names);
        System.out.println("Size: " + names.size());

        System.out.printf("Contains %s: %b%n", "Jordan", names.contains("Jordan"));
        System.out.printf("Contains %s: %b%n", "Bill", names.contains("Bill"));

        //removes all items
        //names.clear();


        //iterate through
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        } 


        //Use case: removing all duplicates from a list
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,3,3,4,5,2));
        System.out.println("Number List: " + numberList);
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println("Number Set" + numberSet);



        //using linkedhashset maintains insertion order of elements, more efficient than treeset but not hashset
        //using a TreeSet is less efficient but elemets are ordered, uses a redblack tree
    }
}

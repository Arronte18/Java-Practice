import java.util.*;
public class ArrayLists {
    
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        intArrayList.add(1);
        intArrayList.add(3);
        System.out.println(intArrayList);

        intArrayList.add(0,9);
        System.out.println(intArrayList);

        intArrayList.set(0,19);
        System.out.println(intArrayList);

        //to print ArrayList use the variable name in sout, directly
        //-------------------------------------
        System.out.println("___________________________");

        //creates a list from an array of literals
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);
        System.out.println(list);

        //creates an arraylist from a list, you do this to use the
        //methods found in List but not in arraylist and then create
        /// the arraylist from the provided list
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        //create arraylist from list of literals
        ArrayList<String> nextList = new ArrayList<>(List.of("pickes",
                                        "mustard", "cheese"));
        System.out.println(nextList);

        //add/appends one list to another
        groceries.addAll(nextList);
        System.out.println(groceries);

        //------------------------------------------------------
        System.out.println("------------------------------------");
        //access, sort, copy, search

        System.out.println("Third item = " + groceries.get(2));

        if(groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("first = " + groceries.lastIndexOf("yogurt"));


        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        //sorting algorithms for ArrayList
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceriesArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceriesArray));
   
        //searching methods for ArrayList are boolean contains, boolean containsAll, int indexOf, lastIndexOf
        //-------------------
        System.out.println("--------------------------------");

        String[] originalArray = new String[] {"First", "Second", "Third"};
        //creates list of the passes array, has array limitations, no add or remove, cant change size
        // originalList is also a reference to originalArray, any changes to either results in changes in the other
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList );
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

        //causes a runtime error because you cant grow an array
        //originalList.add("fourth");

        //creates a fixed size list
        List<String> newList = Arrays.asList("Monday", "Tuesday", "Wednesday");
        System.out.println(newList);
    }
}

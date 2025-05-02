import java.util.*;
public class LinkedLists {
    //usefull list methods
    //list.contains(list) returns true or false
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        // sorts list
        //Collections.sort(placesToVisit);
        placesToVisit.sort(Comparator.naturalOrder());
        System.out.println(placesToVisit);



        // removeElements(placesToVisit);
        // System.out.println(placesToVisit);

        //gettingElements(placesToVisit);

        printItinerary3(placesToVisit);

        //testIterator(placesToVisit);
        //testListIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");
        
        System.out.println(list);
        String s1 = list.remove(); //removes first element, index 0
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); //removes first element, index 0
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); //removes last element
        System.out.println(s3 + " was removed");

        //Queue/Dequeue poll methods
        String p1 = list.poll(); //removes first element
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst(); //removes first element
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast(); //removes last element
        System.out.println(p3 + " was removed");

        //Stack methods
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed"); //removes first element
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        //Queue retrival method
        System.out.println("Element from element() = " + list.element()); //gets first element

        //Stack retrival methods
        System.out.println("Element from peek() = " + list.peek()); //gets first element
        System.out.println("Element from peekFirst() = " + list.peekFirst()); //gets first element
        System.out.println("Element from peekLast() = " + list.peekLast()); //gets last element

    }

    private static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String prevTown = list.getFirst();
        for(String town : list){
            System.out.println("--> From: " + prevTown + " to " + town);
            prevTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String prevTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + prevTown + " to " + town);
            prevTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    //regular iterator is forwards only and only supports the remove method
    private static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
               // list.remove(); gives error
               iterator.remove(); 
            }
        }
        System.out.println(list);
    }

    private static void testListIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            
            if(iterator.next().equals("Brisbane")){
               // can add to listIterator
               iterator.add("Lake Wivenhoe"); 
            }
        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        //iterator cursor position is between indexes, next and previous returns the value and moves the cursor
        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }
}

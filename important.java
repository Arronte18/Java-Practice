import java.util.*;
import java.io.*;
public class important {
    
    public static void main(String[] args) {
        //file i/o
        //write
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Writing to file");
        writer.write("\nAnother Line");
        writer.close();
    } catch(IOException e) {
        e.printStackTrace();
    }
    //read
    try{
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line;
        while(line = reader.readLine() != null)
            System.out.println(line);
        reader.close();
    } catch (IOException e){
        e.printStackTrace();
    }


    //Hash Map
    Map<String,Integer> mapHash = new HashMap<>();
    mapHash.put("Jim", 92893); //puts keyvalue pair into hash
    mapHash.get("Jim"); //returns value
    mapHash.containsKey("Jim"); //returns true if key found
    mapHash.containsValue(92893); //returns true if value found

     //overrides the value of key jim
        //if jim does not exist, creates jim with value
        mapHash.put("Jim", 7777);

    //same as put but does not create new key-value pair if it does not exist
    mapHash.replace("Jim", 5555);


    //does nothing becuase Jim already exists
    mapHash.putIfAbsent("Jim", 4444);
    //creates new keyvalue pair Swim
    mapHash.putIfAbsent("Swim", 2222);

    mapHash.remove("Swim");
    


    //Hash Set
    //UseCase:
    // when you want a collection of items with no duplicates, order does not matter

    Set<String> names = new HashSet<>();
    names.add("James");

    //second add of batman does nothing, sets cannot contain duplicates
    names.add("James");

    //remove only works by object name
    //cannot remove based on index because of unrealiable item order
    names.remove("James");

    // will not print in order because sets do not maintain insertion order
    System.out.println(names);

    //removes all items
    //names.clear();

    names.contains("James"); //returns true if value exists in set

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


    //Arrays

    int[] myIntArry = new int[10];
    myIntArry[5] = 50;
    int size = myIntArry.length;

    int[] anotherArray = {9,8,7,6,5,4,3,2,1};

    //print individual elements
    System.out.println();
    for(int i : anotherArray){
        System.out.print(i + " ");
    }
    //print string of array elements
    System.out.println(Arrays.toString(anotherArray));


     //initialization sets default values of 0
     int[] secondArray = new int[10];
     System.out.println(Arrays.toString(secondArray));
     //sets all elements to 5
     Arrays.fill(secondArray, 5);

     //sorts using modified merge sort
     Arrays.sort(secondArray);


     //array binary search
        //array must be sorted for binary search to work
        //multiple same target values could return random duplicate index
        //returns index of target value

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark in the list");

        }

        //to print array use Arrays.toString(array);
        //to print multidimenstional arrays use Arrays.deepToString(array2d);
        int here = 19;
        String me = "";
        me = Integer.parseString(here);
        int newInt = Interger.toString(me);
        //String.valueOf(here) also works
        //User Input
        Scanner scan = new Scanner(System.in);


    }

    //get random ints
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}

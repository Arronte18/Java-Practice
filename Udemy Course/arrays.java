import java.util.*;
public class arrays {
    
    public static void main(String[] args) {

        //Inititalizing Arrays
        int[] myIntArry = new int[10];
        myIntArry[5] = 50;
        int size = myIntArry.length;
        System.out.println(size);

        int[] someArray = new int[]{2,3,4,5,6,7};

        int[] anotherArray = {9,8,7,6,5,4,3,2,1};
        
        System.out.println();
        for(int i : anotherArray){
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.println(Arrays.toString(anotherArray));

        Object objectVariable = anotherArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }
        
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        System.out.println(objectArray[0]);
        objectArray[2] = anotherArray;

        //---------------------------------------------------------------
        System.out.println("---------------------------------------------");
        //array functionality

        int [] testy = getRandomArray(12);
        //modified merge sort that runs at n*logn
        Arrays.sort(testy);
        System.out.println(Arrays.toString(testy));

        //initialization sets default values of 0
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        //sets all elements to 5
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));


        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArrray = Arrays.copyOf(thirdArray, 20);
        System.out.println(Arrays.toString(largerArrray));

        //-------------------------------------------------
        System.out.println("---------------------------------------------------");
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

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        // returns true on ordered arrays of equal size
        if(Arrays.equals(s1, s2)){
            System.out.println("arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }

        //to print array use Arrays.toString(array);
        //to print multidimenstional arrays use Arrays.deepToString(array2d);
        
    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}

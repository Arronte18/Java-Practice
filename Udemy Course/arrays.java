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
    }
}

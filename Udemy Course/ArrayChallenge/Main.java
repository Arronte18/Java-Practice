package ArrayChallenge;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] s1 = new int[10];
        for(int i = 0; i < s1.length; i++){
            s1[i] = random.nextInt(100);
        }
        int[] s2 = descendingOrder(s1);
        System.out.println("Array1 = " + Arrays.toString(s1));
        System.out.println("Array2 = " + Arrays.toString(s2));
    }


    public static int[] descendingOrder(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }
        Arrays.sort(arr);
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[arr.length -1 -i] = arr[i];
        }
        
        return temp;
    }
}

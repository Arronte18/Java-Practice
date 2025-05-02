package MinimumElementChallenge;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //System.out.println(findMin(readIntegers()));
        reverse(readIntegers());
    }
    

    private static int[] readIntegers(){
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        String[] modifiedUserInput = userInput.split(",");
        int len = modifiedUserInput.length;
        int[] temp = new int[len];
        for(int i = 0; i < len; i++){
            temp[i] = Integer.parseInt(modifiedUserInput[i].trim());
        }
        
       return temp;
    }

    private static int findMin(int[] arr){
        int currentMin = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            currentMin = (currentMin < arr[i]) ? currentMin : arr[i];
        }

        return currentMin;
    }
    //1,2,3,4,5
    private static void reverse(int[] arr){
        int mid = arr.length / 2;
        int temp;
        for(int i = 0; i < mid; i++){
            temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

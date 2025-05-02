import java.util.*;
public class testing {
        


        public static void main (String [] args){
            List<Integer> arr = new ArrayList<>(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
        
        
                long max = 0;
                long min = 0;
                arr.sort(Comparator.naturalOrder());
                min = (long)arr.get(0) + (long)arr.get(1) + (long)arr.get(2) + (long)arr.get(3);
                max = (long)arr.get(1) + (long)arr.get(2) + (long)arr.get(3) + (long)arr.get(4);
                System.out.println(min + " " + max);
        }

        

        

       
}


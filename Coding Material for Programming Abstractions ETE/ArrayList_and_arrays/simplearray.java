package ArrayList_and_arrays;
import java.util.*;

public class simplearray {
    public static void main(String ... args){

        Integer arr[] = {10,5,4,3,2};

        Arrays.sort(arr); // sort in asc
        Arrays.sort(arr, Collections.reverseOrder()); // sort in desc

        for(int ele:arr)
            System.out.print(ele + " ");

    }
}

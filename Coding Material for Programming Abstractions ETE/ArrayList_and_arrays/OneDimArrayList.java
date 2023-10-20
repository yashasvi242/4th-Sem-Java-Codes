package ArrayList_and_arrays;
import java.util.*;
public class OneDimArrayList {
    
    public static void main(String ... args){

        // input
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n); //
        for(int i=0; i < n; i++){
            int ele = scn.nextInt();
            arr.add(ele);
        }

        // arr.set(0,199); // reassign a value in arrayList

        // print array 
        System.out.println("Array :- ");
        for(int i=0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        System.out.println();

        // sort 
        Collections.sort(arr);
        System.out.println("Asc sorted array : " + arr);

        Collections.reverse(arr);
        System.out.println("Descsorted array : " + arr);
    }
    
}
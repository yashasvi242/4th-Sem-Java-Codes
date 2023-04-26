import java.util.*;
import java.util.Arrays;

/* Sorting an array in both ascending & descending orders :- 

    1. to sort a simple 'int arr[]' in ascending order we can use 'Arrays.sort(arr)'
    2. we can not sort 'int arr[]' in descending order, even using 'Arrays.sort(arr, Collections.reverseOrder())'
    
    3. to solve this problem use 'Integer arr[]' rather then 'int arr[]' this way both we can sort the array in
        ascending as well as descending order, because Int is a primitive data type On the other hand Integer is a wrapper class that wraps a primitive type int into an object
*/

public class SortArray{

    public static void main(String args[]){

        //input 
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter number of elements in array : ");
        int size = scn.nextInt();

        System.out.print("Enter all elements : ");

        // int arr[] = new int[size]; 
        Integer arr[] = new Integer[size];
        for(int i = 0; i < size; i++){
            arr[i] = scn.nextInt();
        }

        // ASCENDING SORTING 
        Arrays.sort(arr); // works for both 'int' and 'Integer'

        System.out.print("Ascending :- ");
        for(int i=0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        // Descending sorting 
        // we will need to use method of 'Collections' predefined class of java, will not work for 'int' array, only works for 'Integer' array 

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("\nDescending :- ");
        for(int i=0; i < size; i++){
            System.out.print(arr[i] + " ");
        }



    }
}

/*

Enter number of elements in array : 6
Enter all elements : 1 2 4 0 9 8 
Ascending :- 0 1 2 4 8 9 
Descending :- 9 8 4 2 1 0 

 */

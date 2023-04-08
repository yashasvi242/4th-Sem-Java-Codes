
import java.util.*;

// Lets learn how to declare, allocate memory and initialize array (not ArrayList)

/* ⭐(Ques) Difference between array, list, and ArrayList in Java ?

-> An array is a basic collection of fixed size that can store any declared type of
elements. 

-> The List is a dynamic collection (it means, its size can change over
time) that is generic, so it can also store any declared type of elements.

-> An ArrayList is a dynamic collection that can store various types of elements at 
the same time, as it treats everything it stores as instances of the System.Object
type

*/

class Array{

    public static void main(String args[]){
        
        // array is a basic functionality whereas ArrayList is a part of the collection framework.
        // there are 3 ways to declare & initialize a array
        
        //Method - 1 (declaring , then allocating memory, insert element)
        int arr1[];
        arr1 = new int[5];

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        //Method-2 (declaring allocating memory at ones, then inserting element)
        int arr2[] = new int[5];

        arr2[0] = 4;
        arr2[1] = 14;
        arr2[2] = 24;
        arr2[3] = 34;
        arr2[4] = 44;

        //Method-3 (declaring allocating meory and initializeing with values all at ones)
        int arr3[] = new int[]{9,19,29,39,49};   // size will be equal to number of elements 

        //lets print all 3 arrays 
        
        //System.out.println(arr1); // ⚠️this only works for 'ArrayList' framework    

        System.out.println("-----Array 1 : ------ ");
        for(int i=0; i < arr1.length; i++)
            System.out.println(i + " -> " + arr1[i]);

        System.out.println("-----Array 2 : ------ ");
        for(int i=0; i < arr2.length; i++)
            System.out.println(i + " -> " + arr2[i]);

            
        System.out.println("-----Array 3 : ------ ");
        for(int i=0; i < arr3.length; i++)
            System.out.println(i + " -> " + arr3[i]);
    }
    
}

/* Output :- 

-----Array 1 : ------ 
0 -> 10
1 -> 20
2 -> 30
3 -> 40
4 -> 50
-----Array 2 : ------
0 -> 4
1 -> 14
2 -> 24
3 -> 34
4 -> 44
-----Array 3 : ------
0 -> 9
1 -> 19
2 -> 29
3 -> 39
4 -> 49
  
  */

import java.util.*;
/*  
    -> create an array of size 5.
    -> take 5 elements from user as input and store int into the array
    -> now print the min and max elements of this array 
    -> create an array 'revArr' and store the 'arr' elements into 'revArr' in a reversed order 
    -> take input from user as 'targerIndex' , now print 'arr' but do not print the 'targetIndex' element 

 */

// important - save this file as 'array.java'

public class array {

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.print("enter 5 ints for array : ");
        for(int i=0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        // print
        System.out.print("Array : ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // find min and max element of the array 
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("\nMin : " + min);
        System.out.println("Max : " + max);

        // reversed array 
        int revArr[] = new int[5];

        int index = 0;
        for(int i=arr.length-1; i >= 0; i--){
            revArr[index++] = arr[i];
        }

        System.out.print("reversed Array : ");
        for(int i=0; i < revArr.length; i++)
            System.out.print(revArr[i] + " ");

        // delete target index element
        System.out.print("\nenter index to delete : ");
        int targetIndex = scn.nextInt();

        for(int i=0; i < arr.length; i++){
            if(i==targetIndex)
                continue;
            else System.out.print(arr[i] + " ");
        }
    }
    
}

/*
 Input output :- 
 
enter 5 ints for array : 10 20 30 40 50 
Array : 10 20 30 40 50 
Min : 10
Max : 50
reversed Array : 50 40 30 20 10 
enter index to delete : 3
10 20 30 50

*/

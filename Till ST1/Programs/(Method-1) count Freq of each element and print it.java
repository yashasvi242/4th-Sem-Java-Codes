import java.util.*;

// count freq of all numbers in an array 

public class CountFreq {

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int size = scn.nextInt();
        int arr[] = new int[size];

        System.out.print("enter all numbers : ");
        for(int i=0; i < size; i++){
            arr[i] = scn.nextInt();
        }

        // lets count the freq and store it into numToFreq
        int numToFreq[] = new int[size];

        for(int i=0; i < size; i++){
            numToFreq[arr[i]]++;
        }

        // print the output 
        System.out.println("------ Result -----");
        for(int i=0; i < size; i++){
            if(numToFreq[i] != 0)
                System.out.println("num : " + i + " Freq : " + numToFreq[i]);
        }
        


    }
    
}

//Output :- 
/*
Enter number of elements : 10
enter all numbers : 1 1 2 2 3 4 4 4 6 7 
------ Result -----
num : 1 Freq : 2
num : 2 Freq : 2
num : 3 Freq : 1
num : 4 Freq : 3
num : 6 Freq : 1
num : 7 Freq : 1

*/

import java.util.*;

// count freq of all numbers without using extra space

public class CountFreq {

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int size = scn.nextInt();
        int arr[] = new int[size];

        System.out.println("enter all numbers : ");
        for(int i=0; i < size; i++){
            arr[i] = scn.nextInt();
        }

        // lets count the freq of each element without using any extra space

        for(int i=0; i < size; i++){
            //int ele = arr[i];
            int freq = 0;
            for(int j=0; j < size; j++){
                if(arr[j] == i)
                    freq++;
            }
            
            System.out.println("num : " + i + " Freq : " + freq);
        }
        


    }
    
}

//Output :- 
/*
Enter number of elements : 9
enter all numbers : 1 1 2 2 3 4 4 4 6 
------ Result -----
num : 0 Freq : 0
num : 1 Freq : 2
num : 2 Freq : 2
num : 3 Freq : 1
num : 4 Freq : 3
num : 5 Freq : 0
num : 6 Freq : 1
num : 7 Freq : 1
num : 8 Freq : 0
num : 9 Freq : 0
-----------------

*/

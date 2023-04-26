import java.util.*;

public class KthLargestNum {
    
    /* 
        Test Case - 1
        ------------- 
            I/P ->
                10 3 
                3 3 4 2 5 4 5 4 6 6
            
            O/P -> 4

                note:- array may have duplicate elements

        size of array = 10  
        3 3 4 2 5 4 5 4 6 6 (find kth largest number) (if k = 3 exp output : 4 )
        
        6 6 5 5 4 4 4 3 3 2  (now we can not simply find the kth largest)

        prv = 4
        ans = 4
        k = 0

        */

    
    public static void main(String args[]){

        System.out.print("-----------------------------------------\n");

        //input 
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter size of array & value of K : ");

        int size = scn.nextInt();
        int k = scn.nextInt();

        Integer arr[] = new Integer[size];
        System.out.println("Enter elements for array : ");
        for(int i=0; i < size; i++){
            arr[i] = scn.nextInt();
        }

        // lets find the kth largest element (keep in mind : array can have duplicate elements )

        // lets sort the array in desc order (since we need the kth largest num)
        Arrays.sort(arr, Collections.reverseOrder());

        // now our array is sorted in desc, lets fetch the kth largest element (ignore dupli of same element if any)
        int tempK = k;
        int prv = -99999; // to store prv element (to maintain duplicate)
        int ans = 0;

        /* debug

            6 6 5 5 4 4 4 3 3 2 
                    -
            index = 4
            prv = 4
            tempK = 1 
            ans = 0

         */
        for(int i=0; i < size; i++){

            if(arr[i] != prv){// new ele found 

                prv = arr[i];
                tempK--;

                if(tempK == 0){// k limit reached 
                    ans = arr[i];
                    break;
                }
            }
        }

        if(ans == 0)
            System.out.println("Kth largest element does'nt exist");
        else System.out.println("kth largest => " + ans);


        System.out.print("-----------------------------------------\n");

    }

   
}

/*
 Output : 

Enter size of array & value of K : 
10 2 
Enter elements for array :
3 3 4 2 5 4 5 4 6 6
kth largest => 5

 */

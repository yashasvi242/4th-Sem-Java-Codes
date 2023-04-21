
import java.util.*;

public class Main{
    
    // rotate array by k steps to left
    
    public static void main(String args[]){
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("enter size of array : ");
        int size = scn.nextInt();
        
        System.out.print("enter k : ");
        int k = scn.nextInt();
        
        System.out.print("enter elements : ");
        int arr[] = new int[size];
        for(int i=0; i < size; i++){
            arr[i] = scn.nextInt();
        }
        
        //algo
        int ans[] = new int[size];
        int index = 0;
        for(int i = k-1; i < size; i++){
            ans[index++] = arr[i];
        }
        
        for(int i=0; i <= k-2; i++)
            ans[index++] = arr[i];
        
        // print ans 
        System.out.println("Output : ");
        for(int i=0; i < size; i++)
            System.out.print(ans[i] + " ");
        
        
    }
}

/*
Output :



enter size of array : 5 
enter k : 3
enter elements : 1 2 3 4 5 

Output : 
3 4 5 1 2 

*/

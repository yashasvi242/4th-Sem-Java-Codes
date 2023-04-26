import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        
        System.out.println("enter size of array : ");
        
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt();
        
        int arr[] = new int[n];
        
        // int numToFreq[] = new int[10];
        System.out.print("Enter numbers : ");
        System.out.println();
        for(int i=0; i < n; i++){
            
            arr[i] = scn.nextInt();
            
            // numToFreq[arr[i]]++; // freq stored
        }
        
        
        int ans = 0;
        for(int i=0; i < arr.length; i++){
            
            int num = arr[i];
            int freq = 0;
            // count freq
            for(int j=0; j < arr.length; j++){
                if(num == arr[j])
                    freq++;
                    
            }
            
            if(freq == num)
                ans = Math.max(num,ans);
        }
        
        if(ans == 0)    
            System.out.println("ans = " + -1);
        else System.out.println("ans = " + ans);
        
    }
}

/*
Test case 1 : 
8
3 3 3 4 4 4 4 1
*/

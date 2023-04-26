import java.util.*;

public class MyClass {
    
    //2 sum
    
    public static void main(String args[]) {
        
        // input 
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number of elements and K : ");
        
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("enter all elements : ");
        for(int i=0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        //algo
        boolean ansFound = false;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(i == j)
                    continue;
                if(arr[i] + arr[j] == k){
                    System.out.println("result : " + i + " " + j);
                    ansFound = true;
                    break;
                }
            }
            
            if(ansFound)
                break;
        }
        
        
        if(!ansFound)
            System.out.println("resulting pair not found");
        
    }
}

/*
Test case 1 : 
5 10 
7 6 5 2 3 

Output : 0 4 (indexes)
*/ 


import java.util.*;


public class Main{
    
    public static void main(String args[]){
        
        // Fibo : 0 1 1 2 3 5 8 => 20 (n=7)
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("enter n : ");
        int n = scn.nextInt();
        
        // find fibo series till 7 elements 
        int fiboSum = 1;
        int a = 0;
        int b = 1;
        for(int i=2; i < n; i++){
            int c = a+b;
            fiboSum += c;
            a = b;
            b = c;
        }
        
        System.out.println(" Result : " + fiboSum);
        
    }
}

// input : n=7
// output : sum = 20

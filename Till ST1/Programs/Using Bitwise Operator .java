import java.util.*;

/* Question given a number 'n', and a threshold 'k', we need to find 'and' 'or' 'xor' of each number between 1 to n and return the 
maximum value of 'and' 'or' 'xor' as output but make sure to return only the ans which is lower then threshold 'k'

input : n=4 k=4

output : - 
maxAnd = 2
maxOr = 3 
maxXor = 3

*/
public class Main{
    
    public static void main(String args[]){
        // n = 3, k = 3
        //1, 2, 3
        
        // input 
        Scanner scn = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = scn.nextInt();
        System.out.print("enter k : ");
        int k = scn.nextInt();
        
        int maxAnd = 0;
        int maxOr = 0;
        int maxXor = 0;
        
        // algo 
        for(int i=1; i <= n; i++){
            
            for(int j=i+1; j <= n; j++){
                
                int andVal = i&j;
                int orVal = i|j;
                int xorVal = i^j;
                
                if(andVal < k && andVal > maxAnd)
                    maxAnd = andVal;
                if(orVal < k && orVal > maxOr)
                    maxOr = orVal;
                if(xorVal < k && xorVal > maxXor)
                    maxXor = xorVal;
            }
        }
        
        // print 
        System.out.println("\nmax Or : " + maxAnd);
        System.out.println("max And : " + maxOr);
        System.out.println("max XOr : " + maxXor);
        
        
    }
}

/* 
input :-
--------
enter n : 4
enter k : 4

Output :- 
---------
max Or : 2
max And : 3
max XOr : 3


*/

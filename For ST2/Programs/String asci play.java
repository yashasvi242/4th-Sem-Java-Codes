import java.util.*;
public class que1 {

    /*
        given a 'string' and n 'characters', for each character out of n, count its frequency in the string and then multiply it with its asci value's 
        at the end add all the asci values and return the sum 

        input : Hello 
        Enter n : 
        2  
        Enter 2 characters : 
        l o 
        
        result : 173
     */
    public static void main(String ... args){
        
        // input 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scn.next();
        System.out.println("Enter n : ");
        int n = scn.nextInt();
        System.out.println("Enter " + n + " characters : ");
        char chArr[] = new char[n];
        for(int i=0; i < n; i++)
            scn.next().charAt(0);

        //algo
        int sum = 0;
        for(int i=0; i < n; i++){
            char ch = str.charAt(i);

            // count fre of ch in str
            int freq = 0;
            for(int j=0; j < str.length(); j++)
                if(str.charAt(j) == ch)
                    freq++;
            
            // find the asci of ch 
            int asci = (int)ch;

            sum += freq*asci;

        }

        System.out.println("result : " + sum);

    }
    
}

/* Q7. Remove character 
Que - For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
input :-
Yashasvi
a
output : Yshsvi
*/ 

import java.util.*;

public class RemoveOccurrence {
    public static void main(String ... args){

        //input 
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = scn.next();
        System.out.print("Enter char to remove : ");
        char ch = scn.next().charAt(0);

        // algo
        String newStr = "";
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) != ch) 
                newStr += str.charAt(i);
        }

        System.out.println("Output : " + newStr);
    }
    
}

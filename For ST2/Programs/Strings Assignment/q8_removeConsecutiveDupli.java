/*
input : aaaabbbb
Output : ab
*/
import java.util.*;

public class RemoveConsicutiveDupli {

    public static void main(String ... args){
        // input 
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string :- ");
        String str = scn.next();

        // algo

        String newString = "";
        char prvChar = ' ';
        for(int i=0; i < str.length(); i++){
            char currChar = str.charAt(i);
            if(currChar != prvChar){
                newString += currChar; // insert new char to string (only when it is not eq to prvChar)
                prvChar = currChar;
            }
        }

        System.out.println("Output : " + newString);
    }
    
}

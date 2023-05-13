import java.util.*;
/*
    Input : abcd
    Output : a, ab, abc, b, bc, bcd, c, cd, d
*/

public class FindAllSubstring {
    
    public static void main(String ... args){

        System.out.println("-------------------------------");

        // input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = scn.next();

        // algo
        for(int i=0; i < str.length(); i++){
            String smallerStr = "";
            for(int j=i; j < str.length(); j++){
                smallerStr += str.charAt(j); // fetch ch from 'str' and push into 'smallerStr'
                System.out.println(smallerStr + " ");
            }
        }

        System.out.println("-------------------------------");

        

    }
}

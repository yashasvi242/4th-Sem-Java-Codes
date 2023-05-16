import java.util.*;

/*  Given a string, add the digits present in that string in the below way

    input : M12a12da12m
    output : 36 

    input : a123Lph456xxd798ida
    output : 1377

    input : acb12cbcg34ncxncn67
    output : result : 113

*/

public class StringSum {

     public static void main(String ... args){

        // input 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scn.next();
        
        //algo 
        // A-Z (65-90) 
        // a-z (97-128)
        // 1 to 9 (49-57)

        int sum = 0;
        
        String strInt = "";
        for(int i=0; i < str.length(); i++){

            char ch = str.charAt(i);
            boolean isInt = (ch >= 49 && ch <= 57);    // (or use Character.isDigit(ch) - checks if a character is digit or not)

            // if we get a int character then, add it to out 'strInt'
            if(isInt){
                strInt += ch;
            }
            else{ // else convert currString to character and add it to sum
                if(strInt == "")
                    continue;
                Integer num = Integer.valueOf(strInt); 
                sum += num;
                strInt = "";
            }
        }

        if(strInt != ""){
            Integer num = Integer.valueOf(strInt);
            sum += num;
        }

        System.out.println("result : " + sum);
     }
}

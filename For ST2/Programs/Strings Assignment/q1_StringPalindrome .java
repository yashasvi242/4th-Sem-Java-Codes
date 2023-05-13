import java.util.*;

class StringPalindrome1{

    public static void main(String ... args){

        //input 
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = scn.next();

        // check if its a palindrome
        int i = 0;
        int j = str.length() - 1;

        boolean isPalindrome = true;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome)
            System.out.println("Yes Palindrome");
        else System.out.println("Not a Palindrome");
    }
}

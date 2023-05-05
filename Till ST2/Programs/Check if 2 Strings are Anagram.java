// import java.lang.reflect.Array;
import java.util.*;

// check if 2 strings are anagrams or not.

public class StrToken3 {

    public static void main(String ... args){

        String a = "abcdef";   // anagram  (all characters have same frequencies)
        String b = "fedcba";

        a = "Demo";  // not anagram ('D' is diff from 'd')
        b = "Mode";

        // convert string into character arrays  
        char aArr[] = a.toCharArray(); 
        char bArr[] = b.toCharArray(); 

        // sort 2 char arrays 
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        // again convert char array into strings
        a = String.valueOf(aArr);
        b = String.valueOf(bArr);

        // compare the data of 2 strings
        if(a.equals(b))
            System.out.println("Anagram");
        else System.out.println("not anagram");
    }
}



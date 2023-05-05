import java.lang.reflect.Array;
import java.util.*;

// check if 2 strings are anagrams or not.

// 2 strings are anagram if both have same characters with same freq

public class StrToken3 {

    public static void main(String ... args){

        String a = "abcdef";
        String b = "fedcba";

        a = "Demo";
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

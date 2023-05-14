```
Input : 
CodingNinjas
3 
Output : jasCodingNin

```
```java
import java.util.Scanner;
public class RotateString6 {
    
    // Given a string and an integer n, shift and rotate the given string by n characters in right.

    public static void main(String ... args){

        // input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = scn.next();
        System.out.print("Enter k : ");
        int k = scn.nextInt();

        String newString = "";
        for(int i=str.length() - k; i < str.length(); i++)
            newString += str.charAt(i);
        
        for(int i=0; i < str.length()-k; i++)
            newString += str.charAt(i);

        System.out.println("Output : " + newString);


    }
}
```

```
input : AbCdEf
output : aBcDeF
```

```java
import java.util.*;
public class InvertCase {

    public static void main(String ... args){

        // input 
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scn.next();

        // algo 
        char chArr[] = str.toCharArray();
        for(int i=0; i < chArr.length; i++){

            char ch = chArr[i];// fetch character

            // if char is lower case, convert it to upper case (by doing -32)
            // lower case range :- 97 to 123
            // upper case range :- 65 to 91

            if(ch >= 65 && ch <= 91)  // upper case to lower case
                chArr[i] = (char)(ch + 32);
            
            else if(ch >= 97 && ch <= 123) // lower case to upper case 
                chArr[i] = (char)(ch - 32 );
            
        }

        String newString = String.valueOf(chArr);

        System.out.println("Output : " + newString);





    }
    
}
```

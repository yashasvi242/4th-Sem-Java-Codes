// Change UPPER CASE to lower case.
```
Input : HELLOW
output : hellow

Input : ABC DEG IMJ
output : abc deg imj
```

### Approach - 1 (using asci)
```java
import java.util.*;

public class ChangeTheCase {

    // A = 65
    // a = 96
    // upper to lower (96-65) => 31 
    // A + 31 => a

    // Approach - 1 (using asci)

    // change upper case string to lower case 
    public static void main(String ... args){

        // input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string in upper case : ");
        String str = scn.nextLine(); // coz input can be "ABC DEF IJK"
 
        //algo
        String newString = "";
        for(int i=0; i < str.length(); i++){
            //newString += str.charAt(i) + 32;  //⚠️ this will convert 32 to string then append it
            
            if(str.charAt(i) == ' ') // skip spaces (do not convert them)
                newString += " "; 
            
            else newString += (char)(str.charAt(i) + 32); //✔️
        }

        System.out.println("Output : " + newString);

    }
    
}

```

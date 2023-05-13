// Replace character 'c1' present in string with a character 'c2' in 'str'
 
 ```java
input:- 
  
string : abacd
Enter character 1 : a 
Enter character 2 : x 

Output :- xbxcd
 
 ```
 
### Approach -1 (generating a new string)

 ```java
import java.util.*;

// Q2. Replace Character 


// Approach - 1 (generating new string)

public class CharacterReplacement {
    
    public static void main(String ... args) {

        // input 
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = scn.next();
        System.out.print("Enter character 1 : ");
        char ch1 = scn.next().charAt(0);
        System.out.print("Enter character 2 : ");
        char ch2 = scn.next().charAt(0);

        // replace ch1 with ch2 in 'str'
        // himachal (replace a with A)
        
        String newString = "";
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == ch1)
                newString += ch2;
            else newString += str.charAt(i);
        }

        System.out.println("Output :- " + newString);
        
        
    }
}

```

-------
### Approach - 2 (using character array)

```java


```

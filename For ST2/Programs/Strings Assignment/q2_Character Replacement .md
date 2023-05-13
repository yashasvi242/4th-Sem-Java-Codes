### Replace character 'c1' present in string with a character 'c2' in 'str'
 
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
import java.util.*;

// Q2. Replace Character 


 // Approach - 2 (using character array)

public class CharacterReplacement2 {
    
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
     
        char chArr[] = str.toCharArray(); // convert str to chacter array, then replace the ch 
        
        for(int i=0; i < chArr.length; i++){
            if(chArr[i] == ch1)
                chArr[i] = ch2;
        }   

        String outputString = String.valueOf(chArr); // ones replaced, convert back charArray to string 

        System.out.println("Output :- " + outputString);
        
        
    }
}


```

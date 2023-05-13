```java
input : "hellow how are you?"
output : "hellowhowareyou?"
```

## Approach -1 (using string tokenizer)
```java
import java.util.*;

public class TrimSpaces3 {

   //Approach - 2 (using string tokenizer)
   
    public static void main(String ... args){
        
        // input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String sentence = scn.nextLine();
        
        //algo
        StringTokenizer tokenObj = new StringTokenizer(sentence," "); // split sentence on basis of space
        
        String newString = "";
        while(tokenObj.hasMoreTokens()){
            newString += tokenObj.nextToken();
        }

        System.out.println("Output : " + newString);
        

    }
    
}

```
## Approach-2 (generating new string)

```java
import java.util.*;

public class TrimSpaces3 {

    // Approach - 1 (generating new String)
    public static void main(String ... args){
        
        // input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String sentence = scn.nextLine();

        // trim spaces 
        String newStr = "";
        for(int i=0; i < sentence.length(); i++){
            if(sentence.charAt(i) != ' ') // including only non space characters into new string
                newStr += sentence.charAt(i);
        }

        System.out.print("Output : " + newStr);

    }
    
}

```

## Reverse a sentence in unique way 

``` 
    Input : "hellow how are you?"
    Output : wolleh woh era ?uoy 
```

##### Approach 1 (simple loops itarative method)

```java
import java.util.*;
    
 // Approach - 1 (using simple loops and iteration with string obj)

public class ReverseString {

    static String revString(String str){

        String reversedString = "";
        int i = str.length()-1;

        while(i >= 0){
            reversedString += str.charAt(i);
            i--;
        }

        return reversedString;
    }

    public static void main(String ... args){

        System.out.println("------------------------");
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = scn.nextLine(); // "Hello how are you?"

        System.out.println("Reversed String :- ");

        String word = "";
        for(int i=0; i < sentence.length(); i++){

            // fetch each word from the sentence
            if(sentence.charAt(i) != ' '){
                word += sentence.charAt(i);
            }
            // if a space comes, then rev this word, print it, and set it to empty string again
            else{
                String reversedStr = revString(word);
                System.out.print(reversedStr + " ");
                word = "";
            }
        }

        // reversiing the last word
        if(word != ""){
            String reversedStr = revString(word);
            System.out.print(reversedStr + " ");
        }

        System.out.println("\n------------------------");
    }
}

```
##### ⭐[Best] Approach-2 (using string tokenizer)

```java
import java.util.*;

/* Reverse a sentence in unique way :- 
    Input : "hellow how are you?"
    Output : wolleh woh era ?uoy 
 */

 // Approach - 2 (using string tokenizer)

public class ReverseString2 {

    // function to reverse a string
    static String revString(String str){

        String reversedString = "";
        int i = str.length()-1;
        while(i >= 0){
            reversedString += str.charAt(i);
            i--;
        }
        return reversedString;
    }

    public static void main(String ... args){

        System.out.println("------------------------");
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = scn.nextLine(); // "Hello how are you?"

        StringTokenizer tokenObj = new StringTokenizer(sentence, " "); // split the string on basis of 'spaces'

        while(tokenObj.hasMoreTokens()){ // loop while the tokenObj is not empty
            String word = tokenObj.nextToken();  // fetch each word from tokenObj
            String reveredstring = revString(word); // reverse it
            System.out.print(reveredstring + " ");
        }

        System.out.println("\n------------------------");
    }

    

}

```

```
input : aaabvcddddww
output : d (4 times)
```

### Approach - 1 (using extra space array)

```java
import java.util.*;
public class HighestOccurringCharacter {

    // Q9. Highest Occuring Character 
    
    public static void main(String ... args){

        // input 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scn.next();

        //algo (storing freq)
        int charToFreq[] = new int[26];

        int maxFreq = Integer.MIN_VALUE;
        char maxFreqChar = ' ';
        for(int i=0; i < str.length(); i++){ // storing freq
            char ch = str.charAt(i);
            int index = (int)(ch - 'a');  // finding right index for 'ch'
            
            charToFreq[index]++;
            //finding the max freq char (while storing them)
            if(charToFreq[index] > maxFreq){
                maxFreq = charToFreq[index];
                maxFreqChar = (char)(index + 'a');
            }
        }

        System.out.println("max Freq character : " + maxFreqChar);
        System.out.println("max Freq : " + maxFreq);
    }   
}
```

### approach - 2 (no extra space )
$Time : O(n^2)$
```java
import java.util.*;
public class HighestOccurringCharacter {

    // Q9. Highest Occuring Character 
    
    public static void main(String ... args){

        // input 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scn.next();

        int maxFreq = Integer.MIN_VALUE;
        char maxFreqChar = ' ';
        for(int i=0; i < str.length(); i++){
            char currChar = str.charAt(i);
            int currFreq = 0;
            for(int j=0; j < str.length(); j++){
                if(str.charAt(j) == currChar)
                    currFreq++;
            }

            if(currFreq > maxFreq){
                maxFreq = currFreq;
                maxFreqChar = currChar;
            }
        }

        System.out.println("Output : " + maxFreqChar);
    }
    
}

```



import java.util.*;

public class FindRepeatingWord {

    // max time occurring word
    
    public static void main(String ... args){
        
        String str = "cat bat vat cat cat vat bat cat rat"; 

        // 'cat' 'vat' are repeating >= 2 times so print them 
        // split word on basis of space and store into string tokenizer
        // then loop the tokenObj, and count the freq of each wird

        // using split 
        String arr[] = str.split(" ");

        String maxFreqWord = " ";
        int maxFreq = 0;

        for(int i=0; i < arr.length; i++){

            String word = arr[i];
            int freq = 0;
            for(int j=0; j < arr.length; j++){

                if(word == arr[j]) 
                    freq++;
            }

            // if we found a more freq occuring word
            if(freq > maxFreq){
                maxFreq = freq;
                maxFreqWord = word;
            }
        }

        System.out.println("Result : " + maxFreqWord);

    }
    
}

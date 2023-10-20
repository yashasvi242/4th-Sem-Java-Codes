
import java.util.*;

/*
  hm.containsKey(key)


 */
public class Hashmaps {

    public static void main(String ... args){

        Map<Character,Integer> hm = new HashMap<>();   //         random order
        // Map<Character,Integer> hm = new LinkedHashMap<>();   //  same order in which we pushed elements 
        // Map<Character,Integer> hm = new TreeMap<>();  // sorted lexicographically 

        // count character frequency
        String str = "helloow";
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(hm.containsKey(ch)){
                int key = hm.get(ch);
                hm.put(ch,key+1);
            }
            else hm.put(ch,1); // initialize with freq 1 
        }

        // print the ch with freq 
        for(Character key:hm.keySet()){
            int freq = hm.get(key);
            System.out.println(key + " occurs " + freq + " times");
        }
    }    
}



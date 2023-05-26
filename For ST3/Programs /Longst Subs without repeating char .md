## Longest Substring without repeating char

[Que leetcode Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/description)

input /output 

![image](https://github.com/yashasvi242/4th-Sem-Java-Codes/assets/124666305/d77e0655-4ad7-4631-9212-c6a85b707e75)

![image](https://github.com/yashasvi242/4th-Sem-Java-Codes/assets/124666305/f17de1a1-0026-4132-9138-2ba1ac90cfe9)

![image](https://github.com/yashasvi242/4th-Sem-Java-Codes/assets/124666305/996d9b61-2656-4184-b26e-bf02cc0aeb7a)


```java
class Solution {
/* ✔️Approach - 1 (Brute force)

        idea : try finding all possible substrings with uniq chars, and to check if they prv occured or not we are here using a HashMap, coz in a hashmap retrieval/insertion is O(1)
    
     T : O(n^2) 
     S : O(n) - hashMap 
    
*/
    public int lengthOfLongestSubstring(String str) {

        int maxLen = 0;
        //int charToFreq[] = new int[26];  // this will not work since we can have special characters as well (! , * A a 0 etc)
        HashMap<Character, Integer> charToFreq = new HashMap<>();

        for(int i=0; i < str.length(); i++){

            int currLen = 0;

            for(int j=i; j < str.length(); j++){

                char ch = str.charAt(j);

                if(charToFreq.containsKey(ch)) // is key prv occurred 
                    break;
                else{ // new key found 
                    charToFreq.put(ch, 1);
                    currLen++;
                } 
            }

            maxLen = Math.max(maxLen, currLen);
            charToFreq.clear();
        }
        
        return maxLen;
    }
}
```

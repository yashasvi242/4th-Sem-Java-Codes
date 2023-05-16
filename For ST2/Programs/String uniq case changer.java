import java.util.*;

// given a sentence, convert 1st and last alphabet of each word to upper case and rest to lower case 
//input : Hellow how are you
//output : HellW HoW ArE YoU

public class que2 {

    public static void main(String ... args){
        
        //input 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str1 = scn.nextLine();

        //algo
        StringTokenizer tokenObj = new StringTokenizer(str1, " "); // divide string into parts (on basis of space)

        String newSentence = "";
        while(tokenObj.hasMoreTokens()){

            String word = tokenObj.nextToken();   // fetch the word 
            char chArr[] = word.toCharArray();   // convert word to char Array for changes

            int firstIndex = 0, lastIndex = chArr.length - 1;

            // System.out.println("first ch : " + chArr[firstIndex] + " Last ch " + chArr[lastIndex]);

            // if 1st char is lower case(97 to ), convert it to upper case  97 + 26 -> 123   (65 + 26 -> 91)  (97 - 65 -> 32)
            for(int i=0; i < chArr.length; i++){

                char ch = chArr[i];

                // only for ist and last index
                if(i == firstIndex || i == lastIndex) {
                    if(ch >= 97 && ch <= 122){ // if first or last char are un lower case convert it to upper case 
                        // System.out.println(ch + " is lower case");
                        chArr[i] = (char)(ch - 32);
                        // System.out.println(chArr[i] + " is now upper case");
                        // System.out.println("-----------------------");
                    }
                }
                
                // for indexes other then first and last 
                else {
                    // if char is in upper case, conver it to lower case
                    if(ch >= 65 && ch <= 90){
                        // System.out.println(ch + " is upper case");
                        chArr[i] = (char)(ch + 32);
                        // System.out.println(chArr[i] + " is now lower case");
                        // System.out.println("----------------------");

                    }
                }
            }

            String newWord = String.valueOf(chArr);
            System.out.print(newWord + " ");
        }


    }
    
}

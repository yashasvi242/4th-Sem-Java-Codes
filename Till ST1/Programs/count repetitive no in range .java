import java.util.*;

// current approach - using eleToFreq array to store freq of each digit 
// alternative approach - using visited array to check if a digit is already visited or not 

public class Main{
   
    /*  count number of repeatitive numbers from given range
   
    Test Case 1 :
        //input 11 15
        //output 4
       
    Test Case 2 :
        input 101 200
        output 72
   
    */
   
    public static void main(String args[]){
        int start = 11;
        int end = 15;
        int repeatitiveCount = 0;
       
        for(int i=start; i <= end; i++){
           
            int num = i;
            int eleToFreq[] = new int[10]; // for 0 to 9
           
            while(num != 0){
                int lastDig = num % 10;
                eleToFreq[lastDig]++;
                num /= 10;
            }
           
            // check freq
            for(int j=0; j < 10; j++){
                if(eleToFreq[j] > 1){
                    repeatitiveCount++;
                    break;
                }
            }
        }
        int nonRepeatitive = end - start + 1 - repeatitiveCount;
        System.out.print("non repeatitive : " + nonRepeatitive);
       
    }
}

//output : 4 

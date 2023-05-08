import java.util.*;
/* 
I n p u t 

n = 5
Aman R
Shekhar S 
Tripti T
Mahesh M
Amrit A 

O u t p u t 
-------------Sorted array :---------------
Aman R  Amrit A Mahesh M  Shekhar S  Tripti T
 
 */
class SortArrayOfStrings{

    public static void main(String ... args){


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();
        scn.nextLine();  // imp note :- whenever we take int input then input cursor doesnt come to next line, for that we need to use nextLine() to comsume the complete line

        String arr[] = new String[n];

        System.out.print("Enter all strings : ");
        for(int i=0; i < n; i++){
            arr[i] = scn.nextLine(); 
        }

        //sort
        Arrays.sort(arr);

        System.out.println("-------------Sorted array :--------------- ");
        for(int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}


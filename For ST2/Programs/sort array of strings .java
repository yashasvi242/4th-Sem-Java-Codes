import java.util.*;

/*
 n=5
 aman shekhar tripti mahesh amrit

 Sorted array : aman amrit mahesh shekhar tripti 
 
 */
class Eh1{

    public static void main(String ... args){


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();

        String arr[] = new String[n];

        System.out.print("Enter all strings : ");
        for(int i=0; i < n; i++){
            arr[i] = scn.next(); 
        }

        //sort
        Arrays.sort(arr);

        System.out.println("Sorted array : ");
        for(int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

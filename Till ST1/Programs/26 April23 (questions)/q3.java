java.util.*;

// ⚠️⚠️this solution may contain some error 

public class MyClass {
    public static void main(String args[]) {
        
        // 3 3 4 2 5 4 5 4 6 6 (find kth largest number) (if k = 3 exp output : 4 )
        
        // 6 6 5 5 4 4 4 3 3 2  (now we can not simply find the kth largest)
        //prv=4
        //ans = 4
        //k=0
        
        // input 
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number of elements & K: ");
        int size = scn.nextInt();
        int k = scn.nextInt();
        
        int arr[] = new int[size];
        
        System.out.print("enter all elements : ");
        for(int i=0; i < size; i++){
            arr[i] = scn.nextInt();
        }
        
        //algo
        Arrays.sort(arr, collections.reverseOrder()); //sorted
        
        int prv=-1;
        int tempK = k;
        int ans;
        
        for(int i=0; i < size; i++)
        {
            if(arr[i] != prv){
                prv = arr[i];
                ans = arr[i];
                tempK--;
                if(tempK == 0){
                    System.out.println("result : " + ans);
                    break;
                }
            }
        }
        
        if(ans == -1)
        System.out.println("result not found");
        
        
    }
}

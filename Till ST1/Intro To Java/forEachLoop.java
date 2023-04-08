import java.util.*;

// 'for each' loop is used to access elements directly from the array without any indicies

class forEachLoop{

    public static void main(String args[]){

        int arr[] = new int[]{10,11,12,13,14};

        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

}

/* Output 

10 11 12 13 14

 */

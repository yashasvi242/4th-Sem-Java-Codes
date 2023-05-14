```java
Input :
3 
1 5 6 
4 
2 3 4 7
Output : 1 2 3 4 5 6 7 
```
### Approach - 1 (using .sort())
```java
import java.util.*;

public class Merge2SortedArrays {
    
    public static void main(String ... args){

        //input
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter size1 : ");
        int size1 = scn.nextInt();
        int arr1[] = new int[size1];

        System.out.print("enter elements of arr1 : ");
        for(int i=0; i < size1; i++)
            arr1[i] = scn.nextInt();

        System.out.print("Enter size2 : ");
        int size2 = scn.nextInt();
        int arr2[] = new int[size2];

        System.out.println("enter elements of arr2 : ");
        for(int i=0; i < size2; i++)
            arr2[i] = scn.nextInt();


        // algo (merge 2 sorted arrays)
        Integer arr3[] = new Integer[size1+size2];
        int index = 0;
        for(int ele:arr1)
            arr3[index++] = ele;
        for(int ele:arr2)
            arr3[index++] = ele;

        Arrays.sort(arr3);

        System.out.println("Final Sorted array :- ");
        for(int ele:arr3)
            System.out.print(ele + " ");

    
        
    }
}

```

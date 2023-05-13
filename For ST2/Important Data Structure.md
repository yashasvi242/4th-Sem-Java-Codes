
## ArrayList
- Equivalent to `Vector` of C++

```java

import java.util.ArrayList;
import java.util.Collections;
/* ArrayList (alternative of 'vector' from cpp)
    
    .add(ele)        - inserts ele at end)
    .add(i, ele)     - inserts ele at index i)
    .size()          - returns size of arrayList
    .get(i)          - access element at ith index)
    
    Collections.sort(arr) - sorts the arr
    Collections.reverse(arr)  - reverses the arr


 */

public class ArrayListWorking {

    public static void main(String ... args){

        // creating array list (vector equivalent )
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // inserting data
        for(int i=10; i <= 14; i++)
        arr.add(i);
        arr.add(19);
        arr.add(18);
        arr.add(17);
        arr.add(16);


        // printing whole arrayList (at ones)
        System.out.println(arr);
        
        // sort 
        Collections.sort(arr);

        // access elements by indices
        System.out.print("sorted arr : ");
        for(int i=0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}

/*
 Output : 
 
[10, 11, 12, 13, 14, 19, 18, 17, 16]
sorted arr : 10 11 12 13 14 16 17 18 19

 */
```

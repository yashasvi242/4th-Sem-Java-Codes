
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

## HashMap
```java
import java.util.*;

public class TryingMap {

    // H A S H M A P S

    public static void main(String ... args){

        HashMap<Integer,Integer> simpleMap = new HashMap<Integer,Integer>();

        // insertion in map
        simpleMap.put(1,100);
        simpleMap.put(2,200);
        simpleMap.put(3,300);
        simpleMap.put(4,400);

        // iterating on map 
        for(Map.Entry block:simpleMap.entrySet()){
            System.out.println("key : " + block.getKey() + " Value : " + block.getValue());
        }

        System.out.println("map has key 1 ? " + simpleMap.containsKey(1));
        System.out.println("map has key 10 ? " + simpleMap.containsKey(10));
    }

}
/*
    Output:- 

key : 1 Value : 100
key : 2 Value : 200
key : 3 Value : 300
key : 4 Value : 400
map has key 1 ? true
map has key 10 ? false

 */

```

## Imp 'Character' class methods 
```java
1	isLetter()
Determines whether the specified char value is a letter.

2	isDigit()
Determines whether the specified char value is a digit.

3	isWhitespace()
Determines whether the specified char value is white space.

4	isUpperCase()
Determines whether the specified char value is uppercase.

5	isLowerCase()
Determines whether the specified char value is lowercase.

6	toUpperCase()
Returns the uppercase form of the specified char value.

7	toLowerCase()
Returns the lowercase form of the specified char value.

8	toString()
Returns a String object representing the specified character value that is, a one-character string.

```

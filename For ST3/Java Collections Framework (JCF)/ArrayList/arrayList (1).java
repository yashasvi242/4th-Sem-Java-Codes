 import java.util.*;
/*
    ArrayList 
    ---------

    .get(index)
    .remove(index)
    .indexOf(ele) - first occ
    .lastIndexOf(ele) - last occ
*/

class Demo{

    public static void main(String ... args){

        ArrayList<Integer> arr = new ArrayList<>(); // creating obj of ArrayList class 

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(50);
        arr.add(50);
        arr.add(020); // here '020' (hexadecimal) gets converted to int -> 16 

        System.out.println(arr); // printing object

        System.out.println("printing array elements 1 by 1");
        for(int i=0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        arr.remove(1); // deleting index 1 element 

        System.out.print("\n" + arr);

        System.out.println("\n 1st occ of 50 is at index : " + arr.indexOf(50));
        System.out.println("last occ of 50 is at index : " + arr.lastIndexOf(50));
    }
}

/* Output :- 

[10, 20, 30, 40, 50, 50, 50, 16]
printing array elements 1 by 1
10 20 30 40 50 50 50 16 
[10, 30, 40, 50, 50, 50, 16]
 1st occ of 50 is at index : 3
last occ of 50 is at index : 5

 */

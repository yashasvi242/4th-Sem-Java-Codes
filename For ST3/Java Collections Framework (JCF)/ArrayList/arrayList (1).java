import java.util.*;

class Demo{

    public static void main(String ... args){

        ArrayList<Integer> arr = new ArrayList<>(); // creating obj of ArrayList class 

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr); // printing object

        System.out.println("printing array elements 1 by 1");
        for(int i=0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}

/* Output :- 

[10, 20, 30, 40, 50]
printing array elements 1 by 1
10 20 30 40 50 
 */

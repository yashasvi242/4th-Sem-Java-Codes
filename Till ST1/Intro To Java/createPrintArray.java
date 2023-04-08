import java.util.*;

class Sort {
    public static void main(String[] args){

        ArrayList<String> array = new ArrayList<String>();
        
        array.add("hello");
        array.add("second");
        array.add("third");
        array.add("fourth");
        array.add("fifth");

        System.out.println(array);   // to print whole array at ones 

        // to traverse and print array (1 element at a time)
        Iterator itr = array.iterator();
         
        while(itr.hasNext()){   
            System.out.println(itr.next());
        }

        
        //System.out.print(itr.next() + " ");  // .print() prints data in same line (no line break \n)
    }
}


/* Output :- 

[hello, second, third, fourth, fifth]
hello
second
third
fourth
fifth

*/

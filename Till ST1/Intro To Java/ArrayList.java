import java.util.*;

// lets learn how to create and print a 'ArrayList'
// note : array is different then ArrayList, where array is just a basic array with indicies, whereas ArrayList is a part of java collection frameword with methods like .add(), .iterator() etc.

/* ⭐(Ques) Difference between array, list, and ArrayList in Java ?

-> An array is a basic collection of fixed size that can store any declared type of
elements. 

-> The List is a dynamic collection (it means, its size can change over
time) that is generic, so it can also store any declared type of elements.

-> An ArrayList is a dynamic collection that can store various types of elements at 
the same time, as it treats everything it stores as instances of the System.Object
type

*/
class ArrayList {
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

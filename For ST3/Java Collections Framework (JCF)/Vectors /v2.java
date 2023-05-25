import java.util.*;
/*
 Vectors 
    
    - .capacity()      note : (whenever size becomes > capacity, then it gets doubles automatically )
    - .size()
    - .addElement() / .add()
    - .firstElement()/ .lastElement()
 */

public class VecEx1 {

    public static void main(String [] args){

        Vector<String> vec = new Vector<String>(4);

        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");

        System.out.println("Capacity : " + vec.capacity());
        System.out.println("size : " + vec.size());

        System.out.println(vec);

        // check if ele is present in vec
        if(vec.contains("Tiger")){
            System.out.println("Tiger is present at index : " + vec.indexOf("Tiger"));
        }
        else{
            System.out.println("Tiger is not present");
        }

        // get first element, get the last element
        System.out.println("The first animal : " + vec.firstElement());
        System.out.println("The last animal : " + vec.lastElement());
    }
    
}

/*
Capacity : 4
size : 4
[Tiger, Lion, Dog, Elephant]
Tiger is present at index : 0
The first animal : Tiger
The last animal : Elephant
 */

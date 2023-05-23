import java.util.*;

/*
   Linked List (non sequencial)

    .add()      - inserts at last
    .addFirst() - inserts at first
    .addLast() - inserts at end
 */

public class LL {

    public static void main(String ... args){
        LinkedList<String> ll = new LinkedList<>();

        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.addFirst("A");
        ll.addLast("Z");

        System.out.println(ll);
    }
}
// Output :- 
// [A, a, b, c, d, Z]

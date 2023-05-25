import java.util.*;
public class stack4 {

    public static void main(String ... args){

        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        ListIterator<Integer> li = stk.listIterator(stk.size());
        System.out.println("Iteration over the stack from top to bottom");
        while(li.hasPrevious()){
            Integer avg = li.previous();
            System.out.print(avg + " ");
        }
    }
    
}
// Iteration over the stack from top to bottom
// 40 30 20 10

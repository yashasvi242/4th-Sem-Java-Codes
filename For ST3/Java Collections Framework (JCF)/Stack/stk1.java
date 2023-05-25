
import java.util.*;

// STACK - LIFO

public class stack {

    public static void main(String ... args){
        Stack<Integer> stk = new Stack<>();

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(8);
        stk.push(7);
        stk.push(6);

        System.out.print("Bottom to top : ");
        System.out.println(stk);

        System.out.print("top to bottom: ");
        while(!stk.empty()){
            System.out.print(stk.peek() + " ");
            stk.pop();
        }
    }
    
}

// Bottom to top : [10, 20, 30, 8, 7, 6]
// top to bottom: 6 7 8 30 20 10

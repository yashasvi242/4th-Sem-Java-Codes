import java.util.*;
public class stack3 {

    public static void main(String ... args){

        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        Iterator it = stk.iterator();
        while(it.hasNext()){
            Object values = it.next();
            System.out.print(values + " ");
        }
    }
    
}


// 10 20 30 40 

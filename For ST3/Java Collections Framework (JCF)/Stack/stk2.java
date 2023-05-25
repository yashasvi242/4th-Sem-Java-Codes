import java.util.*;


public class stack2 {

    public static void main(String[] args){

        Stack<String> stk = new Stack<>();

        stk.push("MacBook");
        stk.push("HP");
        stk.push("Dell");
        stk.push("Dell");

        System.out.println(stk);

        // search an element 
        int location = stk.search("Dell");
        System.out.println("position of Dell is " + location); // its is position not index (note)
    }

    
}

// [MacBook, HP, Dell, Dell]
// position of Dell is 1

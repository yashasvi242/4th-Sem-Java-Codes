// generic methods 
// if we only want a specific function to be generic, and not its class, we can achieve it

public class Demo4 {

    static<V,T> void display(V v, T t){
        System.out.println(v.getClass().getName() + " = " + v);
        System.out.println(t.getClass().getName() + " = " + t);
    }

    public static void main(String[] args){
        display(88, "This is string");
    }
}

// Output :- 
// java.lang.Integer = 88
// java.lang.String = This is string

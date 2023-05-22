class Gen<T>{
    T obj; // object of type T is declared

    Gen(T o)// constructior
    {
        obj = o;
    }
    
    public T getObj(){
        return obj;
    }
}

public class Demo1 {
    
    public static void main(String args[]) {

        Gen<Integer> iob = new Gen<>(100);
        int x = iob.getObj();
        System.out.println(x);
        Gen<String> sob = new Gen<>("Hello");
        String str = sob.getObj();
        System.out.println(str);

    }   
}

/* Output :- 

100
Hello
*/

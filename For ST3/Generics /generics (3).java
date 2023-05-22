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

public class Demo2 {

    public static void main(String ... args){

        Gen<Integer> iob1 = new Gen(100);
        int x = iob1.getObj();
        System.out.println(x);

        Gen<Integer> iob2 = new Gen(200);
        iob2 = iob1;  // we can assign like this only for objexts for same type like we cant store a String obj in an int
        int y = iob2.getObj();
        System.out.println(y);
    }
    
}

// Output :- 
// 100
// 100

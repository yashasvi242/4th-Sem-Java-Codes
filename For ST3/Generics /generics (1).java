
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

class Demo{
    public static void main(String args[]) {

        Gen<Integer> iob = new Gen<>(100);
        int x = iob.getObj();
        System.out.println(x);

    }
}

// Output : 100


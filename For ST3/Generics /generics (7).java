// Using a Generic Superclass 

class MyClass<T>{
    T ob;   // string type obj
    MyClass(T o){
        ob = o;
    }
    T getob(){
        return ob;
    }
}

class MySubclass<T,V> extends MyClass<T>{
    V ob2; // Int type object
    MySubclass(T o, V o2){
        super(o);
        ob2 = o2;
    }
    V getob2(){
        return ob2;
    }
}

public class Demo {

    public static void main(String ... args){

        MySubclass<String,Integer> obj = new MySubclass<>("This is String", 10);

        System.out.println(obj.getob());
        System.out.println(obj.getob2());

    }
}

// This is String
// 10

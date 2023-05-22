class Gen<T1,T2>{
    T1 name;
    T2 value;

    Gen(T1 obj1, T2 obj2){
        name = obj1;
        value = obj2;
    }
    public T1 getName(){
        return name;
    }
    public T2 getValue(){
        return value;
    }
}

public class Demo3 {
    
    public static void main(String ... args){
        Gen<String,Integer> obj = new Gen<>("Chitkara University", 123);
        String s = obj.getName();
        System.out.println(s);
        Integer i = obj.getValue();
        System.out.println(i);
    }
}

// Output : 
// Chitkara University
// 123

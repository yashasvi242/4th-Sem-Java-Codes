interface Fruit<T>{
    public void taste(T fruit);
}

class AnyFruit<T> implements Fruit<T>{
    public void taste(T fruit){
        String fruitname = fruit.getClass().getName();
        System.out.println(fruitname);
    }
}

class Banana{
}
class Orange{
}

public class GenericClass{
    public static void main(String ... args){
        Banana b = new Banana();
        AnyFruit<Banana> fruit1 = new AnyFruit<Banana>();
        fruit1.taste(b);
        
        Orange o = new Orange();
        AnyFruit<Orange> fruit2 = new AnyFruit<Orange>();
        fruit2.taste(o);
    }
}

// Banana
// Orange

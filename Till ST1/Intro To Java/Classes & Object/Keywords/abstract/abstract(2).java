
// note : each normal class (non abstract class) that extends an abstract class must define all the methods of the 'abstract class' else there will be error.
abstract class A{
    abstract void callme();
}

class B extends A{
    void callme(){
        System.out.println("calling");
    }
}

public class C extends A{

    void callme(){
        System.out.println("Calling ended...");
    }

    public static void main(String[] args){
        
        B b = new B();
        b.callme();

        C c = new C();
        c.callme();

    }
}


/*
Output :- 

calling
Calling ended...

*/

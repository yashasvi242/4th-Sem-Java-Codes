
// error because as we talked in abstract(2) module, each normal class that extends an abstract class must define all the methods of abstract class
// note : if we want to remove this error then we can use abstract key word for child class too

abstract class A{
    abstract void callme();
}


abstract class B extends A{
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

error : 
can not make object of abstract class

/C.java:25: error: B is abstract; cannot be instantiated
        B b = new B();
              ^

*/

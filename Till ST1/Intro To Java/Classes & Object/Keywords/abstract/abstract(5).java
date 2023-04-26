
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
        
        // B b = new B();  // since we commented the line in which we created objext of the abstract class, code will execute.
        // b.callme();

        C c = new C();
        c.callme();

    }
}


/*
Output :- 

Calling ended...

*/

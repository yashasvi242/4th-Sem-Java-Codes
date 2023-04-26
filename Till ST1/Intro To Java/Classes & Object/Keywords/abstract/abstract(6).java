
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

// now this is multi level inheritance, since abstract 'B' can assess everything of abstract 'A', and 'C' can access everything of both ' abstract A' and 'abstract B'.


public class C extends A{

    void callme(){
        System.out.println("Calling ended...");
    }

    public static void main(String[] args){
        
        // B b = new B();
        // b.callme();

        C c = new C();
        c.callme();

    }
}


/*
Output :- 

Calling ended...

*/

//Inheritance 

// child class extends properties of parent class.
// parent class - parent, super, base  (diff names for )
// child class - child, sub, derived (diff names for )

class Parent{
    
    public void p1(){
        System.out.println("Parent method");
    }
}

public class Child extends Parent{
    public void c1(){
        System.out.println("Child method");
    }
    
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.c1(); // method opf child class
        cobj.p1(); // parent class method accessed from child class 
    }
}

/*
Output :- 

Child method
Parent method

*/











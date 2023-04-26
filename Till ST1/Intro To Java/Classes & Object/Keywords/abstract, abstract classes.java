
    // abstract ckass is declared using abstract keyword known as abstract class
    // an abstract class may not have abstract methods.
    // can not make object of abstract class 

    // An abstract class may or may not have a abstract method, but if a class have even a single abstract method, then it must be declared abstract.
    // Abs classes can have constrctors, Member variables and normal methods
    // abstract classes are never instantialied.
    // when you extend abstract class with abstract method, you must define the abstract method in the child class, or make the child class abstract.
    // used to make code redable
    

abstract class A{
    abstract void callme();
}

public class B extends A{
    void callme(){
        System.out.println("calling...");
    }

    public static void main(String args[]) {
        B b = new B();
        b.callme();
    }
}

//Output 
// calling...


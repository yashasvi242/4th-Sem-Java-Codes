// in dynamic method dispatch instace variables are given priority, while for methods, obj's method is given priority 

class A{
    int x = 20;
}

class B extends A{
    int x = 30;
}

public class Test{
    public static void main(String args[]){
        B b = new B();
        System.out.println(b.x);
        A a = new A();
        System.out.println(a.x);
        A a2 = new B();
        System.out.println(a2.x);
    }
}

/*
Output :- 

30
20
20

*/

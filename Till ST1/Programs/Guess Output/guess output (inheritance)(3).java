
class A{
    static int a = 10;
    int b = 20;
}

public class Main {

    // lets create a class, with a static vaiable, and if we change that static variable , then its value in any other object of that same class also changes 
    
    public static void main(String args[]){
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        
        System.out.println(obj1.a + " " +  obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
        System.out.println(obj3.a + " " + obj3.b);

        obj2.a = 88;
        obj2.b = 99;
        
        System.out.println(obj1.a + " " +  obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
        System.out.println(obj3.a + " " + obj3.b);
    }
}

/*
output :- 

10 20
10 20
10 20
88 20
88 99
88 20

*/

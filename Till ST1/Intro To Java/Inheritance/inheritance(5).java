//Inheritance (5)

// if parent and child have same named methods  

 
class A{//parent
    void show(){
        System.out.println("Class A's show called");
    }
    void print(){
        System.out.println("Class A called");
    }
}

class B extends A{ //
    void show(){
        System.out.println("Class B's show called");
    }
}

public class C extends B{ //grand child
    
    void show(){
        System.out.println("Class C's show called");
    }
    public static void main(String[] args){
        C c = new C();
        c.show();
        c.print();
    }
}


/* Output : 

Class C's show called
Class A called
*/










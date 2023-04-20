
//Inheritance (3)

// Multi level Inheritance 

 
class A{//parent
    String a = "Class A";
    void showA(){
        System.out.println(a);
    }
}

class B extends A{ //child
    String b = "Class B";
    void showB(){
        System.out.println(b);
    }
}

public class C extends B{ //grand child
    public static void main(String[] args){
        C c = new C();
        c.showA();
        c.showB();
    }
}


/* Output : 

Class A
Class B

*/










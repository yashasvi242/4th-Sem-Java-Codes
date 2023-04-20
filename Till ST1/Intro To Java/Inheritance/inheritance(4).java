//Inheritance (3)

// Multi level Inheritance 

 
class A{//parent
    String a = "Class A";
    void show(){
        System.out.println(a);
    }
}

class B extends A{ //child
    String b = "Class B";
    void show(){
        System.out.println(b);
    }
}

public class C extends B{ //grand child
    public static void main(String[] args){
        C c = new C();
        c.show();  // prioeity will be given to the lastest (closest) value first 
    }
}


/* Output : 

Class B



*/

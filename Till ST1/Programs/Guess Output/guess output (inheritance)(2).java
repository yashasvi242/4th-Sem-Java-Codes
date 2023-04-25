// guess Output 
class A{
    String s = "CLass A";
}

class B{
    String s = "Class B";
    {
        System.out.println(super.s);
    }
}

class C extends B{
    String s = "CLass C";
    {
        System.out.println(super.s);
    }
}

public class Main{
    public static void main(String args[]){
        C c = new C();
        System.out.println(c.s);
    }
}




/*
Output : 

CLass A 
CLass B
Class C 

*/

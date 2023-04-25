// guess output 

class A{
    {
        System.out.println(1);
    }
}
class B extends A{
    {
        System.out.println(2);
    }
}
class C extends B{
    {
        System.out.println(3);
    }
}
public class Main{
    public static void main(String args[]){
        C c = new C();
    } 
}











/*

Output : 
1
2
3

*/

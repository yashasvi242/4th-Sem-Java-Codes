// note : we can initialize the blank final variable ONLY inside constructor.

public class Demo{
    final int a; // blank final variable
    Demo(){
        a=10; // initialized black final
    }
    
    public static void main(String[] args){
        Demo demo = new Demo();
        System.out.println("a = " + demo.a);
    }
}
/*Output :- 

a = 10

*/

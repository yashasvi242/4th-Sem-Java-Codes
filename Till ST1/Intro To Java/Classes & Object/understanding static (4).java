//using 'static' keybord

public class MyClass {
    
    public static void square(int x){
        System.out.println("Sq : " + x*x);
    }
    
    public static void main(String args[]) {
        
        square(4); // static method is called with/without class name 
    }
}

/*

Sq : 16

*/

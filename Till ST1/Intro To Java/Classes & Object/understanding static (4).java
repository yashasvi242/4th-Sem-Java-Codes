//using 'static' keybord

public class MyClass {
    
    public static void square(int x){
        System.out.println("Sq : " + x*x);
    }
    
    public static void main(String args[]) {
        
        // M-1
        square(4); // static method is called with/without class name 
        
        //M-2
        MyClass.square(4);  // this also works fine
        
        //M-3 : to create an object of 'MyClass' then access the method square()
    }
}

/*

Sq : 16

*/

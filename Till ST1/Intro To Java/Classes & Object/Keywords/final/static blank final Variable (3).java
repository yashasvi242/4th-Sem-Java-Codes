// note : we can initialize the blank final variable inside static block only.
// note : we can not initialize a 'static final blank variable' inside constuctor 
// note : only the blank final variable can be initialized inside constuctor, 'static blank final variable' can only be inintialized inside the static block 

public class Demo{
    static final int a; //static blank final variable 
    
 /*  // correct way 
    static{
        a=10; // static final blank variable can be initialized inside static block
    }
 */
    
    // error - only the blank final variable can be initialized inside constuctor, 'static blank final variable' can only be inintialized inside the static block 
    Demo(){
        a=10;
    }
    
    public static void main(String args[]){
        Demo obj = new Demo();
        
        System.out.println("a = " + obj.a );
    }
    
}

/*

Demo.java:10: error: cannot assign a value to final variable a
        a=10;
        ^
1 error

*/

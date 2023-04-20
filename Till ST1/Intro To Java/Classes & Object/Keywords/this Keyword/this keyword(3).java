public class Demo {
    
    // IMP example - 'this' keyword points to class, but we can assess class through object.
    
    Demo(){
        this("Class Constructor");  // calling parameterized constructor of class Demo (this)
        System.out.println("Default Constructor called..");
    }
    
    Demo(String str){ // para constructor 
        System.out.println(str);
    }
    
    public static void main(String[] args){
        
        Demo d = new Demo();
        
    } 
}
/* // imp note

    Demo(){
        System.out.println("Default Constructor called..");
        this("Class Constructor");  // calling parameterized constructor of class Demo (this)
        
        // ERROR 
    }
    

*/

/*
Output :- 


Class Constructor
Default Constructor called..

*/

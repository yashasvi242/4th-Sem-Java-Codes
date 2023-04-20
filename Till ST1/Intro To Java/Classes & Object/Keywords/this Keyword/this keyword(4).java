public class Demo {
    
    // IMP example - 'this' keyword points to class, but we can assess class through object.
    
    void getName(){
        System.out.println("Class Method");
    }
    
    void Display(){
        // getName; // error - either first create an object, or use 'this'  keyword to access 'getName()' method
        this.getName();
    }
    
    public static void main(String[] args){
        
        Demo d = new Demo();
        d.Display();
        
    } 
}
/*
Output :- 

Class Method

*/

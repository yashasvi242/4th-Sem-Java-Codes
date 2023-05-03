
package pack; //Imp

// note : it is necessary to use 'public' keyword to declare this class, because this class is inside a package, so if a main func in some other file will try to create an object of this class, it will throw error because we can not access 'private' or 'default' class outside this file then
// without using the 'public' keyword for declaring this class, error will be :- 
/*  
    A is not public in pack; cannot be accessed from outside package
        A obj1 = new A();
*/ 

public class A {
    
    public void display(){
        System.out.println("Class A printing");
    }
}

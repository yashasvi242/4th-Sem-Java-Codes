
    // constructor 
    // default 
    // parameterized
    // if we do not create a constuctor, then while compiling JVM will create a default empty constructor. 
    //constructor is invoked only when an object is created.  
    
public class AddDemo1{
  
  AddDemo1(){
    int a = 10;
    int b = 5;
    int c;
    c = a+b;
    System.out.println("Default Constructor");
    System.out.println("Total of 10 + 5 = " + c);
  }
  
  public static void main(String args[]){
    AddDemo1 obj = new AddDemo1();
  }
}

/*

Default Constructor
Total of 10 + 5 = 15

*/

// we know that we can not change the value of the final keyword variable, so we can't inherit it  

class Study{
    void learn(){
        System.out.println("learning something new");
    }
}

// concept of inheritance 
public class Student extends Study{

    void learn(){
        System.out.println("learning something interesting");
    }

    public static void main(String args[]){
        Student object = new Student();
        object.learn();
    }
}

/*
    
    ERROR - method overriding, both same named should have same access specifier
 
final.java:9: error: learn() in Student cannot override learn() in Study
    void learn(){
         ^
  overridden method is final
  
  TO remove the error remove 'final' from both the methods, and output will be 
  
  "learning something interesting"

 */

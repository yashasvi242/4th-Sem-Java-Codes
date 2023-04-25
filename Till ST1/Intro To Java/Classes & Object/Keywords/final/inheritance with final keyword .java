class Study{
    final void learn(){
        System.out.println("learning something new");
    }
}

// concept of inheritance with 'final' keyword 
public class Student extends Study{

    final void learn(){
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

 */

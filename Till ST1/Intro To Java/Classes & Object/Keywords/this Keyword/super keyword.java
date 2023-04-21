class Parent{
    String name;
}


// note : The super keyword in Java is a reference variable which is used to refer immediate parent

public class Child extends Parent{
    String name;
    public void details(){
        super.name = "Parent";
        name = "Child";
        System.out.println(super.name + " and " + name);
    }
    
    public static void main(String[] args){
        Child cobj = new Child();
        cobj.details();
    } 
}

/*

Output 

Parent and Child

*/

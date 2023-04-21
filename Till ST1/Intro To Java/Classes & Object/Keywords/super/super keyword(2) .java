// super(2)

class Parent{
    
    String name;
    Parent(String n){
        name = n;
    }
}

public class Child extends Parent{
    
    String name;
    Child(String n1, String n2){
        super(n1);
        this.name = n2;
    }
    
    public void details(){
        System.out.println(super.name + " and " + name);
    }
    
    public static void main(String[] args){
        Child cobj = new Child("Parent", "Child");
        cobj.details();
    } 
} 

/*

Parent and Child

*/


// method overloading means methods having same name but diff number of arguments, 
// method Overriding means same method name and same parameter, occur in different class that has inheritance relationship. we use method overriding to implement specific functionality to the method.
// Overriding implements Runtime Polymorphism. 
// Whereas Overloading implements Compile time polymorphism.

class Animal{
    public void eat(){
        System.out.println("Eat all eatables");
    }
}

public class Dog extends Animal{
    public void eat(){
        System.out.println("Dog likes to eat meat");
    }
    
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        Animal a = new Animal();
        a.eat();
    }
}

/*
Output :- 

Dog likes to eat meat
Eat all eatables
*/

//method overriding with access specifiers (2)

// note : for inherited classes both the parent and childs should have same access specifier for same named functions and that too only 'public' and 'default'
// note 2 : also both methods should have same return type too.

class Animal{
    public void eat(){
        System.out.println("Eat all eatables");
    }
}

public class Dog extends Animal{
    private void eat(){
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

Line 10: error: eat() in Dog cannot override eat() in Animal [in Dog.java]
    private void eat(){
                 ^
  attempting to assign weaker access privileges; was public
*/

//method overriding with access specifiers (2)

// for inherited classes, if we are overriding methods, then same named methods should have same access specifier.

class Animal{
    public void eat(){
        System.out.println("Eat all eatables");
    }
}

public class Dog {
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

Dog likes to eat meat
Eat all eatables
*/

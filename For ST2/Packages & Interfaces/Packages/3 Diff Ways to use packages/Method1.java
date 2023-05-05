
class Method1 {

    // without 'importing' the package 

    public static void main(String ... args){

        pack.A obj1 = new pack.A();
        pack.B obj2 = new pack.B();
        pack.C obj3 = new pack.C();

        obj1.display();
        obj2.display();
        obj3.display();

    }
    
}
/*
 Output :- 

    Class A printing
    Class B printing
    Class C printing
 */

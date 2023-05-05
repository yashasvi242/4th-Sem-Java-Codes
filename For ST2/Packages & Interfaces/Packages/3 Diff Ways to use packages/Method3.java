import pack.*;

// using * keyword will import all the files (classes) inside the 'pack' folder, for our easy use 

class Method2 {

    public static void main(String ... args){

        A obj1 = new A();
        B obj2 = new B();  // since we have included the 'packages for all 3 classes' so no need to use pack.A , pack.B, etc.
        C obj3 = new C();

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
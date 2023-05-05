import pack.A;
import pack.B;
import pack.C;


// we can use 'public' here, but if we do not use it then also its fine, because this is the class where main function is and most importantly we are not inheriting or using this class in any other file (i mean like packages)

class Method2 {

    // importing specific class that we want to use from the package 

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
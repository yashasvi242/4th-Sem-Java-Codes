// constructor overloading.

class Cricketer{
    
    String name;
    String team;
    int age;
    
    Cricketer(){ // default constructor 
        name = "";
        team = "";
        age = 0;
    }
    
    Cricketer(String n, String t, int a){
        name = n;
        team = t;
        age = a;
    }
    
    Cricketer(Cricketer ckt){
        String s = "HI";
        name = ckt.name + s;
        team = ckt.team + s;
        age = ckt.age;
    }
    
    void printit(){
        System.out.println("this is " + name + " of " + team);
    }
    
}

public class test{
    
    public static void main(String args[]){
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer("Sachin", "India", 32);
        Cricketer c3 = new Cricketer(c2);
        
        c1.printit();
        c2.printit();
        c1.name = "Virat";
        c1.team = "India";
        c1.age = 32;
        c3.printit();
    }
    
}

/*

this is  of 
this is Sachin of India
this is SachinHI of IndiaHI

*/

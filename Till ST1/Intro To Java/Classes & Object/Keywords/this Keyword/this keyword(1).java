public class Demo {
    
    // by default uninitialized 'double' has value null.
    // this stores the reference of curr object.
    // this keyword is used mainly to solve confusion when local and global both variables have same name.
    
    Double width, height, depth;
    Demo(double w, double h, double d) {
        
        Double width=0d, height = 0d, depth = 0d;  // local variable
        this.width = w;
        this.height = h;
        this.depth = d;
        System.out.println("Constwidth = " + width);  // local variables will be printed
        System.out.println("constheight = " + height);
        System.out.println("Constdepth = " + depth);
    }
    
    public static void main(String[] args){
        Demo d = new Demo(10,20,30);
        System.out.println("width = " + d.width);  // obj's variables will be printed
        System.out.println("heigh = " + d.height);
        System.out.println("depth = " + d.height);
    } 
}

/*
Output :- 

Constwidth = 0.0
constheight = 0.0
Constdepth = 0.0
width = 10.0
heigh = 20.0
depth = 20.0


*/

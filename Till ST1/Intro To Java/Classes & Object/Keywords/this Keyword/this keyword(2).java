public class Demo {
    
    // by default uninitialized 'double' has value null.
    // this stores the reference of curr object.
    
    Double width, height, depth;
    Demo(double w, double h, double d) {
        
        Double width=0d, height = 0d, depth = 0d;  // local variable
        width = w;
        height = h;  // local variables will be assigned values
        depth = d;
        System.out.println("Constwidth = " + width);  // local variables will be printed first
        System.out.println("constheight = " + height);
        System.out.println("Constdepth = " + depth);
    }
    
    public static void main(String[] args){
        Demo d = new Demo(10,20,30);
        System.out.println("width = " + d.width);  // obj's variables will be printed secondly 
        System.out.println("heigh = " + d.height);
        System.out.println("depth = " + d.height);
    } 
}

/*
Output :- 

Constwidth = 10.0
constheight = 20.0
Constdepth = 30.0
width = null
heigh = null
depth = null



*/


// imp note : we can only have 1 main in our whole code, and which ever class has main function/method, that will start the execution first
// IMP Example

// note 2 : do not this class with specifier 'static' ,'public' so that it would by default get in 'default' mode, and can be accesed by anyone.
class Demo{
    int mul;
    double div;
    int add;
    Demo(int m, double d, int a){
        mul = m;
        div = d;
        add = a;
    }
}

public class MethodDemo4{
    
    static Demo get(int x,int y){
        return new Demo(x*y, (double)x/y, (x+y));  // note 1.2 : now when this method is called, with 2 parameters we are allocating memory for demo class and returning that Object without a name.
    }
    
    public static void main(String[] args){
        Demo ans = get(25,5); // note 1 : note that we did not allocate memory for 'ans' object, instead we called get method to allocate memory, now check the 'get' method
        System.out.println("Multiplication = " + ans.mul);
        System.out.println("Division = " + ans.div);
        System.out.println("Addition = " + ans.add);
    }
    
    
}

/*
Output : 

Multiplication = 125
Division = 5.0
Addition = 30

*/





public class Test {

    static void check() throws ArithmeticException
    {
        System.out.println("Inside check function");
        throw new ArithmeticException("demo");
    }

    public static void main(String args[]){
        try{
            check();
        }
        catch(ArithmeticException e){
            System.out.println("caught " + e);
        }
    }
}

/*
 Output :- 

Inside check function
caught java.lang.ArithmeticException: demo

 */

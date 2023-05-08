
public class EH9 {

    // "throw" is used to throw error of desired kind(whatever type we want), and ones it finds its equivalent class, then it will call that class, and for its overrides the output of its 'toString()' function with whatever string we passed (eg. "demo")

    static void avg(){
        try{
            throw new ArithmeticException("demo"); // this will throw 'ArithmeticException' error, and calls the equivalent catch, then  it found that at line 8, and prints the given text ("demo" in out case)
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception caught");
        }
    }

    public static void main(String ... args){

        avg();
       
    }
    
}

/*
 Output :- 

java.lang.ArithmeticException: demo
Exception caught

 */

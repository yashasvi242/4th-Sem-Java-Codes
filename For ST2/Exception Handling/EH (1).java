// try and catch in Java

public class EH2 {

    // Try block 
    // The catch block also known as handler is used to handle the exception. It handles the exception thrown by the code enclosed into the try block
    // Try block must provide a catch handler or a finally block.

    // Catch block must be used after the try block only. We can also use multiple catch block with a single try block
    public static void main(String ... args){

        try{
            int a = 10;
            int b = 0;
            int c = a/b; // exception
        }
        catch(ArithmeticException e){ // arithmetic exception is a class defined by java to handle arithmetic errors. e is out objext for arithmetic exception class
                                        // toString() function of the 'e' object prints the error '/ by zero'
            
            System.out.println(e);   // java inbuild error
            System.out.println("Divided int by Zerol (ERROR)"); // custom error 
        }
    }
}
/* Output 
 
java.lang.ArithmeticException: / by zero
Divided int by Zerol (ERROR)

 */

// java.lang.ArithmeticException: / by zero

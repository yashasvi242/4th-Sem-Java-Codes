
public class EH4 {

    // Multiple Catch 
    /*
      ones a exception is thrown, control jumps to the 1st catch, then it will match if the error equals to the catch's class, if not then it jumps to next catch, and soo on, if no catch matches the exception, then the program will terminate
     */
    public static void main(String ... args){
        
        try{
            
            Integer in = new Integer("abc");
            in.intValue();

        }
        catch(ArithmeticException e){ // firstly control jumps here, but ArithmeticExpression if  for calculation related exceptions
            System.out.println("Arithmetic " + e);
        }
        catch(NumberFormatException e){ // then control jumps here and match found, so prints the content
            System.out.println("Number Format Exception "+ e);
        }

    }
    
}

// Output :- 
// Number Format Exception java.lang.NumberFormatException: For input string: "abc"

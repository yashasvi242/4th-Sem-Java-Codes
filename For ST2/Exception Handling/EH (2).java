public class EH3 {

  // understanding try-catch block 
  
    public static void main(String ... args) {

        int a,b,c;
        try{
            a = 0;
            b = 10;
            c = b/a; // from here the control jumps to catch, coz there is an exception(error) here, note that the progam will not be terminated because this error code is in the 'try' block
            System.out.println("This line will not be executed");
        }

        catch(ArithmeticException e){
            System.out.println("cannot Divided by zero"); // this will be printed first 
        }

        System.out.println("After exception is handled"); // this will be secondly printed
        
    }   
}

/*
 Output :- 
    
cannot Divided by zero
After exception is handled

 */

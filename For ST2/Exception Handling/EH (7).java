

public class EH7 {

    public static void main(String ... args){

        try{
            int arr[] = {5,0,1,2};
            try{
                int x = arr[3]/arr[1];  // note 
            }
            catch(ArithmeticException ae){
                System.out.println("divide by zero");
            }
            arr[4] = 3;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound exception");
        }
    }
}

/*
 Output :- 

divide by zero  
array index out of bound exception

 */

//  note  : program reached line 10, exception found, then its try will search for the equavilant catch, and found catch at line 12 and prints its content 'dvided by zero', then then normal program continues from the end of catch i.e
// from line 15, and then another exception found at line 15, then its try will search for the equivalent catch and found it at line 17, and prints its content.

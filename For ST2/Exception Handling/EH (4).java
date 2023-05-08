
// note :- Exception handling's sole purpose is that we do not want our program get terminated over some exception, so whenever
// a error is fouund inside try{} then the equivalent catch{} for that try will be searched, so when the desired catch is found then the program will continue from where this matched catch ends.

public class EH5 {
    
    public static void main(String args[]){

        try{
            int a[] = new int[10];
            System.out.println(a[20]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception -->" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){  // this will execute first 
            System.out.println("ArrayIndexOutOfBounds Exception --> " + "hiiiiii");  // then this will be printed , now catch is found, so program jumps to lie 24
        } 

        catch(Exception e){
            System.out.println("working at line 21"); 
            System.out.println(e);
        }
         
        System.out.println("Ended"); // this will printed at last 
    }
}
/*
    Output :- 
        ArrayIndexOutOfBounds Exception --> hiiiiii
        Ended
 */

/* 
 note : catch(Exception e){
        }

        this 'Exception' is the main class for all the exceptions that exists in java, so if we simply use 'Exception' keyword, then all the subclasses are included on its own

 */

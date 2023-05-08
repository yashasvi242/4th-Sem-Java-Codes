
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
        // catch(ArrayIndexOutOfBoundsException e){ 
        //     System.out.println("ArrayIndexOutOfBounds Exception --> " + "hiiiiii"); 
        // } 

        catch(Exception e){ // this will be executed
            System.out.println("working at line 21"); 
            System.out.println(e);
        }
         
        System.out.println("Ended"); // then thsi will printed at last 
    }
}
/*
    Output :- 

working at line 21  
java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 10
Ended
 */

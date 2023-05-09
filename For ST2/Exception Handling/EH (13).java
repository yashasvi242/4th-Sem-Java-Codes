
public class Test {

    /* Throw is used in cases, where java has not defined any exception for a condition 'x' but we still want to throw and exception there 
            - eg. we want to throw exception whenever a -ve number is stored

        Throws :- is used we want to use the java's inbuild exception only
    */

    static void check() throws ArithmeticException, ArrayIndexOutOfBoundsException{ // this code may have these 2 exceptions 
        System.out.println("Inside check function");
        int a = 20/0; // from here the prog, jumps to line 23 coz 'Arithmetic exception found'
        int[] arr = new int[5];
        arr[20] = 5;
    }

    public static void main(String ... args){

        try{
            check();
        }
        catch(ArithmeticException e){
            System.out.println("caught " + "Divide by ZERO"); // from line 12 prog. reaches here, this will be printed 
        }
    }

    /*
        Output :- 
            Inside check function
            caught Divide by Zero 
     */
    


}


public class FinallyKeyword2 {

    public static void main(String args[]) {

        int a[] = new int[2];

        try{
            System.out.println("Access invalid element" + a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught");
        }
        finally{
            System.out.println("finally is always executed.");
        }
    }
    
}

/*
 Output :- 
 
 Exception caught
finally is always executed.
 */

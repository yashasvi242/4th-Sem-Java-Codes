
public class FinallyKeyword {

    public static void main(String ... args) {

        int a[] = new int[2];
        System.out.println("out of try, prints first"); // first this is printed 
        try{
            System.out.println("Access invalid element" + a[3]); // then exceptionn found, so this is not printed.
        }
        finally{
            System.out.println("finally is always executed."); // no cattch found, finally is executed then
        }
        System.out.println("Hello"); // this is not printed coz execution starts at the end of catch only (not finally)

        // at last when no catch found, then JVM default exception is thrown
    }    
}

/*
 Output :- 

out of try, prints first
finally is always executed.
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
        at FinallyKeyword.main(FinallyKeyword.java:9)
 */

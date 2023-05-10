
public class EH6 {

    public static void main(String ... args){
        try{
            int arr[] = {1,2};
            arr[2] = 3/0;    // altough only considering this line, runtime error for div by 0 will hit first, coz in this value of 3/0 is going to get assigned to arr[2] so that means 3/0 is getting calculated first, that will throw error 
 
        }
        catch(Exception e){
            System.out.println("Generic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){  // this class is already covered by the above main class 'Exception', therefore ERROR 
            System.out.println("Array index out of bound exception");
        }
    }
}

/*
 Output :- 

  error: exception ArrayIndexOutOfBoundsException has already been caught

  Explanation :- so to make it work, either shift the catch(ArrayIndexOutOfBoundException) to the top or comment it

 */

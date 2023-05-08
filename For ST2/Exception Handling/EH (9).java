public class EH8 {

    // note :- the nested try block first access its own catch, and if it doesn't find it then it can access its parent's catch block also 

    public static void main(String ... args){

        try{
            int arr[] = {5,0,1,2};
            try{
                int x = arr[5]/arr[1];  // note this try did not found eq catch block with out of bound error, so it will check its parents catch i.e line number 17, and will continue from where that catch ends.
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

 */

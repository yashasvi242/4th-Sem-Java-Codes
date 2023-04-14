public class jaggedArray {

    // jagged arrays 

    public static void main(String args[]){

        
        int jaggedArr[][] = {{1,2,3},{4,5},{6,7,8,9}};  // giving elements at compile time.

        for(int i=0; i < 3; i++){

            for(int j=0; j < jaggedArr[i].length; j++){

                
                System.out.print(jaggedArr[i][j] + " ");

            }

            // lets print a end line 
            System.out.println();
        }

    }
    
}

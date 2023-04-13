
public class matrix3 {

    /*      SORT EVERY ROW OF GIVEN MATRIX
    eg.      
               ---------------
    Input      | 1  6  5  4  |
               | 5  6  4  3  |    
               | 10 4  5  6  |
               ---------------

   
               ------------
    Output     | 1 4 5 6  |
               | 3 4 5 6  |
               | 4 5 6 10 | 
               ------------           
    */

    public static void main(String args[]){

        int matrix1[][] = {{1,6,5,4}, 
                           {5,6,4,3},
                           {10,4,5,6}} ;
                           

        int rowSize = matrix1.length;
        int colSize = matrix1[0].length;

        //  bubble sort every row of matrix - (use rounds as cols here)
        
        for(int row=0; row<rowSize; row++){

            for(int col=1; col <= colSize - 1; col++){

                for(int k = 0; k <= colSize-col-1; k++){
                    
                    // swap
                    if(matrix1[row][k] > matrix1[row][k+1]){
                        int temp = matrix1[row][k];
                        matrix1[row][k] =  matrix1[row][k+1];
                        matrix1[row][k+1] = temp;
                    }
                }
            }
        }

        // print loop
        for(int i=0; i < rowSize; i++){
            for(int j = 0 ; j < colSize; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();

        }
        
    } 
    
}


/*  Sorted Output 


1 4 5 6 
3 4 5 6 
4 5 6 10 
 

 */

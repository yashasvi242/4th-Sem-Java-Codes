public class matrix1 {

    // Sum 2 Matricies each element and store it into 3rd matrix. 

    public static void main(String args[]){

        int matrix1[][] = {{1,2,3,4}, 
                           {5,6,7,8}} ;
                           
        int matrix2[][] = {{9,10,11,12}, 
                           {13,14,15,16}} ;

        int sumMatrix[][] = new int[2][4];

        int rowSize = matrix1.length;
        int colSize = matrix1[0].length;

        for(int i=0; i < rowSize; i++){
            for(int j=0; j < colSize; j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // print 
        for(int i=0; i < rowSize; i++){
            for(int j=0; j < colSize; j++){
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();

        }
        

        
    } 
    
}

/* Sum : 
 
10 12 14 16 
18 20 22 24 

 */

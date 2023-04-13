import java.util.*;

public class matrix {

    // take input into matrix

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        int rowSize;
        int colSize;
        System.out.print("enter rowSize : ");
        rowSize = scn.nextInt();
        System.out.print("enter colSize : ");
        colSize = scn.nextInt();
        
        int matrix[][] = new int[rowSize][colSize];

        System.out.println("enter ele of matrix : ");
        for(int i=0; i < rowSize; i++){
            for(int j=0; j < colSize; j++){
                matrix[i][j] = scn.nextInt();
            }
        }

        // print array 
        
        System.out.print("matrix :- \n");
        for(int i=0; i < rowSize; i++){
            for(int j=0; j < colSize; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}

/*
 
Output : 

enter rowSize : 2
enter colSize : 3
enter ele of matrix : 
1 2 3 4 5 6
matrix :- 
1 2 3 
4 5 6

 */

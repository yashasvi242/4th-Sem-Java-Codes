import java.util.*;

// Sort each coloumn of a matrix
/*
 
 input:-              Output  :-
    12 11 10 9        4 3 2 1
    8 7 6 5           8 7 6 5
    4 3 2 1           12 11 10 9

 */

public class sortMatrixRows {

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        //input
        System.out.print("Enter number of rows : ");
        int rowSize = scn.nextInt();

        System.out.print("Enter number of cols : ");
        int colSize = scn.nextInt();

        System.out.print("enter all elements : ");
        int matrix[][] = new int[rowSize][colSize];
        for(int row=0; row<rowSize; row++){
            for(int col=0; col<colSize; col++){
                matrix[row][col] = scn.nextInt();
            }
        }

        // bubble sort for sorting elements of each col
        // since we need to sort each col, so for a col, row will be the only one to increase 

        for(int col=0; col<colSize; col++){
            for(int row=0; row<rowSize; row++){
                
                for(int k=0; k < rowSize - 1 - row; k++){
                    //swap
                    if(matrix[k][col] > matrix[k+1][col]){
                        int temp = matrix[k][col];
                        matrix[k][col] = matrix[k+1][col];
                        matrix[k+1][col] = temp;
                    }
                }
            }
        }
        

        // printing the sorted matrix 
        System.out.println("Sorted Matrix :- ");
        for(int row=0; row<rowSize; row++){
            for(int col=0; col < colSize; col++)
                System.out.print(matrix[row][col] + " ");
            System.out.println();
        }

    }
    
}

/*  Input Output :- 
 
Enter number of rows : 3
Enter number of cols : 4
enter all elements : 12 11 10 9 
8 7 6 5 
4 3 2 1 
Sorted Matrix :-
4 3 2 1
8 7 6 5
12 11 10 9

*/

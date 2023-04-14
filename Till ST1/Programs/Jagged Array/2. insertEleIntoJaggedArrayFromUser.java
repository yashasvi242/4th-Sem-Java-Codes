import java.util.*;

public class jaggedArr2 {
    
    // create a jagged array, and take diff size input from user
  /*
  
                    1 2
       jaggedArr =  4 5 6
                    7 8 9 10

  */

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rowSize = scn.nextInt();

        int jaggedArr[][] = new int[rowSize][];

        for(int i=0; i < rowSize; i++){

            System.out.print("enter col size for row " + i + " : ");
            int colSize = scn.nextInt();
            // jaggedArr[i] = new int[scn.nextInt()];
            jaggedArr[i] = new int[colSize];  // allocating memory for no. of cols of ith row 

            System.out.print("enter elements for row " + i + " : ");
            for(int j=0; j < colSize; j++){
                jaggedArr[i][j] = scn.nextInt();
            }
        }


        // print array 
        for(int i=0; i < rowSize; i++){
            for(int j=0; j < jaggedArr[i].length; j++){
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

/*

 Enter number of rows : 3
enter col size for row 0 : 2
enter elements for row 0 : 1 2 
enter col size for row 1 : 3 
enter elements for row 1 : 4 5 6 
enter col size for row 2 : 4
enter elements for row 2 : 7 8 9 10
1 2
4 5 6
7 8 9 10

 */

package ArrayList_and_arrays;
import java.util.*;

public class TwoDimArrayList {
    
    public static void main(String ... args){

        Scanner scn = new Scanner(System.in);
        System.out.print("enter rowsize : ");
        int n = scn.nextInt();
        System.out.print("enter colsize : ");
        int m = scn.nextInt();

        // declare and take input
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(n);

        System.out.println("enter elements : ");
        for(int row=0; row < n; row++){
            ArrayList<Integer> eachRow = new ArrayList<>(n);
            for(int col=0; col < m; col++){
                int ele = scn.nextInt();
                eachRow.add(ele);
            }
            matrix.add(eachRow);
        }

        //print 
        int rowSize = matrix.size();        
        int colSize = matrix.get(0).size();

        System.out.println("Matrix :- ");
        for(int row=0; row < rowSize; row++){
            for(int col=0; col < colSize; col++){
                int ele = matrix.get(row).get(col);
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        // sort each row of matrix 
        for(int row=0; row < rowSize; row++){
            ArrayList<Integer> eachRow = matrix.get(row);
            Collections.sort(eachRow);
            System.out.println(eachRow);
        }


    }


}

import java.util.Currency;
import java.util.Scanner;


// given 'n' numbers, return the ones which are perfect cubes.
// current approach -> using Math.cbrt()
// alternative approach -> using a loop from 1 till num/3, and find cube roots for them 

public class CheckCube {
    
    public static void main(String args[]){
        
        //input
        System.out.print("Number Of test Cases : ");
        Scanner scn = new Scanner(System.in);

        int numOfTestCase = scn.nextInt();
        System.out.print("Enter all numbers : ");
        
        //algo
        while(numOfTestCase != 0){

            int num = scn.nextInt();

            Double cubeRoot = Math.cbrt(num);

            // note : cube root of 10 = 2.15443469 (using Math.cbrt())
            // note : cube root of 8 = 2.000000 usint (using Math.cbrt())
          
            // now how do we know if 2.15 or 2.0 is cube root of 'num', so for that lets check it.
          
            if(num == cubeRoot*cubeRoot*cubeRoot){  // check if the cube root of given num is really perfect cube or not 
              
                System.out.println(num + " is perfect cube");
            }
        
            numOfTestCase--;
        }
    }
}

/* Outputs :- 
 
Number Of test Cases : 3
Enter all numbers : 27 64 67
27 is perfect cube
64 is perfect cube

 */

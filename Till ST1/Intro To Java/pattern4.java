public class pattern5 {
    /*
    n = 5
* 
* *
* * *           Approach is at the end.
* * * *
* * * * *
* * * *
* * *
* *
*

*/

    public static void main(String args[]){

        int n = 5;
        
        // upper triangle
        for(int row = 0; row <= n-1; row++){
            for(int col = 1; col <= row+1; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // lower triangle 
        for(int row=0; row <= n-2; row++){
            for(int col = 1; col <= n-row-1; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}


/*
 
break it into 2 triangles (upper and lower), and then try to print it.

*      n=5
* *
* * *          
* * * *
* * * * *
------------ 
* * * *
* * *
* *
*

 */

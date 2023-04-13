public class pattern6 {

    /*
       n=4
   *
  **
 ***
****
 ***
  **
   *
    
     */
    public static void main(String args[]){
        int n = 4;

        // upper triangle 
        for(int row=0; row < n; row++){
            
            // spaces 
            for(int spaces = 1; spaces <= n-row-1; spaces++){
                System.out.print(" ");
            }

            // stars
            for(int stars = 1; stars <= row+1; stars++){
                System.out.print("*");
            }

            System.out.println("");
        }

        // lower triangle 
        for(int row=0; row < n-1; row++){

            // spaces 
            for(int spaces = 1; spaces <= row+1; spaces++){
                System.out.print(" ");
            }

            // stars
            for(int stars = 1; stars <= n-row-1; stars++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}


/*
 
explanation : break this into 2 triangles (1 upper 2nd lower)


       n=4
   *
  **
 ***
****
-----
 ***
  **
   *
   
 */

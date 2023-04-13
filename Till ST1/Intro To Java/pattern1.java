public class pattern2 {
    /*

    *
   **
  ***
 ****
*****

     */

    public static void main(String args[]){    
        
        int n = 5;
        for(int row=0; row<n; row++){
            //spaces 
            for(int spaces=1; spaces <= n-row-1; spaces++){
                System.out.print(" ");
            }
            
            // colujmns 
            for(int star=1; star <= row+1; star++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}

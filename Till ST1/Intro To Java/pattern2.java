public class pattern3 {
    /*  n=5
    
        *****
        *   *
        *   *
        *   *
        *****

     */
    public static void main(String args[]){

        int n = 5;
        for(int row=0; row<n; row++){
            for(int col=1; col <= n; col++){
                if(row == 0 || row == n-1){
                    System.out.print("*");
                }
                else{
                    if(col == 1 || col == n)
                        System.out.print("*");

                    else System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

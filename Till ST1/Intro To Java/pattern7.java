
/* 

    # # * # # 
    # * * * # 
    * * * * *  
    # * * * # 
    # # * # # 





*/

public class pattern8 {

    public static void main(String args[]){
        
        int n = 3;

        // upper rectangle 
        for(int row=0; row < n; row++){
            
            // part1 
            for(int hash=1; hash <= n-row-1; hash++){
                System.out.print("# ");
            }

            //part2 
            for(int star = 1; star <= 2*row+1; star++)
                System.out.print("* ");

            // part3 
            for(int hash=1; hash <= n-row-1; hash++){
                System.out.print("# ");
            }

            System.out.println();

        }
        
        // lower rectangle
        for(int row=0; row < n-1; row++){
            
            // part4 
            for(int hash=1; hash<=row+1; hash++){
                System.out.print("# ");
            }

            // part5 
            for(int star = 1; star <= n-2*row; star++){
                System.out.print("* ");
            }

            for(int hash = 1; hash <= row+1; hash++)
                System.out.print("# ");

            System.out.println();
        }
    }
    
}


// divide this into 6 parts , for upper rectange (3 parts) for lower rectangle (other 3 parts)

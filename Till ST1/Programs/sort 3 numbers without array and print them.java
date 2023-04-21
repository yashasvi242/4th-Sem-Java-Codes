public class Main{
    
    
    // given 3 int, sort and print them without using array.
  
    public static void main(String args[]){
        
        int n1 = 3, n2 = 2, n3 = 0;
        
        if(n1 < n2 && n1 < n3){
            System.out.print(n1 + " ");
            if(n2 < n3){
                System.out.print(n2 + " " + n3);
            }
            else 
                System.out.print(n3 + " " + n2);
        }
        
        else if(n2 < n1 && n2 < n3){
            System.out.print(n2 + " ");
            if(n1 < n3){
                System.out.print(n1 + " " + n3);
            }
            else 
                System.out.print(n3 + " " + n1);
        }
        
        else{
            
            System.out.print(n3 + " ");
            
            if(n1 < n2){
                System.out.print(n1 + " " + n2);
            }
            else 
                System.out.print(n2 + " " + n1);
        }
    }
}

/*Output : 

0 2 3
*/

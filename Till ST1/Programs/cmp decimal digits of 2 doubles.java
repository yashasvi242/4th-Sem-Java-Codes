public class main{
    
    /* given 2 numbers with decimal places, compare and print 'same' if both have same decimal digits.
    eg)
        n1 = 200.26
        n2 = 10.26
        
        Output : Yes Same decimal digits
    
    */
    
    public static void main(String args[]){
        
        // double n1 = 200.26;
        // double n2 = 10.26;
        
        double n1 = 200.35;
        double n2 = 20.23;
        
        // check decimal are same or not 
        int num1 = (int)n1;
        int num2 = (int)n2;
        
        double number1 = (n1%num1) + 1;
        double number2 = (n2%num2) + 1;
        
        System.out.println(number1 + " " + number2);  //0.2599999999999909 0.2599999999999998
        
        // lets store doubles n1 and n2 upto only 2 decimal places. eg 0.25 for above written comment. 
        
        /*
            //M-1 (works fine)
            
        double r1 = Math.round(number1*100.00)/100.00;
        double r2 = Math.round(number2*100.00)/100.00; 
        
        */
        
        // M-2 (works fine) 
        double r1 = (double)Math.round(number1*100)/100;
        double r2 = (double)Math.round(number2*100)/100;
        
        if(r1 == r2) 
            System.out.println("Yes, Same decimal digits");
        else 
            System.out.println("No, Not Same");
         
    }
}

/*
1.3499999999999943 1.2300000000000004
No, Not Same

*/

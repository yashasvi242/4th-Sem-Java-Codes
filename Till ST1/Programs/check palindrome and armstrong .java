class No_Check{
    
    public static boolean palin(int num){
        
        // find length of number 
        int temp = num;
        int length = 0;
        while(temp != 0){
            length++;
            temp /= 10;
        }
        
        // storing all digits into array 
        int digArr[] = new int[length];
        
        temp = num;
        int index = 0; 
        while(temp != 0){
            int lastDig = temp % 10;
            digArr[index++] = lastDig;
            temp /= 10;
        }
        
        int i=0;
        int j=length-1;
        while(i < j){
            if(digArr[i] != digArr[j])
                return false;
            i++;
            j--;
        }
        
        return true;
    }
    
    public static boolean arms(int num){
        // System.out.println("working at line 44");
        
        // armstrong 
        int tempNum = num;
        int sum = 0;
        while(tempNum != 0){
            int lastDig = tempNum % 10;
            sum += lastDig*lastDig*lastDig;
            tempNum /= 10;

        }
        
        if(sum == num) return true;
        return false;
    }
}

public class Child extends No_Check{
    
    public static void main(String args[]){
        
        // int n = 153;
        // int n  = 371;
        int n=111;
        
        boolean isPalindrome = palin(n);


        boolean isArmstrong = arms(n);

        System.out.println("---------------------------------");
        
        if(isPalindrome == true)
            System.out.println("Yes num is palindrome.");
        else System.out.println("No num is not palindrome.");
        
        if(isArmstrong == true)
            System.out.println("Yes num is armstrong");
        else System.out.println("No num is not armstrong.");

        System.out.println("---------------------------------");

        
        
    }
}

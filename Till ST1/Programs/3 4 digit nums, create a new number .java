public class different {

    // Given 3 numbers (4 digit numbers only)
    // find the largest ones dig out of all 3 
    // find the smallest tens dig out of all 3 numbers  
    // find the largest hundredth dig out of all 3 numbers  
    // find the smallest thousandth dig out of all 3 numbers  
    
    public static int max(int num1, int num2, int num3){

        if(num1 > num2 && num1 > num3)
            return num1;
        else if(num2 > num3 && num2 > num1)
            return num2;
        else return num3;
    }

    public static int min(int num1, int num2, int num3){

        if(num1 < num2 && num1 < num3)
            return num1;
        else if(num2 < num3 && num2 < num1)
            return num2;
        else return num3;
    }


    public static void main(String args[]){

        // int num1 = 1234;
        // int num2 = 4321;
        // int num3 = 1423;

        int num1 = 3521;
        int num2 = 2452;
        int num3 = 1352;

        // exp output : 4231


        int ans = 0;
        int digCount = 4;
        boolean printSmallest = false; 
        int mul = 1; // to increment digits
        while(digCount != 0){

            int dig1 = num1 % 10;
            int dig2 = num2 % 10;
            int dig3 = num3 % 10;

            num1 /= 10;
            num2 /= 10;
            num3 /= 10;

            if(printSmallest){
                ans += mul*(min(dig1,dig2, dig3));
            }
            else{
                ans += mul*(max(dig1,dig2,dig3));
            }

            printSmallest = !printSmallest;

            mul *= 10;

            digCount--;
        }


        System.out.println("res : " + ans);
    }
}

// Output : 1522

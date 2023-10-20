import java.util.*;

class decimalBinaryConversion{


    // decimal to binary 
    public static void main(String args[]){


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();

        String binaryStr = Integer.toBinaryString(n);
        System.out.print("binary of " + n + " is : " + binaryStr);
    }
    
    // binaryString to decimal
    public static void main(String args[]){


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter binary str : ");
        String binaryStr = scn.next();

        int n = Integer.valueOf(binaryStr,2);

        System.out.println("int form of " + binaryStr + " is : " + n);
    }

}
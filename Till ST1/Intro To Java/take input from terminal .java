// program to add 2 numbers 
import java.util.*;

public class Calculator {

    public static void main(String args[]){
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		System.out.println("Sum = " + (n1+n2));
    }
    
}

// now open the terminal and then compile and run
PS C:\Users\Yashasvi\Downloads> javac Calculator.java
PS C:\Users\Yashasvi\Downloads> java Calculator 10 20  // last 2 are inputs for the program 
Sum = 30

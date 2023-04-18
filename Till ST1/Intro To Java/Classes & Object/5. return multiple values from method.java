public class MyClass {
    
    // returning mutiple values from a fun using array 

    //static int total[](int a, int b){ -- this is invalid way
    static int[] total(int a, int b){
        int[] s = new int[2];
        s[0] = a+b;
        s[1] = a-b;
        return s;
    }
    
    public static void main(String args[]) {
        
        // MyClass obj = new MyClass();
        int s[] = total(200,70); // this will return an array of size 2 so 's' will be assigned size 2 
        System.out.println("Addition = " + s[0]);
        System.out.println("Subtraction = " + s[1]);
        
    }
}

/* Output :-

Addition = 270
Subtraction = 130

*/

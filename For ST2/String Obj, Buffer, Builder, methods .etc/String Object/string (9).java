
public class ValueOf {

    public static void main(String args[]){
        int num = 35;

        // converting primitive data type (int) to String 
        String s1  = String.valueOf(num);
        System.out.println(s1);
        System.out.println("Type of num is : " + s1.getClass());

        Integer n = 10;
        System.out.println("Type of num is : " + n.getClass()); // doesnt work with int

    }
    
}

/* Output : - 

35
Type of num is : class java.lang.String
Type of num is : class java.lang.Integer

*/

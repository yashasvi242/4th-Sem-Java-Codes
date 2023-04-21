
// converting double to double with 3 decimal places.

public class Main {
    public static String convertTill3deci(double cnum1){
        
        return String.format("%.3f", cnum1); // works fine
    }
    
    public static void main(String[] args) {
        
        double num1 = 10.494589;
        
        System.out.println("num1 : " + num1);
        
        // converting 'double' to 'String' with 3 decimal places
        String cnum1 = convertTill3deci(num1); // works fine
        
        //m-1 (works fine)
        // converting 3 decimal placed string into 'double' again 
        //double number = Double.parseDouble(cnum1); // converting string to double (indirectly ) coz there is no direct way 
        
        //m-2 (prefered method)
        Double number = Double.valueOf(cnum1);
        
        // printing the final double 
        System.out.println(number);
        
        
        
        
    }
}

/*
num1 : 10.494589
10.495
    
    */

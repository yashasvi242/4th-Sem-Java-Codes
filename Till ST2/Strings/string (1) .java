import java.lang.*;

public class StringClass {
    
    public static void main(String ... args){
        String s = "hello";
        String str = "Java";
        String str1 = s + str;   
        String str2 = "Java" + 11;  // here this + operator works as a concatenator
        System.out.println(str1);
        System.out.println(str2);
    }
    /*
     Output :- 

        helloJava
        Java11

     */
    
}

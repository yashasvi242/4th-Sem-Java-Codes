public class StringCompare1 {

    // so '.equals()'  checks if 2 strings / objects are same copy of a class or not.

    public static void main(String ... args){
        String s = "hell";
        String s1 = "Hello";
        String s2 = "Hello";

        boolean b = s1.equals(s2);
        System.out.println(b);
        b = s.equals(s1);
        System.out.println(b);
    }
}

/*
 Output :- 
    true
    false
 */

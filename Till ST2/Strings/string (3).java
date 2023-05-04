public class StringCompare2 {
    public static void main(String args[]){

        /* imp note : every time we cerate string using String s = "hello" then the string pool will be checked first that either data "hello" already exists or not
                      and if "hello" already exists then no new memory will be alocated, but if we use String s2 = new String("hello") then pool will not be checked 
                      directly a new memory is created, doesnt matter how many 'new' Strings have same data, every time we use 'new' memory will be allocated for sure

        */



        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java"); 
        String s4 = new String("java");

        
        boolean b = (s1 == s2);
        System.out.println(b);
        b = (s1 == s3);
        System.out.println(b); 
        b = s3.equals(s4);
        System.out.println(b); 

        b = s1.equals(s2);
        System.out.println(b);
        b = s1.equals(s3);
        System.out.println(b); 
        b = s3.equals(s4);
        System.out.println(b); 
    }
}

/*
true
false
true

true
true
true

 */

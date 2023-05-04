public class StringCompare3 {

    /*
        s1.compareTo(s2) 
        will compare both strings from the start, and will go one untill it finds 2 character that are different 
        
        eg. for s1 = "abcdf"
            s2 = "abcef"
        
            here a,b,c of both strings are skipped, and d != e therefore answer => asci(d) - asci(e)
        
            Imp : if while comparing s1.compareTo(s2) the output is :- 
        
               +ve means that s1 > s2 
               -ve means s1 < s2
               0 means s1 == s2

    */

    public static void main(String args[]){

        String s1 = "Abhi";
        String s2 = "Viraaj";
        String s3 = "Abhi";

        int a = s1.compareTo(s2); // 65-86 
        System.out.println(a);
        a = s1.compareTo(s3); // 65 - 65
        System.out.println(a);
        a = s2.compareTo(s1); // 86-65
        System.out.println(a);

        System.out.println("---------------------------");
        
        s1 = "Abhi";
        s2 = "Viraaj";
        s3 = "Abcd";

        a = s1.compareTo(s2); // 65-86 
        System.out.println(a);
        a = s1.compareTo(s3); // Asci of (h) - Asci of (c) -> 5
        System.out.println(a);
        a = s2.compareTo(s1); // 86-65
        System.out.println(a);
    }
    /*  Output 
        -21
        0
        21
        ---------------------------
        -21
        5
        21
     */
}

public class StrIndex {

    public static void main(String ... args){
        String str = "ChitkaraUniversity";
        System.out.println(str.indexOf('U'));
        System.out.println(str.indexOf('t',5));

        String subStr = "Uni";
        System.out.println(str.indexOf(subStr));
        System.out.println(str.indexOf(subStr, 9));

    }
    
}

/*
 Output :- 

 8
16
8
-1

 */

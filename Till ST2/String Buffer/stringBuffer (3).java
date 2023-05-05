public class StrBuff3 {
    
    /*
        .append() for string buffer has 3 types of arguments :- 

            .append(int)
            .append(String str)
            .append(object)

     */

     public static void main(String ... args){
        StringBuffer str = new StringBuffer("test");
        str.append(123);//1 
        System.out.println(str);  

        str.append(new String("hi"));
        System.out.println(str);   //2 

        String s = new String(" no ");
        str.append(s);
        System.out.println(str);   //2 

        System.out.println("----------------");

        StringBuffer str1 = new StringBuffer("test");
        str1.insert(2,123);
        System.out.println(str1);

     }
}
/*
test123
test123hi
test123hi no
----------------
te123st
 */

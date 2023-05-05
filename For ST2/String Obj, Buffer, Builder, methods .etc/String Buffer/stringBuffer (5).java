public class StrBuff5 {

    // str.replace(startIndex, endIndex, "new content")

    public static void main(String args[]){
        StringBuffer str = new StringBuffer("Hello World");
        str.replace(6, 11, "java"); // start from 6th index and replace till 10th index i.e 'Hello (World)' -> 'Hello (java)'
 
        System.out.println(str);

        str.replace(6, 15, "JAVA"); // start from 6th index till 14th index i.e 'hello (java..)' ->  'Hello (Hello JAVA)'
        System.out.println(str);


        str.replace(6, 7, "HELL");  // start from 6th index and replace till 6th index of "Hello (J)AVA"  -> Hello (HELL)AVA
        System.out.println(str);

        str.replace(6, 6, "Noo");  // start from 6 and replace till 5 -> i.e no change



    }
    
}

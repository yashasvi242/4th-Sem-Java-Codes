public class StrBuff6 {
    
    // .capacity()

    public static void main(String args[]){
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity()); // empty string has capacity for 16 characters

        StringBuffer str1 = new StringBuffer("Hello");
        System.out.println(str1.capacity()); //  now when first char/string is appended capacity inc 16 + 5 -> 21  (now 16 are empty, rest are filled)

        str1.append(10);
        System.out.println(str1.capacity()); //  capacity was 21, now 14 blocks are empty

        str1.append("12345678912345");
        System.out.println(str1.capacity()); //  capacity : 21, now 0 blocks are empty

        str1.append("1");
        System.out.println(str1.capacity()); //  newcapacity : 2*oldCap + 2 -> 2*21=2 => 44 (22 filled, rest empty)




    }
}
/*
 16
21
21
21
44
 */

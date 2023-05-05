public class StrBuff7 {
    
    // new capacity is always = oldCap*2 + 2 

    public static void main(String args[]){
        StringBuffer str = new StringBuffer();

        System.out.println(str.capacity()); // 16 

        str.ensureCapacity(30); 

        System.out.println(str.capacity()); // 2*(old) + 2 --> 34

    }
}

/*
16
34
 */

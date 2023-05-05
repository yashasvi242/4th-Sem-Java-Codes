
public class getBytes {

    // converts "String" objext into byte array (i.e store asci values of each character of the String into the byte array)

    public static void main(String args[]){
        String a = "abcd";
        byte[] b = a.getBytes();

        for(int i=0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
    
}


// Output : 
// 97 98 99 100 

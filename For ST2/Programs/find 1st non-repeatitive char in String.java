
public class TRY {

    /* find first non repeating character from the string


        String str = "aabbccddeffgghii"; // TC-1
            output : e

        String str = "myanatomy";   // TC-2
            output : m

        String str = "aabbcc";   // TC-3
            output : all are repeatitive
            
    */
    public static void main(String ... args){

        // String str = "aabbccddeffgghii"; // TC-1
        String str = "myanatomy";   // TC-2
        // String str = "aabbcc";   // TC-3

        char resChar = ' ';

        for(int i=0; i < str.length(); i++){

            char ch = str.charAt(i);
            int freq = 0;

            for(int j=0; j < str.length(); j++){
                if(ch == str.charAt(j))
                    freq++;
            }

            if(freq == 1){ // print nonrepeatitive character 
                resChar = ch;
                break;
            }

        }
        
        if(resChar == ' ')
            System.out.print("all characters are repeatitive");
        else System.out.print("Result : " + resChar);
        
    }
}

import java.util.*;

public class StrToken2 {

    public static void main(String ... args){

        String a = ":";
        String b = "Welcome : to : Chitkara : , : How : are : you : ?";
        
        StringTokenizer c = new StringTokenizer(b,":");
        int count1 = c.countTokens();

        for(int i=0; i < count1; i++){
            System.out.println("token [" + i + "]:" + c.nextToken());
        }
    }
    
}

/* Output :- 

token [0]:Welcome 
token [1]: to
token [2]: Chitkara
token [3]:
token [4]: How
token [5]: are
token [6]: you
token [7]: ?

 */

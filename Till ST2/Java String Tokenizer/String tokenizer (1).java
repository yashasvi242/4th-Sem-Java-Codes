// import java.nio.file.WatchService;
// import java.util.StringTokenizer;

import java.util.*;

public class StrToken1 {
    
    public static void main(String ... args){

        StringTokenizer obj = new StringTokenizer("welcome to chitkara", " ");


        while(obj.hasMoreTokens()){
            System.out.println(obj.nextToken());
        }

        StringTokenizer obj2 = new StringTokenizer("welcome to chitkara", " c");

        System.out.println("-----------------------");

        while(obj2.hasMoreTokens()){
            System.out.println(obj2.nextToken());
        }
    }
}

/* Output :- 

welcome
to
chitkara
-----------------------
wel
ome
to
hitkara

 */

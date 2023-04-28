

public class IntToString {
    
    public static void main(String ... args){

        int num = 101389;

        //coversion to string 
        String numStr = String.valueOf(num);

        System.out.println("String : " + numStr);
        System.out.println("Each dig of string:- ");
        for(int i=0; i < numStr.length(); i++){
            // System.out.print(numStr[i] + " "); // does'nt work
            System.out.print( numStr.charAt(i) + " " );
        }


    }
}
/*

String : 101389
Each dig of string:- 
1 0 1 3 8 9

*/

import java.lang.*;

class GetChars {
  
  // finds characters from specific range of indicies from the String objext 

    public static void main(String ... args){

        String a = new String("Hello welcome to chitkara");
        char[] ch = new char[15];

        a.getChars(6,16,ch,0);

        System.out.println(ch);

    }
    
}

// Out:- 
// welcome to

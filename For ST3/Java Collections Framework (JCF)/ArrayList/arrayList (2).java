
import java.util.*;

class Demo1{

    public static void main(String ... args){

        ArrayList<String> ar = new ArrayList<>();
        
        ar.add("ab");
        ar.add("bc");
        ar.add("cd");
        ar.add("de");

        Iterator it = ar.iterator(); 

        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }

        System.out.println(ar);
    }
}

/*
 Output : 
ab 
bc 
cd 
de
[ab, bc, cd, de]
 */

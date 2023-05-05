
public class StrBuilder2 {

    public static void main(String args[]){
        
        StringBuilder sb = new StringBuilder("Java is a progamming language");
        System.out.println(sb);
        // replaceing obj
        sb.replace(10,21,"computer");

        System.out.println(sb);
    }
    
}

/*
Java is a progamming language
Java is a computerlanguage
 */

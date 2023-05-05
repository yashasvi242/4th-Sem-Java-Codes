
public class StrBuilder1 {

    public static void main(String [] args){

        StringBuilder sb = new StringBuilder("study");
        System.out.println(sb);
        // modifying
        sb.append("today");
        System.out.println(sb);
    }
}

/*
study
studytoday
 */

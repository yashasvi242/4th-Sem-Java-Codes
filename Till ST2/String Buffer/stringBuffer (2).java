public class StrBuff2 {

    public static void main(String args[]){

        String str = "study";  // normal string object (not buffer)
        str.concat("today");    
        System.out.println(str);

        StringBuffer strB = new StringBuffer("study"); // str buffer 
        strB.append("today");
        System.out.println(strB);
    }
    
}

/*
 Output : 

 study
studytoday

 */

public class StrBuff1 {

    // here when teh string is modified, no new memory is changed, the changes takes place at the same prv. memory
    public static void main(String args[]){

        StringBuffer sb = new StringBuffer("Study");
        System.out.println(sb);

        // modifiying string at the same memory (no new memory created )
        sb.append("together");
        System.out.println(sb);
    }   
}


/* Output :- 

Study
Studytogether

 */
